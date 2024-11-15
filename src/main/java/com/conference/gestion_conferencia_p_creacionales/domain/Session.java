/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencia_p_creacionales.domain;

/**
 *
 * @author Ashlee Campaz
 */
public class Session {
    
    private String name;
    private String description; 

    public Session(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    public Session makeClone(){
    
        Session clon = null;
        try{
            clon = new Session(name,description); 
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return clon; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Session{" + "name=" + name + '}';
    }
    
    
}
