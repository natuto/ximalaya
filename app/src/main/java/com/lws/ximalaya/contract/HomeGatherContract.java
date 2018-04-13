package com.lws.ximalaya.contract;

import com.lws.ximalaya.base.BaseModel;
import com.lws.ximalaya.base.BaseView;
import com.lws.ximalaya.bean.GatherBean;
import com.lws.ximalaya.bean.Ximalayabaen;

import io.reactivex.Observable;

/**
 * song on 2018/4/8 02:06
 */
public interface HomeGatherContract {
  interface View extends BaseView{
      void showError();
      void showLoading(GatherBean gatherBean ,boolean is);
  }
  interface Presenter {
      void getLatest(int id);
      void getMore(int id, int page);
  }
  interface Model extends BaseModel {
      Observable<GatherBean> getData(int id , int page);
  }
}
