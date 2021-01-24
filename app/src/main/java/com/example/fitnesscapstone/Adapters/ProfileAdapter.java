package com.example.fitnesscapstone.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fitnesscapstone.R;
import com.example.fitnesscapstone.dataModels.userdata;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProfileAdapter extends  RecyclerView.Adapter<ProfileAdapter.myViewHolder>{
    ArrayList<userdata> udata;

    public ProfileAdapter(ArrayList<userdata> udata) {
        this.udata = udata;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_card,parent,false);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.name.setText(udata.get(position).getName());
        holder.email.setText("Email :"+udata.get(position).getEmail());
        holder.age.setText("Age :"+udata.get(position).getAge());

    }

    @Override
    public int getItemCount() {
        return udata.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{

        TextView name,email,age;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            name=(TextView)itemView.findViewById(R.id.acc_name);
            email=(TextView)itemView.findViewById(R.id.acc_email);
            age=(TextView)itemView.findViewById(R.id.acc_age);
        }
    }
}
