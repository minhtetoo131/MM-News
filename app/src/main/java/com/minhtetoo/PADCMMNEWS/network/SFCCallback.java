package com.minhtetoo.PADCMMNEWS.network;

import com.minhtetoo.PADCMMNEWS.events.RestApiEvents;

import org.greenrobot.eventbus.EventBus;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by min on 12/9/2017.
 */

public abstract class SFCCallback<T extends SFCResponse> implements Callback<T>{


    @Override
    public void onResponse(Call<T> call, Response<T> response) {

        SFCResponse sfcResponse = response.body();
        if(sfcResponse == null){

            RestApiEvents.ErrorInvokingAPIEvent errorEvent =new
                    RestApiEvents.ErrorInvokingAPIEvent("no data could be load");
            EventBus.getDefault().post(errorEvent);

        }

    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        RestApiEvents.ErrorInvokingAPIEvent errorInvokingAPIEvent = new RestApiEvents.ErrorInvokingAPIEvent(t.getMessage());

        EventBus.getDefault().post(errorInvokingAPIEvent);
    }
}
