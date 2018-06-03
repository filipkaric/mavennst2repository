/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kf.mavennst2.mb;

import com.kf.mavennst2.domen.Clan;
import com.kf.mavennst2.domen.PlanIshrane;
import com.kf.mavennst2.jpa.controller.Controller;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedProperty;
import javax.inject.Named;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Filip
 */
@Named(value = "mbPlanIshrane")
@SessionScoped
public class MBPlanIshrane implements Serializable{
    

    private PlanIshrane planIshrane;   
    private List<PlanIshrane> lista;
    private List<Clan> listaClanova;

    public MBPlanIshrane() {
        planIshrane = new PlanIshrane();
    }

    public PlanIshrane getPlanIshrane() {
        return planIshrane;
    }

    public void setPlanIshrane(PlanIshrane planIshrane) {
        this.planIshrane = planIshrane;
    }

    public List<PlanIshrane> getLista() {
        return lista;
    }

    public void setLista(List<PlanIshrane> lista) {
        this.lista = lista;
    }
     public List<Clan> getListaClanova() {
        return listaClanova;
    }

    public void setListaClanova(List<Clan> listaClanova) {
        this.listaClanova = listaClanova;
    }
    
    @PostConstruct
    public void onload(){
        lista = Controller.getInstance().findAllPlanIshrane();
    }
    public String vratiStavke(PlanIshrane pi){
        this.setPlanIshrane(pi);
        return "prikazStavki.xhtml";
    }

    public String vratiClanove(PlanIshrane pi){
        this.setPlanIshrane(pi);
        listaClanova = new LinkedList(pi.getClanCollection());
        return "prikazClanova.xhtml";
    }
    public void test(){
        System.out.println("Test test test OVO JE TEST");
    }

   
    
}
