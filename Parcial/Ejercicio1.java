/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(abecedario('s', 'w', false));
        System.out.println(abecedario('7', '9', true));
        System.out.println(cuentaPares(6, 10));
    }

    public static String abecedario(char inicio, char fin, boolean inverso) {
        String resultado = "";
        if (!inverso) { //inverso es false
            for (char i = inicio; i < fin; i++) {
                resultado += i + " ";
            }
        } else {    //inverso es true
            for (char i = fin; i > inicio; i--) {
                resultado += i + " ";
            }
        }
        return resultado;
    }
    
    public static int cuentaPares(int inicio, int fin){
        int contador = 0;
        //Compruebo errores:
        if (inicio > fin){
            return -1;
        }
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0){
                contador++;
            }
        }
        return contador;
    }
    
}
