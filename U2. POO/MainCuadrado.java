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
        int edad = 20;
        int fin = 3+edad++;
        System.out.println(fin);
        for (int i = 8; i < 23; i += 5) {
            System.out.println(i);
        }
        //System.out.println(i);

        //a. 23     5
        //b. 18     3
        //c. 49     1
        //d. error  

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("hola");
            }
        }
        //12
        //20
        //6
        //16
        int a = 0;
        while (a < 10) {
            System.out.println(a);
            a++;
        }
        //de 0 al 10
        //del 0 al 9

        System.out.println("------");
        a = 0;
        do {
            System.out.println(a);
            a++;
        } while (a > 10);
        
        System.out.println(a);
        
        
        
        
        
        
        
        
        Cuadrado cuadrado1 = new Cuadrado(4, 6);
        Cuadrado cuadrado2 = new Cuadrado(10, 15, "rojo");
        cuadrado1.setLado1(100);
        double sumaAreas = cuadrado1.calculaArea() + cuadrado2.calculaArea();
        
        System.out.println(sumaAreas);
        cuadrado1.calculaArea();
        cuadrado1.pinta();

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

        System.out.println(Cuadrado.calculaArea(5, 6));
        //System.out.println(cuadrado2.imprimeInfo());

        System.out.println(cuadrado1);
        System.out.println(cuadrado2.toString());
        System.out.println(cuadrado1.pintaV2());
    }

}
