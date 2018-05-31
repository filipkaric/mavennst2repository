/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kf.mavennst2.mb;

import com.kf.mavennst2.domen.Clan;
import com.kf.mavennst2.jpa.controller.Controller;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Filip
 */
@ManagedBean(name = "mbClan")
@SessionScoped
public class MBClan implements Serializable{
    private Clan clan;
    private List<Clan> clanovi;

    public MBClan() {
        clan = new Clan();
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    public List<Clan> getClanovi() {
        return clanovi;
    }

    public void setClanovi(List<Clan> clanovi) {
        this.clanovi = clanovi;
    }
    public void onload(){
       clanovi = Controller.getInstance().findAllClan();
    }
    
    
}
