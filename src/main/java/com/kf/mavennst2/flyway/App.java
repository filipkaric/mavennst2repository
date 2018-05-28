/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kf.mavennst2.flyway;

import org.flywaydb.core.Flyway;

/**
 *
 * @author Filip
 */
public class App {
    
        public void migrate(){
        Flyway flyway = new Flyway();
        flyway.setDataSource("jdbc:mysql://localhost:3306/bazaplanishrane", "admin", "admin");
        flyway.setLocations("filesystem:C:/Users/Filip/Documents/NetBeansProjects/MavenNST2/src/main/java/migration");
        flyway.migrate();
        }
}
