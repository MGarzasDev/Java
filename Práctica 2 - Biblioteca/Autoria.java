/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progdaw2223prac2;

import java.time.LocalDate;

/**
 *
 * @author seter
 */
public class Autoria {

    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;

    public Autoria(String nombre, String apellidos, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellidos;
    }
}
