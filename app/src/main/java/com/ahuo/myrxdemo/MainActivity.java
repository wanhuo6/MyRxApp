package com.ahuo.myrxdemo;

import android.widget.TextView;

import com.ahuo.myrxdemo.base.BaseActivity;
import com.ahuo.myrxdemo.net.HttpManager;

import butterknife.BindView;
import butterknife.OnClick;


public class MainActivity extends BaseActivity{

    @BindView(R.id.tv_login)
    TextView mTvLogin;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initData() {
        mTvLogin.setText("登录");
    }


    @OnClick(R.id.tv_login)
    void login(){
        HttpManager.getLogin();
    }
}
