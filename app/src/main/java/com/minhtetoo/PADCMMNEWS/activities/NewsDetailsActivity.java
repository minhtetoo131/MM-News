package com.minhtetoo.PADCMMNEWS.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.minhtetoo.PADCMMNEWS.R;
import com.minhtetoo.PADCMMNEWS.adapters.NewsimagesPagerAdapter;
import com.minhtetoo.PADCMMNEWS.adapters.RelatedNewsRecyclerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewsDetailsActivity extends BaseActivity {

    @BindView(R.id.vp_news_images) ViewPager viewPager;
    @BindView(R.id.rv_related_news)RecyclerView rvRelatednews;



    public  static Intent newIntent(Context context){
        Intent intent = new Intent(context ,NewsDetailsActivity.class);

        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_news_details);
        ButterKnife.bind(this,this);

        NewsimagesPagerAdapter adapter = new NewsimagesPagerAdapter(getApplicationContext());
        viewPager.setAdapter(adapter);

        rvRelatednews.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));

        rvRelatednews.setAdapter(new RelatedNewsRecyclerAdapter(getApplicationContext()));

        viewPager.setOffscreenPageLimit(adapter.getCount());

    }
}
