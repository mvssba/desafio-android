package com.mvssba.desafio_android_concrete.network.api

import com.mvssba.desafio_android_concrete.network.response.PullRequestResponse
import com.mvssba.desafio_android_concrete.network.response.RepositoriesResponse
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GithubApi {

    @GET("search/repositories")
    fun repositories(
        @Query("q") query: String = "language:Java",
        @Query("sort") sort: String = "stars",
        @Query("page") page: Int
    ): Call<RepositoriesResponse>

    @GET("repos/{login_owner}/{name_repository}/pulls")
    fun pullRequests(
        @Path("login_owner") owner: String,
        @Path("name_repository") repo: String
    ): Single<List<PullRequestResponse>>

}