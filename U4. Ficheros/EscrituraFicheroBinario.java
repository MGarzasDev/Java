/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class EscrituraFicheroBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream(".\\info.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //Tres enteros, un double, un boolean y un String
            oos.writeInt(16);
            oos.writeInt(2);
            oos.writeInt(2023);
            oos.writeDouble(9.17);
            oos.writeBoolean(true);
            oos.writeObject("Hoy está siendo un gran jueves");
            oos.writeChar('Q');
            Persona p = new Persona("Sete", 35, 1.69);
            oos.writeObject(p);
            //oos.flush(); El close ya hace un flush
            oos.close();
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        } 
    }
    
}
