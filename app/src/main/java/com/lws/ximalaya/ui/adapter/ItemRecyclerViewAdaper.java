package com.lws.ximalaya.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lws.ximalaya.R;
import com.lws.ximalaya.bean.Ximalayabaen;
import com.lws.ximalaya.ui.activity.GatherDetailActivity;
import com.lws.ximalaya.utils.AmountUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * song on 2018/4/11 21:06
 */
public class ItemRecyclerViewAdaper  extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private Context mContext;
    private List<Ximalayabaen.ListBeanX.ListBean> mListBeans;
    public ItemRecyclerViewAdaper(Context context ,List<Ximalayabaen.ListBeanX.ListBean> data) {
        this.mListBeans = data;
        this.mContext = context;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.home_recycler_item_recycler,parent ,false);

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
    @Override
    public int getItemCount() {
        if (mListBeans.size()>0) {

            return mListBeans.size();
        }
        return 0;

    }
    public class ItemViewHoder extends RecyclerView.ViewHolder{
        @BindView(R.id.iv_pic)
        ImageView mImageView;
        @BindView(R.id.tv_title)
        TextView mTitle;
        @BindView(R.id.tv_subtitle)
        TextView mSubTitle;
        @BindView(R.id.tv_count)
        TextView mCount;
        @BindView(R.id.tv_tracks)
        TextView mTracks;
        @BindView(R.id.linerlayout)
        LinearLayout mLinearLayout;

        public ItemViewHoder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
        private void bindItem(final int position){


        mTitle.setText(mListBeans.get(position).getTitle());
        mSubTitle.setText(mListBeans.get(position).getSubtitle());
        mCount.setText(AmountUtils.getAmount(mListBeans.get(position).getPlayCount()) );
        mTracks.setText(mListBeans.get(position).getTracksCount()+"集");
        Glide.with(mContext).load(mListBeans.get(position).getPic()).into(mImageView);
            mLinearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(mContext, GatherDetailActivity.class);
                    intent.putExtra("id",mListBeans.get(position).getAlbumId() );
                    mContext.startActivity(intent);
                }
            });
        }
    }
}
