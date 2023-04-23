/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

import java.util.ArrayList;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class VehiculosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        Bicicleta b = new Bicicleta("Orbea");
        Coche c = new Coche("123");
        Autobus a = new Autobus("789");
        vehiculos.add(b);
        vehiculos.add(c);
        vehiculos.add(a);
        
        a.repostar(100000);
        a.avanzar(900);
        System.out.println("1\t" + a);
        a.avanzar(150);
        //Debería estar averiado: km 150
        System.out.println("2\t" + a);
        a.avanzar(1);
        //Debería no haber avanzado porque estaba averiado: km 150
        System.out.println("3\t" + a);
        a.reparar();
        a.avanzar(1);
        //Debería haber avanzado: km 151
        System.out.println("4\t" + a);
        vehiculos.sort(null);
        System.out.println(vehiculos);
    }
    
}
