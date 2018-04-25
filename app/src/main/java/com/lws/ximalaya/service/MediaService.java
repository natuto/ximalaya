package com.lws.ximalaya.service;

import android.app.Service;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;


import com.orhanobut.logger.Logger;

import java.io.IOException;


/**
 * song on 2018/4/19 08:27
 */
public class MediaService extends Service {
    public MediaPlayer mediaPlayer = new MediaPlayer();
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new MyBinder();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
       /* mediaPlayer.stop();
        mediaPlayer.release();*/

    }

    @Override
    public boolean onUnbind(Intent intent) {


        return super.onUnbind(intent);
    }

    public class MyBinder extends Binder{
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
       public  boolean isPlaying(){
           return mediaPlayer.isPlaying();
       }
       public void closeMedia() {
           if (mediaPlayer != null) {
               mediaPlayer.stop();
               mediaPlayer.release();
           }
           }
        ;
        public int getDuration() {
            return mediaPlayer.getDuration();
        }


        /**
         * 获取播放位置
         */
        public int getPlayPosition() {

            return mediaPlayer.getCurrentPosition();
        }
        /**
         * 播放指定位置
         */
        public void seekToPositon(int msec) {
            mediaPlayer.seekTo(msec);
        }


   }
}
