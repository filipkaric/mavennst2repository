/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kf.mavennst2.jpa.controller;

import com.kf.mavennst2.domen.Korisnik;
import com.kf.mavennst2.domen.PlanIshrane;
import com.kf.mavennst2.domen.Clan;
import com.kf.mavennst2.domen.Jelo;
import com.kf.mavennst2.jpa.dbb.DBBroker;
import java.util.List;

/**
 *
 * @author Filip
 */
public class Controller {
    
    private static Controller controller;

    public static Controller getInstance() {
        if (controller == null) {
            controller = new Controller();
        }
        return controller;
    }
    
    public Korisnik logIn(Korisnik korisnik) throws Exception{
        return DBBroker.getInstance().logIn(korisnik);
    }
    public List<PlanIshrane> findAllPlanIshrane(){
        return DBBroker.getInstance().findAllPlanIshrane();
    }
    public PlanIshrane findPlanIshraneBySifra(String sifra){
       return DBBroker.getInstance().findPlanIshraneBySifra(sifra);
    }
   public PlanIshrane findPlanIshraneByNaziv(String naziv) {
       return DBBroker.getInstance().findPlanIshraneByNaziv(naziv);
    }
    
    public void persistPlanIshrane(PlanIshrane planIshrane){
        DBBroker.getInstance().persistPlanIshrane(planIshrane);
    }
    
    public void deletePlanIshraneBySifra(PlanIshrane planIshrane){
        DBBroker.getInstance().deletePlanIshraneBySifra(planIshrane);
    }
    
    public void persistClan(Clan clan){
        DBBroker.getInstance().persistClan(clan);
    }

    public List<Clan> findAllClan() {
        return DBBroker.getInstance().findAllClan();
    }

    public List<Jelo> findAllJelo() {
        return DBBroker.getInstance().findAllJelo();
    }

    public Jelo findJeloByNaziv(String naziv) {
        return DBBroker.getInstance().findJeloByNaziv(naziv);
    }

    public void deleteClan(Clan clan) {
        DBBroker.getInstance().delete(clan);
    }
}
