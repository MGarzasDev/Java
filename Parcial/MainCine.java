/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class MainCine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SalaCine cine1 = new SalaCine("Interestelar", 4, 6);
        SalaCine cine2 = new SalaCine();
        //Puedo rellenar atributos con setters pero es raro, para eso tengo constructor
        cine2.setPelicula("LNM");
        cine2.setFilas(9);
        cine2.setButacas(9);
        int total = cine1.calcularAsientos() + cine2.calcularAsientos();
        System.out.println("Butacas totales: " + total);
        System.out.println(cine1.venderAsiento(4, 3));
        System.out.println(cine2.venderAsiento(7, 10));
    }
    
}
