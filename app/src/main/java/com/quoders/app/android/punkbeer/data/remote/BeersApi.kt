package com.quoders.app.android.punkbeer.data.remote

import com.quoders.app.android.punkbeer.data.remote.model.beers.BeersRemoteData
import retrofit2.http.GET

interface BeersApi {

    @GET("beers")
    suspend fun getBeers(): List<BeersRemoteData>

    companion object {
        val BEERS_API_ROOT = "https://api.punkapi.com/v2/"
    }
}
