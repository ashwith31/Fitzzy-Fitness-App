package com.example.fitnesscapstone.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fitnesscapstone.MainActivity;
import com.example.fitnesscapstone.R;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    EditText phone_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        phone_number=(EditText)findViewById(R.id.loginact_phone);
    }

    //verifing phone number

    public void verifybutton(View view) {
        if(phone_number.length()==10){
            Intent i=new Intent(LoginActivity.this,OtpActivity.class);
            i.putExtra("phone_d",phone_number.getText().toString().trim());
            startActivity(i);
        }else{
            Toast.makeText(this, "Enter a Valid Number", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    protected void onStart() {
        super.onStart();

        if(FirebaseAuth.getInstance().getCurrentUser()!=null){
            Toast.makeText(this, "welcome "+FirebaseAuth.getInstance().getCurrentUser().getPhoneNumber(), Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }
    }
}
