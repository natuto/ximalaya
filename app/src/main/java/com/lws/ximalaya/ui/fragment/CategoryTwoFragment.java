package com.lws.ximalaya.ui.fragment;



import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lws.ximalaya.R;
import com.lws.ximalaya.base.BaseFragment;
import com.lws.ximalaya.bean.Ximalayabaen;
import com.lws.ximalaya.ui.message.MessageCategory;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;

/**
 * song on 2018/4/6 21:58
 */
public class CategoryTwoFragment extends BaseFragment{
    @BindView(R.id.liner_layout1)
    LinearLayout mLinearLayout1;
    @BindView(R.id.image_view1)
    ImageView mImageView1;
    @BindView(R.id.text1)
    TextView mTextView1;
    @BindView(R.id.liner_layout2)
    LinearLayout mLinearLayout2;
    @BindView(R.id.image_view2)
    ImageView mImageView2;
    @BindView(R.id.text2)
    TextView mTextView2;
    @BindView(R.id.liner_layout3)
    LinearLayout mLinearLayout3;
    @BindView(R.id.image_view3)
    ImageView mImageView3;
    @BindView(R.id.text3)
    TextView mTextView3;
    @BindView(R.id.liner_layout4)
    LinearLayout mLinearLayout4;
    @BindView(R.id.image_view4)
    ImageView mImageView4;
    @BindView(R.id.text4)
    TextView mTextView4;
    @BindView(R.id.liner_layout5)
    LinearLayout mLinearLayout5;
    @BindView(R.id.image_view5)
    ImageView mImageView5;
    @BindView(R.id.text5)
    TextView mTextView5;
    @BindView(R.id.liner_layout6)
    LinearLayout mLinearLayout6;
    @BindView(R.id.image_view6)
    ImageView mImageView6;
    @BindView(R.id.text6)
    TextView mTextView6;
    @BindView(R.id.liner_layout7)
    LinearLayout mLinearLayout7;
    @BindView(R.id.image_view7)
    ImageView mImageView7;
    @BindView(R.id.text7)
    TextView mTextView7;
    @BindView(R.id.liner_layout8)
    LinearLayout mLinearLayout8;
    @BindView(R.id.image_view8)
    ImageView mImageView8;
    @BindView(R.id.text8)
    TextView mTextView8;
    @BindView(R.id.liner_layout9)
    LinearLayout mLinearLayout9;
    @BindView(R.id.image_view9)
    ImageView mImageView9;
    @BindView(R.id.text9)
    TextView mTextView9;
    @BindView(R.id.liner_layout10)
    LinearLayout mLinearLayout10;
    @BindView(R.id.image_view10)
    ImageView mImageView10;
    @BindView(R.id.text10)
    TextView mTextView10;

    public  static CategoryTwoFragment getInstance(){

        CategoryTwoFragment categoryFragment = new CategoryTwoFragment();
        return  categoryFragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_category;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initUI() {
        EventBus.getDefault().register(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void event(MessageCategory messageCategory){
        Ximalayabaen ximalayabaen = messageCategory.getXimalayabaen();
        Glide.with(getContext()).load(ximalayabaen.getList().get(1).getList().get(10).getCoverPath()).into(mImageView1);
        mTextView1.setText(ximalayabaen.getList().get(1).getList().get(10).getTitle());
        Glide.with(getContext()).load(ximalayabaen.getList().get(1).getList().get(11).getCoverPath()).into(mImageView2);
        mTextView2.setText(ximalayabaen.getList().get(1).getList().get(11).getTitle());
        Glide.with(getContext()).load(ximalayabaen.getList().get(1).getList().get(12).getCoverPath()).into(mImageView3);
        mTextView3.setText(ximalayabaen.getList().get(1).getList().get(12).getTitle());
        Glide.with(getContext()).load(ximalayabaen.getList().get(1).getList().get(13).getCoverPath()).into(mImageView4);
        mTextView4.setText(ximalayabaen.getList().get(1).getList().get(13).getTitle());
        Glide.with(getContext()).load(ximalayabaen.getList().get(1).getList().get(14).getCoverPath()).into(mImageView5);
        mTextView5.setText(ximalayabaen.getList().get(1).getList().get(14).getTitle());

        Glide.with(getContext()).load(ximalayabaen.getList().get(1).getList().get(15).getCoverPath()).into(mImageView6);
        mTextView6.setText(ximalayabaen.getList().get(1).getList().get(15).getTitle());
        Glide.with(getContext()).load(ximalayabaen.getList().get(1).getList().get(16).getCoverPath()).into(mImageView7);
        mTextView7.setText(ximalayabaen.getList().get(1).getList().get(16).getTitle());
        Glide.with(getContext()).load(ximalayabaen.getList().get(1).getList().get(17).getCoverPath()).into(mImageView8);
        mTextView8.setText(ximalayabaen.getList().get(1).getList().get(17).getTitle());
        Glide.with(getContext()).load(ximalayabaen.getList().get(1).getList().get(18).getCoverPath()).into(mImageView9);
        mTextView9.setText(ximalayabaen.getList().get(1).getList().get(18).getTitle());
        Glide.with(getContext()).load(ximalayabaen.getList().get(1).getList().get(19).getCoverPath()).into(mImageView10);
        mTextView10.setText(ximalayabaen.getList().get(1).getList().get(19).getTitle());

    }


}
