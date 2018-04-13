package com.lws.ximalaya.peresenter;

import com.lws.ximalaya.base.BasePresenter;
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

    public HomegatherPresenter() {
        mHomeModel = new HomeGatherModel();
    }

    @Override
    public void getLatest(int id ) {
        mHomeModel.getData(id, 1).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<GatherBean>() {
                    @Override
                    public void accept(GatherBean gatherBean) throws Exception {


                        view.showLoading(gatherBean,false );
                    }
                });

    }

    @Override
    public void getMore(int id ,int page) {

    }
}


