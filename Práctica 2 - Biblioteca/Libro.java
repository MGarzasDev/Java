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
public class Libro {

    private String isbn;
    private String titulo;
    private Autoria autoria;
    private int ejemplares;
    private int prestados;

    public Libro(String isbn, String titulo, String nombre, String apellidos,
            LocalDate fechaNacimiento, int ejemplares) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autoria = new Autoria(nombre, apellidos, fechaNacimiento);
        this.ejemplares = ejemplares;
        this.prestados = 0;
    }

    public String getIsbn() {
        return isbn;
    }

    public int prestar() {
        if (prestados >= ejemplares) {
            return -1;
        }
        prestados++;
        return ejemplares - prestados;
    }

    public int devolver() {
        if (prestados == 0) {
            return -1;
        }
        prestados--;
        return ejemplares - prestados;
    }

    @Override
    public String toString() {
        String ret = "";
        ret += "ISBN: " + this.isbn;
        ret += "\t" + this.titulo;
        ret += ", " + this.autoria;

        ret += " - " + this.ejemplares + " ejemplares -> " + this.prestados + " prestados.";
        return ret;
    }
}
