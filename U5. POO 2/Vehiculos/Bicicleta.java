/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Bicicleta extends Vehiculo{
    private String marca;

    public Bicicleta(String marca) {
        super();
        this.marca = marca;
    }

    public Bicicleta(String marca, int km, boolean averiado) {
        super(km, averiado);
        this.marca = marca;
    }
    
    
}
