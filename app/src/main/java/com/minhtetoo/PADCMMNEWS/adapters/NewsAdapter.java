package com.minhtetoo.PADCMMNEWS.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.minhtetoo.PADCMMNEWS.R;
import com.minhtetoo.PADCMMNEWS.data.VO.NewsVO;
import com.minhtetoo.PADCMMNEWS.delegates.NewsItemsDelegate;
import com.minhtetoo.PADCMMNEWS.viewholder.NewsViewHolder;




public class NewsAdapter extends BaseRecyclerAdapter<NewsViewHolder,NewsVO> {

   private NewsItemsDelegate mNewsItemsDelegate;
    private Context mContext;



    public NewsAdapter(Context context, NewsItemsDelegate newsItemsDelegate) {
        super(context);

        mNewsItemsDelegate = newsItemsDelegate;
        mContext = context;



    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View newsItemView =mLayoutInflator.inflate(R.layout.view_item_news,parent,false);


        return new NewsViewHolder(newsItemView,mNewsItemsDelegate);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {

        NewsVO currentNewsVO = mData.get(position);


        holder.tvBriefNew.setText(currentNewsVO.getBrief());

        ImageView NewImage = holder.newsImage;

        String imageUrl = null;
        if (currentNewsVO.getImages() != null ) {
            imageUrl = currentNewsVO.getImages().get(0);
        }

        if (imageUrl != null) {
            Glide.with(mContext).load(imageUrl)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(NewImage);
        }

        holder.postedDate.setText("Posted At : " + currentNewsVO.getPostedDate());

        Glide.with(mContext).load(currentNewsVO.getPublication().getLogo())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.publicationLogo);

        holder.publicationName.setText(currentNewsVO.getPublication().getTitle());



    }

    @Override
    public int getItemCount() {
        return  mData.size();
    }


}
