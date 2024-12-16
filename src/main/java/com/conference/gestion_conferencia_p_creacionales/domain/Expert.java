/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conference.gestion_conferencia_p_creacionales.domain;

import java.util.List;

/**
 *
 * @author Ashlee Campaz
 */
public class Expert {
    
    private String name;
    private String lastName;
    private String degree;
    private String organization;
    private List<String> researchFields;

    public Expert(String name, String lastName, String degree, String organization, List<String> researchFields) {
        this.name = name;
        this.lastName = lastName;
        this.degree = degree;
        this.organization = organization;
        this.researchFields = researchFields;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public List<String> getResearchFields() {
        return researchFields;
    }

    public void setResearchFields(List<String> researchFields) {
        this.researchFields = researchFields;
    }
    
    
}
