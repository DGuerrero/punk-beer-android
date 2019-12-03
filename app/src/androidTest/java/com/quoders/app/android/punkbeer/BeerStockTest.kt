package com.quoders.app.android.punkbeer

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.quoders.app.android.punkbeer.ui.stock.BeerStockFragment
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BeerStockTest {

    @Test
    fun exampleEspressoTest() {

        launchFragmentInContainer<BeerStockFragment>()
    }
}
