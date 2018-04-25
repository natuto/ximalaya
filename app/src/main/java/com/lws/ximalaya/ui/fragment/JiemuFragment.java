package com.lws.ximalaya.ui.fragment;


import android.content.Context;
import android.content.Intent;
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
import com.lws.ximalaya.bean.GarhetMoreBean;
import com.lws.ximalaya.bean.GatherBean;
import com.lws.ximalaya.contract.HomeGatherContract;
import com.lws.ximalaya.peresenter.HomegatherPresenter;
import com.lws.ximalaya.ui.activity.PlayDetailActivity;
import com.lws.ximalaya.ui.adapter.GatherJiemuRecyclerAdaper;
import com.lws.ximalaya.ui.message.MessageCategory;
import com.lws.ximalaya.ui.message.MessageJiemu;
import com.orhanobut.logger.Logger;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * song on 2018/4/6 21:58
 */
public class JiemuFragment extends BaseMVPFragment<HomegatherPresenter>implements HomeGatherContract.View<GarhetMoreBean>{
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;

    private GatherJiemuRecyclerAdaper mGatherJiemuRecyclerAdaper;
    private GarhetMoreBean mGarhetMoreBean;
    private LinearLayoutManager mLinearLayoutManager;
    private  int id;
    private  int page =2;
    private int mTotal;
    public int current;
    private int mJ;
    private  int maxPage;
    private boolean isRefresh ;

    public  static JiemuFragment getInstance(){

        JiemuFragment wodeFragment = new JiemuFragment();
        return  wodeFragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.jiemu_recycler;
    }

    @Override
    protected HomegatherPresenter getPresanter() {
        return new HomegatherPresenter();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initUI() {
        EventBus.getDefault().register(this);

        mLinearLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        mGatherJiemuRecyclerAdaper = new GatherJiemuRecyclerAdaper(R.layout.jiemu_recycler_item, getActivity());
        mGatherJiemuRecyclerAdaper.openLoadAnimation(BaseQuickAdapter.ALPHAIN);

        //mJ = 0;
      //  isRefresh =true;
        mGatherJiemuRecyclerAdaper.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {

            @Override
            public void onLoadMoreRequested() {
              if (current >= mTotal) {
                  mGatherJiemuRecyclerAdaper.loadMoreEnd();
                }else {
                  if (page <= maxPage) {
                  }
                      mPresenter.getMore(id,page );
                      mGatherJiemuRecyclerAdaper.loadMoreComplete();
                      page++;





            }
            }
        },mRecyclerView);
        mRecyclerView.setAdapter(mGatherJiemuRecyclerAdaper);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
    @Override
    public void showError() {

    }

    @Override
    public void showLoading(GarhetMoreBean data, boolean is) {



        if (!is) {

            mGatherJiemuRecyclerAdaper.addData(data.getData().getList());

            current = mGatherJiemuRecyclerAdaper.getData().size();



        }

    }


    @Subscribe(threadMode = ThreadMode.MAIN)
    public void event(MessageJiemu messageJiemu) {
        mTotal = messageJiemu.getGatherBean().getData().getTracks().getTotalCount();
        maxPage = messageJiemu.getGatherBean().getData().getTracks().getMaxPageId();
        id = messageJiemu.getId();

        mGatherJiemuRecyclerAdaper.replaceData(messageJiemu.getGatherBean().getData().getTracks().getList());

    }

    /**
     * callback method to be invoked when an item in this view has been
     * click and held
     *
     * @param adapter
     * @param view     The view whihin the ItemView that was clicked
     * @param position The position of the view int the adapter
     */
   /* @Override
    public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
        switch (view.getId()) {
            case R.id.ll_item:
            //     GarhetMoreBean.DataBean.ListBean list = (GarhetMoreBean.DataBean.ListBean)adapter.getData();
               //  Logger.d(list.getAlbumId());
                Intent intent = new Intent(getActivity(), PlayDetailActivity.class);
                //intent.putExtra("id", )
                getActivity().startActivity(intent);
                break;
            case R.id._iv_download:
                Logger.d("mmmm");
                break;

        }
    }*/


    /**
     * callback method to be invoked when an item in this view has been
     * click and held
     *
     * @param adapter
     * @param view     The view whihin the ItemView that was clicked
     * @param position The position of the view int the adapter
     */
/*    @Override
    public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
        switch (view.getId()) {
            case R.id.ll_item:
                Logger.d("gggggggggg"+position);
                break;
            case R.id._iv_download:
                Logger.d("mmmm");
                break;

        }
    }*/
}
