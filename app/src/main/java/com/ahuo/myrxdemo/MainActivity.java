package com.ahuo.myrxdemo;

import android.view.View;
import android.widget.TextView;

import com.ahuo.myrxdemo.base.BaseActivity;
import com.ahuo.myrxdemo.net.HttpManager;

public class MainActivity extends BaseActivity implements View.OnClickListener{

   // @BindView(R.id.tv_login)
   // TextView mTvLogin;
    private TextView mTvLogin;


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initData() {
        mTvLogin= (TextView) findViewById(R.id.tv_login);
        mTvLogin.setOnClickListener(this);
        mTvLogin.setText("登录");
    }


    /*@OnClick(R.id.tv_login)
    private void login(){
        HttpManager.getLogin();
    }
*/
    @Override
    public void onClick(View view) {
        HttpManager.getLogin();
    }
}
