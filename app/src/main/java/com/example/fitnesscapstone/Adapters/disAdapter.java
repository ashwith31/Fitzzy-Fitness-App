package com.example.fitnesscapstone.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fitnesscapstone.R;
import com.example.fitnesscapstone.dataModels.dis_data;

import org.w3c.dom.Text;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class disAdapter extends RecyclerView.Adapter<disAdapter.myViewholder>{
    ArrayList<dis_data> dis_Data;

    public disAdapter(ArrayList<dis_data> dis_Data) {
        this.dis_Data = dis_Data;
    }

    @NonNull
    @Override
    public myViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.disease_card,parent,false);

        return new myViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewholder holder, int position) {
        holder.disname.setText(dis_Data.get(position).getDisname());
        holder.dis_cure.setText(dis_Data.get(position).getDis_cure());


    }

    @Override
    public int getItemCount() {
        return dis_Data.size();
    }

    public class myViewholder extends RecyclerView.ViewHolder{
        TextView disname,dis_cure;

        public myViewholder(@NonNull View itemView) {
            super(itemView);
            disname=(TextView)itemView.findViewById(R.id.dis_name);
            dis_cure=(TextView)itemView.findViewById(R.id.dis_cure);
        }
    }
}
