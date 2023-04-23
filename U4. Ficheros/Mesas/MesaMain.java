/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mesa;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class MesaMain {

    private static ArrayList<Mesa> mesas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File f = new File("mesas.bin");
        //Leer mesas.bin (si existe) y meter las mesas en el arrayList e imprimirlas
        if (!f.exists()){
            System.out.println("mesas.bin no existe");
        }else{
            
        }
        
        //Repito 3 veces:
        for (int i = 0; i < 3; i++) {
            System.out.println("Nombre de la mesa:");
            String nombre = sc.nextLine();
            System.out.println("Longitud:");
            double longitud = scannerDouble();
            System.out.println("Radio:");
            double radio = scannerDouble();
            mesas.add(new Mesa(nombre, longitud, radio));
        }

        for (Mesa m : mesas) {
            System.out.println(m);
        }
        
        try {
            //Guardar en mesas.bin las mesas:
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("mesas.bin"));
            oos.writeObject(mesas);
            oos.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }

    private static double scannerDouble() {
        double numero = 0;
        Scanner sc = new Scanner(System.in);
        boolean error = true;
        while (error) {
            try {
                numero = sc.nextDouble();
                error = false;
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        }
        return numero;
    }
}
