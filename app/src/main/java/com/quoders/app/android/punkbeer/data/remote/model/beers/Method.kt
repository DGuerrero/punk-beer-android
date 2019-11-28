package com.quoders.app.android.punkbeer.data.remote.model.beers

data class Method(
    val fermentation: Fermentation,
    val mash_temp: List<MashTemp>?,
    val twist: String
)