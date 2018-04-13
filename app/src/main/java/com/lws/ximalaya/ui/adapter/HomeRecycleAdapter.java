package com.lws.ximalaya.ui.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lws.ximalaya.R;
import com.lws.ximalaya.bean.Ximalayabaen;

import java.util.List;

/**
 * song on 2018/4/10 23:57
 */
public class HomeRecycleAdapter extends BaseQuickAdapter<Ximalayabaen.ListBeanX,BaseViewHolder>{
    private Context mContext;
    private List<Ximalayabaen.ListBeanX> mList;

    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param layoutResId The layout resource id of each item.
     * @param data        A new list is created out of this one to avoid mutable list
     */
    public HomeRecycleAdapter(int layoutResId, @Nullable List<Ximalayabaen.ListBeanX> data ,Context context) {
        super(layoutResId, data);
        this.mContext = context;
        this.mList = data;
    }


    @Override
    protected void convert(BaseViewHolder helper, Ximalayabaen.ListBeanX item) {
        helper.setText(R.id.tv_title,item.getTitle() );

        RecyclerView recyclerView = (RecyclerView) helper.getView(R.id.item_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        recyclerView.setAdapter(new ItemRecyclerViewAdaper(mContext,item.getList()));


    }
}
