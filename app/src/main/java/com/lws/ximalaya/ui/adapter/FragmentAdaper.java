package com.lws.ximalaya.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.lws.ximalaya.base.BaseFragment;

import java.util.List;

/**
 * Created by song on 2018/2/4.
 */

public class FragmentAdaper extends FragmentPagerAdapter {
    public FragmentManager fm;
    public List<BaseFragment> mFragments;


    public FragmentAdaper(FragmentManager fm, List<BaseFragment> fragments ) {
        super(fm);
        this.fm = fm;
        this.mFragments = fragments;

    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return mFragments.size();
    }


}
