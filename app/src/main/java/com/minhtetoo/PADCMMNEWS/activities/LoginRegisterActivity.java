package com.minhtetoo.PADCMMNEWS.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.minhtetoo.PADCMMNEWS.R;
import com.minhtetoo.PADCMMNEWS.delegates.LoginRegisterDelegate;
import com.minhtetoo.PADCMMNEWS.fragments.LoginFragment;
import com.minhtetoo.PADCMMNEWS.fragments.RegisterFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by min on 11/26/2017.
 */

public class LoginRegisterActivity extends AppCompatActivity implements
        LoginRegisterDelegate {

    @BindView(R.id.toolbar)
    Toolbar toolbar;



    public static Intent newIntent(Context con){

        Intent i = new Intent(con ,LoginRegisterActivity.class);

        return  i;

    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_regiseter);
        ButterKnife.bind(this,this);

        if (savedInstanceState ==null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container, LoginFragment.newInstance())
                    .commit();



        }
        setSupportActionBar(toolbar);


    }

    @Override
    public void onTapLogin() {

    }

    @Override
    public void onTapForgetPassWord() {

    }

    @Override
    public void onTapToRegister() {

        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(R.anim.enter,R.anim.exit,R.anim.pop_enter,R.anim.pop_exit)
                .replace(R.id.fl_container, RegisterFragment.newInstance())
                .addToBackStack(null)
                .commit();

    }

    @Override
    public void onSetTitle(String title) {

        toolbar.setTitle(title);

    }


}
