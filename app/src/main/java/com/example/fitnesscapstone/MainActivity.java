package com.example.fitnesscapstone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.fitnesscapstone.Fragments.Homefrag;
import com.example.fitnesscapstone.Fragments.LogoutFrag;
import com.example.fitnesscapstone.Fragments.VideoFrag;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=(BottomNavigationView)findViewById(R.id.mainact_bottomNav);


        final FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.mainact_frame,new Homefrag());
        fragmentTransaction.commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                FragmentTransaction ft=getSupportFragmentManager().beginTransaction();

                switch(menuItem.getItemId()){

                    case R.id.main_home:
                        ft.replace(R.id.mainact_frame,new Homefrag());
                        ft.commit();

                        return true;

                    case R.id.main_video:
                        ft.replace(R.id.mainact_frame,new VideoFrag());
                        ft.commit();

                        return true;


                    case R.id.main_exit:
                        ft.replace(R.id.mainact_frame,new LogoutFrag());
                        ft.commit();
                        return true;


                    default:
                        return false;

                }

            }
        });
    }
}
