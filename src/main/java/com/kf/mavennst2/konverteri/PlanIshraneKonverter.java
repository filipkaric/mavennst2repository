/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kf.mavennst2.konverteri;

import com.kf.mavennst2.domen.PlanIshrane;
import com.kf.mavennst2.jpa.controller.Controller;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;


/**
 *
 * @author Filip
 */
@FacesConverter(forClass = PlanIshrane.class, value = "planIshraneCNV")
public class PlanIshraneKonverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (!value.isEmpty()){
            PlanIshrane pi  = Controller.getInstance().findPlanIshraneByNaziv(value);
            return pi;
        }
        
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
         if (value instanceof PlanIshrane){
            
            PlanIshrane pi = (PlanIshrane) value;
            return pi.getNazivPlanaIshrane();            
        }
        
        
        return "";
    }
    
}
