/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kf.mavennst2.domen;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "tipjela")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipJela.findAll", query = "SELECT t FROM TipJela t")
    , @NamedQuery(name = "TipJela.findBySifraTipaJela", query = "SELECT t FROM TipJela t WHERE t.sifraTipaJela = :sifraTipaJela")
    , @NamedQuery(name = "TipJela.findByNazivTipaJela", query = "SELECT t FROM TipJela t WHERE t.nazivTipaJela = :nazivTipaJela")})
public class TipJela implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "SifraTipaJela")
    private String sifraTipaJela;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NazivTipaJela")
    private String nazivTipaJela;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sifraTipaJela")
    private Collection<Jelo> jeloCollection;

    public TipJela() {
    }

    public TipJela(String sifraTipaJela) {
        this.sifraTipaJela = sifraTipaJela;
    }

    public TipJela(String sifraTipaJela, String nazivTipaJela) {
        this.sifraTipaJela = sifraTipaJela;
        this.nazivTipaJela = nazivTipaJela;
    }

    public String getSifraTipaJela() {
        return sifraTipaJela;
    }

    public void setSifraTipaJela(String sifraTipaJela) {
        this.sifraTipaJela = sifraTipaJela;
    }

    public String getNazivTipaJela() {
        return nazivTipaJela;
    }

    public void setNazivTipaJela(String nazivTipaJela) {
        this.nazivTipaJela = nazivTipaJela;
    }

    @XmlTransient
    public Collection<Jelo> getJeloCollection() {
        return jeloCollection;
    }

    public void setJeloCollection(Collection<Jelo> jeloCollection) {
        this.jeloCollection = jeloCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sifraTipaJela != null ? sifraTipaJela.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipJela)) {
            return false;
        }
        TipJela other = (TipJela) object;
        if ((this.sifraTipaJela == null && other.sifraTipaJela != null) || (this.sifraTipaJela != null && !this.sifraTipaJela.equals(other.sifraTipaJela))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kf.mavennst2.domen.TipJela[ sifraTipaJela=" + sifraTipaJela + " ]";
    }
    
}
