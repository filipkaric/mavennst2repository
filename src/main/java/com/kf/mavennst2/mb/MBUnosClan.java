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
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Filip
 */
@Named(value = "mbUnosClana")
@SessionScoped
public class MBUnosClan implements Serializable {

    private Clan clan;
    private List<PlanIshrane> planoviIshrane;
    
    public MBUnosClan() {
        clan = new Clan();
    }
    
    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    public List<PlanIshrane> getPlanoviIshrane() {
        return planoviIshrane;
    }

    public void setPlanoviIshrane(List<PlanIshrane> planoviIshrane) {
        this.planoviIshrane = planoviIshrane;
    }
    
    public void onload() {
        planoviIshrane = Controller.getInstance().findAllPlanIshrane();
    }

    public void persistClan() {
        try {
            Controller.getInstance().persistClan(clan);
            clan = new Clan();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sistem je zapamtio člana", null));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sistem ne moze da zapamti novog člana", null));
        }
    }
}
