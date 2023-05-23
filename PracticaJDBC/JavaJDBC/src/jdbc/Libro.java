/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

/**
 *
 * @author Miguel De La Torre Garzás
 */
public class Libro {

    private String ISBN;
    private String titulo;
    private Autoria autoria;
    private int ejemplares;
    private int prestados;

    public Libro(String ISBN, String titulo, Autoria autoria, int ejemplares, int prestados) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autoria = autoria;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

   public boolean prestar() {
    if (getEjemplares() > getPrestados()) {
        setPrestados(getPrestados() + 1);
        return true;
    }
    return false;
}


    public int devolver() {
        if (prestados > 0) {
            prestados--;
            return ejemplares - prestados;
        }
        return -1;
    }

    // getters y setters para cada atributo
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autoria getAutoria() {
        return autoria;
    }

    public void setAutoria(Autoria autoria) {
        this.autoria = autoria;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
    
     public String toString() {
        return "ISBN: " + this.ISBN + "\nTítulo: " + this.titulo + "\nAutoría: " + this.autoria.toString() + "\nEjemplares: " + this.ejemplares + "\nPrestados: " + this.prestados;
    }
}

