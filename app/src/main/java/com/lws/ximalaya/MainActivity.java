package com.lws.ximalaya;


import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import android.os.Bundle;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.lws.ximalaya.base.BaseActivity;
import com.lws.ximalaya.service.MediaService;
import com.lws.ximalaya.ui.activity.PlayDetailActivity;
import com.lws.ximalaya.ui.fragment.FaxianFragment;
import com.lws.ximalaya.ui.fragment.HomeFragment;
import com.lws.ximalaya.ui.fragment.WodeFragment;
import com.lws.ximalaya.ui.fragment.WotingFragment;
import com.lws.ximalaya.utils.TimeUtils;
import com.lws.ximalaya.view.RoundImageView;
import com.orhanobut.logger.Logger;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity{
   @BindView(R.id.rbHome)
   RadioButton mHomeRb;
   @BindView(R.id.rbWoting)
   RadioButton mWodingRb;
   @BindView(R.id.rbFanxian)
   RadioButton mFaxianRb;
   @BindView(R.id.rbWode)
   RadioButton mWodeRb;
   @BindView(R.id.iv_round)
   ImageView mRoundImageView;
   @BindView(R.id.iv_start)
   ImageView mStartImageView;

   private HomeFragment mHomeFragment;
   private WotingFragment mWotingFragment;
   private FaxianFragment mFaxianFragment;
   private WodeFragment mWodeFragment;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initUI() {
        Logger.d(TimeUtils.getTimesamp());
        showHomeFragment();

    }

    @Override
    protected void onStart() {
        super.onStart();
        if (PlayDetailActivity.instance !=null) {

            if (PlayDetailActivity.instance.isRoundShow) {
                mRoundImageView.setVisibility(View.VISIBLE);
                mStartImageView.setVisibility(View.INVISIBLE);
                animImage();
            } else {
                mRoundImageView.setVisibility(View.INVISIBLE);
                mStartImageView.setVisibility(View.VISIBLE);

            }
        }
    }
    public void animImage(){
        // Glide.with(this).load(R.drawable.ruon).into(mRoundImageView);
        // mRoundImageView.setImageDrawable(getDrawable(R.drawable.ruon));
        Glide.with(this).load(PlayDetailActivity.instance.imageUrl).asBitmap()
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
         Animation rotateAnimation = AnimationUtils.loadAnimation(this,R.anim.rotate_round_image);
         mRoundImageView.startAnimation(rotateAnimation);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (PlayDetailActivity.instance!= null) {
            PlayDetailActivity.instance.finish();
        }


        //stopService(new Intent(this, MediaService.class));
    }

    @Override
    public void initData() {

    }
    public void showHomeFragment(){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        hideAllFragment(fragmentTransaction);
        if(mHomeFragment == null){
            mHomeFragment = HomeFragment.getInstance();
            fragmentTransaction.add(R.id.fragment,mHomeFragment);
        }
        commitShowFragment(fragmentTransaction,mHomeFragment);
    }
    public void showWotingFragment(){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        hideAllFragment(fragmentTransaction);
        if(mWotingFragment == null){
            mWotingFragment = WotingFragment.getInstance();
            fragmentTransaction.add(R.id.fragment,mWotingFragment);
        }
        commitShowFragment(fragmentTransaction,mWotingFragment);
    }
    public void showFaxianFragment(){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        hideAllFragment(fragmentTransaction);
        if(mFaxianFragment == null){
            mFaxianFragment = FaxianFragment.getInstance();
            fragmentTransaction.add(R.id.fragment,mFaxianFragment);
        }
        commitShowFragment(fragmentTransaction,mFaxianFragment);
    }
    public void showWodeFragment(){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        hideAllFragment(fragmentTransaction);
        if(mWodeFragment == null){
            mWodeFragment = mWodeFragment.getInstance();
            fragmentTransaction.add(R.id.fragment,mWodeFragment);
        }
        commitShowFragment(fragmentTransaction,mWodeFragment);
    }
    public void commitShowFragment(FragmentTransaction fragmentTransaction,Fragment fragment){
        fragmentTransaction.show(fragment);
        fragmentTransaction.commit();

    }
    public void hideAllFragment(FragmentTransaction fragmentTransaction){
        hideFragment(fragmentTransaction,mHomeFragment);
        hideFragment(fragmentTransaction,mWotingFragment);
        hideFragment(fragmentTransaction,mFaxianFragment);
        hideFragment(fragmentTransaction,mWodeFragment);
    }

   public void hideFragment(FragmentTransaction fragmentTransaction,Fragment fragment){
        if(fragment!=null){
            fragmentTransaction.hide(fragment);
        }
    }
    @OnClick({R.id.rbHome,R.id.rbWoting,R.id.rbFanxian,R.id.rbWode,R.id.iv_start,R.id.iv_round})
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.rbHome:
                showHomeFragment();
                break;
            case R.id.rbWoting:
                showWotingFragment();
                break;
            case R.id.rbFanxian:
                showFaxianFragment();
                break;
            case R.id.rbWode:
                showWodeFragment();
                break;
            case R.id.iv_start:
                if (PlayDetailActivity.instance !=null) {

                Intent intent = new Intent(this, PlayDetailActivity.class);
                boolean is = true;
                intent.putExtra("start",is);
                startActivity(intent);}

                break;
            case R.id.iv_round:
                if (PlayDetailActivity.instance !=null) {
                    Intent intent = new Intent(this, PlayDetailActivity.class);
                    boolean is = true;
                    intent.putExtra("start",is);
                    startActivity(intent);}
                break;
        }

    }
}
