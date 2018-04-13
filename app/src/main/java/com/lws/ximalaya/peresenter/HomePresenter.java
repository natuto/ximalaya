package com.lws.ximalaya.peresenter;

import com.lws.ximalaya.base.BasePresenter;
import com.lws.ximalaya.bean.Ximalayabaen;
import com.lws.ximalaya.contract.HomeContract;
import com.lws.ximalaya.model.HomeModel;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * song on 2018/4/8 03:16
 */
public class HomePresenter extends BasePresenter <HomeContract.View>implements HomeContract.Presenter {
    private HomeModel mHomeModel;

    public HomePresenter() {
        mHomeModel = new HomeModel();
    }

    @Override
    public void getLatest() {
        mHomeModel.getData().
                 subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Ximalayabaen>() {
                               @Override
                               public void accept(Ximalayabaen ximalayabaen) throws Exception {
                                   view.showLoading(ximalayabaen);


                               }
                           }, new Consumer<Throwable>() {
                               @Override
                               public void accept(Throwable throwable) throws Exception {

                               }
                           }

                );
    }
}
