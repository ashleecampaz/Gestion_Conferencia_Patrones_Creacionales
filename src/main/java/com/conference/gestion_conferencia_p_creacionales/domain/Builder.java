/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencia_p_creacionales.domain;

/**
 *
 * @author Ashlee Campaz
 */
public interface Builder {
    
    public void buildBasicInfo(String name, String theme, String organizingEntity, int edition);
    
    public void buildLocation(String country, String state, String city, String address);
    
    public void buildDates(String startDate,String endDate,String evaluationDate,String receptionDate);
    
    public void buildArticlesInfo(int numReseption,int numAcceptedArticles, float minCalification);
    
    public void reset(); 
}
