/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kf.mavennst2.jpa.dbb;

import com.kf.mavennst2.domen.Clan;
import com.kf.mavennst2.domen.Jelo;
import com.kf.mavennst2.domen.Korisnik;
import com.kf.mavennst2.domen.PlanIshrane;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Filip
 */
public class DBBroker {
    
    private static DBBroker dbb;

    public static DBBroker getInstance() {
        if (dbb == null) {
            dbb = new DBBroker();
        }
        return dbb;
    }
    
    public Korisnik logIn(Korisnik korisnik) throws Exception{
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nst_filip");
        EntityManager em = emf.createEntityManager();
        
        Korisnik k = (Korisnik) em.createQuery("SELECT k FROM Korisnik k WHERE k.username = :username AND k.password = :password")
                .setParameter("username", korisnik.getUsername()).setParameter("password", korisnik.getPassword()).getSingleResult();
        if(korisnik == null){
            throw new Exception("Korisnik ne postoji.");
        } else {
            return k;
        }
    }
//    PlanIshrane   PlanIshrane   PlanIshrane   PlanIshrane   PlanIshrane   PlanIshrane   PlanIshrane   PlanIshrane   PlanIshrane   PlanIshrane
    public List<PlanIshrane> findAllPlanIshrane(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nst_filip");
        EntityManager em = emf.createEntityManager();
        
        List<PlanIshrane> list = em.createQuery("SELECT p FROM PlanIshrane p").getResultList();
        em.close();
        emf.close();
        return list;
    }
    
    public PlanIshrane findPlanIshraneBySifra(String sifra){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nst_filip");
        EntityManager em = emf.createEntityManager();
        
        PlanIshrane planIshrane = (PlanIshrane) em.createQuery("SELECT p FROM PlanIshrane p WHERE p.sifraPlanaIshrane = :sifraPlanaIshrane")
                .setParameter("sifraPlanaIshrane", sifra).getSingleResult();
        em.close();
        emf.close();
        return planIshrane;
    }
    
    public PlanIshrane findPlanIshraneByNaziv(String naziv) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nst_filip");
        EntityManager em = emf.createEntityManager();
        
        PlanIshrane planIshrane = (PlanIshrane) em.createQuery("SELECT p FROM PlanIshrane p WHERE p.nazivPlanaIshrane = :nazivPlanaIshrane")
                .setParameter("nazivPlanaIshrane", naziv).getSingleResult();
        
        em.close();
        emf.close();
        return planIshrane;
    }
    
    public void persistPlanIshrane(PlanIshrane planIshrane){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nst_filip");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(planIshrane);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
    public void deletePlanIshraneBySifra(PlanIshrane planIshrane){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nst_filip");
        EntityManager em = emf.createEntityManager();
        
        PlanIshrane plan = em.find(PlanIshrane.class, planIshrane.getSifraPlanaIshrane());
        em.getTransaction().begin();
        em.remove(plan);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
//    Clan Clan Clan
    public void persistClan(Clan clan) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nst_filip");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(clan);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public List<Clan> findAllClan() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nst_filip");
        EntityManager em = emf.createEntityManager();
        
        List<Clan> list = em.createQuery("SELECT c FROM Clan c").getResultList();
        em.close();
        emf.close();
        return list;
    }

    public List<Jelo> findAllJelo() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nst_filip");
        EntityManager em = emf.createEntityManager();
        
        List<Jelo> list = em.createQuery("SELECT j FROM Jelo j").getResultList();
        em.close();
        emf.close();
        return list;
    }

    public Jelo findJeloByNaziv(String naziv) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nst_filip");
        EntityManager em = emf.createEntityManager();
        
        Jelo jelo = (Jelo) em.createQuery("SELECT j FROM Jelo j WHERE j.nazivJela = :nazivJela")
                .setParameter("nazivJela", naziv).getSingleResult();
        
        em.close();
        emf.close();
        return jelo;
    }

    public void delete(Clan clan) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nst_filip");
        EntityManager em = emf.createEntityManager();
        
        Clan c = em.find(Clan.class, clan.getSifraClana());
        em.getTransaction().begin();
        em.remove(c);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
