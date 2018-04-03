package com.example.mac.takehomeassignment08_yup;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by mac on 2018/4/3.
 */

public class CuisineViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView cuisineName;
    public ImageView cuisinePhoto;
    public boolean isSpicy;

    public CuisineViewHolder(View itemView, final Context context){
        super(itemView);

        cardView =(CardView) itemView.findViewById(R.id.card_view);
        cuisineName=(TextView)itemView.findViewById(R.id.cuisine_text);
        cuisinePhoto=(ImageView)itemView.findViewById(R.id.cuisine_pic);

        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int messageResId = 0;

                if(isSpicy){
                    messageResId = R.string.spicy_toast;
                } else {
                    messageResId = R.string.unspicy_toast;
                }
                Toast.makeText(context, messageResId, Toast.LENGTH_SHORT).show();
            }
        } );
    }

}
