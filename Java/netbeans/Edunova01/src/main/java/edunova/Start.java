/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edunova;

import com.github.javafaker.Faker;

/**
 *
 * @author Polaznik
 */
public class Start {

    public static void main(String[] args) {
        //  new Prozor().setVisible(true);
        
        // new LjubavniKalkulator().setVisible(true);
        
        Faker f = new Faker();
        while (true) {
            System.out.println(f.beer().name());
        }
}
}