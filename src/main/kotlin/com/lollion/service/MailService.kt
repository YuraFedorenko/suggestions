package com.lollion.service

interface MailService {

    fun sendEmail(text: String, to: String, description: String? = "")
}