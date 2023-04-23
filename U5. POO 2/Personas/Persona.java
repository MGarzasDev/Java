/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public abstract class Persona {

    protected String id;
    protected String nombre;

    public Persona(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String mostrarDatos() {
        return id + " - " + nombre;
    }

    @Override
    public boolean equals(Object obj) {
        Persona p = (Persona) obj;
        if (this.id.equals(p.id) && this.nombre.equals(p.nombre)) {
            return true;
        }
        return false;
    }

}
