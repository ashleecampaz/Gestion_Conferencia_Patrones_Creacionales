/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencia_p_creacionales.domain;

/**
 *
 * @author Ashlee Campaz
 */
public class ConferenceFactory {
    
    private static ConferenceFactory instance; 
    
    public static ConferenceFactory getInstance(){
        if(instance==null){
            instance = new ConferenceFactory();
        }
        return instance;
    }
    
    public ConferencePrototype getConference(String type,String name, String theme, String organizingEntity, String country, String state, String city, String address, String startDate, String endDate) throws Exception{
        switch(type){
            case "s":
                return new Symposium( name,  theme,  organizingEntity,  country,  state,  city,  address,  startDate,  endDate);
            case "w": 
                return new WorkShop( name,  theme,  organizingEntity,  country,  state,  city,  address,  startDate,  endDate);
            default:
                throw new Exception("Invalid conference type"); 
        }
    }
}
