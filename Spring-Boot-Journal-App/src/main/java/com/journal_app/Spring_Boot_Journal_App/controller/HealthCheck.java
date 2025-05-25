package com.journal_app.Spring_Boot_Journal_App.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HealthCheck {
    @GetMapping("/health-check")
    public String healthCheck(){ // Health check
        return "Healthy";
    }
}
