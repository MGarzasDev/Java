/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class SalaCine {

    private String pelicula;
    private int filas, butacas, vendidas;

    public SalaCine() {
    }

//    public SalaCine(String pelicula) {
//        this.pelicula = pelicula;
//    }
//    public SalaCine(int filas) {
//        this.filas = filas;
//    }
    public SalaCine(String pelicula, int filas, int butacas) {
        this.pelicula = pelicula;
        this.filas = filas;
        this.butacas = butacas;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        if (filas > 0) {
            this.filas = filas;
        } else {
            System.err.println("Error filas negativas");
        }
    }

    public int getButacas() {
        return butacas;
    }

    public void setButacas(int butacas) {
        if (butacas > 0) {
            this.butacas = butacas;
        }
    }

    public int getVendidas() {
        return vendidas;
    }

    public void setVendidas(int vendidas) {
        this.vendidas = vendidas;
    }

    public int calcularAsientos() {
        int total;
        total = this.filas * this.butacas;
        return total;
    }

    public String venderAsiento(int fila, int butaca) {
        String resultado = "  ";
        //Control de errores:
        if (fila > this.filas || butaca > this.butacas) {
            return "Error: asiento fuera de rango";
        }

        //Funcionalidad:
        //fila=4 butaca=3
        for (int i = 1; i <= this.butacas; i++) {
            resultado += i + " ";
        }
        resultado += "\n";
        for (int i = 1; i <= this.filas; i++) {  //i son las filas
            for (int j = 1; j <= this.butacas; j++) {    //j columnas o butacas
                if (j == 1){    //Si es la primera columna, imprimo el número
                    resultado += i + " ";
                }
                if (i == fila && j == butaca) {
                    resultado += "o ";
                } else {
                    resultado += "- ";
                }
            }
            resultado += "\n";
        }

        return resultado;
    }

//    @Override
//    public String toString() {
//        return "Película: " + this.pelicula 
//                + " - Filas: " + this.filas
//                + " - Butacas: " + this.butacas
//                + " - Vendidas: " + this.vendidas;
//    }
    @Override
    public String toString() {
        return "SalaCine{" + "pelicula=" + pelicula
                + ", filas=" + filas
                + ", butacas=" + butacas
                + ", vendidas=" + vendidas + '}';
    }

}
