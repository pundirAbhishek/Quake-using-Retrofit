package com.example.multipleviewrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.internal.bind.ArrayTypeAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;

public class EarthquakeAdapter extends RecyclerView.Adapter<EarthquakeAdapter.ViewHolder>{

    List<Earthquake> listItems;

    public EarthquakeAdapter(List<Earthquake> listItems) {
        this.listItems = listItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        Earthquake items = listItems.get(position);
        viewHolder.textViewMag.setText(items.getMagnitude().toString());
        viewHolder.textViewLoc.setText(items.getLocation());
        viewHolder.textViewTime.setText(items.getTime());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder
    {

        TextView textViewMag;
        TextView textViewLoc;
        TextView textViewTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewMag = itemView.findViewById(R.id.magnitude);
            textViewLoc = itemView.findViewById(R.id.location_offset);
            textViewTime = itemView.findViewById(R.id.time);

        }

    }


}
