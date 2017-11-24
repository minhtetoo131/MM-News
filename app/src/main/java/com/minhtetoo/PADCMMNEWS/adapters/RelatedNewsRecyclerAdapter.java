package com.minhtetoo.PADCMMNEWS.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.minhtetoo.PADCMMNEWS.R;

/**
 * Created by min on 11/16/2017.
 */

public class RelatedNewsRecyclerAdapter extends RecyclerView.Adapter<RelatedNewsRecyclerAdapter.RelatedNewsViewHolder> {

    private LayoutInflater inflater;

    public RelatedNewsRecyclerAdapter(Context context) {
        inflater = LayoutInflater.from(context);
    }

    @Override
    public RelatedNewsRecyclerAdapter.RelatedNewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = inflater.inflate(R.layout.view_item_related_news,parent,false);

        RelatedNewsViewHolder viewHolder = new RelatedNewsViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RelatedNewsRecyclerAdapter.RelatedNewsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 30;
    }



    public class RelatedNewsViewHolder extends RecyclerView.ViewHolder {



        public RelatedNewsViewHolder(View itemView) {
            super(itemView);
        }
    }
}
