/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacroParcial;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(esDivisible(6, 2));
        if (esDivisible(7, 2)) {
            System.out.println("Sí es divisible");
        } else {
            System.out.println("No es divisible");
        }
        System.out.println(esMayuscula('V'));
        System.out.println(tablaMultiplicar(5));
    }

    public static String tablaMultiplicar(int num) {
        String tabla = "";
        for (int i = 1; i <= 10; i++) {
            tabla += num + " x " + i + " = " + (num * i) + "\n";
            //System.out.println(num + " x " + i + " = " + (num*i));
        }
        return tabla;
    }

    public static boolean esDivisible(int numero, int div) {
        boolean divisible = false;
        if (numero % div == 0) {
            divisible = true;
        } else {
            divisible = false;
        }
        return divisible;
    }

    public static boolean esDivisiblev2(int numero, int div) {
        return (numero % div == 0);
    }

    public static String esDivisibleVInventada(int numero, int div) {
        String retorno = "";
        if (numero % div == 0) {
            retorno = "Sí es divisible";
        } else {
            retorno = "No es divisible";
        }
        return retorno;
    }

    public static boolean esMayuscula(char caracter) {
        return (caracter >= 'A' && caracter <= 'Z');
    }

}
