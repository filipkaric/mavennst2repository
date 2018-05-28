/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.kf.mavennst2.domen.Korisnik;
import com.kf.mavennst2.domen.PlanIshrane;
import com.kf.mavennst2.jpa.controller.Controller;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Filip
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Korisnik korisnik = new Korisnik();
//        korisnik.setUsername("filip");
//        korisnik.setPassword("filip1");
//        try {
//            Korisnik k = Controller.getInstance().logIn(korisnik);
//            System.out.println(k.getIme() + "  " + k.getPrezime());
//        } catch (Exception ex) {
//            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
//        }

        List<PlanIshrane> list = Controller.getInstance().findAllPlanIshrane();
        for (PlanIshrane planIshrane : list) {
            System.out.println(planIshrane.getNazivPlanaIshrane());
        }
            PlanIshrane plan = Controller.getInstance().findPlanIshraneBySifra("filip1498422162560Srpski režim");
            System.out.println("test.Test.main()" + plan.getNazivPlanaIshrane());
        

//        PlanIshrane plan = new PlanIshrane("sifraplana1234", "nazivplana1234");
//        Controller.getInstance().persistPlanIshrane(plan);

//        Controller.getInstance().deletePlanIshraneBySifra(plan);

    }

}
