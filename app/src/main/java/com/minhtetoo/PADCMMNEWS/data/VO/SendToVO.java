package com.minhtetoo.PADCMMNEWS.data.VO;

import com.google.gson.annotations.SerializedName;

/**
 * Created by min on 12/3/2017.
 */

public class SendToVO {


    @SerializedName("send-to-id")
    private String sendToId;

    @SerializedName("sent-date")
    private String  sendDate;

    @SerializedName("acted-user")
    private ActedUserVO sender;

    @SerializedName("received-user")
    private ActedUserVO reciever;


    public String getSendToId() {
        return sendToId;
    }

    public String getSendDate() {
        return sendDate;
    }

    public ActedUserVO getSender() {
        return sender;
    }

    public ActedUserVO getReciever() {
        return reciever;
    }
}
