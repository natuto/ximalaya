package com.lws.ximalaya.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lws.ximalaya.R;

/**
 * song on 2018/4/6 21:58
 */
public class XiangsiFragment extends Fragment{

    public  static XiangsiFragment getInstance(){

        XiangsiFragment wodeFragment = new XiangsiFragment();
        return  wodeFragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.xiangsi_framgnet,container,false);
    }
}
