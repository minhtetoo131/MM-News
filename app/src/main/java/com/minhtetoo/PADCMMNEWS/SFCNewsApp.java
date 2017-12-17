package com.minhtetoo.PADCMMNEWS;

import android.app.Application;

import com.minhtetoo.PADCMMNEWS.data.model.NewsModel;


public class SFCNewsApp extends Application {
    public static final  String LOG_TAG = "SFCNewsApp";

    @Override
    public void onCreate() {
        super.onCreate();

        NewsModel.getObjInstance().startloadingMMNews();
    }
}
