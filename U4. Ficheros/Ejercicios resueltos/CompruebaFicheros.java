/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosFicheros;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author seter
 */
public class CompruebaFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un fichero:");
        String fichero = sc.nextLine();
        File f = new File(fichero);
        if (f.exists()) {
            System.out.println("El fichero " + f.getPath() + " existe.");

            System.out.println("Permisos:");
            System.out.print("\tLectura: ");
            if (f.canRead()) {
                System.out.println("Si");
            } else {
                System.out.println("No");
            }

            System.out.print("\tEscritura: ");
            if (f.canWrite()) {
                System.out.println("Si");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("El fichero " + f.getPath() + " no existe");
        }
    }

}
