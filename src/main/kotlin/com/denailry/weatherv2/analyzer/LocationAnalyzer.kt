package com.denailry.weatherv2.analyzer

import com.denailry.weatherv2.weather.LocationBuilder

class LocationAnalyzer : Analyzer<String>() {
    private var locations: Array<LocationBuilder.Location> = arrayOf()

    override fun init(locations: Array<LocationBuilder.Location>) {
        this.locations = locations
    }

    override fun filterBy(value: String) {

    }

    override fun sort() {

    }

    override fun result(): Array<LocationBuilder.Location> {
        return locations
    }
}