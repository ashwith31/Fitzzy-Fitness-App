package com.example.fitnesscapstone.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fitnesscapstone.MainActivity;
import com.example.fitnesscapstone.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.concurrent.TimeUnit;

public class OtpActivity extends AppCompatActivity {
    String codeSent,phoneNumber;
    FirebaseAuth mauth;
    DatabaseReference mref;
    EditText otp_code,otp_name;
    ProgressBar mprogress;
    TextView otpact_count;
    Button otp_resend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        if(getIntent()!=null){
            phoneNumber=getIntent().getExtras().getString("phone_d");
        }
        mauth=FirebaseAuth.getInstance();
        mref= FirebaseDatabase.getInstance().getReference();


        otp_code=(EditText)findViewById(R.id.otpact_num);
        otp_name=(EditText)findViewById(R.id.otpact_name);
        otpact_count=(TextView)findViewById(R.id.otpact_count);
        mprogress=(ProgressBar)findViewById(R.id.otpact_progressBar);
        otp_resend=(Button)findViewById(R.id.otpact_resend);
        sendVerificationSms();
    }

    public void onVerified(View view) {


        VerifyCode();
    }

    public void sendVerificationSms(){
        mprogress.setVisibility(View.VISIBLE);
        PhoneAuthProvider.getInstance().verifyPhoneNumber("+91"+phoneNumber,60,TimeUnit.SECONDS,this,mcallbacks);
        CountTimer();

    }
    PhoneAuthProvider.OnVerificationStateChangedCallbacks mcallbacks=new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
        @Override
        public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
            mprogress.setVisibility(View.GONE);
        }

        @Override
        public void onVerificationFailed(@NonNull FirebaseException e) {
            mprogress.setVisibility(View.GONE);
            Toast.makeText(OtpActivity.this, ""+e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            super.onCodeSent(s, forceResendingToken);
            codeSent=s;
            mprogress.setVisibility(View.GONE);
        }
    };


    public void VerifyCode(){
        mprogress.setVisibility(View.VISIBLE);
        final String name=otp_name.getText().toString().trim();



        if(!TextUtils.isEmpty(otp_code.getText().toString())){
            String userTypedCode=otp_code.getText().toString().trim();
            PhoneAuthCredential mcredential=PhoneAuthProvider.getCredential(codeSent,userTypedCode);
            mauth.signInWithCredential(mcredential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(!TextUtils.isEmpty(name) && name.length()>4){
                        mref.child("Users").child(mauth.getCurrentUser().getUid()).child("name").setValue(name).addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                mprogress.setVisibility(View.GONE);
                                Intent i=new Intent(OtpActivity.this, MainActivity.class);
                                startActivity(i);
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                mprogress.setVisibility(View.GONE);
                                Toast.makeText(OtpActivity.this, ""+e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });
                        Toast.makeText(OtpActivity.this, "verified number "+mauth.getCurrentUser().getPhoneNumber(), Toast.LENGTH_LONG).show();

                    }else{
                        Toast.makeText(OtpActivity.this, "name is empty or too short", Toast.LENGTH_SHORT).show();
                    }

                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    mprogress.setVisibility(View.GONE);
                    Toast.makeText(OtpActivity.this, ""+e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }

    }

    public  void CountTimer(){
        new CountDownTimer(60000,1000){
            @Override
            public void onTick(long l) {
                otpact_count.setVisibility(View.VISIBLE);
                otpact_count.setText(""+l/1000);

            }

            @Override
            public void onFinish() {
                otpact_count.setVisibility(View.INVISIBLE);
                otp_resend.setVisibility(View.VISIBLE);

            }
        }.start();
    }

    public void resend_code(View view) {
        sendVerificationSms();

        otp_resend.setVisibility(View.GONE);
    }
}
