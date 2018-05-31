/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kf.mavennst2.mb;

/**
 *
 * @author Filip
 */


import com.kf.mavennst2.domen.Korisnik;
import com.kf.mavennst2.jpa.controller.Controller;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named(value = "mbKorisnik")
@SessionScoped
public class MBKorisnik implements Serializable{
    Korisnik korisnik;

    public MBKorisnik() {
        korisnik = new Korisnik();
        korisnik.setUsername("");
        korisnik.setPassword("");
    }
     public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public String prijaviUsera(){
        if (korisnik.getUsername() == null || korisnik.getPassword() == null || korisnik.getUsername().isEmpty() || korisnik.getPassword().isEmpty()) {
            return "Unesite vrednosti za username i password";
        }
        try {
            System.out.println("Korisnik: korisnicko ime:" + korisnik.getUsername() + ", korisnicka sifra:" + korisnik.getPassword());
            korisnik = Controller.getInstance().logIn(korisnik);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Korisnik je uspesno prijavljen.", null));
            return "prva.xhtml";
        } catch (Exception ex) {
            Logger.getLogger(MBKorisnik.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Sistem ne moze da nadje korisnika na osnovu unetih vrednosti", null));
        }
        return "";
    }
    
    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/index.xhtml?faces-redirect=true";
    }
    
}
