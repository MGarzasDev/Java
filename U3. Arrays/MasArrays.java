/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class MasArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {4, 9, -7, 7};
        //System.out.println(numeros);
        System.out.println(Arrays.toString(numeros));
        
        Persona[] personas = new Persona[5];
        personas[0] = new Persona("5932", "Maria");
        Persona p = new Persona("456", "Julia");
        personas[1] = p;
        if (buscarPorDNI("59032", personas)){
            System.out.println("Sí está");
        }else{
            System.out.println("No está");
        }
    }
    
    private static boolean buscarPorDNI(String dni, Persona[] personas){
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null && dni.equals(personas[i].getDni())){  //dni == personas[i].getDni()
                return true;
            }
        }
        return false;
    }

}
