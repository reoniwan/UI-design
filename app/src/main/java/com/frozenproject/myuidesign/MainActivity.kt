package com.frozenproject.myuidesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapter = WeddingAdapter(
        listOf(
            WeddingModel(
                R.drawable.img1
            ),
            WeddingModel(
                R.drawable.img2
            ),
            WeddingModel(
                R.drawable.img3
            )
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        locationViewPager.adapter = adapter
    }
}
