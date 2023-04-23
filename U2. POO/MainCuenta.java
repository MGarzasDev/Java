/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class MainCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Construyo/Instancio objetos de la clase CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria("ES123", "Alberta");
        CuentaBancaria cuenta2 = new CuentaBancaria("es987", 100.36, "Sonia");
        CuentaBancaria cuenta3 = new CuentaBancaria("es567", "ahorro", 50, "Fatima", 100);
        CuentaBancaria cuenta4 = new CuentaBancaria();
        
        //Un mes después...
        //cuenta.limiteCajero = 100; --> setter
        //System.out.println("Fatima tiene " + cuenta.saldo + "€");  ---> getter
     
        cuenta.setLimiteCajero(100);
        System.out.println("Fatima tiene " + cuenta3.getSaldo() + "€");
    }

}
