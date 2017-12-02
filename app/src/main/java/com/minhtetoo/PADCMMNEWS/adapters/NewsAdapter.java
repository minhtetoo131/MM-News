package com.minhtetoo.PADCMMNEWS.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.minhtetoo.PADCMMNEWS.R;
import com.minhtetoo.PADCMMNEWS.data.VO.NewsVO;
import com.minhtetoo.PADCMMNEWS.delegates.NewsItemsDelegate;
import com.minhtetoo.PADCMMNEWS.viewholder.NewsViewHolder;

/**
 * Created by min on 11/4/2017.
 */

public class NewsAdapter extends BaseRecyclerAdapter<NewsViewHolder,NewsVO> {

   private NewsItemsDelegate mNewsItemsDelegate;



    public NewsAdapter(Context context, NewsItemsDelegate newsItemsDelegate) {
        super(context);

        mNewsItemsDelegate = newsItemsDelegate;


    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View newsItemView =mLayoutInflater.inflate(R.layout.view_item_news,parent,false);


        return new NewsViewHolder(newsItemView,mNewsItemsDelegate);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {

    }


}
