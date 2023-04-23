/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class ArraysXY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        System.out.println("Introduce el tamaño");
        int tam = sc.nextInt();
        double[] valores = new double[tam];

        while (opcion != 0) {
            System.out.println("Aquí iría el menú.....");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    for (int i = 0; i < valores.length; i++) {
                        System.out.print("Introduce el valor " + i + ": ");
                        valores[i] = sc.nextDouble();
                    }
                    break;
                case 2:
                    System.out.println(suma(valores));
                    break;
                case 3:
                    System.out.println(Arrays.toString(duplica(valores)));
                    break;
                case 0:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("No existe esa opción");

            }
        }
    }

    public static double suma(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    //si llega 2,4,6 que devuelva 2,4,6,2,4,6
    public static double[] duplica(double[] array) {
        int indice = 0;
        double[] nuevo = new double[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            nuevo[indice++] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            nuevo[indice++] = array[i];
        }
        return nuevo;
    }

}
