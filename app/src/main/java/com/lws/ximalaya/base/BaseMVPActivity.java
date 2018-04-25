package com.lws.ximalaya.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toolbar;

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
    protected void initToobar(android.support.v7.widget.Toolbar toolbar){
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


    protected abstract P getPresanter();
}
