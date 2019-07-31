package com.mvssba.desafio_android_concrete.modules.repositories

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mvssba.desafio_android_concrete.model.Repository
import com.mvssba.desafio_android_concrete.network.RetrofitClient
import com.mvssba.desafio_android_concrete.network.api.GithubApi
import com.mvssba.desafio_android_concrete.network.response.RepositoriesResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepositoriesViewModel : ViewModel() {

    private val webService: GithubApi =
        RetrofitClient.getInstance().create(GithubApi::class.java)

    lateinit var list: MutableLiveData<List<Repository>>

    fun getRepositories() {
        webService.repositories(page = 1)
            .enqueue(object : Callback<RepositoriesResponse> {
                override fun onFailure(call: Call<RepositoriesResponse>, t: Throwable) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onResponse(
                    call: Call<RepositoriesResponse>,
                    response: Response<RepositoriesResponse>
                ) {
                    list.value = response.body()?.items
                }
            })
    }
}