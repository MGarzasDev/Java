/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheros;

import java.io.Serializable;

/**
 *
 * @author seter
 */
public class Direccion implements Serializable{

    private String calle;
    private int numero;
    private String piso;

    public Direccion(String calle, int numero, String piso) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
    }

    @Override
    public String toString() {
        return calle + " " + numero + ", " + piso;
    }

    public String aFichero() {
        String ret = calle + "\n";
        ret += numero + "\n";
        ret += piso;
        return ret;
    }

}
