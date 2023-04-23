/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personas;

import java.util.ArrayList;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class PersonasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---");
        Alumnado a = new Alumnado("123W", "Luz", "Calle Pez", 20);
        Profesorado p = new Profesorado("456", "Alfredo", 2000.23);
        System.out.println(p.cobrarSueldo());
        System.out.println(a.mostrarDatos());
        System.out.println(p.mostrarDatos());

//        Persona persona = new Persona("456T", "Personita");
//        System.out.println(persona.mostrarDatos());
        //CASTINGS:        
        Persona persona2 = a;
        //Aquí hago otras cosas...
        Alumnado al2 = (Alumnado) persona2;
        al2.mostrarDatos();

        Profesorado prof2 = new Profesorado("123r", "Juan", 546);
        Persona persona3 = prof2;
        System.out.println(persona3.mostrarDatos());
        System.out.println(persona3.getClass().getSuperclass().getSuperclass());

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Alumnado("123", "j", "cal", 20));
        personas.add(new Profesorado("456", "L", 300));
        for (Persona pIteracion : personas) {
            System.out.println(pIteracion.mostrarDatos());
        }

        Profesorado p9 = new Profesorado("123", "Sete", 3000);
        Profesorado p8 = new Profesorado("123", "Sete", 3000);
        if (p9 == p8) {
            System.out.println("==");
        }
        if (p9.equals(p8)) {
            System.out.println("equals");
        }
    }

}
