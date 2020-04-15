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
            "Anguilla is blessed with many a stunning beach, but Maundays Bay",
            "Maundays Bay, Anguilla",
            "http://www.projectconnect.com.br/github_imagens/anguilla.jpg",
            4.9f
            )

        val travelLocation2 = TravelLocation(
            "Kiawah Island, a mostly private, gated community, less than a hours drive from Charleston International Airport",
            "Kiawah Island, SC",
            "http://www.projectconnect.com.br/github_imagens/kiawah.jpg",
            4.7f
        )

        val travelLocation3 = TravelLocation(
            "Undeniably one of the most photographed beaches in the Caribbean, if not the world, Trunk Bay sits in the northwestern corner of the Virgin Islands National Park",
            "Trunk Bay, St. John, USVI",
            "http://www.projectconnect.com.br/github_imagens/trunk.jpg",
            4.6f
        )

        val travelLocation4 = TravelLocation(
            "Shockingly, Palawan remains steadily under the radar, even though it continues to rank highly in our Readers' Choice Awards.",
            "El Nido, Palawan, Philippines",
            "http://www.projectconnect.com.br/github_imagens/elnido.jpg",
            4.5f
        )

        arrayList.add(travelLocation1)
        arrayList.add(travelLocation2)
        arrayList.add(travelLocation3)
        arrayList.add(travelLocation4)

        viewPager.adapter = TravelLocationsAdapter(arrayList)
    }
}
