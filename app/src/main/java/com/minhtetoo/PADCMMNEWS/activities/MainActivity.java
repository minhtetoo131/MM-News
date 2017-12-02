package com.minhtetoo.PADCMMNEWS.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewAnimationUtils;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.minhtetoo.PADCMMNEWS.R;
import com.minhtetoo.PADCMMNEWS.adapters.NewsAdapter;
import com.minhtetoo.PADCMMNEWS.components.EmptyViewPod;
import com.minhtetoo.PADCMMNEWS.components.SmartRecyclerView;
import com.minhtetoo.PADCMMNEWS.delegates.NewsItemsDelegate;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements NewsItemsDelegate {

    @BindView(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;
    @BindView(R.id.rv_news)
    SmartRecyclerView smartRecyclerView;

    @BindView(R.id.coordinator)
    CoordinatorLayout coordinatorLayout;

    @BindView(R.id.vp_empty_news)
    EmptyViewPod vpEmptyNews;

    private SmartScrollListener mSmartScrollsitener;
    Animation ScaleDownAndTranslate;
    Animation ScaleUpAndTranslate;

    private boolean isRightPanelOpen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this,this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ScaleDownAndTranslate = AnimationUtils.loadAnimation(this, R.anim.scale_down_and_translate);
        ScaleUpAndTranslate = AnimationUtils.loadAnimation(this, R.anim.scale_up_and_translate);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();


                Intent i = LoginRegisterActivity.newIntent(getApplicationContext());
                startActivity(i);

//                mDrawerLayout.openDrawer(GravityCompat.START);
            }
        });

        final SmartRecyclerView rvnews =findViewById(R.id.rv_news);
        rvnews.setmEmptyView(vpEmptyNews);
        rvnews.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));

        NewsAdapter newsAdapter = new NewsAdapter(getApplicationContext(),this);

        rvnews.setAdapter(newsAdapter);
        mSmartScrollsitener = new SmartScrollListener(new SmartScrollListener.OnSmartScrollListener() {
            @Override
            public void onListEndReach() {
                Snackbar.make(rvnews,"this is end",Snackbar.LENGTH_LONG).show();
            }
        });


        rvnews.addOnScrollListener(mSmartScrollsitener);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

       if (id == R.id.add){
           mDrawerLayout.openDrawer(GravityCompat.END);
           coordinatorLayout.startAnimation(ScaleDownAndTranslate);
           isRightPanelOpen = true;

       }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        if(isRightPanelOpen){
            mDrawerLayout.closeDrawer(GravityCompat.END);
            coordinatorLayout.startAnimation(ScaleUpAndTranslate);


        }
    }

    @Override
    public void onTapComment() {

    }

    @Override
    public void onTapSendTo() {

    }

    @Override
    public void onTapFavorite() {

    }

    @Override
    public void onTapStatistic() {

    }

    @Override
    public void onTapNews() {

        Intent intent = NewsDetailsActivity.newIntent(getApplicationContext());
        startActivity(intent);

    }
}
