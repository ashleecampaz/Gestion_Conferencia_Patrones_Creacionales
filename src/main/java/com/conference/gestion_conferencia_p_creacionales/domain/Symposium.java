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
public class Symposium extends ConferencePrototype {
    
    private List<Expert> experts; 
    
    public Symposium(String name, String theme, String organizingEntity, String country, String state, String city, String address, String startDate, String endDate) {
        super(name, theme, organizingEntity, country, state, city, address, startDate, endDate);
        
        this.experts = new ArrayList();
    }
    
    public Symposium(String name, String theme, String organizingEntity, String country, String state, String city, String address, int edition) {
        super(name, theme, organizingEntity, country, state, city, address, edition);
        
        this.experts = new ArrayList();
    }

    Symposium() {
         this.experts = new ArrayList();
    }
    
    public void addExpert(Expert e){
        experts.add(e);
    }

   
    @Override
    public String toString() {
        return "ConferencePrototype{" + "name=" + name + ", theme=" + theme + ", organizingEntity=" + organizingEntity + ", country=" + country + ", state=" + state + ", city=" + city + ", address=" + address + ", startDate=" + startDate + ", endDate=" + endDate + ", edition=" + edition + ", sessions=" + sessions + ", experts="+ experts+'}';
    }
   
    
    
}
