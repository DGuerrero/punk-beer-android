package com.quoders.app.android.punkbeer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.quoders.app.android.punkbeer.ui.beers.BeersFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, BeersFragment.newInstance())
                .commitNow()
        }
    }

}
