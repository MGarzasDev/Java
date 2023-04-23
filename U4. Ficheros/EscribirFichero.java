/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class EscribirFichero {

    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("t.txt");
            fw.close();
        } catch (IOException ex) {
            System.err.println("Error IO: " + ex.getMessage());
        }

        try {
            FileWriter fw = new FileWriter("escrito.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("primera linea");
            bw.newLine();   //bw.write("\n");
            bw.flush(); //En este momento, se vacía el buffer y se escribe en el fichero
            bw.write("segunda linea");
            bw.close();
            //fw.close(); No haría falta, porque ya lo hace la línea anterior.
        } catch (IOException ex) {
            System.err.println("Error IO: " + ex.getMessage());
        }

        try {
            FileWriter fw = new FileWriter("otro.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("una línea");
            pw.println("Otra linea");
            pw.close();
        } catch (IOException ex) {
            System.err.println("Error IO: " + ex.getMessage());
        }
    }

}
