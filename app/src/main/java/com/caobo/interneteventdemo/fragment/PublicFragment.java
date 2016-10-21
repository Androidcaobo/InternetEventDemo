package com.caobo.interneteventdemo.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.caobo.interneteventdemo.R;
import com.caobo.interneteventdemo.activity.ZhaoNongHuoActivity;

/**
 * Created by 曹博 on 2016/10/19.
 */

public class PublicFragment extends Fragment {
    private RelativeLayout mRelativeLayout;
    private View view;
    private Toolbar mToolbar;
    private TextView mConfirm;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_public, null);
        //初始化控件
        initUI();


        mRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(getActivity(), ZhaoNongHuoActivity.class);
                startActivity(i1);
            }
        });

        mConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "已经提交", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    /**
     *初始化控件
     */
    private void initUI() {
        mRelativeLayout = (RelativeLayout) view.findViewById(R.id.rl_sign_up);
        mToolbar = (Toolbar) view.findViewById(R.id.toolbar);
        mConfirm = (TextView) view.findViewById(R.id.tv_confirm);

    }
}
