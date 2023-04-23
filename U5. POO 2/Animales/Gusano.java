/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Gusano extends Animal {

    public Gusano(String nombre) {
        super(nombre);
    }

    @Override
    public String comer() {
        return "Soy un gusano y como";
    }
    
    
}
