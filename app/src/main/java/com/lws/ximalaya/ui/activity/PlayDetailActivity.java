package com.lws.ximalaya.ui.activity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.IBinder;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lws.ximalaya.R;
import com.lws.ximalaya.base.BaseMVPActivity;
import com.lws.ximalaya.bean.GarhetMoreBean;
import com.lws.ximalaya.bean.PlayDetailBean;
import com.lws.ximalaya.contract.PlayDetailContract;
import com.lws.ximalaya.peresenter.PlayDetailPresenter;
import com.lws.ximalaya.service.MediaService;
import com.orhanobut.logger.Logger;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.concurrent.ExecutionException;

import butterknife.BindView;

public class PlayDetailActivity extends BaseMVPActivity<PlayDetailPresenter>implements PlayDetailContract.View,View.OnClickListener{
    public static PlayDetailActivity instance = null;
    @BindView(R.id.iv_start_play)
    ImageView mImageStartPlay;
    @BindView(R.id.tv_title)
    TextView mTitle;
    @BindView(R.id.iv_image)
    ImageView mImageView;
    @BindView(R.id.iv_left_play)
    ImageView mLeftPlay;
    @BindView(R.id.iv_right_play)
    ImageView mRightPlay;
    @BindView(R.id.seek_bar)
    SeekBar mSeekBar;
    @BindView(R.id.tv_current_time)
    TextView mCurrentTime;
    @BindView(R.id.tv_duration)
    TextView mDuration;
    private Bundle mBundle;
    private List<GarhetMoreBean.DataBean.ListBean> mList;
    private int p;
    private MediaService.MyBinder mMyBinder;
    private boolean isPlay = true;
    public  boolean  isStart =true;
    private SimpleDateFormat time = new SimpleDateFormat("m:ss");
    private Handler mHandler = new Handler();
    public String imageUrl;
    public boolean isRoundShow;


    @Override
    protected int getLayoutId() {
        return R.layout.activity_gather_play_detail;
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (!isStart) {

            if (getIntent().getBooleanExtra("start", false)) {

                if (!isPlay) {
                    mMyBinder.playMusic();
                    isPlay = true;
                    isRoundShow=true;
                    mImageStartPlay.setImageDrawable(getDrawable(R.drawable.notify_btn_light_pause2_normal));
                }
            } else {
                Bundle bundle = getIntent().getBundleExtra("data");
                mList = bundle.getParcelableArrayList("data");
                p = bundle.getInt("position");
                cutMedia(p, mList);


            }

        }
        isStart =false;

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override
    public void initUI() {
        instance = this;
        mLeftPlay.setOnClickListener(this);
        mRightPlay.setOnClickListener(this);
        mImageStartPlay.setOnClickListener(this);



    }
    public void stopMedia(){
        stopHandel();
        mMyBinder.closeMedia();

    }


    @Override
    public void initData() {
        Intent intent = new Intent(this,MediaService.class);
        startService(intent);
        bindService(intent,mServiceConnection,  BIND_AUTO_CREATE );

        mBundle = getIntent().getBundleExtra("data");
        mList = mBundle.getParcelableArrayList("data");
        p= mBundle.getInt("p");

        int id = mBundle.getInt("id");
        mPresenter.getLatest(id);


    }

    @Override
    protected PlayDetailPresenter getPresanter() {
        return new PlayDetailPresenter();
    }

    @Override
    public void showError() {

    }

    @Override
    public void showLoading(PlayDetailBean playDetailBean) {
        if (playDetailBean != null) {
            mTitle.setText(playDetailBean.getTrackInfo().getTitle());
            Glide.with(this).load(playDetailBean.getTrackInfo().getCoverLarge()).centerCrop().into(mImageView);
            mMyBinder.iniMediaPlayerFile(playDetailBean.getTrackInfo().getPlayUrl32());
            mImageStartPlay.setImageDrawable(getDrawable(R.drawable.notify_btn_light_pause2_normal));

            imageUrl = playDetailBean.getTrackInfo().getCoverLarge();
            isRoundShow = true;


        }
    }
    public  void cutMedia(int p ,List<GarhetMoreBean.DataBean.ListBean> list){
        isRoundShow = true;
        imageUrl = list.get(p).getCoverLarge();
        mTitle.setText(list.get(p).getTitle());
        Glide.with(this).load(list.get(p).getCoverLarge()).centerCrop().into(mImageView);
        mMyBinder.iniMediaPlayerFile(list.get(p).getPlayUrl32());
        mImageStartPlay.setImageDrawable(getDrawable(R.drawable.notify_btn_light_pause2_normal));


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
       // mMyBinder.closeMedia();
        stopHandel();
        stopMedia();
        unbindService(mServiceConnection);
        stopService(new Intent(this, MediaService.class));
    }
    public void stopHandel(){
        mHandler.removeCallbacks(mRunnable);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_right_play:

                if (( mList.size() >  p) && ( p >= 0 )){
                    cutMedia(++p,mList );
                }
                break;
            case R.id.iv_left_play:

                if (( mList.size() > p) && ( p >= 0 )){
                cutMedia(--p,mList );
                }
                break;
            case R.id.iv_start_play:
                if (isPlay) {
                    isPlay = false;
                    mMyBinder.pauseMusic();
                    isRoundShow =false;
                    mImageStartPlay.setImageDrawable(getDrawable(R.drawable.notify_btn_light_play2_normal));

                }else {
                    mMyBinder.playMusic();
                    isPlay = true;
                    isRoundShow =true;
                    mImageStartPlay.setImageDrawable(getDrawable(R.drawable.notify_btn_light_pause2_normal));
                }

                break;
            case R.id.iv_back:
                moveTaskToBack(true);
                break;
        }
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode==KeyEvent.KEYCODE_BACK){
            moveTaskToBack(true);
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }
    private ServiceConnection mServiceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            mMyBinder = (MediaService.MyBinder) iBinder;

            mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                     if (b) {
                         mMyBinder.seekToPositon(seekBar.getProgress());


                     }
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
            mHandler.post(mRunnable);
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    };
    private Runnable mRunnable = new Runnable() {
        @Override
        public void run() {
                mDuration.setText(time.format(mMyBinder.getDuration()));
                mSeekBar.setMax(mMyBinder.getDuration());
                mSeekBar.setProgress(mMyBinder.getPlayPosition());
                mCurrentTime.setText(time.format(mMyBinder.getPlayPosition()));

            mHandler.postDelayed(mRunnable, 1000);
        }
    };


}
