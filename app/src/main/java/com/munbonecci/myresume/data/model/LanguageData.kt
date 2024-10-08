package com.munbonecci.myresume.data.model

data class LanguageData(
    val name: String,
    val percentage: Int
) {
    override fun toString(): String = name
}

const val ENGLISH_LANGUAGE = "English"
const val SPANISH_LANGUAGE = "Urdu"