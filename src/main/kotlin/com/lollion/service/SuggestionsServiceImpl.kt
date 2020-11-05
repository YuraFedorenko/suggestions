package com.lollion.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class SuggestionsServiceImpl(val restClient: RestTemplate) : SuggestionsService {

    @Value("\${app.suggestions.url}")
    lateinit var url: String;

    override fun findSuggestions(text: String): Array<String>? {
        return restClient.getForObject("$url?from=ukr&dest=rus&phrase=$text", Array<String>::class.java)
    }
}