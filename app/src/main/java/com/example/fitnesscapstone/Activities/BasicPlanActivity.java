package com.example.fitnesscapstone.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.fitnesscapstone.R;

public class BasicPlanActivity extends AppCompatActivity {

    CardView c1,c2,c3,c4;
    LinearLayout l1,l2,l3,l4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_plan);


        l1=(LinearLayout)findViewById(R.id.basact_linear1);
        l2=(LinearLayout)findViewById(R.id.basact_linear2);
        l3=(LinearLayout)findViewById(R.id.basact_linear3);
        l4=(LinearLayout)findViewById(R.id.basact_linear4);


        c1=(CardView)findViewById(R.id.basact_head1);
        c2=(CardView)findViewById(R.id.basact_head2);
        c3=(CardView)findViewById(R.id.basact_head3);
        c4=(CardView)findViewById(R.id.basact_head4);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l1.setVisibility(View.VISIBLE);
                l2.setVisibility(View.GONE);
                l3.setVisibility(View.GONE);
                l4.setVisibility(View.GONE);
            }
        });


        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l2.setVisibility(View.VISIBLE);
                l1.setVisibility(View.GONE);
                l3.setVisibility(View.GONE);
                l4.setVisibility(View.GONE);
            }
        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l3.setVisibility(View.VISIBLE);
                l2.setVisibility(View.GONE);
                l1.setVisibility(View.GONE);
                l4.setVisibility(View.GONE);
            }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l4.setVisibility(View.VISIBLE);
                l2.setVisibility(View.GONE);
                l3.setVisibility(View.GONE);
                l1.setVisibility(View.GONE);
            }
        });


    }
}
