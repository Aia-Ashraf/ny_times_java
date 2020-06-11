package com.aashraf.nytimesjava.models.data.remote;

import com.aashraf.nytimesjava.models.Response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NYAPIService {
    @GET("/svc/mostpopular/v2/viewed/7.json")
    Call<Response> getNyTimesData(@Query("api-key") String var1);
}
