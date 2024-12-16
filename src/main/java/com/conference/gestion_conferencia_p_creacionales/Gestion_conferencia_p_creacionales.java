/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.conference.gestion_conferencia_p_creacionales;

import com.conference.gestion_conferencia_p_creacionales.domain.ConferenceBuilder;
import com.conference.gestion_conferencia_p_creacionales.domain.ConferenceFactory;
import com.conference.gestion_conferencia_p_creacionales.domain.ConferencePrototype;
import com.conference.gestion_conferencia_p_creacionales.domain.Session;
import com.conference.gestion_conferencia_p_creacionales.domain.SymposiumBuilder;
import com.conference.gestion_conferencia_p_creacionales.domain.WorkShopBuilder;

/**
 *
 * @author Ashlee Campaz
 */
public class Gestion_conferencia_p_creacionales {

    public static void main(String[] args) throws Exception {
        //----USO DEL PATRON PROTOTYPE----------
        System.out.println("--USO DEL PATRON PROTOTYPE--");
        //Crea un conferencia
        System.out.println("-Creacion de la conferencia base");
        ConferencePrototype SantiagoComicCom = new ConferencePrototype("Santiago Comic Con", "Comic", "DC Comic", "Chile", "Santiago", "Santiago", "Plaza 1", "12/12/2024", "12/12/2024");
        SantiagoComicCom.addSession(new Session("Dibujo con tinta", "Charla sobre las mejores herramientas para crear dibujos con tinta"));
        SantiagoComicCom.addSession(new Session("Dibujo digital", "Charla sobre avances tecnologicos en el arte digital"));
        
        //Crea un clone en base a la conferencia anterior, no se clonan las sesiones
        ConferencePrototype SantiagoComicCom_v2 = SantiagoComicCom.makeClone();
        SantiagoComicCom_v2.setStartDate("12/12/2025");
        SantiagoComicCom_v2.setEndDate("13/12/2025");
        System.out.println("ED 1:" + SantiagoComicCom.toString());
        System.out.println("Copia superficial ED 2:" + SantiagoComicCom_v2.toString());
        
        //Crea un clone profundo de la primera conferencia, se clonan las sesiones
        ConferencePrototype SantiagoComicCom_v3 = SantiagoComicCom.makeDeepClone();
         SantiagoComicCom_v3.setStartDate("12/12/2025");
        SantiagoComicCom_v3.setEndDate("13/12/2025");
        System.out.println("Copia profunda ED  2:" + SantiagoComicCom_v3.toString());
        
        System.out.println("--------------------------------------------------------------------------");
        //---USO DEL PATRON FACTORY
        System.out.println("--USO DEL PATRON FACTORY--");
        
        System.out.println("Symposium");
        ConferencePrototype conference = ConferenceFactory.getInstance().getConference("s", "Santiago Comic Con", "Comic", "DC Comic", "Chile", "Santiago", "Santiago", "Plaza 1", "12/12/2024", "12/12/2024");
        System.out.println(conference.toString());
        System.out.println("WorkShop");
        conference = ConferenceFactory.getInstance().getConference("w", "Santiago Comic Con", "Comic", "DC Comic", "Chile", "Santiago", "Santiago", "Plaza 1", "12/12/2024", "12/12/2024");
        System.out.println(conference.toString());
        System.out.println("--------------------------------------------------------------------------");
        
        System.out.println("--USO DEL PATRON BUILDER--");
        
        //Creacion de los contructores
        ConferenceBuilder conferenceBuilder = new ConferenceBuilder();
        WorkShopBuilder workShopBuilder = new WorkShopBuilder();
        SymposiumBuilder symposiumBuilder = new SymposiumBuilder();
        
        conferenceBuilder.buildBasicInfo("Santiago Comic Con", "Comic", "DC Comic",1);
        System.out.println("Se inicializan los datos basicos");
        ConferencePrototype con = conferenceBuilder.getResult();
        System.out.println(con.toString());
        System.out.println("Se inicializan los datos de ubicacion");
        conferenceBuilder.buildLocation("Colombia", "Valle del cauca", "Cali", "Jardin Plaza");
        con = conferenceBuilder.getResult();
        System.out.println(con.toString());
        
    }
}
