package com.minhtetoo.PADCMMNEWS.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.minhtetoo.PADCMMNEWS.R;

import butterknife.ButterKnife;


/**
 * Created by min on 11/26/2017.
 */

public class LoginFragment extends Fragment {

    public static LoginFragment newInstance(){
        LoginFragment loginFragment = new LoginFragment();

        return loginFragment;


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
}
