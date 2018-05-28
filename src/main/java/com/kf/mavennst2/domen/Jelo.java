/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kf.mavennst2.domen;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Filip
 */
@Entity
@Table(name = "jelo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jelo.findAll", query = "SELECT j FROM Jelo j")
    , @NamedQuery(name = "Jelo.findBySifraJela", query = "SELECT j FROM Jelo j WHERE j.sifraJela = :sifraJela")
    , @NamedQuery(name = "Jelo.findByNazivJela", query = "SELECT j FROM Jelo j WHERE j.nazivJela = :nazivJela")
    , @NamedQuery(name = "Jelo.findByBrojKiloKalorijaNa100g", query = "SELECT j FROM Jelo j WHERE j.brojKiloKalorijaNa100g = :brojKiloKalorijaNa100g")
    , @NamedQuery(name = "Jelo.findByKolicinaProteinaNa100g", query = "SELECT j FROM Jelo j WHERE j.kolicinaProteinaNa100g = :kolicinaProteinaNa100g")
    , @NamedQuery(name = "Jelo.findByKolicinaUgljenihHidrataNa100g", query = "SELECT j FROM Jelo j WHERE j.kolicinaUgljenihHidrataNa100g = :kolicinaUgljenihHidrataNa100g")
    , @NamedQuery(name = "Jelo.findByKolicinaMastiNa100g", query = "SELECT j FROM Jelo j WHERE j.kolicinaMastiNa100g = :kolicinaMastiNa100g")})
public class Jelo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "SifraJela")
    private String sifraJela;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "NazivJela")
    private String nazivJela;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BrojKiloKalorijaNa100g")
    private Double brojKiloKalorijaNa100g;
    @Column(name = "KolicinaProteinaNa100g")
    private Double kolicinaProteinaNa100g;
    @Column(name = "KolicinaUgljenihHidrataNa100g")
    private Double kolicinaUgljenihHidrataNa100g;
    @Column(name = "KolicinaMastiNa100g")
    private Double kolicinaMastiNa100g;
    @OneToMany(mappedBy = "sifraJela")
    private Collection<StavkaPlanaIshrane> stavkaPlanaIshraneCollection;
    @JoinColumn(name = "SifraTipaJela", referencedColumnName = "SifraTipaJela")
    @ManyToOne(optional = false)
    private TipJela sifraTipaJela;

    public Jelo() {
    }

    public Jelo(String sifraJela) {
        this.sifraJela = sifraJela;
    }

    public Jelo(String sifraJela, String nazivJela) {
        this.sifraJela = sifraJela;
        this.nazivJela = nazivJela;
    }

    public String getSifraJela() {
        return sifraJela;
    }

    public void setSifraJela(String sifraJela) {
        this.sifraJela = sifraJela;
    }

    public String getNazivJela() {
        return nazivJela;
    }

    public void setNazivJela(String nazivJela) {
        this.nazivJela = nazivJela;
    }

    public Double getBrojKiloKalorijaNa100g() {
        return brojKiloKalorijaNa100g;
    }

    public void setBrojKiloKalorijaNa100g(Double brojKiloKalorijaNa100g) {
        this.brojKiloKalorijaNa100g = brojKiloKalorijaNa100g;
    }

    public Double getKolicinaProteinaNa100g() {
        return kolicinaProteinaNa100g;
    }

    public void setKolicinaProteinaNa100g(Double kolicinaProteinaNa100g) {
        this.kolicinaProteinaNa100g = kolicinaProteinaNa100g;
    }

    public Double getKolicinaUgljenihHidrataNa100g() {
        return kolicinaUgljenihHidrataNa100g;
    }

    public void setKolicinaUgljenihHidrataNa100g(Double kolicinaUgljenihHidrataNa100g) {
        this.kolicinaUgljenihHidrataNa100g = kolicinaUgljenihHidrataNa100g;
    }

    public Double getKolicinaMastiNa100g() {
        return kolicinaMastiNa100g;
    }

    public void setKolicinaMastiNa100g(Double kolicinaMastiNa100g) {
        this.kolicinaMastiNa100g = kolicinaMastiNa100g;
    }

    @XmlTransient
    public Collection<StavkaPlanaIshrane> getStavkaPlanaIshraneCollection() {
        return stavkaPlanaIshraneCollection;
    }

    public void setStavkaPlanaIshraneCollection(Collection<StavkaPlanaIshrane> stavkaPlanaIshraneCollection) {
        this.stavkaPlanaIshraneCollection = stavkaPlanaIshraneCollection;
    }

    public TipJela getSifraTipaJela() {
        return sifraTipaJela;
    }

    public void setSifraTipaJela(TipJela sifraTipaJela) {
        this.sifraTipaJela = sifraTipaJela;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sifraJela != null ? sifraJela.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jelo)) {
            return false;
        }
        Jelo other = (Jelo) object;
        if ((this.sifraJela == null && other.sifraJela != null) || (this.sifraJela != null && !this.sifraJela.equals(other.sifraJela))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kf.mavennst2.domen.Jelo[ sifraJela=" + sifraJela + " ]";
    }
    
}
