/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencia_p_creacionales.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ashlee Campaz
 */
public class ConferencePrototype {
    
    String name;
    String theme;
    String organizingEntity;
    String country;
    String state;
    String city;
    String address;
    String startDate;
    String endDate;
    String evaluationDate;
    String receptionDate;
    int numReseption;
    int edition; 
    int numAcceptedArticles;
    float minCalification;
    List<Session> sessions; 

    public ConferencePrototype(String name, String theme, String organizingEntity, String country, String state, String city, String address, String startDate, String endDate) {
        this.name = name;
        this.theme = theme;
        this.organizingEntity = organizingEntity;
        this.country = country;
        this.state = state;
        this.city = city;
        this.address = address;
        this.startDate = startDate;
        this.endDate = endDate;
        this.edition = 1; 
        this.sessions = new ArrayList();
    }
   
     public ConferencePrototype(String name, String theme, String organizingEntity, String country, String state, String city, String address, int edition) {
        this.name = name;
        this.theme = theme;
        this.organizingEntity = organizingEntity;
        this.country = country;
        this.state = state;
        this.city = city;
        this.address = address;
        this.edition = edition; 
        this.sessions = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getOrganizingEntity() {
        return organizingEntity;
    }

    public void setOrganizingEntity(String organizingEntity) {
        this.organizingEntity = organizingEntity;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEvaluationDate() {
        return evaluationDate;
    }

    public void setEvaluationDate(String evaluationDate) {
        this.evaluationDate = evaluationDate;
    }

    public String getReceptionDate() {
        return receptionDate;
    }

    public void setReceptionDate(String receptionDate) {
        this.receptionDate = receptionDate;
    }

    public int getNumReseption() {
        return numReseption;
    }

    public void setNumReseption(int numReseption) {
        this.numReseption = numReseption;
    }

    public int getNumAcceptedArticles() {
        return numAcceptedArticles;
    }

    public void setNumAcceptedArticles(int numAcceptedArticles) {
        this.numAcceptedArticles = numAcceptedArticles;
    }

    public float getMinCalification() {
        return minCalification;
    }

    public void setMinCalification(float minCalification) {
        this.minCalification = minCalification;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }
    public void addSession(Session s){
        sessions.add(s); 
    }
    public  ConferencePrototype makeClone(){
        return new ConferencePrototype( name, theme, organizingEntity,  country,  state,  city,  address, edition+1); 
    }
    
    
    public  ConferencePrototype makeDeepClone (){
        ConferencePrototype clone = new ConferencePrototype( name, theme, organizingEntity,  country,  state,  city,  address, edition+1); 
        for(Session s:sessions){
            clone.addSession(s.makeClone());
        }
        return clone; 
    } 

    @Override
    public String toString() {
        return "ConferencePrototype{" + "name=" + name + ", theme=" + theme + ", organizingEntity=" + organizingEntity + ", country=" + country + ", state=" + state + ", city=" + city + ", address=" + address + ", startDate=" + startDate + ", endDate=" + endDate + ", edition=" + edition + ", sessions=" + sessions + '}';
    }
   
    
}
