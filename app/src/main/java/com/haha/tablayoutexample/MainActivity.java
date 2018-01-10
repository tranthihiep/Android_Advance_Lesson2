package com.haha.tablayoutexample;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements First.OnFragmentInteractionListener,
        Second.OnFragmentInteractionListener,Third.OnFragmentInteractionListener{
    ViewPager mViewPaper;
    TabLayout mTabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        addTab(mTabLayout);
        AdapterViewPaper mAdapterView = new AdapterViewPaper(getSupportFragmentManager(),mTabLayout.getTabCount());
        mViewPaper.setAdapter(mAdapterView);
        mViewPaper.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPaper.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    private void init(){
        mTabLayout= (TabLayout) findViewById(R.id.tabLayout);
        mViewPaper= (ViewPager) findViewById(R.id.viewPager);
    }
    private void addTab(TabLayout mTabLayout){
        mTabLayout.addTab(mTabLayout.newTab().setText("FIRST").setIcon(R.mipmap.ic_launcher));
        mTabLayout.addTab(mTabLayout.newTab().setText("SECOND").setIcon(R.mipmap.ic_launcher));
        mTabLayout.addTab(mTabLayout.newTab().setText("THIRD").setIcon(R.mipmap.ic_launcher));
        mTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

    }
    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
