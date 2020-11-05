package com.lollion.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service


@Service
class MailServiceImpl(val sender: JavaMailSender) : MailService {

    @Value("\${app.mail.subject}")
    lateinit var subject: String

    override fun sendEmail(text: String, to: String, description: String?) {
        val message = SimpleMailMessage()
        message.setTo(to)
        message.setSubject(subject)
        message.setText(text)
        sender.send(message)
    }
}