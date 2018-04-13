package com.lws.ximalaya.ui.activity;

import com.lws.ximalaya.R;
import com.lws.ximalaya.base.BaseMVPActivity;
import com.lws.ximalaya.bean.GatherBean;

import com.lws.ximalaya.contract.HomeGatherContract;

import com.lws.ximalaya.peresenter.HomegatherPresenter;

import java.util.HashMap;
import java.util.Map;

/**
 * song on 2018/4/13 01:38
 */
public class GatherDetailActivity extends BaseMVPActivity <HomegatherPresenter> implements HomeGatherContract.View{
    int i = 11679871;
    @Override
    protected HomegatherPresenter getPresanter() {
        return new HomegatherPresenter();
    }


    @Override
    protected int getLayoutId() {
        return R.layout.home_gather_activity;
    }

    @Override
    public void initUI() {

    }

    @Override
    public void initData() {

        mPresenter.getLatest(i);
    }

    @Override
    public void showError() {

    }

    @Override
    public void showLoading(GatherBean gatherBean , boolean is) {

    }


}
