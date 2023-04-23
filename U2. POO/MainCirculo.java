/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class MainCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c1 = new Circulo(10);
        Circulo c2 = new Circulo(8, "Rojo");
        //c1.color = "Verde";
        c1.setColor("Verde");
        
        double areaC1 = c1.calcularArea();
        System.out.println(areaC1);
        
        System.out.println(c2.calcularArea());
        double sumaAreas = c1.calcularArea() + c2.calcularArea();
        System.out.println("La suma de las áreas es "  + sumaAreas);
    }
    
}
