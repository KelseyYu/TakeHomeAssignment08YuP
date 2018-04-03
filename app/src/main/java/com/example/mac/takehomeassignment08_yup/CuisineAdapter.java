package com.example.mac.takehomeassignment08_yup;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by mac on 2018/4/3.
 */

public class CuisineAdapter extends RecyclerView.Adapter<CuisineViewHolder> {
    private List<Cuisine> cuisines;
    private Context context;

    public CuisineAdapter(List<Cuisine> cuisines, Context context) {
        this.cuisines = cuisines;
        this.context = context;
    }
    @Override
    public CuisineViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_cuisine,parent,false);
       return new CuisineViewHolder(view,context);
    }

    @Override
    public void onBindViewHolder(CuisineViewHolder holder, int position) {
        Cuisine cuisine = cuisines.get(position);
        holder.cuisineName.setText(cuisine.name);
        holder.cuisinePhoto.setImageResource(cuisine.photoId);
        holder.isSpicy = cuisine.isSpicy;

        if(position%2 == 0){
            holder.itemView.setBackgroundColor(Color.parseColor("#ECEFF1"));
        } else{
            holder.itemView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
    }

    @Override
    public int getItemCount() {
        return cuisines.size();}
}
