package com.example.Visitorcounterapp.controller;

import com.example.Visitorcounterapp.model.Visit;
import com.example.Visitorcounterapp.service.UrlService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/visitors-count")
public class UrlController {

    private UrlService urlService;

    public UrlController(UrlService urlService){

        this.urlService=urlService;
    }

    @GetMapping("/username/{username}")
    public Visit getCount(@PathVariable String username){
         Visit visit = urlService.getVisits(username);
         return visit;
    }
}
