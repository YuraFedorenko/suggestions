package com.lollion.controller

import com.lollion.service.MailService
import com.lollion.service.SuggestionsService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")
class SuggestionsController(val mailService: MailService, val suggestionsService: SuggestionsService) {

    private val logger: Logger = LoggerFactory.getLogger(SuggestionsController::class.java)

    @GetMapping("/suggestions")
    fun findSuggestions(@RequestParam text: String, @RequestParam to: String) {
        logger.info("start finding suggestions...")
        val suggestions = suggestionsService.findSuggestions(text)
        val addPrefix: (String) -> String = { "suggestion is $it" }
        suggestions?.let {
            mailService.sendEmail(to = to, description = null, text = it.joinToString(transform = addPrefix))
        }
    }
}