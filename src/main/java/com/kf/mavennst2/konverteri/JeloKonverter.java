/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kf.mavennst2.konverteri;

import com.kf.mavennst2.domen.Jelo;
import com.kf.mavennst2.jpa.controller.Controller;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Filip
 */
@FacesConverter(forClass = Jelo.class, value = "jeloCNV")
public class JeloKonverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (!value.isEmpty()){
            Jelo j  = Controller.getInstance().findJeloByNaziv(value);
            return j;
        }
        
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value instanceof Jelo){
            
            Jelo j = (Jelo) value;
            return j.getNazivJela();            
        }
        
        
        return "";
    }
    
}
