package com.anushka.SingtelRestAPI.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class RoosterRepository {

    public Map<String, String> getLanguages(){
        Map<String, String> languages = new HashMap<String,String>();

        languages.put("Sinhala", "Kukku ku kuu");
        languages.put("Danish", "kykyliky");
        languages.put("Dutch", "kukeleku");
        languages.put("Finnish", "kukko kiekuu");
        languages.put("French", "cocorico");
        languages.put("German", "kikeriki");
        languages.put("Greek", "kikiriki");
        languages.put("Hebrew", "coo-koo-ri-koo");
        languages.put("Hungarian", "kukuriku");
        languages.put("Italian", "chicchirichi");
        languages.put("Japanese", "ko-ke-kok-ko-o");
        languages.put("Portuguese", "cucurucu");
        languages.put("Russian", "kukareku");
        languages.put("Swedish", "kuckeliku");
        languages.put("Turkish", "kuk-kurri-kuuu");
        languages.put("Urdu", "kuklooku");

        return languages;
    }
}
