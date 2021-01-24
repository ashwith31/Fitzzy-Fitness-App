package com.example.fitnesscapstone.Adapters;

import com.example.fitnesscapstone.Fragments.HosFrag;
import com.example.fitnesscapstone.Fragments.docFrag;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class docactAdapter extends FragmentStatePagerAdapter {


    public docactAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new HosFrag();
        }
        if(position==1){
            return new docFrag();

        }else{

        return null;}
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "Hospitals";

        }if(position==1){
            return "Doctors";
        }else {
            return "";
        }
    }
}
