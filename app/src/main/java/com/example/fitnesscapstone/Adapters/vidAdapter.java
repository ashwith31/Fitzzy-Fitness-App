package com.example.fitnesscapstone.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fitnesscapstone.R;
import com.example.fitnesscapstone.dataModels.viddata;

import org.w3c.dom.Text;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class vidAdapter extends RecyclerView.Adapter<vidAdapter.myViewHolder>{
    ArrayList<viddata> vdata;
    vidFragLister mlistener;

    public vidAdapter(ArrayList<viddata> vdata,vidFragLister mlistener) {
        this.vdata = vdata;
        this.mlistener=mlistener;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.home_frag_card,parent,false);
        return new myViewHolder(v,mlistener);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.img.setImageResource(vdata.get(position).getImageIg());
        holder.textView.setText(vdata.get(position).getVidname());

    }

    @Override
    public int getItemCount() {
        return vdata.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView img;
        TextView textView;
        vidFragLister mlistener;

        public myViewHolder(@NonNull View itemView,vidFragLister mlistener) {
            super(itemView);
            img=(ImageView)itemView.findViewById(R.id.homefrag_img);
            textView=(TextView)itemView.findViewById(R.id.homefrag_text);
            itemView.setOnClickListener(this);
            this.mlistener=mlistener;

        }

        @Override
        public void onClick(View view) {
            mlistener.vidClickListener(getAdapterPosition());
        }
    }

    public interface  vidFragLister{
        public void vidClickListener(int position);
    }
}
