package com.ahuo.myrxdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created on 17-7-6
 *
 * @author liuhuijie
 */

public abstract class BaseActivity extends AppCompatActivity {

   protected Unbinder mUnBinder = null;



   @Override
   protected void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      mUnBinder = ButterKnife.bind(this);
      setContentView(getLayoutId());
      initData();
   }

   protected abstract int getLayoutId();


   public abstract void initData();




   @Override
   protected void onDestroy() {
      super.onDestroy();
      mUnBinder.unbind();
   }
}
