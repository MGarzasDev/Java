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
public class MasFunciones {

    public static void main(String[] args) {
        //Scanner...
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una nota: ");
        int n = sc.nextInt();
        String tuNota = nota(n);
        System.out.println(tuNota);
    }

    public static String nota(int n) {
        String res;
        switch (n) {
            case 0:
                res = "Suspenso";
                break;
            case 1:
                res = "Aprobado";
                break;
            case 2:
                res = "Notable";
                break;
            case 3:
                res = "Sobresaliente";
                break;
            default:
                res = "Nota no válida";
        }
        return res;
    }

    public static String notaV2(int n) {
        String res;
        if (n == 0) {
            res = "Suspenso";
        } else if (n == 1) {
            res = "Aprobado";
        } else if (n == 2) {
            res = "Notable";
        } else if (n == 3) {
            res = "Sobresaliente";
        } else {
            res = "Nota no válida";
        }
        return res;
    }

}
