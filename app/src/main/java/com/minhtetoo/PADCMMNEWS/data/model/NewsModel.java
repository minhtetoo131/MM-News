package com.minhtetoo.PADCMMNEWS.data.model;

import com.minhtetoo.PADCMMNEWS.Utils.AppConstants;
import com.minhtetoo.PADCMMNEWS.data.VO.NewsVO;
import com.minhtetoo.PADCMMNEWS.events.RestApiEvents;
import com.minhtetoo.PADCMMNEWS.network.MMNewsDataAgentImpl;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by min on 12/3/2017.
 */

public class NewsModel {

   private static NewsModel objInstance;
   private List<NewsVO> mNews;

   int mmNewsPageIndex=1;


    private NewsModel() {

        EventBus.getDefault().register(this);
        mNews = new ArrayList<>();


    }

    public static NewsModel getObjInstance(){

        if(objInstance == null){

            objInstance = new NewsModel();

        }

        return objInstance;
    }



    public void startloadingMMNews(){
        MMNewsDataAgentImpl.getObjInstance().loadMMNews(AppConstants.ACESS_TOKEN,
                mmNewsPageIndex);

    }

    public List<NewsVO> getmNews(){

      return mNews;
    }

    public void loadMoreNews() {
        MMNewsDataAgentImpl.getObjInstance().loadMMNews(AppConstants.ACESS_TOKEN,
                mmNewsPageIndex);

    }


    @Subscribe
    public void onNewsDataLoaded(RestApiEvents.NewsDataLoadedEvent event){
        mNews.addAll(event.getLoadNews());
        mmNewsPageIndex = event.getLoadedPageIndex() + 1;

    }

    public void forceRefreshNews() {
        mNews = new ArrayList<>();

        mmNewsPageIndex = 1;
        startloadingMMNews();
    }
}
