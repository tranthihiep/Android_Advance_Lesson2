package com.haha.tablayoutexample;

/**
 * Created by trant on 10/01/2018.
 */


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class AdapterViewPaper extends FragmentStatePagerAdapter {

    int mTab;
    public AdapterViewPaper(FragmentManager fm, int mTab) {
        super(fm);
        this.mTab = mTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                First first = new First();
                return first;
            case 1:
                Second second = new Second();
                return second;
            case 2:
                Third third = new Third();
                return third;
            default: return null;

        }
    }
    @Override
    public int getCount() {
        return mTab;
    }
}
