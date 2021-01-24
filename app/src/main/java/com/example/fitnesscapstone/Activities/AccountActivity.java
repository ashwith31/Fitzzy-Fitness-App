package com.example.fitnesscapstone.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;
import com.example.fitnesscapstone.Adapters.ProfileAdapter;
import com.example.fitnesscapstone.R;
import com.example.fitnesscapstone.dataModels.userdata;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class AccountActivity extends AppCompatActivity {

    FirebaseAuth mauth;
    DatabaseReference mref;
    RecyclerView rv;
    ArrayList<userdata> uData=new ArrayList<>();
    ProfileAdapter adapter;
    ProgressBar progress;
    CircleImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        mauth=FirebaseAuth.getInstance();
        mref= FirebaseDatabase.getInstance().getReference();
        rv=(RecyclerView)findViewById(R.id.accact_rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        adapter=new ProfileAdapter(uData);
        rv.setAdapter(adapter);

        progress=(ProgressBar)findViewById(R.id.acc_progress);
        img=(CircleImageView)findViewById(R.id.profile_image);

        loadData();
    }

    private void loadData() {
        progress.setVisibility(View.VISIBLE);

        mref.child("Users").child(mauth.getCurrentUser().getUid()).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    uData.clear();
                    progress.setVisibility(View.GONE);
                    userdata udata=dataSnapshot.getValue(userdata.class);
                    uData.add(udata);
                    Glide.with(getApplicationContext()).load(udata.getImageurl()).into(img);
                    adapter.notifyDataSetChanged();


                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    //itent to profile data

    public void editProfile(View view) {
        Intent i=new Intent(AccountActivity.this,ActivityEdit.class);
        startActivity(i);
    }
}
