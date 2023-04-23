/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import clasesExtra.Direccion;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Alumnado extends Persona {

    private Direccion direccion;

    public Alumnado(String id, String nombre, String calle, int numero) {
        super(id, nombre);
        this.direccion = new Direccion(calle, numero);
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + this.direccion;
    }
    
    @Override
    public boolean equals(Object obj) {
        Alumnado a = (Alumnado) obj;
        if (super.equals(obj) && this.direccion.equals(a.direccion)) {
            return true;
        }
        return false;
    }

}
