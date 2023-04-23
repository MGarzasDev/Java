/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progkahoot;

/**
 *
 * @author seter
 */
public class Problemas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. ¿Es el número 6 par?
        int numero = 6.0;
        if (numero % 2 = 0) {
            System.out.println("El número " + numero " SÍ es par");
        }else{
            System.out.println("El número " + numero " NO es par");
        }
        
        //2. Multiplica el valor de 30*50 y muestra el resultado
        byte 1Operando = 30;
        byte 2Operando = 50;
        byte mult = 1Operando * 2Operando;
        System.out.println("El resultado de la multiplicación es: " + mult);

        //3. Imprime los caracteres de la A a la Z en la misma línea.
        character caracter = "A";
        for (char i = caracter; i < "Z"; i++) {
            System.out.println(i);
        }
		
        //4. Imprime una matriz de 4 columnas y 5 filas con el símbolo #.
        char char = '#';
        int columnas = 4, filas = 5
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println(char + " ");
            }
        }
    }

}
