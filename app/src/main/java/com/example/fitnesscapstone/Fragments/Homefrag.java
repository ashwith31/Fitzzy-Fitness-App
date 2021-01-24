package com.example.fitnesscapstone.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.fitnesscapstone.Activities.AccountActivity;
import com.example.fitnesscapstone.Activities.CalorieActivity;
import com.example.fitnesscapstone.Activities.DiseasesActivity;
import com.example.fitnesscapstone.Activities.DoctorhospitalActivity;
import com.example.fitnesscapstone.Activities.ExerciseDActivity;
import com.example.fitnesscapstone.Activities.ExercisePActivity;
import com.example.fitnesscapstone.Adapters.homeFragAdapter;
import com.example.fitnesscapstone.R;
import com.example.fitnesscapstone.dataModels.homefrag_recycler_data;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Homefrag extends Fragment implements homeFragAdapter.homeClickListener{


    public Homefrag() {
        // Required empty public constructor
    }

    RecyclerView rv;

    ArrayList<String> cardT=new ArrayList<>();
    ArrayList<Integer> imageId=new ArrayList<>();

    ArrayList<homefrag_recycler_data> rv_data=new ArrayList<>();



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_homefrag, container, false);

        rv=(RecyclerView)v.findViewById(R.id.homefrag_recycler);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));

        imageId.add(R.drawable.pic_four);
        imageId.add(R.drawable.pic_two);
        imageId.add(R.drawable.pic_five);
        imageId.add(R.drawable.pic_three);
        imageId.add(R.drawable.medical);
        imageId.add(R.drawable.diseases);


        cardT.add("Exercise Plans");
        cardT.add("Exercise Display");
        cardT.add("Calories Calculator");
        cardT.add("Account");
        cardT.add("Doctors/Hospitals");
        cardT.add("Diseases");


        setRecylerData();


        return v;
    }

    public void setRecylerData(){

        for(int i=0;i<imageId.size();i++){
            homefrag_recycler_data d=new homefrag_recycler_data(imageId.get(i),cardT.get(i));
            rv_data.add(d);
        }

        homeFragAdapter adapter=new homeFragAdapter(rv_data,this);
        rv.setAdapter(adapter);

    }

    @Override
    public void clickListener(int position) {
        Toast.makeText(getContext(), "clicked "+position, Toast.LENGTH_SHORT).show();
        Intent i;
        switch (position){
            case 0:
                i=new Intent(getActivity(), ExercisePActivity.class);
                startActivity(i);
                break;

            case 1:
                i=new Intent(getActivity(), ExerciseDActivity.class);
                startActivity(i);
                break;

            case 2:
                i=new Intent(getActivity(), CalorieActivity.class);
                startActivity(i);
                break;

            case 3:
                i=new Intent(getActivity(), AccountActivity.class);
                startActivity(i);
                break;

            case 4:
                i=new Intent(getActivity(), DoctorhospitalActivity.class);
                startActivity(i);
                break;

            case 5:
                 i=new Intent(getActivity(), DiseasesActivity.class);
                startActivity(i);
                break;


        }
    }
}
