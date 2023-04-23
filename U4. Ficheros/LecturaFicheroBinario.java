/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class LecturaFicheroBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(".\\info.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            //Leo en el mismo orden y la misma cantidad de datos: 3 int, 1 double, 1 boolean
            int dia = ois.readInt();
            int mes = ois.readInt();
            int ano = ois.readInt();
            double nota = ois.readDouble();
            boolean meGustaProgramar = ois.readBoolean();
            //Leo el String:
            String mensajito = (String) ois.readObject();
            char letra = ois.readChar();
            //Leo la persona:
            Persona persona = (Persona) ois.readObject();
            ois.close();
            //Imprimo la información leida
            System.out.println(dia + "/" + mes + "/" + ano + " -- " + nota + " " + meGustaProgramar);
            System.out.println(mensajito);
            System.out.println(persona);
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
            System.out.println("Qué pena que algo ha fallado");
            ex.printStackTrace();
        }

    }

}
