/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class GestionarFlores {

    public static void main(String[] args) {
        Flor[] flores = new Flor[3];
        flores[0] = new Flor("Marga");
        flores[1] = new Flor("Rosa");
        flores[2] = new Flor("Clavelito");

        //Añadir pétalos a la margarita
        System.out.println(flores[0]);
        flores[0].anadirPetalo(4);
        flores[0].anadirPetalo(6);
        flores[0].anadirPetalo(9);
        
        System.out.println(flores[0]);
        
        System.out.println(flores[0].mediaPetalos());
        flores[0].crecerPetalos(2);
        System.out.println(flores[0].mediaPetalos());
        System.out.println(flores[0]);
    }
}
