/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Gato extends Animal implements Ruido {

    public Gato(String nombre) {
        super(nombre);
    }
    

    @Override
    public String comer() {
        return "Soy un gato y como";
    }

    @Override
    public String hacerRuido() {
        try {
            Thread.sleep(Ruido.duracion * 1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return "Miau";
    }

}
