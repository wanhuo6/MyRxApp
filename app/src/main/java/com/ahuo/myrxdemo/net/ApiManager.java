package com.ahuo.myrxdemo.net;

/**
 * Created on 17-7-7
 *
 * @author liuhuijie
 */

public class ApiManager {

    public static ApiManager mApiManager;

    public  ApiService mApiService;

    private ApiManager(){

    }

    public static ApiManager getInstance() {
        if (mApiManager == null) {
            mApiManager = new ApiManager();
        }
        return mApiManager;
    }

    public ApiService getApiService(){
        if (mApiService==null){
            mApiService=RetrofitManager.build().create(ApiService.class);
        }
        return mApiService;
    }




}
