package com.example.fitnesscapstone.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fitnesscapstone.Adapters.docactAdapter;
import com.example.fitnesscapstone.R;
import com.google.android.material.tabs.TabLayout;

public class DoctorhospitalActivity extends AppCompatActivity {

    sendDataListener senddataListener;
    sendDataListenerB senddataListenerB;

    TabLayout tabs;
    ViewPager viewPager;
    docactAdapter adapter;

    EditText search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorhospital);
        tabs=(TabLayout)findViewById(R.id.docact_tab);
        viewPager=(ViewPager)findViewById(R.id.docact_viewpager);
        search=(EditText)findViewById(R.id.docact_search);

        adapter=new docactAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabs.setupWithViewPager(viewPager);

        search.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if(i== EditorInfo.IME_ACTION_SEARCH){
                    senddataListener.sendSearchD(search.getText().toString());
                    senddataListenerB.sendSearchDB(search.getText().toString());
                    return true;
                }else
                {return false;}
            }
        });


    }



    //for places frag
    public  interface sendDataListener{
        public void sendSearchD(String s);
    }

    public void setSenddataListener_setter(sendDataListener listener){
        this.senddataListener=listener;
    }


    //for doctor frad

    public  interface sendDataListenerB{
        public void sendSearchDB(String s);
    }

    public void setSenddataListener_setterB(sendDataListenerB listener){
        this.senddataListenerB=listener;
    }

}
