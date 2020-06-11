package com.aashraf.nytimesjava.domain;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import com.aashraf.nytimesjava.R;
import com.aashraf.nytimesjava.models.News;
import com.aashraf.nytimesjava.models.Response;
import com.aashraf.nytimesjava.models.data.remote.NYAPIService;
import com.aashraf.nytimesjava.presentation.NYView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

 public class  Repo {
     public List<News> newsList;
     public NYView nyView;

     public Repo(List<News> newsList, NYView nyView
     ){
         this.newsList=newsList;
         this.nyView =nyView;

     }

   public List<News> getdata() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.nytimes.com")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        NYAPIService nYAPIService = retrofit.create(NYAPIService.class);

        nYAPIService.getNyTimesData("O7FLHg4wwR7XxTC7x7smXXcahSznXXQm").enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                if (response.code() == 200) {
                    response.body().getCopyright();
                    newsList = response.body().getNews();
                    nyView.setData(newsList);
                }
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

            }
        });
   return newsList; }
}
