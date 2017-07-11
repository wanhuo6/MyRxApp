package com.ahuo.myrxdemo;

import android.app.Application;

/**
 * Created on 17-7-6
 *
 * @author liuhuijie
 */

public class MyApplication extends Application{

    public static MyApplication myApplication;

    public static MyApplication getInstance(){
        return myApplication;
    }



}
