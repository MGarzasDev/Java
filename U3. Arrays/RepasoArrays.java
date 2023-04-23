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
public class RepasoArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración:
        double[] nums;
        //Inicialización:
        nums = new double[5];

        nums[2] = 3.4;

        //Declaro e inicializo a la vez:
        //char[] vocales = new char[5];
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        System.out.println(vocales.length); //5

        System.out.println(nums);   //NO imprime el contenido
        //Imprimir contenido:
        //Opción 1: for
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("------");
        //Opción 2 foreach: for (tipo variable: array)
        for (double numero : nums) {
            System.out.println(numero);
        }

        //Opción 3:
        System.out.println(Arrays.toString(nums));
        //aumentaTamanoArray(nums, 7);
        ///////
        double[] resultado = aumentaTamanoArray(nums, 7);
        resultado[6] = 10;
        System.out.println(Arrays.toString(resultado));

        resultado = rellenaArrayConValor(nums, 3.0);
        System.out.println(Arrays.toString(resultado));
        double[] prueba = {-5.9, -6.4, -121.3, -49};
        double suma = sumaContenidoDelArray(prueba);
        System.out.println("Suma: " + suma);
        System.out.println("Max: " + maximo(prueba));

    }

    public static double[] aumentaTamanoArray(double[] array, int tam) {
        double[] nuevoArray = new double[tam];
        for (int i = 0; i < array.length; i++) {
            nuevoArray[i] = array[i];
        }
        return nuevoArray;
    }

    public static double[] rellenaArrayConValor(double[] array, double numero) {
        for (int i = 0; i < array.length; i++) {
            array[i] = numero;
        }
        return array;
    }

    public static double sumaContenidoDelArray(double[] array) {
        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        return suma;
    }

    public static double mediaArray(double[] array) {
        //1. Calculo la suma de los elementos
        //2. Divido la suma entre el número de elmeentos
        //3. Devuelvo
        
//        double suma = 0;
//        for (int i = 0; i < array.length; i++)
//            suma = suma + array[i];
//        return suma / array.length;
        double suma = sumaContenidoDelArray(array);
        return suma / array.length;
    }

    public static double maximo(double[] array) {
        double maximo = array[0];
        for (int i = 0; i < array.length; i++)
            if (array[i] > maximo)
                maximo = array [i];
        return maximo;
        

    }

    public static double minimo(double[] array) {
        return 0;
    }
    
    

}
