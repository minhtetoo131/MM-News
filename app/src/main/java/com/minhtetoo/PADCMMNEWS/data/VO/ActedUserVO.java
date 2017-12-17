package com.minhtetoo.PADCMMNEWS.data.VO;

import com.google.gson.annotations.SerializedName;

/**
 * Created by min on 12/3/2017.
 */

public class ActedUserVO {

      @SerializedName("user-id")
      private  String userId;

      @SerializedName("user-name")
      private String userName;

      @SerializedName("profile-image")
      private String profileImage;

      public String getUserId() {
            return userId;
      }

      public String getUserName() {
            return userName;
      }

      public String getProfileImage() {
            return profileImage;
      }
}
