/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestorFicheros;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author seter
 */
public class GestorDeFicherosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> contenido = new ArrayList<>();
        contenido.add("esto es una linea");
        contenido.add("esto otra linea");
        contenido.add("fin");
        File path = new File(".//texto.txt");
        //1. Pruebo a escribir el fichero:
        try {
            GestorDeFicheros.escribeFicheroEntero(path, contenido);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

        //2. Pruebo a leer el fichero:
        ArrayList<String> contenidoLeido;
        try {
            contenidoLeido = GestorDeFicheros.leeFicheroEntero(path);
            System.out.println("Fichero leído:");
            for (String linea : contenidoLeido) {
                System.out.println("\t" + linea);
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

        //3. Pruebo a contar palabras
        try {
            int palabras = GestorDeFicheros.cuentaPalabras(path);
            System.out.println("Número de palabras: " + palabras);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

        //4. Pruebo a concatenar:
        try {
            GestorDeFicheros.escribeFicheroEntero(path, contenido, true);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        
        //5. Pruebo a copiar ficheros:
        try {
            File pathCopia = new File(".\\textoCopia.txt");
            GestorDeFicheros.copiaFichero(path, pathCopia);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

    }

}
