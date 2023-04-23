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
public class ArraysPreExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {5, 9, 3, 5, 9, 10, 9, 7};
        System.out.println(Arrays.toString(buscarTodos(numeros, 9)));
        System.out.println(Arrays.toString(incrementa(numeros, 6)));
        System.out.println(Arrays.toString(eliminar(numeros, 2)));
        
        //1:
        Persona[] personas;
        personas = new Persona[4];
        //En la posición 0 de personas mete a "Javi" con DNI 5934:
        Persona p1 = new Persona("5934", "Javi");
        personas[0] = p1;
        //En la posición 1 d e personas mete a "Maria" con DNI 423J:
        personas[1] = new Persona("423J", "María");
        //2
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
        }
        
    }


    /**
     * Busca el elemento que se pasa como clave en el array, y devuelve un array
     * con todas las posiciones en las que se ha encontrado
     *
     * @param t Array de números en el que buscar
     * @param clave Elemento a buscar
     * @return Array con todos los índices en los que se ha encontrado la clave
     */
    public static int[] buscarTodos(int[] t, int clave) {
        int[] indices = new int[0];
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                indices = insertarUnElementoEnArray(indices, i);
            }
        }
        return indices;
    }

    /**
     * Añade un valor a un array: incrementa en 1 su longitud y añade valor al
     * final del nuevo array
     *
     * @param t
     * @param valor
     * @return
     */
    public static int[] insertarUnElementoEnArray(int[] t, int valor) {
        int[] aux = new int[t.length + 1];
        for (int i = 0; i < t.length; i++) {
            aux[i] = t[i];
        }
        aux[aux.length - 1] = valor;
        return aux;
    }

    /**
     * Devuelve el índice en el que se encuentra por primera vez la clave en el
     * array (la primera vez)
     *
     * @param t
     * @param clave
     * @return
     */
    public static int buscar(int[] t, int clave) {

    }

    /**
     * Devuelve el array orginal eliminando el valor que está en la posición
     * indice. Por ejemplo: [2,4,5,9,4,6] y clave 4 devuelve: [2,4,5,9,6]
     *
     * @param t
     * @param indice
     * @return
     */
    public static int[] eliminar(int[] t, int indice) {
        int[] resultado = new int[t.length - 1];
        int cont = 0;
        for (int i = 0; i < t.length; i++) {
            if (i != indice) {
                resultado[cont] = t[i];
                cont++;
            }
        }
        return resultado;
    }

    /**
     * Devuelve un array de enteros que contiene la concatenación (unión) de los
     * dos arrays que se pasan como parámetros.
     *
     * @param t1
     * @param t2
     * @return
     */
    public static int[] concatenar(int[] t1, int[] t2) {

    }

    /**
     * Devuelve la suma de todos los valores del array
     *
     * @param t
     * @return
     */
    public static int suma(int[] t) {

    }

    /**
     * Devuelve un array incrementando los valores en lo que le pase como
     * parámetro. Por ejmplo: [4,7,11] con incremento=3 devuelve [7, 10,14]
     *
     * @param t
     * @return
     */
    public static int[] incrementa(int[] t, int incremento) {
        int[] resultado = new int[t.length];
        for (int i = 0; i < t.length; i++) {
            resultado[i] = t[i] + incremento;
        }
        return resultado;
    }
}
