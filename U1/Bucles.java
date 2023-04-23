/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miprimerprograma;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //for(incialización; condición; actualización)
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("------");
        //while(condición){......}
        int piso = 0;
        while (piso < 5) {
            System.out.println(piso);
            piso += 1.6;    //piso = piso + 5;
        }
        double decimales = 1.3;
        while (decimales < 10) {
            System.out.println(decimales);
            decimales += 0.9;
        }

        System.out.println("-------");
        //do {.... } while(condición);
        System.out.println("----WHILE-----");
        piso = 3;
        while (piso < 3) {
            System.out.println(piso);
            piso++;
        }
        System.out.println("FIN DEL WHILE");

        System.out.println("----DO-WHILE----");
        piso = 3;
        do {
            System.out.println(piso);
            piso++;
        } while (piso < 3);
        System.out.println("FIN DEL DO-WHILE");

        //while y do-while que imprima desde la A hasta la F
        char c = 'A';
        System.out.println("**** CON FOR: *****");
        for (char i = 'A'; i <= 'F'; i++) {
            System.out.println(i);
        }
        System.out.println("**** CON WHILE: *****");
        c = 'A';    //Inicializaciones
        while (c <= 'F') {  //Condición
            System.out.println(c);
            c++;    //Actualización/Incremento...
        }
        //¿cuánto vale la variable c aquí?
        System.out.println("La variable c es: " + c);
        
        System.out.println("**** CON DO-WHILE: *****");
        //c = 'A';    //Inicializo la c.
        char letra = 'A';
        do {
            System.out.println(letra);
            letra++;
        } while (letra <= 'F');
    }

}
