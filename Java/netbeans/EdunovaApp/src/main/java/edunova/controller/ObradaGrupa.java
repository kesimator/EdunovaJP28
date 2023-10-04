/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Grupa;
import edunova.util.EdunovaException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Polaznik
 */
public class ObradaGrupa extends Obrada<Grupa> {

    @Override
    public List<Grupa> read() {
        return session.createQuery("from Grupa", Grupa.class).list();
    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        kontrolaSmjer();
        kontrolaPredavac();
        kontrolaDatumPocetkaUnos();
    }
    
    private void kontrolaDatumPocetkaUnos() throws EdunovaException {
        // Ako je unesen, datum mora biti nakon današnjeg datuma
        if(getEntitet().getDatumPocetka()==null) {
            return;
        }
        if(getEntitet().getDatumPocetka().compareTo(new Date())<=0) {
            throw new EdunovaException("Datum i vrijeme moraju biti nakon trenutnog datuma i vremena!");        
        }
    }
    
    private void kontrolaSmjer() throws EdunovaException {
        if(getEntitet().getSmjer()==null || getEntitet().getSmjer().getSifra()==0) {
            throw new EdunovaException("Smjer mora biti odabran!");        
        }
    }
    
    private void kontrolaPredavac() throws EdunovaException {
        if(getEntitet().getPredavac()==null || getEntitet().getPredavac().getSifra()==0) {
            getEntitet().setPredavac(null);
        }
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
        kontrolaSmjer();
        kontrolaPredavac();
        kontrolaDatumPocetkaPromjena();
    }
    
    private void kontrolaDatumPocetkaPromjena() throws EdunovaException {
        // Ako je unesen, datum mora biti nakon današnjeg datuma
        if(getEntitet().getDatumPocetka()==null) {
            throw new EdunovaException("Datum i vrijeme moraju biti postavljeni!");
        }
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {

    }

}
