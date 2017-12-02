package com.minhtetoo.PADCMMNEWS.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.minhtetoo.PADCMMNEWS.data.VO.NewsVO;
import com.minhtetoo.PADCMMNEWS.delegates.NewsItemsDelegate;

/**
 * Created by min on 11/4/2017.
 */

public class NewsViewHolder extends BaseViewHolder<NewsVO> {

      NewsItemsDelegate mNewsItemsDelegate;



    public NewsViewHolder(View itemView,  NewsItemsDelegate newsItemsDelegate) {
        super(itemView);


        mNewsItemsDelegate = newsItemsDelegate;


    }

    @Override
    public void setData(NewsVO data) {

    }

    @Override
    public void onClick(View v) {
        mNewsItemsDelegate.onTapNews();
    }
}
