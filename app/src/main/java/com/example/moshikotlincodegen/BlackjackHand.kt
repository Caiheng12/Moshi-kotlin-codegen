package com.example.moshikotlincodegen

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Card(val rank: String, val suit: String)

@JsonClass(generateAdapter = true)
data class BlackjackHand(val hidden_card: Card, val visible_cards: List<Card>)