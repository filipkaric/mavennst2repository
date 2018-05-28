/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kf.mavennst2.domen;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Filip
 */
@Embeddable
public class StavkaPlanaIshranePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "RedniBroj")
    private int redniBroj;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "SifraPlanaIshrane")
    private String sifraPlanaIshrane;

    public StavkaPlanaIshranePK() {
    }

    public StavkaPlanaIshranePK(int redniBroj, String sifraPlanaIshrane) {
        this.redniBroj = redniBroj;
        this.sifraPlanaIshrane = sifraPlanaIshrane;
    }

    public int getRedniBroj() {
        return redniBroj;
    }

    public void setRedniBroj(int redniBroj) {
        this.redniBroj = redniBroj;
    }

    public String getSifraPlanaIshrane() {
        return sifraPlanaIshrane;
    }

    public void setSifraPlanaIshrane(String sifraPlanaIshrane) {
        this.sifraPlanaIshrane = sifraPlanaIshrane;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) redniBroj;
        hash += (sifraPlanaIshrane != null ? sifraPlanaIshrane.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StavkaPlanaIshranePK)) {
            return false;
        }
        StavkaPlanaIshranePK other = (StavkaPlanaIshranePK) object;
        if (this.redniBroj != other.redniBroj) {
            return false;
        }
        if ((this.sifraPlanaIshrane == null && other.sifraPlanaIshrane != null) || (this.sifraPlanaIshrane != null && !this.sifraPlanaIshrane.equals(other.sifraPlanaIshrane))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kf.mavennst2.domen.StavkaPlanaIshranePK[ redniBroj=" + redniBroj + ", sifraPlanaIshrane=" + sifraPlanaIshrane + " ]";
    }
    
}
