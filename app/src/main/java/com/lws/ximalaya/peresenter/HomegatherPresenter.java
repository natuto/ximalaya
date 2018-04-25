package com.lws.ximalaya.peresenter;

import com.lws.ximalaya.base.BasePresenter;
import com.lws.ximalaya.bean.GarhetMoreBean;
import com.lws.ximalaya.bean.GatherBean;
import com.lws.ximalaya.bean.Ximalayabaen;
import com.lws.ximalaya.contract.HomeContract;
import com.lws.ximalaya.contract.HomeGatherContract;
import com.lws.ximalaya.model.HomeGatherModel;
import com.lws.ximalaya.model.HomeModel;
import com.orhanobut.logger.Logger;

;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * song on 2018/4/8 03:16
 */
public class HomegatherPresenter extends BasePresenter <HomeGatherContract.View>implements HomeGatherContract.Presenter {

    private HomeGatherModel mHomeModel;
    private int page=1;
    public HomegatherPresenter() {
        mHomeModel = new HomeGatherModel();
    }

    @Override
    public void getLatest(int id ) {
        page=1;
        mHomeModel.getData(id, page).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<GatherBean>() {
                    @Override
                    public void accept(GatherBean gatherBean) throws Exception {


                        view.showLoading(gatherBean,true);
                    }
                });

    }

    @Override
    public void getMore(int id ,int pa) {



        mHomeModel.getMoreData(id, pa).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<GarhetMoreBean>() {
                    @Override
                    public void accept(GarhetMoreBean garhetMoreBean) throws Exception {



                        view.showLoading(garhetMoreBean,false );

                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {

                    }
                });


    }
}


