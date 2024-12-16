/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencia_p_creacionales.domain;

/**
 *
 * @author Ashlee Campaz
 */
public class SymposiumBuilder extends ConferenceBuilder {
    
    private Symposium conference;
    
    public SymposiumBuilder(){
        conference = new Symposium();
    }

    public Symposium getResult() {
        return conference;
    }
}
