/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {-1, -2, 3};
        try {
            numeros[0] = 6;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("¡¡¡ERROR!!! " + ex.getMessage());
            ex.printStackTrace();
        }

        System.out.println(raizCuadrada(25));
        try {
            double d = raizCuadrada(numeros[2]);
            System.out.println(d);
        } catch (ArithmeticException ex) {
            System.err.println("Cosas aritméticas: " + ex.getMessage());
            ex.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Cosas del array: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Aquí continua el programa...");

        System.out.println("Introduce un número: ");
        int n = leeNumero();
        System.out.println("He metido el " + n);
    }

    public static int leeNumero() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean repetir = true;
        while (repetir) {
            try {
                n = sc.nextInt();
                repetir = false;
            } catch (InputMismatchException e) {
                System.out.println("Error. Introduce un número:");
                sc.nextLine();
            }
        }
        return n;
    }

    /**
     * Calcula la raíz cuadrada de un número. Si es negativo, lanza Excepción
     *
     * @param n Número del que calcular la raíz cuadrada
     * @return Raíz cuadrada de n
     * @throws ArithmeticException Si el parámetro es negativo, lanza excepción
     */
    public static double raizCuadrada(double n) throws ArithmeticException {
        if (n < 0) {
            ArithmeticException e = new ArithmeticException("Raíz cuadrada de un número negativo");
            throw e;
        }
        double r = Math.sqrt(n);
        return r;
    }

}
