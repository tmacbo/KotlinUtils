package com.tmacbo.kotlinutils.server;

import com.tmacbo.kotlinutils.server.req.LoginRequest;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * @Author tmacbo
 * @Since on 2017/6/30  16:18
 * @mail tang_bo@hotmail.com
 * @Description TODO
 */

public interface Api {
    @POST
    Observable<LoginResponse> login(@Body LoginRequest request);

//    @GET
//    Observable<RegisterResponse> register(@Body RegisterRequest request);
}
