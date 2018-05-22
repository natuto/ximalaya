package com.lws.ximalaya.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lws.ximalaya.R;
import com.lws.ximalaya.base.BaseMVPFragment;
import com.lws.ximalaya.bean.DiscoveryBean;
import com.lws.ximalaya.contract.DiscoverContract;
import com.lws.ximalaya.presenter.DiscoveryPresenter;
import com.lws.ximalaya.ui.adapter.RecommendAdaper;

import butterknife.BindView;

/**
 * song on 2018/4/6 21:58
 */
public class FinanceFragment extends BaseMVPFragment<DiscoveryPresenter> implements DiscoverContract.View{
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private RecommendAdaper mRecyclerAdaper;
    public  static FinanceFragment getInstance(){

        FinanceFragment wodeFragment = new FinanceFragment();
        return  wodeFragment;
    }
    @Override
    protected int getLayoutId() {
        return R.layout.recommend_fragment;
    }

    @Override
    protected DiscoveryPresenter getPresanter() {
        return new DiscoveryPresenter();
    }

    @Override
    protected void initData() {
        mPresenter.getLatest(8);

    }

    @Override
    protected void initUI() {
        mLinearLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        mRecyclerAdaper = new RecommendAdaper(R.layout.fragment_discover_recycler, getActivity());
        mRecyclerAdaper.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
        mRecyclerView.setAdapter(mRecyclerAdaper);


    }

    @Override
    public void showError() {

    }

    @Override
    public void showLoading(DiscoveryBean discoveryBean) {
        if (discoveryBean.getData().size()>0) {

            mRecyclerAdaper.addData(discoveryBean.getData());
        }


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mRecyclerAdaper.pauseMusic();
    }
}
