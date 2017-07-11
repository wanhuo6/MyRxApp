package com.ahuo.myrxdemo.net;

import android.support.annotation.NonNull;
import android.util.Log;

import com.ahuo.myrxdemo.entity.response.LoginResponse;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created on 17-7-6
 *
 * @author liuhuijie
 */

public class HttpManager {

    public static void getLogin2(){
    }


    public static void getLogin() {

        ApiManager.getInstance().getApiService().getLogin("wanhuo", "123456")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        new Consumer<LoginResponse>() {
                            @Override
                            public void accept(@NonNull LoginResponse response) throws Exception {
                                Log.e("----","-----");
                            }
                        }, new Consumer<Throwable>() {
                            @Override
                            public void accept(@NonNull Throwable throwable) throws Exception {
                                Log.e("---","faild"+throwable);
                                Log.e("---",HttpExceptionUtils.handleException(throwable));
                            }
                        }
                );
    }

}
