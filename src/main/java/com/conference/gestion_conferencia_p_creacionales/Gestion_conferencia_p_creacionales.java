/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.conference.gestion_conferencia_p_creacionales;

import com.conference.gestion_conferencia_p_creacionales.domain.ConferencePrototype;
import com.conference.gestion_conferencia_p_creacionales.domain.Session;

/**
 *
 * @author Ashlee Campaz
 */
public class Gestion_conferencia_p_creacionales {

    public static void main(String[] args) {
        ConferencePrototype SantiagoComicCom = new ConferencePrototype("Santiago Comic Con", "Comic", "DC Comic", "Chile", "Santiago", "Santiago", "Plaza 1", "12/12/2024", "12/12/2024");
        SantiagoComicCom.addSession(new Session("Dibujo con tinta", "Charla sobre las mejores herramientas para crear dibujos con tinta"));
        SantiagoComicCom.addSession(new Session("Dibujo digital", "Charla sobre avances tecnologicos en el arte digital"));
        ConferencePrototype SantiagoComicCom_v2 = SantiagoComicCom.makeClone();
        SantiagoComicCom_v2.setStartDate("12/12/2025");
        SantiagoComicCom_v2.setEndDate("13/12/2025");
        System.out.println("ED 1:" + SantiagoComicCom.toString());
        System.out.println("Copia superficial ED 2:" + SantiagoComicCom_v2.toString());
        
        ConferencePrototype SantiagoComicCom_v3 = SantiagoComicCom.makeDeepClone();
         SantiagoComicCom_v3.setStartDate("12/12/2025");
        SantiagoComicCom_v3.setEndDate("13/12/2025");
        System.out.println("Copia profunda ED  2:" + SantiagoComicCom_v3.toString());
    }
}
