package com.lws.ximalaya;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.lws.ximalaya.base.BaseActivity;
import com.lws.ximalaya.ui.fragment.FaxianFragment;
import com.lws.ximalaya.ui.fragment.HomeFragment;
import com.lws.ximalaya.ui.fragment.WodeFragment;
import com.lws.ximalaya.ui.fragment.WotingFragment;

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
        showHomeFragment();

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
    @OnClick({R.id.rbHome,R.id.rbWoting,R.id.rbFanxian,R.id.rbWode,R.id.iv_start})
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
                break;
        }

    }
}
