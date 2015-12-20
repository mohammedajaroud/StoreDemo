package com.digitalbuddha.daodemo.rest;

import com.digitalbuddha.daodemo.model.RedditData;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

public interface RedditApi {
    @GET("r/aww/new/.json")
    Observable<RedditData> aww(@Query("limit") String limit);
}