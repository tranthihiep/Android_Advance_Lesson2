package com.haha.tablayoutexample;

/**
 * Created by trant on 10/01/2018.
 */


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class AdapterViewPaper extends FragmentStatePagerAdapter {

    private int mTab;
    public AdapterViewPaper(FragmentManager fm, int mTab) {
        super(fm);
        this.mTab = mTab;
    }
    @Override
    public Fragment getItem(int position) {
            Fragment frag =null;
            switch (position){
                case 0:
                    frag=new First();
                    break;
                case 1:
                    frag=new Second();
                    break;
                case 2:
                    frag=new Third();
                    break;
        } return frag;
    }
    @Override
    public int getCount() {
        return mTab;
    }
}
