package com.example.markspc.rmo;

import com.example.markspc.rmo.models.ServerRequest;
import com.example.markspc.rmo.models.ServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Marks PC on 30/11/2017.
 */

public interface  RequestInterface {

    @POST("learn2crack-login-register/")
    Call<ServerResponse> operation(@Body ServerRequest request);
}
