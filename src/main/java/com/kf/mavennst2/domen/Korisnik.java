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
@Table(name = "korisnik")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Korisnik.findAll", query = "SELECT k FROM Korisnik k")
    , @NamedQuery(name = "Korisnik.findBySifraKorisnika", query = "SELECT k FROM Korisnik k WHERE k.sifraKorisnika = :sifraKorisnika")
    , @NamedQuery(name = "Korisnik.findByIme", query = "SELECT k FROM Korisnik k WHERE k.ime = :ime")
    , @NamedQuery(name = "Korisnik.findByPrezime", query = "SELECT k FROM Korisnik k WHERE k.prezime = :prezime")
    , @NamedQuery(name = "Korisnik.findByUsername", query = "SELECT k FROM Korisnik k WHERE k.username = :username")
    , @NamedQuery(name = "Korisnik.findByPassword", query = "SELECT k FROM Korisnik k WHERE k.password = :password")})
public class Korisnik implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "SifraKorisnika")
    private String sifraKorisnika;
    @Size(max = 60)
    @Column(name = "Ime")
    private String ime;
    @Size(max = 60)
    @Column(name = "Prezime")
    private String prezime;
    @Size(max = 20)
    @Column(name = "Username")
    private String username;
    @Size(max = 20)
    @Column(name = "Password")
    private String password;

    public Korisnik() {
    }

    public Korisnik(String sifraKorisnika) {
        this.sifraKorisnika = sifraKorisnika;
    }

    public String getSifraKorisnika() {
        return sifraKorisnika;
    }

    public void setSifraKorisnika(String sifraKorisnika) {
        this.sifraKorisnika = sifraKorisnika;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sifraKorisnika != null ? sifraKorisnika.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Korisnik)) {
            return false;
        }
        Korisnik other = (Korisnik) object;
        if ((this.sifraKorisnika == null && other.sifraKorisnika != null) || (this.sifraKorisnika != null && !this.sifraKorisnika.equals(other.sifraKorisnika))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kf.mavennst2.domen.Korisnik[ sifraKorisnika=" + sifraKorisnika + " ]";
    }
    
}
