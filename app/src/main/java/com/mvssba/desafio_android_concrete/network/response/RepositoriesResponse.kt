package com.mvssba.desafio_android_concrete.network.response

import com.google.gson.annotations.SerializedName
import com.mvssba.desafio_android_concrete.model.Repository

data class RepositoriesResponse(
    @SerializedName("total_count")
    val count: Int,

    @SerializedName("incomplete_results")
    val incompleteResults: Boolean,

    val items: List<Repository>
)