package com.minhtetoo.PADCMMNEWS.recievers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * Created by min on 11/28/2017.
 */

public class InternetStateReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager= (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if(networkInfo.isConnected()){
            Toast.makeText(context,"connect",Toast.LENGTH_LONG).show();



        }else {
            Toast.makeText(context,"disconnect",Toast.LENGTH_LONG).show();


        }


    }
}
