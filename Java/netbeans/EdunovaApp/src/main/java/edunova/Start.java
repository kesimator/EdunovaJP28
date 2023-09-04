/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edunova;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import edunova.controller.Obrada;
import edunova.controller.ObradaSmjer;
import edunova.model.Smjer;
import edunova.util.EdunovaException;
import edunova.util.HibernateUtil;
import edunova.util.PocetniInsert;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;

/**
 *
 * @author Polaznik
 */
public class Start {

    public static void main(String[] args) {
       
        // HibernateUtil.getSession();
        // new PocetniInsert();
        
        // System.out.println(new Gson().toJson(new ObradaSmjer().read()));
        
        String json = "[{\"naziv\":\"Delirium Tremens\",\"cijena\":923.00,\"upisnina\":90.00,\"trajanje\":180,\"verificiran\":true,\"sifra\":1},{\"naziv\":\"Sierra Nevada Celebration Ale\",\"cijena\":1044.00,\"upisnina\":62.00,\"trajanje\":262,\"verificiran\":true,\"sifra\":2},{\"naziv\":\"Oak Aged Yeti Imperial Stout\",\"cijena\":1096.00,\"upisnina\":68.00,\"trajanje\":270,\"verificiran\":false,\"sifra\":3},{\"naziv\":\"Sierra Nevada Bigfoot Barleywine Style Ale\",\"cijena\":1019.00,\"upisnina\":103.00,\"trajanje\":109,\"verificiran\":true,\"sifra\":4},{\"naziv\":\"HopSlam Ale\",\"cijena\":1368.00,\"upisnina\":55.00,\"trajanje\":134,\"verificiran\":false,\"sifra\":5},{\"naziv\":\"Yeti Imperial Stout\",\"cijena\":1528.00,\"upisnina\":108.00,\"trajanje\":316,\"verificiran\":false,\"sifra\":6},{\"naziv\":\"Shakespeare Oatmeal\",\"cijena\":1272.00,\"upisnina\":114.00,\"trajanje\":155,\"verificiran\":true,\"sifra\":7},{\"naziv\":\"Dreadnaught IPA\",\"cijena\":986.00,\"upisnina\":58.00,\"trajanje\":95,\"verificiran\":false,\"sifra\":8},{\"naziv\":\"Schneider Aventinus\",\"cijena\":1506.00,\"upisnina\":83.00,\"trajanje\":185,\"verificiran\":true,\"sifra\":9},{\"naziv\":\"Sierra Nevada Celebration Ale\",\"cijena\":1319.00,\"upisnina\":107.00,\"trajanje\":95,\"verificiran\":false,\"sifra\":10},{\"naziv\":\"Hop Rod Rye\",\"cijena\":1314.00,\"upisnina\":81.00,\"trajanje\":148,\"verificiran\":true,\"sifra\":11},{\"naziv\":\"Old Rasputin Russian Imperial Stout\",\"cijena\":1532.00,\"upisnina\":89.00,\"trajanje\":327,\"verificiran\":false,\"sifra\":12},{\"naziv\":\"Prvi preko kontrola\",\"verificiran\":false,\"sifra\":13}]";        
     
        List<Smjer> lista = new Gson().fromJson(json, new TypeToken<List<Smjer>>() {}.getType());
        
        ObradaSmjer os = new ObradaSmjer();
        
        for(Smjer s : lista) {
            os.setEntitet(s);
            try {
                os.create();
            } catch (EdunovaException ex) {
                System.out.println(ex.getPoruka());
            }
        }
       
        
    }
}
