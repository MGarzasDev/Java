/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public interface Ruido {
    //Atributo:
    //Por defecto son públicos, estáticos, finales
    //public static final int duracion = 2;
    int duracion = 2;
    
    //Metodo: todos son abstractos
    public String hacerRuido(); //Ponga o no "abstract", el método es abstracto.
}
