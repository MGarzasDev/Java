/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miprimerprograma;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        saludar();
//        despedir();
//        saludar();
//        String nombre = "Luis";
//        saludar("Sete");
//        System.out.println(nombre);
//        saludar("María Fernández asdf");

        int resultado;
        sumar(7, 10);
        resultado = sumar(7, 10);
        System.out.println(resultado);
        int mul = multiplicar(8, 9, 5);
        System.out.println(mul);
    }

    public static boolean esPar(int num) {
        boolean b;
        if (num % 2 == 0) {
            b = true;
        } else {
            b = false;
        }
        return b;
    }

    public static boolean esParV2(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean esParV3(int num) {
        return num % 2 == 0;
    }

    public static int multiplicar(int a, int b, int c) {
        return a * b * c;
    }

    private static int sumar(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void saludar() {
        System.out.println("Holi");
    }

    public static void despedir() {
        System.out.println("Adiós");
    }

    public static void saludar(String nombre) {
        System.out.println("Hola " + nombre);
    }

}
