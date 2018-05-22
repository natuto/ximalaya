package com.lws.ximalaya.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lws.ximalaya.R;
import com.lws.ximalaya.bean.DiscoveryBean;
import com.lws.ximalaya.bean.GarhetMoreBean;
import com.lws.ximalaya.ui.activity.PlayDetailActivity;
import com.lws.ximalaya.utils.AmountUtils;
import com.lws.ximalaya.utils.TimeUtils;

import java.io.IOException;
import java.util.ArrayList;

/**
 * song on 2018/4/17 01:15
 */
public class RecommendAdaper extends BaseQuickAdapter<DiscoveryBean.DataBean,BaseViewHolder> {
    private Context mContext;
    private boolean isPlay = true;
    public MediaPlayer mediaPlayer = new MediaPlayer();
    private  int p;
    public RecommendAdaper(int layoutResId , Context context) {
        super(layoutResId);
        this.mContext = context;
    }




    /**
     * Implement this method and use the helper to adapt the view to the given item.
     *
     * @param helper A fully initialized helper.
     * @param item   The item that needs to be displayed.
     */
    @Override
    protected void convert(final BaseViewHolder helper, final DiscoveryBean.DataBean item) {
        Glide.with(mContext).load(item.getTrackItem().getCoverSmall()).into(helper.<ImageView>getView(R.id.image));
        helper.setText(R.id.tv_time,TimeUtils.getPlayTime(item.getTrackItem().getDuration()) );
        helper.setText(R.id.tv_title,item.getTrackItem().getTitle());
        helper.setText(R.id.tv_name,item.getTrackItem().getNickname());
        helper.getView(R.id.rl_click).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (isPlay) {


                    iniMediaPlayerFile(item.getTrackItem().getPlayPath32());
                    isPlay = false;
                    helper.<ImageView>getView(R.id.image_start).setImageDrawable(mContext.getDrawable(R.drawable.notify_btn_light_pause_normal));

                }else {
                    isPlay =true;
                    helper.<ImageView>getView(R.id.image_start).setImageDrawable(mContext.getDrawable(R.drawable.notify_btn_light_play_normal));
                    pauseMusic();
                }


            }
        });


    }
    public void playMusic() {

        mediaPlayer.start();
    }

    public void pauseMusic() {
        mediaPlayer.pause();

    }



    public void iniMediaPlayerFile(String url) {
        mediaPlayer.reset();
        try {
            mediaPlayer.setDataSource(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mediaPlayer.prepareAsync();
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {

                mediaPlayer.start();
            }
        });

    }
}
