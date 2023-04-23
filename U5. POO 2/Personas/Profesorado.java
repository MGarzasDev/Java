/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Profesorado extends Persona {

    private double sueldo;

    public Profesorado(String id, String nombre) {
        super(id, nombre);
        this.sueldo = -1;
    }

    public Profesorado(String id, String nombre, double sueldo) {
        super(id, nombre);
        this.sueldo = sueldo;
    }

    public String cobrarSueldo() {
        return nombre + " cobra " + this.sueldo;
    }

    @Override
    public String mostrarDatos() {
        String ret = super.mostrarDatos();
        ret += ". Cobra: " + this.sueldo;
        return ret;
    }

    @Override
    public boolean equals(Object obj) {
        Profesorado p = (Profesorado) obj;
        if (super.equals(obj) && this.sueldo == p.sueldo) {
            return true;
        }
        return false;
    }

}
