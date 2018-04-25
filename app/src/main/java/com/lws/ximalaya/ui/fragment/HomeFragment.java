package com.lws.ximalaya.ui.fragment;


import android.graphics.Typeface;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import android.os.Handler;


import com.lws.ximalaya.R;
import com.lws.ximalaya.base.BaseFragment;
import com.lws.ximalaya.base.BaseMVPFragment;
import com.lws.ximalaya.bean.Ximalayabaen;
import com.lws.ximalaya.contract.HomeContract;
import com.lws.ximalaya.peresenter.HomePresenter;

import com.lws.ximalaya.ui.adapter.FragmentAdaper;
import com.lws.ximalaya.ui.adapter.HomeRecyclerViewAdaper;
import com.lws.ximalaya.ui.adapter.MyBanner;
import com.lws.ximalaya.ui.message.MessageCategory;
import com.orhanobut.logger.Logger;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;


import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;

import java.util.List;



import butterknife.BindView;


/**
 * song on 2018/4/6 21:58
 */
public class HomeFragment extends BaseMVPFragment<HomePresenter> implements HomeContract.View ,OnBannerListener,ViewPager.OnPageChangeListener {
   @BindView(R.id.banner)
    Banner mBanner;
   @BindView(R.id.view_pager)
    ViewPager mViewPager;
   @BindView(R.id.ll_indicator)
    LinearLayout mLinearLayout;
   @BindView(R.id.text_switcher)
    TextSwitcher mTextSwitcher;
   @BindView(R.id.tv_kuaibao)
   TextView mTextView;
   @BindView(R.id.home_recycler)
   RecyclerView mRecyclerView;


   private List<String> mListImage ;
   private List<BaseFragment> mFragments;
   private int p =0;
   private boolean isText =true;
   //内存泄漏　不推荐这样写
   private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            mTextSwitcher.setText((String)msg.obj);

        }
    };

    private List<Ximalayabaen.ListBeanX> mXList;
    private HomeRecyclerViewAdaper mHomeRecyclerViewAdaper;
    private Thread mThread;


    public  static HomeFragment getInstance(){
        HomeFragment homeFragment = new HomeFragment();
        return  homeFragment;

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected HomePresenter getPresanter() {
        return new HomePresenter();
    }

    @Override
    protected void initData() {

        mPresenter.getLatest();

    }

    @Override
    public void onResume() {
        super.onResume();

         isText =true;
    }

    @Override
    public void onPause() {
        super.onPause();
      isText =false;

    }

    @Override
    protected void initUI() {
        mListImage = new ArrayList<>();
        mFragments = new ArrayList<>();
        mXList = new ArrayList<>();
        mFragments.add(CategoryFragment.getInstance());
        mFragments.add(CategoryTwoFragment.getInstance());
        mViewPager.addOnPageChangeListener(this);
        mViewPager.setAdapter(new FragmentAdaper(getChildFragmentManager(),mFragments));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mHomeRecyclerViewAdaper = new HomeRecyclerViewAdaper(getActivity(),mXList );
       // mHomeRecycleAdapter.openLoadAnimation();
        mRecyclerView.setAdapter(mHomeRecyclerViewAdaper);
        initIndicator();
        initTextSwitcher();
        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(),"fut.ttf" );
        mTextView.setTypeface(typeface);



    }

    @Override
    public void showError() {

    }

    @Override
    public void showLoading(Ximalayabaen ximalayabaen) {
        if (ximalayabaen.getList() != null) {
            for (int i= 0; i < ximalayabaen.getList().get(0).getList().get(0).getData().size() ; i++) {
                mListImage.add( ximalayabaen.getList().get(0).getList().get(0).getData().get(i).getCover());

            }

            for (int i = 4; i < 13 ; i++) {
                if (ximalayabaen.getList().get(i).getList().size() > 0 ){
                    if ( !ximalayabaen.getList().get(i).getModuleType().equals("playlist")) {
                    mXList.add(ximalayabaen.getList().get(i));
                    }

                }

            }


            mHomeRecyclerViewAdaper.replaceData(mXList);
            EventBus.getDefault().postSticky(new MessageCategory(ximalayabaen));
            setBanner();
            textSwitcherThread(ximalayabaen);
            mTextView.setText(getString(R.string.kuaibao));




        }

    }

    private void setBanner() {
        mBanner.setImages(mListImage);
;       mBanner.setImageLoader(new MyBanner());
        mBanner.setIndicatorGravity(BannerConfig.RIGHT);
        mBanner.setBannerAnimation(Transformer.DepthPage);
        mBanner.setDelayTime(3000);
        mBanner.start();
    }
    public void textSwitcherThread(final Ximalayabaen ximalayabaen){
        mThread = new Thread(new Runnable() {
           @Override
           public void run() {
               int i=0;
               while (isText){
                   Message message = Message.obtain();

                   message.obj = ximalayabaen.getList().get(2).getList().get(i).getTitle();
                   mHandler.sendMessage(message);
                   if ( i==2){
                       i=0;
                   }
                   i++;

                   SystemClock.sleep(4000);



               }

           }
       });
        mThread.start();

    }

    @Override
    public void OnBannerClick(int position) {

    }
    public void initTextSwitcher(){
        mTextSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView tv = new  TextView(getActivity());
                tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14.0F);
                tv.setSingleLine(true);
                tv.setEllipsize(TextUtils.TruncateAt.END);

                return tv;
            }
        });
        mTextSwitcher.setInAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.text_switcher));
        mTextSwitcher.setOutAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.text_switcher1));

    }
    public void initIndicator(){

        for (int i = 0; i < 2 ; i++) {
            View view = new View(getActivity());
            view.setBackgroundResource(R.drawable.category_indicator_bg);
            view.setEnabled(false);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(8, 6);
            if (i!=0)
            layoutParams.leftMargin = 8;
            mLinearLayout.addView(view, layoutParams);

        }
        mLinearLayout.getChildAt(0).setEnabled(true);
    }



    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }


    @Override
    public void onPageSelected(int position) {

        mLinearLayout.getChildAt(p).setEnabled(false);
        mLinearLayout.getChildAt(position).setEnabled(true);
        p = position;

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
