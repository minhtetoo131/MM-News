package com.minhtetoo.PADCMMNEWS.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.minhtetoo.PADCMMNEWS.R;
import com.minhtetoo.PADCMMNEWS.viewholder.NewsViewHolder;

/**
 * Created by min on 11/4/2017.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsViewHolder> {

   private  LayoutInflater mLayoutInflator;

    public NewsAdapter(Context context) {

        mLayoutInflator = LayoutInflater.from(context);

    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View newsItemView =mLayoutInflator.inflate(R.layout.view_item_news,parent,false);


        return new NewsViewHolder(newsItemView);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
