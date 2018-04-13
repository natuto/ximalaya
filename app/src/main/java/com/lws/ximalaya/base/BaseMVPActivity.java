package com.lws.ximalaya.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * song on 2018/4/13 01:55
 */
public abstract class BaseMVPActivity <P extends BasePresenter >extends BaseActivity {
    public P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (mPresenter== null) {
            mPresenter = getPresanter();
            mPresenter.attachView( this);
        }
        initData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter!=null) {
            mPresenter.detachView();
        }
    }
    protected abstract P getPresanter();
}
