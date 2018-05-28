/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kf.mavennst2.domen;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Filip
 */
@Entity
@Table(name = "planishrane")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlanIshrane.findAll", query = "SELECT p FROM PlanIshrane p")
    , @NamedQuery(name = "PlanIshrane.findBySifraPlanaIshrane", query = "SELECT p FROM PlanIshrane p WHERE p.sifraPlanaIshrane = :sifraPlanaIshrane")
    , @NamedQuery(name = "PlanIshrane.findByNazivPlanaIshrane", query = "SELECT p FROM PlanIshrane p WHERE p.nazivPlanaIshrane = :nazivPlanaIshrane")
    , @NamedQuery(name = "PlanIshrane.findByDatumNastankaPlana", query = "SELECT p FROM PlanIshrane p WHERE p.datumNastankaPlana = :datumNastankaPlana")
    , @NamedQuery(name = "PlanIshrane.findByNapomena", query = "SELECT p FROM PlanIshrane p WHERE p.napomena = :napomena")})
public class PlanIshrane implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "SifraPlanaIshrane")
    private String sifraPlanaIshrane;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "NazivPlanaIshrane")
    private String nazivPlanaIshrane;
    @Column(name = "DatumNastankaPlana")
    @Temporal(TemporalType.DATE)
    private Date datumNastankaPlana;
    @Size(max = 600)
    @Column(name = "Napomena")
    private String napomena;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "planIshrane")
    private Collection<StavkaPlanaIshrane> stavkaPlanaIshraneCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sifraPlanaIshrane")
    private Collection<Clan> clanCollection;

    public PlanIshrane() {
    }

    public PlanIshrane(String sifraPlanaIshrane) {
        this.sifraPlanaIshrane = sifraPlanaIshrane;
    }

    public PlanIshrane(String sifraPlanaIshrane, String nazivPlanaIshrane) {
        this.sifraPlanaIshrane = sifraPlanaIshrane;
        this.nazivPlanaIshrane = nazivPlanaIshrane;
    }

    public String getSifraPlanaIshrane() {
        return sifraPlanaIshrane;
    }

    public void setSifraPlanaIshrane(String sifraPlanaIshrane) {
        this.sifraPlanaIshrane = sifraPlanaIshrane;
    }

    public String getNazivPlanaIshrane() {
        return nazivPlanaIshrane;
    }

    public void setNazivPlanaIshrane(String nazivPlanaIshrane) {
        this.nazivPlanaIshrane = nazivPlanaIshrane;
    }

    public Date getDatumNastankaPlana() {
        return datumNastankaPlana;
    }

    public void setDatumNastankaPlana(Date datumNastankaPlana) {
        this.datumNastankaPlana = datumNastankaPlana;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    @XmlTransient
    public Collection<StavkaPlanaIshrane> getStavkaPlanaIshraneCollection() {
        return stavkaPlanaIshraneCollection;
    }

    public void setStavkaPlanaIshraneCollection(Collection<StavkaPlanaIshrane> stavkaPlanaIshraneCollection) {
        this.stavkaPlanaIshraneCollection = stavkaPlanaIshraneCollection;
    }

    @XmlTransient
    public Collection<Clan> getClanCollection() {
        return clanCollection;
    }

    public void setClanCollection(Collection<Clan> clanCollection) {
        this.clanCollection = clanCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sifraPlanaIshrane != null ? sifraPlanaIshrane.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanIshrane)) {
            return false;
        }
        PlanIshrane other = (PlanIshrane) object;
        if ((this.sifraPlanaIshrane == null && other.sifraPlanaIshrane != null) || (this.sifraPlanaIshrane != null && !this.sifraPlanaIshrane.equals(other.sifraPlanaIshrane))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kf.mavennst2.domen.PlanIshrane[ sifraPlanaIshrane=" + sifraPlanaIshrane + " ]";
    }
    
}
