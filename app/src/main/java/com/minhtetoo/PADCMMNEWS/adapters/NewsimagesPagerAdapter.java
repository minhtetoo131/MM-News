package com.minhtetoo.PADCMMNEWS.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.minhtetoo.PADCMMNEWS.R;

/**
 * Created by min on 11/11/2017.
 */

public class NewsimagesPagerAdapter extends PagerAdapter {


    private LayoutInflater mLayoutInflater;

    public NewsimagesPagerAdapter(Context context) {

        mLayoutInflater = LayoutInflater.from(context);


    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {


        return view == (View) object;
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {

       View itemView = mLayoutInflater.inflate(R.layout.view_item_news_details_image,container,false);
       container.addView(itemView);


        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);

        super.destroyItem(container, position, object);

    }
}
