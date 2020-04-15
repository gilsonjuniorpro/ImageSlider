package com.imageslider.ca.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.imageslider.ca.R
import com.imageslider.ca.adapter.TravelLocationsAdapter
import com.imageslider.ca.model.TravelLocation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<TravelLocation>()

        val travelLocation1 = TravelLocation(
            "title",
            "location",
            "http://www.projectconnect.com.br/github_imagens/mustang_01.jpg",
            4.5f
            )

        val travelLocation2 = TravelLocation(
            "title",
            "location",
            "http://www.projectconnect.com.br/github_imagens/mustang_02.jpg",
            4.5f
        )

        val travelLocation3 = TravelLocation(
            "title",
            "location",
            "http://www.projectconnect.com.br/github_imagens/mustang_03.jpg",
            4.5f
        )

        val travelLocation4 = TravelLocation(
            "title",
            "location",
            "http://www.projectconnect.com.br/github_imagens/mustang_04.jpg",
            4.5f
        )

        arrayList.add(travelLocation1)
        arrayList.add(travelLocation2)
        arrayList.add(travelLocation3)
        arrayList.add(travelLocation4)

        viewPager.adapter = TravelLocationsAdapter(arrayList)
    }
}
