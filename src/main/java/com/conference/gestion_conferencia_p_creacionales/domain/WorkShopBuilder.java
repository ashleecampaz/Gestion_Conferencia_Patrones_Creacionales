/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencia_p_creacionales.domain;

/**
 *
 * @author Ashlee Campaz
 */
public class WorkShopBuilder extends ConferenceBuilder {
    
    private WorkShop conference;
    
    public WorkShopBuilder(){
        conference = new WorkShop();
    }
    

    public WorkShop getResult() {
        return conference;
    }
}
