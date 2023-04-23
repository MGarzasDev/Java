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
public class Persona implements Serializable {

    private String nombre;
    private int edad;
    private boolean enParo;
    private Direccion direccion;

    public Persona(String nombre, int edad, boolean enParo, String calle, int numero, String piso) {
        this.nombre = nombre;
        this.edad = edad;
        this.enParo = enParo;
        this.direccion = new Direccion(calle, numero, piso);
    }

    @Override
    public String toString() {
        String ret = nombre + ", " + edad + " años. Dirección: " + direccion + ". ";
        ret += enParo ? "No " : "Sí ";
        ret += " está en paro.";
        return ret;
    }

    public String aFichero() {
        String ret = nombre + "\n";
        ret += edad + "\n";
        if (enParo) {
            ret += "S\n";
        } else {
            ret += "N\n";
        }
        ret += direccion.aFichero();
        return ret;
    }

}
