package com.anushka.SingtelRestAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anushka.SingtelRestAPI.repository.RoosterRepository;

@Service
public class RoosterService {

    private RoosterRepository roosterRepository;

    @Autowired
    public RoosterService(RoosterRepository roosterRepository){
        this.roosterRepository = roosterRepository;
    }

    public String getSingByLanguage(String language){
        return roosterRepository.getLanguages().get(language);
    }
}
