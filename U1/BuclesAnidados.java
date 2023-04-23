/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miprimerprograma;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class BuclesAnidados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print("o\t");
        }
        System.out.println("\n----\n");

        for (int i = 0; i < 3; i++) {   //filas
            for (int j = 0; j < 5; j++) {   //columnas
                System.out.print("o\t");
            }
            System.out.println("");
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("\n--------\n--------");
        for (int i = 0; i < 5; i++) {   //filas
            for (int j = 0; j < 6; j++) {   //columnas
                if (i == 3) {
                    System.out.print(" #");
                } else if (j % 2 == 0) {   //if (j==0 || j==2 || j==4){
                    System.out.print(" -");
                } else {
                    System.out.print(" *");
                }
                
            }
            System.out.println("");
        }

    }
}
