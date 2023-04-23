/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author seter
 */
public class PersonasMain {

    public static ArrayList<Persona> personas;

    public static void main(String[] args) {
        personas = new ArrayList<>();
        cargarPersonas();
        int opcion = -1;
        while (opcion != 0) {
            System.out.print("Introduce una opción:"
                    + "\t\n1. Crea una persona"
                    + "\t\n2. Ver personas"
                    + "\t\n3. Exportar a fichero de texto"
                    + "\t\n4. Importar personas de fichero de texto"
                    + "\t\n0. Salir"
                    + "\nOpción: ");
            opcion = scannerNumero();
            switch (opcion) {
                case 1:
                    creaPersona();
                    break;
                case 2:
                    verPersonas();
                    break;
                case 3:
                    exportarPersonas();
                    break;
                case 4:
                    importarPeronas();
                    break;
                case 0:
                    guardarPersonas();
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Error. Elije una opción correcta");
            }
        }
    }

    private static void cargarPersonas() {
        File info = new File(".\\info.bin");
        if (info.exists()) {
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(info));
                personas = (ArrayList<Persona>) ois.readObject();
                System.out.println("Fichero info.bin cargado correctamente");
            } catch (Exception ex) {
                System.err.println("Error fichero info.bin: " + ex.getMessage());
            }
        }
    }

    private static void guardarPersonas() {
        File info = new File(".\\info.bin");
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(info));
            oos.writeObject(personas);
            oos.close();
        } catch (IOException ex) {
            System.err.println("Error fichero info.bin: " + ex.getMessage());
        }
    }

    private static int scannerNumero() {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        int numero = 0;
        while (continuar) {
            try {
                numero = sc.nextInt();
                continuar = false;
            } catch (Exception e) {
                System.out.println("Error. Tienes que introducir un número.");
                sc.nextLine();
            }
        }
        return numero;
    }

    private static boolean scannerSN() {
        Scanner sc = new Scanner(System.in);
        String leido;
        while (true) {
            leido = sc.nextLine();
            if (leido.toUpperCase().contains("S")) {
                return true;
            } else if (leido.toUpperCase().contains("N")) {
                return false;
            } else {
                System.out.println("Error. Introduce S o N.");
            }
        }
    }

    private static void creaPersona() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre:\t");
        String nombre = sc.nextLine();
        System.out.print("Edad:\t");
        int edad = scannerNumero();
        System.out.print("En paro [S/N]:\t");
        boolean enParo = scannerSN();
        System.out.print("Calle:\t");
        String calle = sc.nextLine();
        System.out.print("Número:\t");
        int numero = scannerNumero();
        System.out.print("Piso:\t");
        String piso = sc.nextLine();
        personas.add(new Persona(nombre, edad, enParo, calle, numero, piso));
    }

    private static void verPersonas() {
        System.out.println("Estas son las " + personas.size() + " personas en el sistema:");
        for (Persona p : personas) {
            System.out.println("\t" + p);
        }
    }

    private static void exportarPersonas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fichero para exportar personas: ");
        File file = new File(sc.nextLine());
        boolean sobrescribir = false;
        if (file.exists()) {
            System.out.println("¿Quieres sobrescribir el fichero? [S/N]");
            sobrescribir = scannerSN();
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, sobrescribir));
            for (Persona p : personas) {
                bw.write(p.aFichero());
                bw.newLine();
            }
            bw.close();
        } catch (IOException ex) {
            System.err.println("Error en la escritura del fichero " + file.getAbsolutePath() + ". Mensaje: " + ex.getMessage());
        }

    }

    private static void importarPeronas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fichero para importar personas: ");
        File file = new File(sc.nextLine());
        if (!file.exists()) {
            System.out.println("El fichero no existe.");
            return;
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String nombre = "";
            while ((nombre = br.readLine()) != null) {
                int edad = Integer.parseInt(br.readLine());
                boolean enParo = false;
                if (br.readLine().contains("S")) {
                    enParo = true;
                }
                String calle = br.readLine();
                int numero = Integer.parseInt(br.readLine());
                String piso = br.readLine();
                personas.add(new Persona(nombre, edad, enParo, calle, numero, piso));
            }
            br.close();
        } catch (IOException ex) {
            System.err.println("Error en la escritura del fichero " + file.getAbsolutePath() + ". Mensaje: " + ex.getMessage());
        }
    }

}
