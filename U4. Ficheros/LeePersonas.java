/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class LeePersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personas.bin"));
            personas = (ArrayList<Persona>)ois.readObject();
            ois.close();
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        } 

//        try {
//            //Lee personas y mételas en un arrayLIst, sin saber cuántos objetos
//            //de la clase persona habrá en el fichero binario.
//
//            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personas.bin"));
//            int numPersonas = ois.readInt();
//            for (int i = 0; i < numPersonas; i++) {
//                Persona p = (Persona) ois.readObject();
//                personas.add(p);
//            }
////            Persona p;
////            while ((p = (Persona) ois.readObject()) != null) {
////                personas.add(p);
////            }
//            ois.close();
//        } catch (Exception ex) {
//            System.err.println("Error: " + ex.getMessage());
//        } 
        
        //Imprimo las personas:
        for (int i = 0; i < personas.size(); i++) {
            System.out.println("-->" + personas.get(i));
        }
    }

}
