package com.ahuo.myrxdemo.net;

import com.ahuo.myrxdemo.core.AppConfig;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/**
 * Created on 17-7-7
 *
 * @author liuhuijie
 */

public class RetrofitManager {

    private static Retrofit mRetrofit;

    public static Retrofit build(){

        if(mRetrofit == null){

            mRetrofit = new Retrofit.Builder()
                    .baseUrl(AppConfig.API_HOST)
                    //.client(HttpClientBuilder.build())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(FastJsonConverterFactory.create())
                    .build();
        }

        return mRetrofit;
    }


}
