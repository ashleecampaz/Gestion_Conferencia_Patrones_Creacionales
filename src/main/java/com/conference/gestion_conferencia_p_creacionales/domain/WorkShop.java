/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencia_p_creacionales.domain;

/**
 *
 * @author Ashlee Campaz
 */
public class WorkShop extends ConferencePrototype{
    
    public WorkShop(String name, String theme, String organizingEntity, String country, String state, String city, String address, String startDate, String endDate) {
        super(name, theme, organizingEntity, country, state, city, address, startDate, endDate);
    }
    
    public WorkShop(String name, String theme, String organizingEntity, String country, String state, String city, String address, int edition) {
        super(name, theme, organizingEntity, country, state, city, address, edition);
    }
}
