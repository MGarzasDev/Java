/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animales;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class MainAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        Perro p = new Perro("Toby", "Rabia");
        Gato g = new Gato("Calcetines");
        Gusano gu = new Gusano("Gusanito");
        animales.add(p);
        animales.add(g);
        animales.add(gu);

        for (int i = 0; i < animales.size(); i++) {
            System.out.println(animales.get(i));
        }

        Perro p2 = new Perro("Toby", "Rabia");
        animales.add(p2);
        p2.avanzar(10);
        if (p.equals(p2)) {
            System.out.println("Los perros son iguales");
        } else {
            System.out.println("Los perros NO son iguales");
        }

        animales.sort(null);
        for (Animal a : animales) {
            System.out.println(a);
        }

        //Lectura de fichero:
        //Leer el fichero de texto animales.txt,
        //construir los objetos Gato, Perro o Gusano correspondientes,
        //, y meterlos en el arraylist animalesFichero
        ArrayList<Animal> animalesFichero = new ArrayList<>();

        //Guardar el arraylist en un ficheor binario
        File f = new File("animales.txt");
        animalesFichero = leeFicheroAnimales(f);

        //Guardo en un fichero binario
        try {
            FileOutputStream fos = new FileOutputStream("animales.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(animalesFichero);
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        //Leo del fichero binario
        try {
            FileInputStream fis = new FileInputStream("animales.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Animal> animalesLeidos = (ArrayList<Animal>) ois.readObject();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static ArrayList<Animal> leeFicheroAnimales(File f) {
        ArrayList<Animal> animales = new ArrayList<>();
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String clase = "";
            String vacunas = "";
            while ((clase = br.readLine()) != null) {
                //Leo los datos de cada animal
                String nombre = br.readLine();
                int km = Integer.parseInt(br.readLine());
                if (clase.equals("perro")) {
                    vacunas = br.readLine();
                }
                //Instancio el objeto correspondiente Gato/Gusano/Perro
                Animal a;
                if (clase.equals("gato")) {
                    a = new Gato(nombre);
                    a.setCuentakilometros(km);
                } else if (clase.equals("perro")) {
                    a = new Perro(nombre, vacunas);
                    a.setCuentakilometros(km);
                } else {
                    a = new Gusano(nombre);
                    a.setCuentakilometros(km);
                }

                //Meterlo en el array
                animales.add(a);
            }
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
        //Devuelvo el array:
        return animales;
    }
}
