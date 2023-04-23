/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Persona {

    //1. Atributos
    private String nombre;
    private int edad;
    private double altura;
    private double peso;
    private boolean esMayor;

    //2. Constructores
    public Persona(String nombre, int edad, double altura,
            double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        if (edad >= 18) {
            this.esMayor = true;
        } else {
            this.esMayor = false;
        }
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        if (edad >= 18) {
            this.esMayor = true;
        } else {
            this.esMayor = false;
        }
    }

    //3. Getters y setters
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0 || altura > 250) {
            System.err.println("Error en la altura " + altura);
        } else {
            this.altura = altura;
        }
    }

    //4. Métodos: comer, dormir, andar...
    public String comer() {
        tardar(3);
        return "He comido";
    }

    public int cumplirAno() {
        //1. Aumento 1 año
        edad++;
        //2. Compruebo si empieza a ser mayor de edad
        if (edad >= 18) {
            esMayor = true;
        }
        //3. Devuelvo la nueva edad
        return edad;

    }

    private void tardar(int segundos) {
        for (int i = 0; i < segundos; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public double crecer(double cm){
        this.altura += cm;
        return this.altura;
    }
    public double cambiarPeso(double peso){
        this.peso += peso;
        return this.peso;
    }
    
    @Override
    public String toString(){
        String info = "Nombre: " + nombre 
                + "\n\tEdad:" + this.edad
                + "\n\tPeso:" + this.peso
                + "\n\tAltura:" + this.altura
                + "\n\tMayor de edad:" + this.esMayor;
        return info;
    }
}
