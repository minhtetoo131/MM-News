package com.minhtetoo.PADCMMNEWS.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.minhtetoo.PADCMMNEWS.R;
import com.minhtetoo.PADCMMNEWS.delegates.LoginRegisterDelegate;

import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by min on 11/26/2017.
 */

public class LoginFragment extends BaseFragment {

    private LoginRegisterDelegate mLoginRegisterDelegate;



    public static LoginFragment newInstance(){
        LoginFragment loginFragment = new LoginFragment();

        return loginFragment;


    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        mLoginRegisterDelegate  = (LoginRegisterDelegate) context;



    }

    @Override
    public void onStart() {
        super.onStart();

        mLoginRegisterDelegate.onSetTitle("Login");



    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

          View loginView =inflater.inflate(R.layout.fragment_login,container,
                  false);

        ButterKnife.bind(this,loginView);


        return loginView;
    }

//    @Override
//    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
////        activity.getActionBar().setTitle("LoginFragment");
//    }

    @OnClick(R.id.btn_to_register)
    public void onTapToRegister(View v){
        mLoginRegisterDelegate.onTapToRegister();



    }


    @Override
    public void checkNetworkConnectivity() {
        super.checkNetworkConnectivity();

//        check
    }
}
