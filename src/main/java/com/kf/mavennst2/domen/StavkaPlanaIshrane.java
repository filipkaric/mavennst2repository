/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kf.mavennst2.domen;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Filip
 */
@Entity
@Table(name = "stavkaplanaishrane")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StavkaPlanaIshrane.findAll", query = "SELECT s FROM StavkaPlanaIshrane s")
    , @NamedQuery(name = "StavkaPlanaIshrane.findByRedniBroj", query = "SELECT s FROM StavkaPlanaIshrane s WHERE s.stavkaPlanaIshranePK.redniBroj = :redniBroj")
    , @NamedQuery(name = "StavkaPlanaIshrane.findByDan", query = "SELECT s FROM StavkaPlanaIshrane s WHERE s.dan = :dan")
    , @NamedQuery(name = "StavkaPlanaIshrane.findByNapomena", query = "SELECT s FROM StavkaPlanaIshrane s WHERE s.napomena = :napomena")
    , @NamedQuery(name = "StavkaPlanaIshrane.findBySifraPlanaIshrane", query = "SELECT s FROM StavkaPlanaIshrane s WHERE s.stavkaPlanaIshranePK.sifraPlanaIshrane = :sifraPlanaIshrane")})
public class StavkaPlanaIshrane implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StavkaPlanaIshranePK stavkaPlanaIshranePK;
    @Column(name = "Dan")
    private Integer dan;
    @Size(max = 200)
    @Column(name = "Napomena")
    private String napomena;
    @JoinColumn(name = "SifraJela", referencedColumnName = "SifraJela")
    @ManyToOne
    private Jelo sifraJela;
    @JoinColumn(name = "SifraPlanaIshrane", referencedColumnName = "SifraPlanaIshrane", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PlanIshrane planIshrane;

    public StavkaPlanaIshrane() {
    }

    public StavkaPlanaIshrane(StavkaPlanaIshranePK stavkaPlanaIshranePK) {
        this.stavkaPlanaIshranePK = stavkaPlanaIshranePK;
    }

    public StavkaPlanaIshrane(int redniBroj, String sifraPlanaIshrane) {
        this.stavkaPlanaIshranePK = new StavkaPlanaIshranePK(redniBroj, sifraPlanaIshrane);
    }

    public StavkaPlanaIshranePK getStavkaPlanaIshranePK() {
        return stavkaPlanaIshranePK;
    }

    public void setStavkaPlanaIshranePK(StavkaPlanaIshranePK stavkaPlanaIshranePK) {
        this.stavkaPlanaIshranePK = stavkaPlanaIshranePK;
    }

    public Integer getDan() {
        return dan;
    }

    public void setDan(Integer dan) {
        this.dan = dan;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public Jelo getSifraJela() {
        return sifraJela;
    }

    public void setSifraJela(Jelo sifraJela) {
        this.sifraJela = sifraJela;
    }

    public PlanIshrane getPlanIshrane() {
        return planIshrane;
    }

    public void setPlanIshrane(PlanIshrane planIshrane) {
        this.planIshrane = planIshrane;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stavkaPlanaIshranePK != null ? stavkaPlanaIshranePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StavkaPlanaIshrane)) {
            return false;
        }
        StavkaPlanaIshrane other = (StavkaPlanaIshrane) object;
        if ((this.stavkaPlanaIshranePK == null && other.stavkaPlanaIshranePK != null) || (this.stavkaPlanaIshranePK != null && !this.stavkaPlanaIshranePK.equals(other.stavkaPlanaIshranePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kf.mavennst2.domen.StavkaPlanaIshrane[ stavkaPlanaIshranePK=" + stavkaPlanaIshranePK + " ]";
    }
    
}
