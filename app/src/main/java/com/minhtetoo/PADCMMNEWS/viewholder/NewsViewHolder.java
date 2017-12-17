package com.minhtetoo.PADCMMNEWS.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.minhtetoo.PADCMMNEWS.R;
import com.minhtetoo.PADCMMNEWS.data.VO.NewsVO;
import com.minhtetoo.PADCMMNEWS.delegates.NewsItemsDelegate;

/**
 * Created by min on 11/4/2017.
 */

public class NewsViewHolder extends BaseViewHolder<NewsVO> {

      NewsItemsDelegate mNewsItemsDelegate;
     public TextView tvBriefNew, postedDate , publicationName;
     public View itemView ;
     public ImageView newsImage , publicationLogo;



    public NewsViewHolder(View itemView,  NewsItemsDelegate newsItemsDelegate) {
        super(itemView);


        mNewsItemsDelegate = newsItemsDelegate;

        this.itemView = itemView;

        tvBriefNew= itemView.findViewById(R.id.tv_brief_new);
        newsImage= itemView.findViewById(R.id.iv_news_hero_image);
        postedDate = itemView.findViewById(R.id.tv_publish_date);
        publicationLogo = itemView.findViewById(R.id.iv_publication_logo);
        publicationName = itemView.findViewById(R.id.tv_publication_name);





    }

    @Override
    public void setData(NewsVO data) {

    }

    @Override
    public void onClick(View v) {
        mNewsItemsDelegate.onTapNews();
    }
}
