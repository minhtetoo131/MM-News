package com.minhtetoo.PADCMMNEWS.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.minhtetoo.PADCMMNEWS.R;
import com.minhtetoo.PADCMMNEWS.fragments.LoginFragment;

import butterknife.ButterKnife;

/**
 * Created by min on 11/26/2017.
 */

public class LoginRegisterActivity extends AppCompatActivity {
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
    }
}
