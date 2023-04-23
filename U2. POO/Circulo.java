/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Circulo {

    //Atributos
    private double radio;
    private String color;

    //Constructores
    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    //Getters y setters
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Métodos
    public double calcularArea() {
        double area;
        //area = 3.14 * radio * radio;
        //area = Math.PI * Math.pow(radio, 2);
        area = Math.PI * radio * radio;
        return area;
    }

}
