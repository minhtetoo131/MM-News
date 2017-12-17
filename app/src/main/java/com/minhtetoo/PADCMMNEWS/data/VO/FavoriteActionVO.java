package com.minhtetoo.PADCMMNEWS.data.VO;

import com.google.gson.annotations.SerializedName;

/**
 * Created by min on 12/3/2017.
 */

public class FavoriteActionVO {

    @SerializedName("favorite-id")
        String favoriteId;

    @SerializedName("favorite-date")
       String  favoriteDate;

    @SerializedName("acted-user")
        private ActedUserVO actedUser;

}
