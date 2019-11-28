package com.quoders.app.android.punkbeer.data.remote

import com.quoders.app.android.punkbeer.data.remote.BeersApi.Companion.BEERS_API_ROOT
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class BeersApiService {

    fun makeBeersApiService(): BeersApi {

        val interceptor = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }

        val client = OkHttpClient.Builder().addInterceptor(interceptor).build()

        return Retrofit.Builder()
            .baseUrl(BEERS_API_ROOT)
            .addConverterFactory(MoshiConverterFactory.create())
            .client(client)
            .build()
            .create(BeersApi::class.java)
    }
}