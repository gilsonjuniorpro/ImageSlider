package com.imageslider.ca.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.flaviofaria.kenburnsview.KenBurnsView
import com.imageslider.ca.R
import com.imageslider.ca.adapter.TravelLocationsAdapter.TravelLocationViewHolder
import com.imageslider.ca.model.TravelLocation
import com.squareup.picasso.Picasso

class TravelLocationsAdapter(private val travelLocationsList: List<TravelLocation>) :
    RecyclerView.Adapter<TravelLocationViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TravelLocationViewHolder {
        return TravelLocationViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_container_location,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(
        holder: TravelLocationViewHolder,
        position: Int
    ) {
        holder.setLocationData(travelLocationsList[position])
    }

    override fun getItemCount(): Int {
        return travelLocationsList.size
    }

    class TravelLocationViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        private val kbvLocation: KenBurnsView
        private val tvLocation: TextView
        private val tvStarRating: TextView
        fun setLocationData(travelLocation: TravelLocation) {
            Picasso.get().load(travelLocation.imageUrl).into(kbvLocation)
            tvLocation.text = travelLocation.location
            tvStarRating.text = travelLocation.starRating.toString()
        }

        init {
            kbvLocation = itemView.findViewById(R.id.kbvLocation)
            tvLocation = itemView.findViewById(R.id.tvLocation)
            tvStarRating = itemView.findViewById(R.id.tvStarRating)
        }
    }

}