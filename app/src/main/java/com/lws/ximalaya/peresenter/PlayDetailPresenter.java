package com.lws.ximalaya.peresenter;

import com.lws.ximalaya.base.BasePresenter;
import com.lws.ximalaya.bean.GatherBean;
import com.lws.ximalaya.bean.PlayDetailBean;
import com.lws.ximalaya.contract.HomeGatherContract;
import com.lws.ximalaya.contract.PlayDetailContract;
import com.lws.ximalaya.model.HomeGatherModel;
import com.lws.ximalaya.model.PlayDetailModel;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

;

/**
 * song on 2018/4/8 03:16
 */
public class PlayDetailPresenter extends BasePresenter <PlayDetailContract.View>implements PlayDetailContract.Presenter{

    private PlayDetailModel  mPlayDetailModel;

    public PlayDetailPresenter() {
       mPlayDetailModel = new PlayDetailModel();
    }


    @Override
    public void getLatest(int id) {
        mPlayDetailModel.getData(id).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<PlayDetailBean>() {
                    @Override
                    public void accept(PlayDetailBean playDetailBean) throws Exception {
                        view.showLoading(playDetailBean);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        view.showError();
                    }
                });
    }
}


