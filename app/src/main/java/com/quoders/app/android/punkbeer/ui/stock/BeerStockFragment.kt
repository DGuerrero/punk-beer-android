package com.quoders.app.android.punkbeer.ui.stock

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.quoders.app.android.punkbeer.R

class BeerStockFragment : Fragment() {

    companion object {
        fun newInstance() = BeerStockFragment()
    }

    private lateinit var beerStockViewModel: BeerStockViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.beer_stock_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        beerStockViewModel = ViewModelProviders.of(this).get(BeerStockViewModel::class.java)
    }
}
