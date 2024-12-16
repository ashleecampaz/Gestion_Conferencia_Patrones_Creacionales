/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencia_p_creacionales.domain;

/**
 *
 * @author Ashlee Campaz
 */
public class ConferenceBuilder implements Builder {
    
    private ConferencePrototype conference; 
    
    public ConferenceBuilder(){
        conference = new ConferencePrototype(); 
    }
    @Override
    public void buildBasicInfo(String name, String theme, String organizingEntity, int edition) {
        conference.setName(name);
        conference.setTheme(theme);
        conference.setOrganizingEntity(organizingEntity);
        conference.setEdition(edition);
    }

    @Override
    public void buildLocation(String country, String state, String city, String address) {
        conference.setCountry(country);
        conference.setState(state);
        conference.setCity(city);
        conference.setAddress(address);
    }

    @Override
    public void buildDates(String startDate, String endDate, String evaluationDate, String receptionDate) {
        conference.setStartDate(startDate);
        conference.setEndDate(endDate);
        conference.setEvaluationDate(evaluationDate);
        conference.setReceptionDate(receptionDate);
    }

    @Override
    public void reset() {
       conference = new ConferencePrototype(); 
    }

    @Override
    public void buildArticlesInfo(int numReseption, int numAcceptedArticles, float minCalification) {
       conference.setNumReseption(numReseption);
       conference.setNumAcceptedArticles(numAcceptedArticles);
        conference.setMinCalification(minCalification);
    }

    public ConferencePrototype getResult() {
        return conference;
    }
    
}
