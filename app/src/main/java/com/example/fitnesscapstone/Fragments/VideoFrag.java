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

import com.example.fitnesscapstone.Activities.VidWebViewActivity;
import com.example.fitnesscapstone.Adapters.vidAdapter;
import com.example.fitnesscapstone.R;
import com.example.fitnesscapstone.dataModels.viddata;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideoFrag extends Fragment implements vidAdapter.vidFragLister{
    RecyclerView rv;
    vidAdapter adapter;
    ArrayList<viddata> vData=new ArrayList<>();




    public VideoFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_video, container, false);
        rv=(RecyclerView)v.findViewById(R.id.vidfrag_rv);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new vidAdapter(vData,this);
        rv.setAdapter(adapter);

        loadData();





        return v;
    }

    @Override
    public void vidClickListener(int position) {
        Toast.makeText(getContext(), "clicked "+position, Toast.LENGTH_SHORT).show();

        Intent intent=new Intent(getContext(), VidWebViewActivity.class);
        intent.putExtra("vidUrl",vData.get(position).getVidurl());
        startActivity(intent);

    }


    public void loadData(){

        vData.add(new viddata("Bench press","https://www.youtube.com/watch?v=vthMCtgVtFw",R.drawable.barbellbpress));
        vData.add(new viddata("Dumbell curl","https://www.youtube.com/watch?v=ykJmrZ5v0Oo",R.drawable.dumbellcurl));
        vData.add(new viddata("Dumbell bench press","https://www.youtube.com/watch?v=SHsUIZiNdeY",R.drawable.dumbellbenchpress));
        vData.add(new viddata("Front squat","https://www.youtube.com/watch?v=v-mQm_droHg",R.drawable.squat));
        vData.add(new viddata("Dumbell lunge","https://www.youtube.com/watch?v=D7KaRcUTQeE",R.drawable.dumbelllunge));
        vData.add(new viddata("Leh press","https://www.youtube.com/watch?v=IZxyjW7MPJQ",R.drawable.legpress));
        /*
            vData.add(new viddata("","",""));
            vData.add(new viddata("","",);
            vData.add(new viddata("","",));
            vData.add(new viddata("","",));
        */
        adapter.notifyDataSetChanged();
    }
}
