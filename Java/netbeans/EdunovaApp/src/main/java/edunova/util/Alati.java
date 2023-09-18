/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.util;

import edunova.model.Operater;

/**
 *
 * @author Polaznik
 */
public class Alati {
    
    public static final String NAZIV_APP="Edunova APP";
    public static Operater OPERATER;
    
    public static String getOperater() {
        return OPERATER.getIme() + " " + OPERATER.getPrezime() + " (" + OPERATER.getUloga() + ")";
    }
    
    /**
     * Provjera valjanosti OIB broja
     * https://regos.hr/app/uploads/2018/07/KONTROLA-OIB-a.pdf
     * @param oib String bilo koje dužine
     * @return true ako je valjan, false ako nije valjan
     */
    public static boolean isValjanOIB(String oib) {
        
        if(oib==null || oib.length() != 11) {
            return false;
        }

        char[] chars = oib.toCharArray();
        
        int a = 10;
        for (int i = 0; i < 10; i++) {
        	char c = chars[i];
        	if (c < '0' || c > '9') {
        		return false;
        	}
            a = a + (c - '0');
            a = a % 10;
            if (a == 0) {
                a = 10;
            }
            a *= 2;
            a = a % 11;
        }
        int kontrolni = 11 - a;
        kontrolni = kontrolni % 10;

        return (kontrolni == (chars[10] - '0'));
        
        
        
        
        
    }
    
}
