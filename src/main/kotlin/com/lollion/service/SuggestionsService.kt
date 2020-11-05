package com.lollion.service

interface SuggestionsService {
    fun findSuggestions(text:String) : Array<String>?
}