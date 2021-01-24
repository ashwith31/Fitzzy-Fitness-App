package com.example.fitnesscapstone.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fitnesscapstone.R;
import com.example.fitnesscapstone.dataModels.homefrag_recycler_data;

import org.w3c.dom.Text;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class homeFragAdapter extends RecyclerView.Adapter<homeFragAdapter.myViewHolder>{

    ArrayList<homefrag_recycler_data> rv_data;
    homeClickListener mClicklistener;

    public homeFragAdapter(ArrayList<homefrag_recycler_data> rv_data, homeClickListener mClicklistener) {
        this.rv_data = rv_data;
        this.mClicklistener = mClicklistener;
    }

    public homeFragAdapter(ArrayList<homefrag_recycler_data> rv_data) {
        this.rv_data = rv_data;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.home_frag_card,parent,false);
        return new myViewHolder(view,mClicklistener);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.img.setImageResource(rv_data.get(position).getImageId());
        holder.tv.setText(rv_data.get(position).getCardTitle());

    }

    @Override
    public int getItemCount() {
        return rv_data.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView img;
        TextView tv;
        homeClickListener mclickListener;

        public myViewHolder(@NonNull View itemView,homeClickListener mclickListener) {
            super(itemView);

            img=(ImageView)itemView.findViewById(R.id.homefrag_img);
            tv=(TextView)itemView.findViewById(R.id.homefrag_text);
            this.mclickListener=mclickListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            mclickListener.clickListener(getAdapterPosition());
        }
    }

    public  interface homeClickListener{
        public void clickListener(int position);
    }
}
