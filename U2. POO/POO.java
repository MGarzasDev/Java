/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int numero;
        //Scanner sc = new Scanner(System.in);

        Persona sonia = new Persona("Sonia", 25, 170, 59.7);
        //System.out.println(sonia.comer());

        Persona p = new Persona("Sara", 49);

        //sonia.nombre = "Sonia";   //Atributo privado
        //sonia.tardar(5);  Método privado
        int nuevaEdad = p.cumplirAno();
        System.out.println("La edad de Sara es " + nuevaEdad);
        nuevaEdad = p.cumplirAno();
        System.out.println("La edad de Sara es " + nuevaEdad);
        nuevaEdad = p.cumplirAno();
        System.out.println("La edad de Sara es " + nuevaEdad);
        
        
        Persona fatima = new Persona("Fatima", 50);
        System.out.println(fatima.comer());
        //fatima.peso = -600000; //<=
        sonia.crecer(1.9);
        System.out.println(sonia.getAltura());
        sonia.crecer(4.6);
        System.out.println(sonia.getAltura());
        
        
        Persona marta = new Persona("Marta", 22);
        System.out.println("--------------");
        System.out.println(marta);
    }

}
