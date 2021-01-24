package com.example.fitnesscapstone.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.fitnesscapstone.Activities.LoginActivity;
import com.example.fitnesscapstone.R;
import com.google.firebase.auth.FirebaseAuth;

/**
 * A simple {@link Fragment} subclass.
 */
public class LogoutFrag extends Fragment {

    FirebaseAuth mauth;


    public LogoutFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v= inflater.inflate(R.layout.fragment_logout, container, false);
       mauth=FirebaseAuth.getInstance();
       if(mauth.getCurrentUser()!=null){
            Toast.makeText(getContext(), "logging you out", Toast.LENGTH_LONG).show();

            mauth.signOut();
            Intent intent=new Intent(getActivity(), LoginActivity.class);
            startActivity(intent);
        }



       return v;
    }

}
