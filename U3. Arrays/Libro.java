/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.time.LocalDate;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Libro {
    private String isbn;
    private String titulo;
    private Autoria autoria;
    private int ejemplares;
    private int presatos;

    public Libro(String isbn, String titulo, String nombre, String apellidos, LocalDate fecha, int ejemplares) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autoria = new Autoria(nombre, apellidos, fecha);
        this.ejemplares = ejemplares;
        this.presatos = 0;
    }

    public String getIsbn() {
        return isbn;
    }
    
    
    
    public int prestar(){
        //Comprobar que hay ejemplares...
        this.presatos++;
        return ejemplares - presatos;
        //NO ESTÁ BIEN.
    }
    
    
}
