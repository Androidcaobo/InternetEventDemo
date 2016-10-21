package com.caobo.interneteventdemo.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.caobo.interneteventdemo.R;
import com.caobo.interneteventdemo.activity.ZhaoNongHuoActivity;
import com.caobo.interneteventdemo.adapter.RollViewAdapter;
import com.jude.rollviewpager.RollPagerView;

/**
 * Created by 曹博 on 2016/10/19.
 */

public class HomeFragment extends Fragment implements View.OnClickListener{

    //图片轮播
    private RollPagerView mRollViewPager;
    private View view;
    private TextView mZhaoNongHuo;
    private TextView mZhaoNongJi;
    private TextView mZhinan;
    private TextView mKeFu;




    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home,container,false);




       //初始化控件
        ininUI();


        //设置播放时间间隔
        mRollViewPager.setPlayDelay(2000);
        //设置透明度
        mRollViewPager.setAnimationDurtion(500);
        //设置适配器
        mRollViewPager.setAdapter(new RollViewAdapter());

        //绑定点击事件
        mZhaoNongHuo.setOnClickListener(this);
        mZhaoNongJi.setOnClickListener(this);
        mZhinan.setOnClickListener(this);
        mKeFu.setOnClickListener(this);

        return view;
    }

    /**
     * 初始化控件
     */
    private void ininUI() {
        //图片轮播
        mRollViewPager = (RollPagerView) view.findViewById(R.id.roll_view_pager);
        mZhaoNongHuo = (TextView) view.findViewById(R.id.tv_zhaononghuo);
        mZhaoNongJi = (TextView) view.findViewById(R.id.tv_zhaonongji);
        mZhinan = (TextView) view.findViewById(R.id.tv_zhinan);
        mKeFu = (TextView) view.findViewById(R.id.tv_kefu);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_zhaononghuo:
                Intent i1 = new Intent(getActivity(), ZhaoNongHuoActivity.class);
                startActivity(i1);
                break;
            case R.id.tv_zhaonongji:
                Intent i2 = new Intent(getActivity(), ZhaoNongHuoActivity.class);
                startActivity(i2);
                break;
            case R.id.tv_zhinan:
                Intent i3 = new Intent(getActivity(), ZhaoNongHuoActivity.class);
                startActivity(i3);
                break;
            case R.id.tv_kefu:
                Intent i4 = new Intent(getActivity(), ZhaoNongHuoActivity.class);
                startActivity(i4);
                break;
            default:
                break;
        }
    }
}
