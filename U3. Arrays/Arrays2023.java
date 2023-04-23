
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Arrays2023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración:
        char[] letras;

        //Inicialización
        letras = new char[10];

        //Declaración + inicialización:
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < vocales.length; i++) {
            System.out.println(vocales[i]);
        }

        //foreach
        for (char v : vocales) {
            System.out.println(v);
        }
        
        //Librería Arrays
        for (int i = 0; i < letras.length; i++) {
            letras[i] = 'z';
        }
        //Con Arrays.fill:
        Arrays.fill(letras, 'f');
        System.out.println(Arrays.toString(letras));
        
        Arrays.fill(letras, 3, 6, 'x');
        System.out.println(letras);
        
        //Redimensionar letras para que tenga 15 posiciones
        char[] letrasAux = new char[15];        
        for (int i = 0; i < letras.length; i++) {
            letrasAux[i] = letras[i];
        }
        letras = letrasAux;
        Arrays.fill(letras, 10,15,'j');
        System.out.println(Arrays.toString(letras));
        
        
        //Para buscar con Arrays.binarySearch tiene que estar ordenado
        Arrays.sort(letras);
        System.out.println(Arrays.toString(letras));
        System.out.println(Arrays.binarySearch(letras, 'k'));
        
    }

}
