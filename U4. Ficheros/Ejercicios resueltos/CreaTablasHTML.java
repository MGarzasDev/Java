/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosFicheros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author seter
 */
public class CreaTablasHTML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de filas:\t");
        int filas = sc.nextInt();
        System.out.print("Numero de columnas:\t");
        int columnas = sc.nextInt();

        try {
            PrintWriter pw = new PrintWriter(new FileWriter("tabla.html"));
            pw.println("<table>");
            for (int i = 0; i < filas; i++) {
                pw.println("<tr>");
                for (int j = 0; j < columnas; j++) {
                    pw.println("<td>AAA</td>");
                }
                pw.println("</tr>");
            }

            pw.println("</table>");

            pw.close();
            System.out.println("Fichero guardado con éxito.");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

}
