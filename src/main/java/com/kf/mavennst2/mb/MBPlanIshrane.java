/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kf.mavennst2.mb;

import com.kf.mavennst2.domen.PlanIshrane;
import com.kf.mavennst2.jpa.controller.Controller;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
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

    public MBPlanIshrane() {
        planIshrane = new PlanIshrane();
        lista = new LinkedList<>();
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
    
    public void onload(){
        lista = Controller.getInstance().findAllPlanIshrane();
    }
    public String vratiStavke(PlanIshrane pi){
        planIshrane = pi;
        return "prikazStavki.xhtml";
    }
    
    public String vratiClanove(PlanIshrane pi){
        planIshrane = pi;
        return "prikazClanova.xhtml";
    }
    
    
}
