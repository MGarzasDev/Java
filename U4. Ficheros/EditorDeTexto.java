/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class EditorDeTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escribe el path del fichero:");
        Scanner sc = new Scanner(System.in);
        String ruta = sc.nextLine();

        //Programa que pedirá por pantalla líneas a la persona usuaria,
        //y las irá guardando en el fichero indicado al principio
        //Terminará cuando la persona usuaria introduce -1
        System.out.println("Escribe las líneas que quieras guardar en el fichero. -1 para salir");
        String linea = "";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));
            while (!(linea = sc.nextLine()).equals("-1")) {
                bw.write(linea);
                bw.newLine();
                //bw.flush(); Opcional...
            }
            bw.close();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

    }

}
