package com.caobo.interneteventdemo.activity;

import android.os.Bundle;
import android.widget.RadioGroup;

import com.caobo.interneteventdemo.R;
import com.caobo.interneteventdemo.fragment.FragmentController;

public class MainActivity extends TranslucentBarActivity {



    //碎片布局管理器
    FragmentController mController;

    RadioGroup mRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);


        //控制fragment显示
        final FragmentController controller = FragmentController.getInstance(R.id.container, this);
        //默认显示第一个
        controller.showFragment(0);
        mRadioGroup = (RadioGroup) findViewById(R.id.rg_button);

        //点击事件
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_home:
                        controller.showFragment(0);
                        break;
                    case R.id.rb_public:
                        controller.showFragment(1);
                        break;
                    case R.id.rb_discover:
                        controller.showFragment(2);
                        break;
                    case R.id.rb_my:
                        controller.showFragment(3);
                        break;
                }
            }
        });


    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }
}
