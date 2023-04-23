/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Arrays;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class PruebaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 3;
        //Array guardar varios valores en la misma variable
        int[] numeros;
        numeros = new int[8];

        //Accedo a cada posición:
        numeros[0] = 6;
        numeros[1] = 9;
        numeros[2] = 5;
        numeros[3] = 7;
        // numeros[9] = 9;
        System.out.println("La nota de la persona 3 es " + numeros[2]);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        String[] dias = new String[7];
        dias[0] = "Lunes";
        dias[1] = "Martes";
        dias[2] = "Miércoles";
        dias[3] = "Jueves";
        dias[4] = "Viernes";
        dias[5] = "Sábado";
        dias[6] = "Domingo";

        //Imprimir jueves:
        System.out.println(dias[3]);
        //Imprimir todos:
        System.out.println(dias);   //no me sirve
        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
        }
        System.out.println("-----");
        //Días al revés
        for (int i = dias.length - 1; i >= 0; i--) {
            System.out.println(dias[i]);
        }
        //Arrays.toString(...) imprime el contenido del array
        System.out.println(Arrays.toString(dias));
        System.out.println("****");
        System.out.println(imprimeArray(dias));
        String[] otro = new String[2];
        otro[0] = "A";
        otro[1] = "B";
        System.out.println(imprimeArray(otro));

        

    }

    /**
     * Devuelve un String con el contenido de un array
     *
     * @param array Array a imprimir
     * @return El contenido
     */
    public static String imprimeArray(String[] array) {
        String contenido = "";
        for (int i = 0; i < array.length; i++) {
            contenido += array[i] + ", ";
        }
        return contenido;
    }

    /**
     * Devuelve el tamaño del array
     *
     * @param array
     * @return
     */
    public static int tamanoArray(String[] array) {
        if (array == null) {
            return -1;
        }
        return array.length;
    }

    /**
     * Devuelve el último elemento del array
     *
     * @param array
     * @return
     */
    public static String devuelveUltimoElemento(String[] array) {
        return array[array.length - 1];
    }

    /**
     * Devuelve un array nuevo con el contenido al revés
     *
     * @param array
     * @return
     */
    public static String[] copiaArrayAlReves(String[] array) {
        String[] resultado;
        int tamano = array.length;
        resultado = new String[tamano];
        int indice = 0;
        //Cualquiera de los 2 for funcionaría:
        //Opción a:
//        for (int i = array.length - 1; i >= 0; i--) {
//            resultado[indice] = array[i];
//            indice++;
//        }

        //Opcion b:
        for (int i = array.length - 1; i >= 0; i--) {
            resultado[array.length - 1 - i] = array[i];
        }

        return resultado;
    }

    /**
     * Une dos arrays y devuelve el resultado
     *
     * @param array1
     * @param array2
     * @return
     */
    public static String[] uneArrays(String[] array1, String[] array2) {
        String[] resultado;
        resultado = new String[array1.length + array2.length];
        int indice = 0;
        for (int i = 0; i < array1.length; i++) {
            resultado[indice] = array1[i];
            indice++;
        }
        for (int i = 0; i < array2.length; i++) {
            resultado[indice] = array2[i];
            indice++;
        }      
        return resultado;
    }

    /**
     * Busca elemento
     *
     * @param array
     * @param elemento
     * @return
     */
    public static boolean contieneElemento(String[] array, String elemento) {
        return false;
    }
}
