package com.example.fitnesscapstone.Activities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fitnesscapstone.R;
import com.example.fitnesscapstone.dataModels.userdata;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;

public class ActivityEdit extends AppCompatActivity {
FirebaseAuth mauth;
DatabaseReference mref;
    StorageReference mstoreRef;
    Uri ProductImageUri;
    TextView product_selected;

    StorageTask mtask;
    ProgressBar progress;

EditText name,email,age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        mauth=FirebaseAuth.getInstance();
        mref= FirebaseDatabase.getInstance().getReference();
        mstoreRef= FirebaseStorage.getInstance().getReference("uploads");

        progress=(ProgressBar)findViewById(R.id.acce_progress);

        name=(EditText)findViewById(R.id.acce_name);
        product_selected=(TextView)findViewById(R.id.acce_p_text);
        email=(EditText)findViewById(R.id.acce_email);
        age=(EditText)findViewById(R.id.acce_age);
    }

    public void selectImage(View view) {
        Intent i=new Intent();
        i.setType("image/*");
        startActivityForResult(i,11);
    }

    //updating profile

    public void updatepro(View view) {
        progress.setVisibility(View.VISIBLE);
        if(mtask!=null && mtask.isInProgress()){
            Toast.makeText(this, "upload in progress", Toast.LENGTH_SHORT).show();
        }else{
            if(validate_data(name.getText().toString(),email.getText().toString(),age.getText().toString())) {
                if (ProductImageUri != null) {
                    final String unique_p_id = System.currentTimeMillis() + "";
                    StorageReference mstoretemp = mstoreRef.child(mauth.getCurrentUser().getUid()).child(unique_p_id + "." + extenReturn(ProductImageUri));
                    mtask = mstoretemp.putFile(ProductImageUri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            taskSnapshot.getStorage().getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                                @Override
                                public void onSuccess(Uri uri) {
                                  if(uri!=null){
                                      mref.child("Users").child(mauth.getCurrentUser().getUid()).setValue(new userdata(name.getText().toString(), email.getText().toString(), age.getText().toString(),uri.toString())).addOnSuccessListener(new OnSuccessListener<Void>() {
                                        @Override
                                        public void onSuccess(Void aVoid) {
                                            Toast.makeText(ActivityEdit.this, "updated successfully", Toast.LENGTH_SHORT).show();
                                            progress.setVisibility(View.INVISIBLE);
                                            Intent i = new Intent(ActivityEdit.this, AccountActivity.class);
                                            startActivity(i);
                                        }
                                      });
                                  }
                                }
                            });
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {

                        }
                    });


                }

            }
        }

    }

    private String extenReturn(Uri productImageUri) {
        ContentResolver cr=getContentResolver();
        MimeTypeMap mime=MimeTypeMap.getSingleton();
        return mime.getExtensionFromMimeType(cr.getType(productImageUri));
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==11 && resultCode==RESULT_OK && data!=null && data.getData()!=null){
            ProductImageUri=data.getData();
            product_selected.setText("Image Selected");


        }else{
            Toast.makeText(this, "no image selected", Toast.LENGTH_SHORT).show();


        }
    }


    public boolean validate_data(String name,String email,String age){

        if(!TextUtils.isEmpty(name) && !TextUtils.isEmpty(email) && !TextUtils.isEmpty(age) ){
            if(Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                return true;
            }else {
                Toast.makeText(this, "enter valid email", Toast.LENGTH_SHORT).show();
                return false;

            }
        }else {
            Toast.makeText(this, "fields ara empty", Toast.LENGTH_SHORT).show();
            return false;

        }

    }


//       mref.child("Users").child(mauth.getCurrentUser().getUid()).setValue(new userdata(name.getText().toString(), email.getText().toString(), age.getText().toString())).addOnSuccessListener(new OnSuccessListener<Void>() {
//        @Override
//        public void onSuccess(Void aVoid) {
//            Toast.makeText(ActivityEdit.this, "updated successfully", Toast.LENGTH_SHORT).show();
//            progress.setVisibility(View.INVISIBLE);
//            Intent i = new Intent(ActivityEdit.this, AccountActivity.class);
//            startActivity(i);
//        }
//    });
//
}
