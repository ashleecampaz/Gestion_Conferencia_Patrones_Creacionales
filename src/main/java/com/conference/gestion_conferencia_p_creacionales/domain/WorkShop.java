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
public class WorkShop extends ConferencePrototype{
    
    private List<String> tools;
    
    public WorkShop(String name, String theme, String organizingEntity, String country, String state, String city, String address, String startDate, String endDate) {
        super(name, theme, organizingEntity, country, state, city, address, startDate, endDate);
        this.tools = new ArrayList();
    }
    
    public WorkShop(String name, String theme, String organizingEntity, String country, String state, String city, String address, int edition) {
        super(name, theme, organizingEntity, country, state, city, address, edition);
        this.tools = new ArrayList();
    }

    WorkShop() {
        this.tools = new ArrayList();
    }
    
    public void addTool(String tool){
        tools.add(tool); 
    }

    public List<String> getTools() {
        return tools;
    }
    
   
    @Override
    public String toString() {
        return "ConferencePrototype{" + "name=" + name + ", theme=" + theme + ", organizingEntity=" + organizingEntity + ", country=" + country + ", state=" + state + ", city=" + city + ", address=" + address + ", startDate=" + startDate + ", endDate=" + endDate + ", edition=" + edition + ", sessions=" + sessions + ", tools=" + tools +'}';
    }
   
}
