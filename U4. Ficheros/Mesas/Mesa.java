/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mesa;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Mesa {
    private String nombre;
    private Pata pata;

    public Mesa(String nombre, double longitud, double radio) {
        this.nombre = nombre;
        this.pata = new Pata(longitud, radio);
    }

    @Override
    public String toString() {
        return nombre + " Pata: " + pata;
    }
    
    
    
}
