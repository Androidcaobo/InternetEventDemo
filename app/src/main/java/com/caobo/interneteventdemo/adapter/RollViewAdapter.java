package com.caobo.interneteventdemo.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.caobo.interneteventdemo.R;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;

/**
 * Created by 曹博 on 2016/10/19.
 * 图片轮播适配器
 */

public class RollViewAdapter extends StaticPagerAdapter {
    private int[] imgs = {
            R.drawable.test1,
            R.drawable.test2,

    };


    @Override
    public View getView(ViewGroup container, int position) {
        ImageView view = new ImageView(container.getContext());
        view.setImageResource(imgs[position]);
        view.setScaleType(ImageView.ScaleType.CENTER_CROP);
        view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        return view;
    }


    @Override
    public int getCount() {
        return imgs.length;
    }
}
