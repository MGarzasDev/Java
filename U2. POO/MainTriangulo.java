/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacroParcial;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class MainTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(10);
        Triangulo t2 = new Triangulo(15);
        System.out.println(t1.calcularPerimetro() + t2.calcularPerimetro());
    }
    
}
