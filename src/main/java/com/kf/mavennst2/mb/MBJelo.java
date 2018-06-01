/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kf.mavennst2.mb;

import com.kf.mavennst2.domen.Jelo;
import com.kf.mavennst2.jpa.controller.Controller;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Filip
 */
@ManagedBean(name = "mbJelo")
@SessionScoped
public class MBJelo implements Serializable{
    private Jelo jelo;
    private List<Jelo> jela;

    public MBJelo() {
        jelo = new Jelo();
    }

    public Jelo getJelo() {
        return jelo;
    }

    public void setJelo(Jelo jelo) {
        this.jelo = jelo;
    }

    public List<Jelo> getJela() {
        return jela;
    }

    public void setJela(List<Jelo> jela) {
        this.jela = jela;
    }
    public void onload(){
       jela = Controller.getInstance().findAllJelo();
    }
    
    
}
