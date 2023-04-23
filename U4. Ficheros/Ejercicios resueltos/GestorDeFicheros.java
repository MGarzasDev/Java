/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author seter
 */
public class GestorDeFicheros {

    public static ArrayList<String> leeFicheroEntero(File path) throws IOException {
        ArrayList<String> contenido = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(path));
        String linea;
        while ((linea = br.readLine()) != null) {
            contenido.add(linea);
        }
        br.close();
        return contenido;
    }

    public static void escribeFicheroEntero(File path,
            ArrayList<String> contenido) throws IOException {
        escribeFicheroEntero(path, contenido, false);
    }

    public static void escribeFicheroEntero(File path,
            ArrayList<String> contenido,
            boolean concatenar) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path, concatenar));
        for (String linea : contenido) {
            bw.write(linea);
            bw.newLine();
        }
        bw.close();
    }

    public static void copiaFichero(File pathOriginal, File pathDestino) throws IOException {
        ArrayList<String> contenido = leeFicheroEntero(pathOriginal);
        escribeFicheroEntero(pathDestino, contenido);
    }

    public static int cuentaPalabras(File path) throws IOException {
        int contador = 0;
        ArrayList<String> contenido = leeFicheroEntero(path);
        for (String linea : contenido) {
            String[] palabras = linea.split(" ");
            contador += palabras.length;
        }
        return contador;
    }
}
