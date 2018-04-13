package com.lws.ximalaya.contract;

import com.lws.ximalaya.base.BaseModel;
import com.lws.ximalaya.base.BaseView;
import com.lws.ximalaya.bean.Ximalayabaen;

import io.reactivex.Observable;

/**
 * song on 2018/4/8 02:06
 */
public interface HomeContract {
  interface View extends BaseView{
      void showError();
      void showLoading( Ximalayabaen ximalayabaen);
  }
  interface Presenter {
     void getLatest();
  }
  interface Model extends BaseModel {
      Observable<Ximalayabaen> getData();
  }
}
