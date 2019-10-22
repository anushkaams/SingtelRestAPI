package com.anushka.SingtelRestAPI.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anushka.SingtelRestAPI.service.RoosterService;

@RestController
@RequestMapping(RoosterController.URL)
public class RoosterController {

    public static final String URL = "/rooster";

    private RoosterService roosterService;

    public RoosterController(RoosterService roosterService){
        this.roosterService = roosterService;
    }

    @RequestMapping(value="/language/{language}" , method= RequestMethod.GET)
    public String singByLanguage(@PathVariable String language) {
        return roosterService.getSingByLanguage(language);
    }
}
