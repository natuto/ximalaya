package com.lws.ximalaya.base;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * song on 2018/4/6 20:36
 */
public abstract class BaseMVPFragment<P extends BasePresenter >extends Fragment{
    public P mPresenter;
    public Unbinder mUnbinder;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(getLayoutId(),container,false);
        mUnbinder = ButterKnife.bind(this,rootView);
        initUI();
        initData();
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (mPresenter== null) {
            mPresenter = getPresanter();
            mPresenter.attachView( this);
        }
    }

    @Override
    public void onDestroyView() {
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mUnbinder !=null)
            mUnbinder.unbind();
    }
    protected abstract int getLayoutId();
    protected abstract P getPresanter();
    protected abstract void  initData();
    protected abstract void  initUI();
}
