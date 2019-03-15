package com.example.acer.pixabay;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    Context context;
    ArrayList<ImageModels> images;
    public MyAdapter(MainActivity mainActivity, ArrayList<ImageModels> imageModels) {

        this.context=mainActivity;
        this.images=imageModels;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(context).inflate(R.layout.design,parent,false);
        return  new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, final int position) {

       ImageModels search =images.get(position);
        Picasso.with(context).load(search.pic).into(holder.iv);
        holder.iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String[]  image=new String[4];
                image[0]=images.get(position).getPic();
                image[1]=images.get(position).getImageview();
                image[2]=images.get(position).getImagelikes();
                image[3]=images.get(position).getImagedownload();
                Intent i=new Intent(context,Results.class);
                i.putExtra("data",image);
                context.startActivity(i);

            }
        });


    }

    @Override
    public int getItemCount() {
        return (images==null) ? 0:images.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView iv;
        public MyViewHolder(View itemView) {
            super(itemView);

            iv=itemView.findViewById(R.id.image);

        }
    }
}
