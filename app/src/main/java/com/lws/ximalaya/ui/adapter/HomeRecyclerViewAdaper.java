package com.lws.ximalaya.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lws.ximalaya.R;
import com.lws.ximalaya.bean.Ximalayabaen;

import java.util.List;
import java.util.logging.Logger;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * song on 2018/4/11 21:06
 */
public class HomeRecyclerViewAdaper extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private Context mContext;
    private List<Ximalayabaen.ListBeanX> mList;
    public HomeRecyclerViewAdaper(Context context , List<Ximalayabaen.ListBeanX> data ) {
        this.mList = data;
        this.mContext = context;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.home_recycler_item,parent ,false);

        return new ItemViewHoder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ItemViewHoder itemViewHoder = (ItemViewHoder)holder;
        itemViewHoder.bindItem(position);

    }

    /**
     * Returns the total number of items in the data set held by the adapter.
     *
     * @return The total number of items in this adapter.
     */
    public void replaceData( List<Ximalayabaen.ListBeanX> data) {

        mList = data;

        notifyDataSetChanged();
    }
    @Override
    public int getItemCount() {
        if (mList.size() > 0) {

            return mList.size();
        }
        return 0;


    }
    public class ItemViewHoder extends RecyclerView.ViewHolder{
        @BindView(R.id.item_recycler)
        RecyclerView mRecyclerView;
        @BindView(R.id.tv_title)
        TextView mTitle;




        public ItemViewHoder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
        public void bindItem(final int position){
            mTitle.setText(mList.get(position).getTitle());
            mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
            mRecyclerView.addItemDecoration(new DividerItemDecoration(mContext,DividerItemDecoration.VERTICAL));
            mRecyclerView.setAdapter(new ItemRecyclerViewAdaper(mContext,mList.get(position).getList()));
        }
    }
}
