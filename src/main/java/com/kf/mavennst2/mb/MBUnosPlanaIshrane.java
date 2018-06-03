/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kf.mavennst2.mb;

import com.kf.mavennst2.domen.Clan;
import com.kf.mavennst2.domen.Jelo;
import com.kf.mavennst2.domen.PlanIshrane;
import com.kf.mavennst2.domen.StavkaPlanaIshrane;
import com.kf.mavennst2.domen.StavkaPlanaIshranePK;
import com.kf.mavennst2.jpa.controller.Controller;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Filip
 */
@Named(value = "mbUnosPlanaIshrane")
@SessionScoped
public class MBUnosPlanaIshrane implements Serializable{
    
    private StavkaPlanaIshrane stavka;
    private PlanIshrane planIshrane;
    private List<Clan> clanovi;
    private List<Jelo> jela;
    private List<StavkaPlanaIshrane> stavke;
    private int redniBroj = 1;

    public MBUnosPlanaIshrane() {
        planIshrane = new PlanIshrane();
        stavka = new StavkaPlanaIshrane();
        stavke = new LinkedList<>();
    }

    public StavkaPlanaIshrane getStavka() {
        return stavka;
    }

    public void setStavka(StavkaPlanaIshrane stavka) {
        this.stavka = stavka;
    }
    
    public PlanIshrane getPlanIshrane() {
        return planIshrane;
    }

    public void setPlanIshrane(PlanIshrane planIshrane) {
        this.planIshrane = planIshrane;
    }

    public List<Clan> getClanovi() {
        return clanovi;
    }

    public void setClanovi(List<Clan> clanovi) {
        this.clanovi = clanovi;
    }

    public List<Jelo> getJela() {
        return jela;
    }

    public void setJela(List<Jelo> jela) {
        this.jela = jela;
    }

    public List<StavkaPlanaIshrane> getStavke() {
        return stavke;
    }

    public void setStavke(List<StavkaPlanaIshrane> stavke) {
        this.stavke = stavke;
    }
    
    public void onload(){
        clanovi = Controller.getInstance().findAllClan();
        jela = Controller.getInstance().findAllJelo();
    }
    
    public void persistPlanIshrane() {
        try {
            planIshrane.setStavkaPlanaIshraneCollection(stavke);
            Controller.getInstance().persistPlanIshrane(planIshrane);
            planIshrane = new PlanIshrane();
            stavke.clear();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sistem je zapamtio plan ishrane", null));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sistem ne moze da zapamti plan ishrane", null));
        }
    }
    public void dodajStavkuUListu() {
        StavkaPlanaIshrane s1 = new StavkaPlanaIshrane();
        s1.setDan(stavka.getDan());
        s1.setNapomena(stavka.getNapomena());
        s1.setPlanIshrane(planIshrane);
        s1.setSifraJela(stavka.getSifraJela());
        s1.setStavkaPlanaIshranePK(new StavkaPlanaIshranePK(redniBroj++, planIshrane.getSifraPlanaIshrane()));
        
        if(!stavke.contains(s1))
        {
             stavke.add(s1);
             stavka = new StavkaPlanaIshrane();
        }
        //p1 = new StavkaPlanaIshrane();
    }
    public void izbaciIzListe(StavkaPlanaIshrane s){
        stavke.remove(s);
    }
    
}
