package com.example.fitnesscapstone.Adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.fitnesscapstone.R;
import com.example.fitnesscapstone.dataModels.fooddata;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class foodAdapter extends RecyclerView.Adapter<foodAdapter.myViewHolder>{
ArrayList<fooddata> fdata;
clickData mclickData;

    public foodAdapter(ArrayList<fooddata> fdata,clickData mclickData) {
        this.fdata = fdata;
        this.mclickData=mclickData;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.food_card,parent,false);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, final int position) {
        holder.food.setText(fdata.get(position).getFood());
        holder.calories.setText(""+fdata.get(position).getCalories());

        holder.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mclickData.click_data(fdata.get(position).getCalories());
            }
        });

    }

    @Override
    public int getItemCount() {
        return fdata.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{

        TextView food,calories;
        Button add;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            food=(TextView)itemView.findViewById(R.id.calact_food);
           calories=(TextView)itemView.findViewById(R.id.calact_calval);
           add=(Button)itemView.findViewById(R.id.calact_addfood);
        }
    }

    public interface clickData{
        public void click_data(int cal);
    }
}
