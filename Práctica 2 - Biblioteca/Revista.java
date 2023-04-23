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
public class Revista {
    private String issn;
    private String titulo;
    private Autoria autoria;
    private int prestados;

    public Revista(String issn, String titulo, String nombre, String apellidos, LocalDate fechaNacimiento) {
        this.issn = issn;
        this.titulo = titulo;
        this.autoria = new Autoria(nombre, apellidos, fechaNacimiento);
        this.prestados = 0;
    }

    public String getIssn() {
        return issn;
    }

    public int prestar() {
        return ++this.prestados;
    }

    public int devolver() {
        if (this.prestados == 0) {
            return -1;
        }
        return --this.prestados;
    }

    @Override
    public String toString() {
        String ret = "";
        ret += "ISSN: " + this.issn;
        ret += "\t" + this.titulo;
        ret += ", " + this.autoria;
        ret += " - " + this.prestados + " prestados.";
        return ret;
    }
    
    
}
