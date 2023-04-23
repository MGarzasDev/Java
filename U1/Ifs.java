/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miprimerprograma;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Ifs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 10;
        if (num > 10) {
            System.out.println("No es diez");
        } else if (num == 10) {
            System.out.println("Diez"); ////
        }

        if (num <= 10) {
            if (num < 10) {
                System.out.println("A");
            } else {
                System.out.println("B");    ////
            }
            System.out.println("Es menor o igual a 10"); ////
        } else if (num == 10) {
            System.out.println("C");
        } else {
            System.out.println("otra cosa");
        }

    }
}
