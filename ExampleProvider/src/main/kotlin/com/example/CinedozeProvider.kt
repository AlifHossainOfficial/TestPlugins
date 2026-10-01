package com.example

import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType

class CinedozeProvider : MainAPI() {
    override var mainUrl = "https://cinedoze.tv"
    override var name = "Cinedoze"
    override val hasMainPage = true
    override var lang = "bn"
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)
}