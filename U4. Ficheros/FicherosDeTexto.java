/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class FicherosDeTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto = "";
        try {
            FileReader fr = new FileReader("C:\\Users\\JoséManuelRuizGarcía\\Desktop\\texto.txt");
            int c = fr.read();
            while (c != -1) {
                texto += (char) c;
                c = fr.read();
            }
            fr.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Error: No existe el fichero " + ex.getMessage());
            ex.printStackTrace();
        } catch (IOException ex) {
            System.err.println("Error E/S: " + ex.getMessage());
        }
        //System.out.println(texto);

        //BufferedReader:
        texto = "";
        try {
            FileReader fr = new FileReader("C:\\Users\\JoséManuelRuizGarcía\\Desktop\\texto.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
                texto += linea;
                linea = br.readLine();
            }
//            String lineaa;
//            while ((lineaa = br.readLine()) != null) {
//                texto += lineaa;
//            }
            //Cerrar streams
            br.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Error: No existe el fichero " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Error E/S: " + ex.getMessage());
        }
        System.out.println(texto);
    }

}
