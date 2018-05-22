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
public class FaxianFragment extends BaseFragment {
    @BindView(R.id.view_pager)
    ViewPager mViewPager;
    @BindView(R.id.tab_layout)
    TabLayout mTabLayout;

    public static FaxianFragment getInstance() {
        FaxianFragment faxianFragment = new FaxianFragment();
        return faxianFragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_discover;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initUI() {
        List<String> listTitle = new ArrayList<>();
        listTitle.add("推荐");
        listTitle.add("热点");
        listTitle.add("情感");
        listTitle.add("财经");
        listTitle.add("段子");
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(RecommendFragment.getInstance());
        fragments.add(HotTopicFragment.getInstance());
        fragments.add(EmotionFragment.getInstance());
        fragments.add(FinanceFragment.getInstance());
        fragments.add(CrossTalkFragment.getInstance());
        mViewPager.setOffscreenPageLimit(5);
        mViewPager.setAdapter(new GatherFragmentAdaper(getChildFragmentManager(), fragments, listTitle));
        mTabLayout.setupWithViewPager(mViewPager);


    }
}
