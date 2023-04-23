/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacroParcial;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class MainCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado(4, 6);
        Cuadrado cuadrado2 = new Cuadrado(100, 150, "rojo");

//        System.out.println("El cuadrado es de color " + cuadrado.getColor());
        //cuadrado.color = "azul";
        System.out.println("---- Cosas estáticas");
        System.out.println(cuadrado1.borde);
        System.out.println(cuadrado2.borde);
        cuadrado1.borde = 3;
        System.out.println(cuadrado1.borde);
        System.out.println(cuadrado2.borde);
        Cuadrado.borde = 5;
        System.out.println(Cuadrado.borde);
    
        System.out.println(Cuadrado.calculaArea(5,6));
        //System.out.println(cuadrado2.imprimeInfo());
        
        System.out.println(cuadrado1);
        System.out.println(cuadrado2.toString());
        System.out.println(cuadrado1.pintaV2());
    }

}
