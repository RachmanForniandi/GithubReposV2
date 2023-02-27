package com.devtides.githubrepos.model

import io.reactivex.Single
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface GithubApi {
    @FormUrlEncoded
    @POST("https://githun.com/login/oauth/access_token")
    fun getAuthToken(
        @Field("client_id") clientId:String,
        @Field("client_secret") clientSecret:String,
        @Field("code") code:String
    ):Single<GithubToken>
}