package com.ahuo.myrxdemo.net;

import com.ahuo.myrxdemo.base.BaseResponse;
import com.ahuo.myrxdemo.core.NetUrls;
import com.ahuo.myrxdemo.entity.response.LoginResponse;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created on 17-7-6
 *
 * @author liuhuijie
 */

public interface ApiService {

    @FormUrlEncoded
    @POST(NetUrls.REGISTER)
    Observable<BaseResponse> register(@Field("name") String name, @Field("account") String account, @Field("password") String password);

    @GET(NetUrls.LOGIN)
    Observable<LoginResponse> getLogin(@Query("account") String account, @Query("password") String password);

    @GET(NetUrls.GET_USERS)
    Observable<BaseResponse> getUsers();


}
