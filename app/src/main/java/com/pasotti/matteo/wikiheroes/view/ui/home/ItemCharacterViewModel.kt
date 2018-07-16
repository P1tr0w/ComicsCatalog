package com.pasotti.matteo.wikiheroes.view.ui.home

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.pasotti.matteo.wikiheroes.models.Character

class ItemCharacterViewModel(private val character: Character) : BaseObservable() {

    companion object {
        val IMAGE_TYPE = "."
    }

    var imageUrl = modelImageUrl()

    fun modelImageUrl(): String = character.thumbnail.path + IMAGE_TYPE + character.thumbnail.extension

    @Bindable
    fun getCharacterName(): String = character.name
}