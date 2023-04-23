/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class PruebasFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Clase File
        File escritorio = new File("C:\\Users\\JoséManuelRuizGarcía\\Desktop");
        //Ver si existe el fichero o carpeta
        if (escritorio.exists()) {
            System.out.println("Sí existe la carpeta");
        } else {
            System.out.println("No existe");
        }

        //Ver si es carpeta o fichero
        if (escritorio.isDirectory()) {
            System.out.println("Es una carpeta");
        } else {
            System.out.println("Es un fichero");
        }

        File[] contenido = escritorio.listFiles();
        for (File f : contenido) {
            if (f.isFile()) {
                System.out.println("->" + f.getPath());
            }
        }

        //Crear una carpeta
        File nuevaCarpeta = new File("C:\\Users\\JoséManuelRuizGarcía\\Desktop\\nuevaCarpeta");
        if (!nuevaCarpeta.exists()) {
            nuevaCarpeta.mkdir();
            System.out.println("Carpeta creada");
        }

        //Ruta relativa:
        // . carpeta actual
        // .. carpeta anterior
        File workspace = new File("."); //Ruta relativa al directorio actual
        System.out.println("Workspace: " + workspace.getAbsolutePath());
        nuevaCarpeta = new File(".\\datos");
        if (!nuevaCarpeta.exists()) {
            nuevaCarpeta.mkdir();
            System.out.println("Carpeta creada");
        }

        File nuevoFichero = new File(".\\datos\\t.txt");
        //Si existe el fichero que pregunte si lo quiere sobrescribir. Si no existe lo crea y ya
        //y luego escribir algo.

        //FileWriter fw = new FileWriter(nuevoFichero); Crea el fichero si no existe, y sobrescribe
        //FileWriter fw = new FileWriter(nuevoFichero, true); Crea el fichero si no existe, y concatena
    }

}
