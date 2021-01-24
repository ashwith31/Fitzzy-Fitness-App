package com.example.fitnesscapstone.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fitnesscapstone.R;
import com.example.fitnesscapstone.dataModels.doc_data;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DocRecyclerAdapter extends RecyclerView.Adapter<DocRecyclerAdapter.myViewHolder> {

    ArrayList<doc_data> mData;

    public DocRecyclerAdapter() {
    }

    public DocRecyclerAdapter(ArrayList<doc_data> mData) {
        this.mData = mData;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.doc_data_card,parent,false);

        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.name.setText(mData.get(position).getName());
        holder.address.setText(mData.get(position).getAddress());
        holder.no.setText(mData.get(position).getNo());
        holder.service.setText(mData.get(position).getService());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{

        TextView name,address,no,service;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            name=(TextView)itemView.findViewById(R.id.docfrag_name);
            address=(TextView)itemView.findViewById(R.id.docfrag_address);
            no=(TextView)itemView.findViewById(R.id.docfrag_no);
            service=(TextView)itemView.findViewById(R.id.docfrag_service);
        }
    }
}
