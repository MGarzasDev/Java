/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miprimerprograma;

import java.util.Scanner;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class MiPrimerPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        int a;
        int b;
        int c;
        a = 9;
        b = 3;
        c = a + b;
        System.out.println(c);

        //El resto de la línea va a ser un comentario
        /* Esto es un comentario 
        de varias líneas */
        //VARIABLES
        byte zoo = -127;   //De –128 a 127 
        short s = -32763;    //De –32.768 a 32.767 
//        int i = 5687984;    //De –2 147 483 648 a 2 147 483 647 
        long l = 987864567; //± 9 223 372 036 854 775 808 

        float f = 5.2f; //4 Bytes
        double d = 5.2; //8 Bytes

        boolean estaEnParo = false;
        char letraDNI = 'S';

        //Declarad dos variables long: DNI de dos personas
        //Dividid los dos e imprimir el resultado
        double primerDNI = 45678945;
        double segundoDNI = 99999999;
        double division = primerDNI / segundoDNI;
        System.out.println(division);
        System.out.println(primerDNI);

        //Módulo: resto de una división entre enteros
        int modulo = 7 % 4;
        System.out.println("El módulo es " + modulo);
        modulo = 4 % 2;
        System.out.println("El módulo es " + modulo);

        int edad = 35;
        edad++; //Equivale: edad = edad + 1
        System.out.println(edad);
        edad--; //Equivale: edad = edad - 1;
        //Quiero sumar 5 años
        edad = edad + 5;    //Equivale edad += 5;

//        Scanner sc;
//        sc = new Scanner(System.in);
//        int numero;
//        numero = sc.nextInt();
//        System.out.println("El número introducido es " + numero);
//
//        if (numero >= 18) {
//            //Sentencia(s) cuando la condición se cumple
//            System.out.println("Qué mayor eres");
//        } else {
//            //Sentencia(s) cuando la condición no se cumple
//            System.out.println("Qué pequeño eres");
//        }
//        System.out.println("FIN");
//
//        edad = sc.nextInt();
//        if (edad <= 3) {
//            System.out.println("Bebé");
//        } else if (edad < 18) {
//            System.out.println("Joven");
//        } else {
//            System.out.println("Adulto");
//        }
//        
//        //Si la edad entre 18 y 65 y si el peso >= 55: 
//        //puedes donar.
//        System.out.println("------------");
//        edad = 20;
//        int peso = 51;
//        if (edad >= 18 && peso >= 55 && edad <= 65){
//            System.out.println("Puedes donar sangre");
//        }else{
//            System.out.println("No puedes donar sangre");
//        }
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un número del 1 al 7:");
        num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Uno");
                System.out.println("Lo has hecho muy bien.");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5,6,7:
                System.out.println("Cinco o seis o siete");
                break;
            default:    //Si no se cumple ninguno de los cases
                System.out.println("El número tiene que ser entre 1 y 4");
        }

        //BUCLES: repeticiones hasta que se deje de cumplir una condición
        //for(inicializaciones; condiciones; actualizaciones){......}
        for (int i = 1; i <= 10; i++) { //i++ es equivalente a i = i+1
            System.out.println(i);
        }
        System.out.println("-----");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("------");
        //Del 1 al 10 de dos en dos: 1 3 5 7 9
        for (int i = 1; i <= 10; i += 2) { //equivale a i = i + 2
            System.out.println(i);
        }

        //Pedir al usuario desde qué número, hasta qué número, y de cuánto en cuánto
        System.out.println("Desde qué número:");
        int desde = scanner.nextInt();
        System.out.println("Hasta qué número");
        int hasta = scanner.nextInt();
        System.out.println("Intervalo: ");
        int intervalo = scanner.nextInt();
        for (int i = desde; i <= hasta; i += intervalo) { //i+=intervalo es i=i+intervalo
            System.out.println(i);
        }
        for (; desde <= hasta; desde += intervalo) {
            System.out.println(desde);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        int j = 9;
        for (; j <= 11; j++) {
            System.out.println(j);
        }
        System.out.println("El valor de j es: " + j);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

    }

}
