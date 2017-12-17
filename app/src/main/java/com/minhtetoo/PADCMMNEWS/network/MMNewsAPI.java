package com.minhtetoo.PADCMMNEWS.network;

import com.minhtetoo.PADCMMNEWS.network.response.GetNewsResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public interface MMNewsAPI {

     @FormUrlEncoded
     @POST("v1/getMMNews.php")
     Call<GetNewsResponse> loadMMNews(
             @Field("page") int pageIndex,
             @Field("access_token") String acessToken);





}
