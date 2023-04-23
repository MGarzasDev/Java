/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class EscribePersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        
        //1. Crear entre 3 y 6 personas directamente en el código y meterlas en el arraylist
        Persona p1 = new Persona("Ana", 26, 1.81);
        personas.add(p1);
        personas.add(new Persona("maría", 22, 1.55));
        personas.add(new Persona("Luz", 26, 1.66));
        personas.add(new Persona("alfreda", 25, 1.77));
        
        try {
            FileOutputStream fos = new FileOutputStream("personas.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(personas);
            oos.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
            
        
        
        
//        try {
//            //2. Guardar todas las personas en un fichero binario
//            FileOutputStream fos = new FileOutputStream("personas.bin");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeInt(personas.size());
//            for (int i = 0; i < personas.size(); i++) {
//                oos.writeObject(personas.get(i));
//            }
//            oos.close();
//            
//        } catch (IOException ex) {
//            System.err.println(ex.getMessage());
//        }
    }
    
}
