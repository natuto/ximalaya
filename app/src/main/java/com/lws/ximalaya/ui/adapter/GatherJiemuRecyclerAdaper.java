package com.lws.ximalaya.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ListView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lws.ximalaya.R;
import com.lws.ximalaya.bean.GarhetMoreBean;
import com.lws.ximalaya.contract.PlayDetailContract;
import com.lws.ximalaya.ui.activity.PlayDetailActivity;
import com.lws.ximalaya.utils.AmountUtils;
import com.lws.ximalaya.utils.TimeUtils;
import com.orhanobut.logger.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * song on 2018/4/17 01:15
 */
public class GatherJiemuRecyclerAdaper extends BaseQuickAdapter<GarhetMoreBean.DataBean.ListBean ,BaseViewHolder> {
    private Context mContext;
    public GatherJiemuRecyclerAdaper(int layoutResId ,Context context) {
        super(layoutResId);
        this.mContext = context;
    }



    @Override
    protected void convert(final BaseViewHolder helper, final GarhetMoreBean.DataBean.ListBean item) {

        helper.setText(R.id.tv_createdAt, TimeUtils.getCreateTime(item.getCreatedAt()));
        helper.setText(R.id.tv_order, item.getOrderNo()+"");
        helper.setText(R.id.tv_title, item.getTitle());
        helper.setText(R.id.tv_playcount, AmountUtils.getAmount(item.getPlaytimes()));
        helper.setText(R.id.tv_duration, TimeUtils.getPlayTime(item.getDuration()));
        helper.setText(R.id.tv_comments, item.getComments()+"");
        helper.addOnClickListener(R.id._iv_download);
        helper .addOnClickListener(R.id.ll_item);
        helper.getView(R.id._iv_download).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        helper.getView(R.id.ll_item).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 Intent intent = new Intent(mContext, PlayDetailActivity.class);
                 Bundle bundle = new Bundle();
                 bundle.putParcelableArrayList("data", (ArrayList<? extends Parcelable>) mData);
                  bundle.putInt( "position", helper.getLayoutPosition());

                  bundle.putInt("id",item.getTrackId());

                 intent.putExtra("data",bundle);


                 mContext.startActivity(intent);
            }
        });


    }




}
