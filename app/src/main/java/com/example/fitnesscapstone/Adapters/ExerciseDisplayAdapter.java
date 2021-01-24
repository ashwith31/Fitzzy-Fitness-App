package com.example.fitnesscapstone.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fitnesscapstone.R;
import com.example.fitnesscapstone.dataModels.xdact_data;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ExerciseDisplayAdapter extends RecyclerView.Adapter<ExerciseDisplayAdapter.myViewHolder>{
    ArrayList<xdact_data> xdata;

    public ExerciseDisplayAdapter(ArrayList<xdact_data> xdata) {
        this.xdata = xdata;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.exer_d_card,parent,false);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.name.setText(xdata.get(position).getX_name());
        holder.intro.setText(xdata.get(position).getX_intro());
        holder.img.setImageResource(xdata.get(position).getImg_id());

    }

    @Override
    public int getItemCount() {
        return xdata.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{

        TextView name,intro;
        ImageView img;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            name=(TextView)itemView.findViewById(R.id.xdact_name);
           intro=(TextView)itemView.findViewById(R.id.xdact_intro);
           img=(ImageView) itemView.findViewById(R.id.xdact_img);

        }
    }
}
