/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mesa;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Pata {
    private double longitud;
    private double radio;

    public Pata(double longitud, double radio) {
        this.longitud = longitud;
        this.radio = radio;
    }

    @Override
    public String toString() {
        return longitud + " " + radio;
    }
    
    
}
