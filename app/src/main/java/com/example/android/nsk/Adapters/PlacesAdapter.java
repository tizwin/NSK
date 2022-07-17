package com.example.android.nsk.Adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.nsk.PlacePage;
import com.example.android.nsk.Places;
import com.example.android.nsk.R;

import java.util.List;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.PlacesViewHolder> {

    Context context;
    List<Places> placesList;

    public PlacesAdapter(Context context, List<Places> placesList) {
        this.context = context;
        this.placesList = placesList;
    }

    @NonNull
    @Override
    public PlacesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View placesItems = LayoutInflater.from(context).inflate(R.layout.places_list_item, parent, false);
        return new PlacesAdapter.PlacesViewHolder(placesItems);
    }

    @Override
    public void onBindViewHolder(@NonNull PlacesViewHolder holder, @SuppressLint("RecyclerView") int position) {
        //что будем подставлять в дизайн
        //устанавливаем цвет
        holder.cardView.setCardBackgroundColor(Color.parseColor(placesList.get(position).getColor()));

        //устанавливаем картинку
        int imageId = context.getResources().getIdentifier("ic_" + placesList.get(position).getImg(), "drawable", context.getPackageName());
        holder.imageView.setImageResource(imageId);

        holder.textView.setText(placesList.get(position).getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, PlacePage.class);

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(
                        (Activity)context,
                        new Pair<View, String>(holder.imageView, "imageTransition")
                );

                intent.putExtra("cardView", Color.parseColor(placesList.get(position).getColor()));
                intent.putExtra("imageView", imageId);
                intent.putExtra("textView", placesList.get(position).getTitle());
                intent.putExtra("textContent", placesList.get(position).getContent());
                intent.putExtra("placeId", placesList.get(position).getId());

                context.startActivity(intent, options.toBundle());
            }
        });
    }

    @Override
    public int getItemCount() {
        return placesList.size();
    }

    public static final class PlacesViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        ImageView imageView;
        TextView textView;

        public PlacesViewHolder(@NonNull View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.main_place_object);
            imageView = itemView.findViewById(R.id.imagePlace);
            textView = itemView.findViewById(R.id.main_text_places);
        }
    }
}
