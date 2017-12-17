package com.minhtetoo.PADCMMNEWS.data.VO;

import com.google.gson.annotations.SerializedName;

import java.util.List;



public class NewsVO {

    @SerializedName("news-id")
    private String newsId;

    @SerializedName("brief")
    private String brief;

    @SerializedName("details")
    private String details;

    @SerializedName("images")
    private List<String> images;

    @SerializedName("posted-date")
    private String postedDate;

    @SerializedName("publication")
    private PublicationVO publication;

    @SerializedName("favorites")
    private List<FavoriteActionVO> favoriteActions;


    @SerializedName("comments")
    private List <CommentActionVo> commentActions;

    @SerializedName("sent-tos")
    private List<SendToVO>  sendToAction;


    public String getNewsId() {
        return newsId;
    }

    public String getBrief() {
        return brief;
    }

    public String getDetails() {
        return details;
    }

    public List<String> getImages() {
        return images;
    }

    public String getPostedDate() {
        return postedDate;
    }

    public PublicationVO getPublication() {
        return publication;
    }

    public List<FavoriteActionVO> getFavoriteActions() {
        return favoriteActions;
    }

    public List<CommentActionVo> getCommentActions() {
        return commentActions;
    }

    public List<SendToVO> getSendToAction() {
        return sendToAction;
    }
}
