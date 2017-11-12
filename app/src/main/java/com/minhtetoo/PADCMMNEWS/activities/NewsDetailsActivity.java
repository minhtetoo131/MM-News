package com.minhtetoo.PADCMMNEWS.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.minhtetoo.PADCMMNEWS.R;
import com.minhtetoo.PADCMMNEWS.adapters.NewsimagesPagerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewsDetailsActivity extends AppCompatActivity {

    @BindView(R.id.vp_news_images)
    ViewPager viewPager;

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


    }
}
