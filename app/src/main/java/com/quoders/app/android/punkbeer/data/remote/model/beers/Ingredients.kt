package com.quoders.app.android.punkbeer.data.remote.model.beers

data class Ingredients(
    val hops: List<Hop>,
    val malt: List<Malt>,
    val yeast: String
)