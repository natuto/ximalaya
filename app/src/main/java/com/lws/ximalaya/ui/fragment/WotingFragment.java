package com.lws.ximalaya.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lws.ximalaya.R;
import com.lws.ximalaya.base.BaseFragment;
import com.lws.ximalaya.ui.adapter.GatherFragmentAdaper;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * song on 2018/4/6 21:58
 */
public class WotingFragment extends BaseFragment {
    @BindView(R.id.view_pager)
    ViewPager mViewPager;
    @BindView(R.id.tab_layout)
    TabLayout mTabLayout;

    public static WotingFragment getInstance() {
        WotingFragment wotingFragment = new WotingFragment();
        return wotingFragment;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.woting_fragment;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initUI() {

        List<String> listTitle = new ArrayList<>();

        listTitle.add("我的订阅");
        listTitle.add("推荐订阅");
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(WoDingFragment.getInstance());
        fragments.add(TuidingFragment.getInstance());
       // mViewPager.setOffscreenPageLimit();
        mViewPager.setAdapter(new GatherFragmentAdaper(getChildFragmentManager(), fragments, listTitle));
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
