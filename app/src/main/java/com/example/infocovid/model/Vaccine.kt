package com.example.infocovid.model

import kotlinx.serialization.Serializable

data class Vaccine(
    val `data`: List<Data>,
    val phases: List<Phase>,
    val source: String,
    val totalCandidates: String
) {
    @Serializable
    data class Data(
        val candidate: String,
        val details: String,
        val institutions: List<String>,
        val mechanism: String,
        val sponsors: List<String>,
        val trialPhase: String
    )

    data class Phase(
        val candidates: String,
        val phase: String
    )
}