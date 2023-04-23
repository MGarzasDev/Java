/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosFicheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author seter
 */
public class EscribeConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Path del fichero:");
        String fichero = sc.nextLine();
        File f = new File(fichero);
        System.out.println("Escribe el contenido del fichero [-1 para salir]:");
        String linea;
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            while (!(linea = sc.nextLine()).equals("-1")) {
                bw.write(linea);
                bw.newLine();
            }
            bw.close();
            System.out.println("Fichero " + f.getPath() + " guardado con éxito.");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
