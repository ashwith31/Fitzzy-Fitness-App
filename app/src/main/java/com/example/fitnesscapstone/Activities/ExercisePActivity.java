package com.example.fitnesscapstone.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fitnesscapstone.Adapters.homeFragAdapter;
import com.example.fitnesscapstone.R;
import com.example.fitnesscapstone.dataModels.homefrag_recycler_data;

import java.util.ArrayList;

public class ExercisePActivity extends AppCompatActivity implements homeFragAdapter.homeClickListener{


    RecyclerView expat_rv;
    ArrayList<String>  cardT=new ArrayList<>();
    ArrayList<Integer> imgID=new ArrayList<>();


    LinearLayout linear_beg,linear_inter,linear_ad,linear1,linear2,linear3,linear4;
    TextView tv1,tv2,tv3,tv4;

    ArrayList<homefrag_recycler_data> mdata=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_p);

        expat_rv=(RecyclerView)findViewById(R.id.expact_recycler);
        expat_rv.setLayoutManager(new GridLayoutManager(this,2));

        imgID.add(R.drawable.beg);
        imgID.add(R.drawable.inter);
        imgID.add(R.drawable.advance);

        cardT.add("Beginners Plan");
        cardT.add("Intermediate Plan");
        cardT.add("Advance Plan");




        for(int i=0;i<imgID.size();i++){
            homefrag_recycler_data ndata=new homefrag_recycler_data(imgID.get(i),cardT.get(i));
            mdata.add(ndata);
        }

        homeFragAdapter adapter=new homeFragAdapter(mdata,this);
        expat_rv.setAdapter(adapter);
    }

    @Override
    public void clickListener(int position) {
        Toast.makeText(this, "clicked "+position, Toast.LENGTH_SHORT).show();


        Intent i;
        switch (position){
            case 0:
                i=new Intent(ExercisePActivity.this, BasicPlanActivity.class);
                startActivity(i);
                break;

            case 1:
                i=new Intent(ExercisePActivity.this, IntemActivity.class);
                startActivity(i);
                break;

            case 2:
                i=new Intent(ExercisePActivity.this, AdvanceActivity.class);
                startActivity(i);
                break;


        }
    }
}
