/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Osoba;
import edunova.util.Alati;
import edunova.util.EdunovaException;

/**
 *
 * @author Polaznik
 */
public abstract class ObradaOsoba<T extends Osoba> extends Obrada<T> {

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        kontrolaOib();
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {

    }

    protected void kontrolaOib() throws EdunovaException {
        // DZ: napraviti kontrolu OIB-a https://regos.hr/app/uploads/2018/07/KONTROLA-OIB-a.pdf
        if (!Alati.isValjanOIB(entitet.getOib())) {
            throw new EdunovaException("OIB nije valjan!");
        }
    }

}
