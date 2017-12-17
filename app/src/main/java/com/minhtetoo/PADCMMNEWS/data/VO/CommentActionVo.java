package com.minhtetoo.PADCMMNEWS.data.VO;

import com.google.gson.annotations.SerializedName;

/**
 * Created by min on 12/3/2017.
 */

public class CommentActionVo {

    @SerializedName("comment-id")
    private String commentId;

    @SerializedName("comment")
    private String comment;

    @SerializedName("comment-date")
    private String commentDate;


    private ActedUserVO actedUser;

    public String getCommentId() {
        return commentId;
    }

    public String getComment() {
        return comment;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public ActedUserVO getActedUser() {
        return actedUser;
    }
}
