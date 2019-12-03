package com.quoders.app.android.punkbeer.ui.detail

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.quoders.app.android.punkbeer.R

class BeerDetailFragment : Fragment() {

    companion object {
        fun newInstance() = BeerDetailFragment()
    }

    private lateinit var viewModel: BeerDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.beer_detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BeerDetailViewModel::class.java)
    }

}
