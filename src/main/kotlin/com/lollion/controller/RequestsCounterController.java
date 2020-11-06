package com.lollion.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@Slf4j
public class RequestsCounterController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/requests")
    public Long getRequestsCount() {
        long result = counter.incrementAndGet();
        log.info("Request counter incremented to {}", result);
        return result;
    }
}
