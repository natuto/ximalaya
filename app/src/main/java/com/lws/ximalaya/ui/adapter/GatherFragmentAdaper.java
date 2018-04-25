package com.lws.ximalaya.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.lws.ximalaya.base.BaseFragment;

import java.util.List;

/**
 * Created by song on 2018/2/4.
 */

public class GatherFragmentAdaper extends FragmentPagerAdapter {
    public FragmentManager fm;
    public List<Fragment> mFragments;
    public  List<String> mTitle;


    public GatherFragmentAdaper(FragmentManager fm, List<Fragment> fragments ,List<String> title) {
        super(fm);
        this.fm = fm;
        this.mFragments = fragments;
        this.mTitle = title;

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
     * This method may be called by the ViewPager to obtain a title string
     * to describe the specified page. This method may return null
     * indicating no title for this page. The default implementation returns
     * null.
     *
     * @param position The position of the title requested
     * @return A title for the requested page
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitle.get(position);
    }

    /**
     * Return the number of views available.
     */

    @Override
    public int getCount() {
        return mFragments.size();
    }


}
