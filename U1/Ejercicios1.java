/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miprimerprograma;

import java.util.Scanner;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Ejercicios1 {

    public static void main(String[] args) {
        //Ejercicio 1:
        int numero;
        System.out.println("Introduce un número:");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        int modulo = numero % 2;

        if (modulo != 0) {
            System.out.println("Es impar");
        } else {
            System.out.println("Es par");
        }

//        if (modulo == 0) {
//            System.out.println("Es par");
//        } else {
//            System.out.println("Es impar");
//        }
//        
//        if (numero % 2 == 0) {
//            System.out.println("Es par");
//        } else {
//            System.out.println("Es impar");
//        }
        System.out.println("EJERCICIO 6: DNI");
        int dni;// = 50555505; //X
        System.out.println("Introduce el número de DNI y te digo la letra");
        dni = sc.nextInt();
        int mod = dni % 23;
        //switch(variable) { case ___: .... case ___: .... [default]
        switch (mod) {
            case 0:
                System.out.println("T");
                break;
            case 1:
                System.out.println("R");
                break;
            case 2:
                System.out.println("W");
                break;
            case 3:
                System.out.println("A");
                break;
            //case......
            case 10:
                System.out.println("X");
                break;
            case 15:
                System.out.println("S");
                break;
            ///case......
            case 22:
                System.out.println("E");
                break;
        }

        //Lo mismo con ifs:
        if (mod == 0) {
            System.out.println("T");
        } else if (mod == 1) {
            System.out.println("R");
        } else if (mod == 2) {
            System.out.println("W");
        }/////////muchos else if aquí
        else if (mod == 22) {
            System.out.println("E");
        }

        System.out.println("EJERCICIO 7");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("EJERCICIO 8");
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }

        System.out.println("EJERCICIO 9:");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        //Otra forma:
        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n\n\n\t***********\n");

        System.out.println("EJERCICIO 10:");
        System.out.println("Dime un número y te digo sus múltiplos: ");
        int num = sc.nextInt();
        for (int i = 0; i <= 100; i++) {
            if (i % num == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        //Otra forma
        for (int i = 0; i <= 100; i += num) {
            System.out.print(i + " ");
        }
        System.out.println("");

        System.out.println("EJERCICIO 11:");
        System.out.println("1\t2\t3\n4\t5\t6\n7\t8\t9");
        //COn bucles:
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
        //Otra forma
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
            if (i == 3 || i == 6 || i == 9) {
                System.out.println("");
            }
        }

        System.out.println("EJERCICIO 12:");
        num = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
        
        for (int i = 1; i < 10; i++) {
            System.out.println("TABLA DEL " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + j * i);
            }
        }
    }
}
