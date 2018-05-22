package com.lws.ximalaya.ui.activity;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lws.ximalaya.R;
import com.lws.ximalaya.base.BaseMVPActivity;
import com.lws.ximalaya.bean.GatherBean;

import com.lws.ximalaya.contract.HomeGatherContract;

import com.lws.ximalaya.presenter.HomegatherPresenter;
import com.lws.ximalaya.ui.adapter.GatherFragmentAdaper;
import com.lws.ximalaya.ui.fragment.JiemuFragment;
import com.lws.ximalaya.ui.fragment.XiangqingFragment;
import com.lws.ximalaya.ui.fragment.XiangsiFragment;
import com.lws.ximalaya.ui.message.MessageJiemu;
import com.lws.ximalaya.ui.message.MessageXiangqing;
import com.lws.ximalaya.utils.TimeUtils;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * song on 2018/4/13 01:38
 */
public class GatherDetailActivity extends BaseMVPActivity <HomegatherPresenter> implements HomeGatherContract.View <GatherBean>{
    @BindView(R.id.tv_title)
    TextView mTitle;
    @BindView(R.id.toobar)
    Toolbar mToolbar;
    @BindView(R.id.iv_head)
    ImageView mHeadIamge;
    @BindView(R.id.tv_head_count_play)
    TextView mCountPlayText;
    @BindView(R.id.tv_head_title)
    TextView mTieleText;
    @BindView(R.id.tv_head_nickname)
    TextView mNickNameText;
    @BindView(R.id.tv_head_updata_time)
    TextView mUpdataTimeText;
    @BindView(R.id.tv_head_type)
    TextView mTypeText;
    private Bundle mBundle;
    @BindView(R.id.view_pager)
    ViewPager mViewPager;
    @BindView(R.id.tab_layout)
    TabLayout mTabLayout;
    public int mId;

    @Override
    protected HomegatherPresenter getPresanter() {
        return new HomegatherPresenter();
    }


    @Override
    protected int getLayoutId() {
        return R.layout.home_gather_activity;
    }

    @Override
    public void initUI() {
        initToobar(mToolbar);
        mBundle = getIntent().getBundleExtra("data");
        int t = mBundle.getInt("track");
        List<String> listTitle = new ArrayList<>();
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(XiangqingFragment.getInstance());
        fragments.add(JiemuFragment.getInstance());
        fragments.add(XiangsiFragment.getInstance());
        listTitle.add("详情");
        listTitle.add("节目" + "(" + t + ")");
        listTitle.add("找相似");
        mViewPager.setOffscreenPageLimit(2);
        mViewPager.setAdapter(new GatherFragmentAdaper(getSupportFragmentManager(), fragments, listTitle));
        mTabLayout.setupWithViewPager(mViewPager);
        mViewPager.setCurrentItem(1);

    }

    @Override
    public void initData() {
        mId = mBundle.getInt("id");
        mPresenter.getLatest(mId);


    }

    @Override
    public void showError() {

    }

    @Override
    public void showLoading(GatherBean gatherBean, boolean is) {
        if (is) {
            if (gatherBean.getData().getAlbum() != null) {
            }
            Glide.with(this).load(gatherBean.getData().getAlbum().getCoverLarge()).into(mHeadIamge);
            mCountPlayText.setText(mBundle.getString("count"));
            mTypeText.setText(gatherBean.getData().getAlbum().getCategoryName());
            mTieleText.setText(gatherBean.getData().getAlbum().getTitle());
            mNickNameText.setText(gatherBean.getData().getAlbum().getNickname());
            mUpdataTimeText.setText(TimeUtils.getUpdataTime(gatherBean.getData().getAlbum().getUpdatedAt()));
            EventBus.getDefault().postSticky(new MessageJiemu(gatherBean ,mId));
            EventBus.getDefault().postSticky(new MessageXiangqing(gatherBean));
        } else {

        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
