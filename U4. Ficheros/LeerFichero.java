/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class LeerFichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            //C:\Users\JoséManuelRuizGarcía\Desktop\t.txt
            FileReader fr = new FileReader("t.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();   //Devuelve la línea leida o null si ha llegado al final
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Error de IO: " + ex.getMessage());
        }


        try {
            String cont = contenidoFichero("t.txt");
            System.out.println(cont);
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }

    //Devuelve un String ocn el contenido del fichero
    public static String contenidoFichero(String path) throws FileNotFoundException, IOException {
        String texto = "";
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();   //Devuelve la línea leida o null si ha llegado al final
        while (linea != null) {
            texto += linea;
            linea = br.readLine();
        }
        br.close();
        return texto;
    }

    //Devuelve un arrayList de Strings con cada línea del fichero en una posición del array
    public static ArrayList<String> lineasFichero(String path) throws IOException {
        ArrayList<String> lineas = new ArrayList<>();
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while((linea = br.readLine())!=null){
            lineas.add(linea);
        }
        br.close();
        return lineas;
    }

    /**
     * Devuelve el número de caracteres de un fichero. (Reutilizad las funciones
     * ya hechas)
     *
     * @param path
     * @return
     */
    public static int numCaracteresFichero(String path) throws IOException {
        return contenidoFichero(path).length();
    }

}
