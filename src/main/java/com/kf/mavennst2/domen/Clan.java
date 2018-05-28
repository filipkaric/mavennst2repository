/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kf.mavennst2.domen;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Filip
 */
@Entity
@Table(name = "clan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clan.findAll", query = "SELECT c FROM Clan c")
    , @NamedQuery(name = "Clan.findBySifraClana", query = "SELECT c FROM Clan c WHERE c.sifraClana = :sifraClana")
    , @NamedQuery(name = "Clan.findByImePrezime", query = "SELECT c FROM Clan c WHERE c.imePrezime = :imePrezime")
    , @NamedQuery(name = "Clan.findByGodinaRodjenja", query = "SELECT c FROM Clan c WHERE c.godinaRodjenja = :godinaRodjenja")
    , @NamedQuery(name = "Clan.findByVisinaUMetrima", query = "SELECT c FROM Clan c WHERE c.visinaUMetrima = :visinaUMetrima")
    , @NamedQuery(name = "Clan.findByTezinaUKg", query = "SELECT c FROM Clan c WHERE c.tezinaUKg = :tezinaUKg")
    , @NamedQuery(name = "Clan.findByNapomena", query = "SELECT c FROM Clan c WHERE c.napomena = :napomena")})
public class Clan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "SifraClana")
    private String sifraClana;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "ImePrezime")
    private String imePrezime;
    @Column(name = "GodinaRodjenja")
    private Integer godinaRodjenja;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VisinaUMetrima")
    private Double visinaUMetrima;
    @Column(name = "TezinaUKg")
    private Double tezinaUKg;
    @Size(max = 600)
    @Column(name = "Napomena")
    private String napomena;
    @JoinColumn(name = "SifraPlanaIshrane", referencedColumnName = "SifraPlanaIshrane")
    @ManyToOne(optional = false)
    private PlanIshrane sifraPlanaIshrane;

    public Clan() {
    }

    public Clan(String sifraClana) {
        this.sifraClana = sifraClana;
    }

    public Clan(String sifraClana, String imePrezime) {
        this.sifraClana = sifraClana;
        this.imePrezime = imePrezime;
    }

    public String getSifraClana() {
        return sifraClana;
    }

    public void setSifraClana(String sifraClana) {
        this.sifraClana = sifraClana;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public Integer getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(Integer godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public Double getVisinaUMetrima() {
        return visinaUMetrima;
    }

    public void setVisinaUMetrima(Double visinaUMetrima) {
        this.visinaUMetrima = visinaUMetrima;
    }

    public Double getTezinaUKg() {
        return tezinaUKg;
    }

    public void setTezinaUKg(Double tezinaUKg) {
        this.tezinaUKg = tezinaUKg;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public PlanIshrane getSifraPlanaIshrane() {
        return sifraPlanaIshrane;
    }

    public void setSifraPlanaIshrane(PlanIshrane sifraPlanaIshrane) {
        this.sifraPlanaIshrane = sifraPlanaIshrane;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sifraClana != null ? sifraClana.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clan)) {
            return false;
        }
        Clan other = (Clan) object;
        if ((this.sifraClana == null && other.sifraClana != null) || (this.sifraClana != null && !this.sifraClana.equals(other.sifraClana))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kf.mavennst2.domen.Clan[ sifraClana=" + sifraClana + " ]";
    }
    
}
