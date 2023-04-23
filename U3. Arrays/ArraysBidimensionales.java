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
public class ArraysBidimensionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración
        int[][] matriz;

        //Reserva de memoria
        matriz = new int[3][4];
        matriz[0][0] = 5;
        int contador = 5;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
//                matriz[i][j] = contador;
//                contador++;
                matriz[i][j] = contador++; //Esto es equivalente a las 2 líneas de arriba
            }
        }
        System.out.println(matriz); //Imprime la matrícula
        System.out.println(Arrays.toString(matriz));    //Imprime 3 matrículas
        System.out.println(Arrays.deepToString(matriz));    //Este sí
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("***************");
        //foreach
        for(int[] fuera : matriz){
            for(int dentro : fuera){
                System.out.print(dentro + "\t");
            }
            System.out.println("");
        }
        
        int[][][] facturas = new int[3][2][12];
        //Rellenar de números aleatorios entre 5 y 80
    }

}
