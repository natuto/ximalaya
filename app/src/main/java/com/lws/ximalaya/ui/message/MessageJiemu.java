package com.lws.ximalaya.ui.message;

import com.lws.ximalaya.bean.GatherBean;

/**
 * song on 2018/4/16 23:02
 */
public class MessageJiemu {
    private GatherBean mGatherBean;
    private int id;

    public int getId() {
        return id;
    }

    public MessageJiemu(GatherBean gatherBean, int id) {
        mGatherBean = gatherBean;
        this.id = id;
    }

    public GatherBean getGatherBean() {
        return mGatherBean;
    }
}
