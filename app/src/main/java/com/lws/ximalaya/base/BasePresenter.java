package com.lws.ximalaya.base;

/**
 * song on 2018/4/6 20:36
 */
public class BasePresenter <V >{
    public V view;

   void attachView(V view){
       this.view = view;
   }


    void detachView(){
       view = null;
    }

}
