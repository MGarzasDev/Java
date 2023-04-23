/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miprimerprograma;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class EjerciciosFunciones {

    public static void main(String[] args) {
//        eco(6);
//        System.out.println("---");
//        eco(2);
//        System.out.println(esPrimo(5));
//        boolean variable = esPrimo(1245674568);
//        System.out.println(variable);
//        if (esPrimo(17)) {
//            System.out.println("El número 17 es primo");
//        } else {
//            System.out.println("El 17 NO es primo");
//        }

        //divisoresPrimos(34);
        System.out.println(esVocal('a'));
        if (esVocal('c')){
            System.out.println("Sí es vocal");
        }else{
            System.out.println("No es vocal");
        }
        
        int numDivi = divisoresPrimos(34);
        System.out.println("Tiene " + numDivi + " divisores");
    }

    public static void eco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Eco");
        }
    }

    public static void numerosEntre(int ini, int fin) {

    }

    //Devuelve true si el número es primo, y false si no lo es.
    public static boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Crea una función que devuelva un boolean indicando si el carácter que 
    //se le pasa como parámetro es una vocal o no. 
    public static boolean esVocal(char c) {
        //boolean resultado;
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        } else {
            return false;
        }
        //return resultado;

        /*
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
         */
    }

    //Escribe una función a la que se le pase un número entero, 
    //imprima sus divisores primos y devuelva el número de 
    //divisores primos que tiene. 
    //Nota: utiliza la función del ejercicio anterior. 
    public static int divisoresPrimos(int numero) {
        int contador = 0;
        for (int i = 2; i <= numero; i++) {
            if (numero % i == 0) {
                //El número i es divisor de numero
                if (esPrimo(i)) {
                    System.out.println(i);
                    contador++;
                }
            }
        }
        return contador;
    }
}
