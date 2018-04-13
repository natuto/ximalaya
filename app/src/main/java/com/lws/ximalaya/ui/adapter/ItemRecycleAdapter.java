package com.lws.ximalaya.ui.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lws.ximalaya.R;
import com.lws.ximalaya.bean.Ximalayabaen;

import java.util.List;

/**
 * song on 2018/4/10 23:57
 */
public class ItemRecycleAdapter extends BaseQuickAdapter<Ximalayabaen.ListBeanX.ListBean,BaseViewHolder>{
    private Context mContext;

    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param layoutResId The layout resource id of each item.
     * @param data        A new list is created out of this one to avoid mutable list
     */
    public ItemRecycleAdapter(int layoutResId, @Nullable List<Ximalayabaen.ListBeanX.ListBean> data , Context context) {
        super(layoutResId, data);
        this.mContext = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, Ximalayabaen.ListBeanX.ListBean item) {

        helper.setText(R.id.tv_title, item.getTitle() );
        helper.setText(R.id.tv_subtitle, item.getSubtitle());
        helper.setText(R.id.tv_count, item.getPlayCount()+"");
        helper.setText(R.id.tv_tracks, item.getTracksCount()+"" );
        Glide.with(mContext).load(item.getPic()).into((ImageView) helper.getView(R.id.iv_pic));




    }
}
