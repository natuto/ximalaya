package com.lws.ximalaya.ui.fragment;


import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.lws.ximalaya.R;
import com.lws.ximalaya.base.BaseFragment;
import com.lws.ximalaya.ui.message.MessageJiemu;
import com.lws.ximalaya.ui.message.MessageXiangqing;
import com.lws.ximalaya.utils.AmountUtils;
import com.lws.ximalaya.view.RoundImageView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;

/**
 * song on 2018/4/6 21:58
 */
public class XiangqingFragment extends BaseFragment{
    @BindView(R.id.tv_intro)
    TextView mIntro;
    @BindView(R.id.iv_smallLogo)
    ImageView mRoundImageView;
    @BindView(R.id.tv_name)
    TextView mName;
    @BindView(R.id.iv_v)
    ImageView mImageV;
    @BindView(R.id.tv_followers)
    TextView mFollowers;
    @BindView(R.id.tv_personal)
    TextView mPersonal;




    public  static XiangqingFragment getInstance(){

        XiangqingFragment wodeFragment = new XiangqingFragment();
        return  wodeFragment;
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_xiang_qiang;
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
    }

    @Override
    protected void initUI() {

    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void event(MessageXiangqing messageXiangqing) {
        mIntro.setText(messageXiangqing.getGatherBean().getData().getAlbum().getIntro());
        Glide.with(getActivity()).load(messageXiangqing.getGatherBean().getData().getUser().getSmallLogo()).asBitmap()  //这句不能少，否则下面的方法会报错
                .centerCrop()
                .into(new BitmapImageViewTarget(mRoundImageView) {
                    @Override
                    protected void setResource(Bitmap resource) {
                        RoundedBitmapDrawable circularBitmapDrawable =
                                RoundedBitmapDrawableFactory.create(getResources(), resource);
                        circularBitmapDrawable.setCircular(true);
                        mRoundImageView.setImageDrawable(circularBitmapDrawable);
                    }
                });


        mName.setText(messageXiangqing.getGatherBean().getData().getUser().getNickname());
        setAnchorGrade(messageXiangqing.getGatherBean().getData().getUser().getAnchorGrade());
        mFollowers.setText("已被"+ AmountUtils.getAmount(messageXiangqing.getGatherBean().getData().getUser().getFollowers())+"人关注");
        mPersonal.setText(messageXiangqing.getGatherBean().getData().getUser().getPersonalSignature());
    }
    public void setAnchorGrade(int id)
    {
        switch (id) {
            case 0:
                mImageV.setImageDrawable(getActivity().getDrawable(R.drawable.host_anchor_level_0));
                break;
            case 1:
                mImageV.setImageDrawable(getActivity().getDrawable(R.drawable.host_anchor_level_1));
                break;
            case 2:
                mImageV.setImageDrawable(getActivity().getDrawable(R.drawable.host_anchor_level_2));
                break;
            case 3:
                mImageV.setImageDrawable(getActivity().getDrawable(R.drawable.host_anchor_level_3));
                break;
            case 4:
                mImageV.setImageDrawable(getActivity().getDrawable(R.drawable.host_anchor_level_4));
                break;
            case 5:
                mImageV.setImageDrawable(getActivity().getDrawable(R.drawable.host_anchor_level_5));
                break;
            case 6:
                mImageV.setImageDrawable(getActivity().getDrawable(R.drawable.host_anchor_level_6));
                break;
            case 7:
                mImageV.setImageDrawable(getActivity().getDrawable(R.drawable.host_anchor_level_7));
                break;
            case 8:
                mImageV.setImageDrawable(getActivity().getDrawable(R.drawable.host_anchor_level_8));
                break;
            case 9:
                mImageV.setImageDrawable(getActivity().getDrawable(R.drawable.host_anchor_level_9));
                break;
            case 10:
                mImageV.setImageDrawable(getActivity().getDrawable(R.drawable.host_anchor_level_10));
                break;
            case 11:
                mImageV.setImageDrawable(getActivity().getDrawable(R.drawable.host_anchor_level_11));
                break;
            case 12:
                mImageV.setImageDrawable(getActivity().getDrawable(R.drawable.host_anchor_level_12));
                break;
            case 13:
                mImageV.setImageDrawable(getActivity().getDrawable(R.drawable.host_anchor_level_13));
                break;
            case 14:
                mImageV.setImageDrawable(getActivity().getDrawable(R.drawable.host_anchor_level_14));
                break;
            case 15:
                mImageV.setImageDrawable(getActivity().getDrawable(R.drawable.host_anchor_level_15));
                break;
            case 16:
                mImageV.setImageDrawable(getActivity().getDrawable(R.drawable.host_anchor_level_16));
                break;
        }

    }

}
