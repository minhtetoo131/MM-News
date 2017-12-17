package com.minhtetoo.PADCMMNEWS.network;

import com.google.gson.Gson;
import com.minhtetoo.PADCMMNEWS.data.model.NewsModel;
import com.minhtetoo.PADCMMNEWS.events.RestApiEvents;
import com.minhtetoo.PADCMMNEWS.network.response.GetNewsResponse;

import org.greenrobot.eventbus.EventBus;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by min on 12/3/2017.
 */

public class MMNewsDataAgentImpl implements MMNewsDataAgent {

    private static MMNewsDataAgentImpl objInstance;
    MMNewsAPI theAPI;


    private MMNewsDataAgentImpl() {

        OkHttpClient okHttpClient= new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS).build();

        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl("http://padcmyanmar.com/padc-3/mm-news/apis/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();

        theAPI = retrofit.create(MMNewsAPI.class);




    }

    public static MMNewsDataAgentImpl getObjInstance(){

        if(objInstance == null){

            objInstance = new MMNewsDataAgentImpl();

        }

        return objInstance;
    }

    @Override
    public void loadMMNews(String acessToken, int pageNo) {

      Call<GetNewsResponse> loadMMNewsCall= theAPI.loadMMNews(pageNo,acessToken);

      loadMMNewsCall.enqueue(new SFCCallback<GetNewsResponse>() {
          @Override
          public void onResponse(Call<GetNewsResponse> call,
                                 Response<GetNewsResponse> response) {



              super.onResponse(call,response);

              GetNewsResponse getNewsResponse = response.body();

              if(getNewsResponse !=null && getNewsResponse.getNewsList().size()> 0){
                  RestApiEvents.NewsDataLoadedEvent newsDataLoadedEvent = new
                          RestApiEvents.NewsDataLoadedEvent(getNewsResponse.getPageNo(),
                                                             getNewsResponse.getNewsList());
                  EventBus.getDefault().post(newsDataLoadedEvent);

              }

          }




      });
    }
}
