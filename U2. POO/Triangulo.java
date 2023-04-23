/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacroParcial;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Triangulo {

    private int lado;

    public Triangulo() {
    }

    public Triangulo(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        if (lado > 0) {
            this.lado = lado;
        }
    }

    public int calcularPerimetro() {
        return this.lado * 3;
    }

    public static int calcularPerimetro(int lado) {
        return lado * 3;
    }
    
    public int calculaArea(){
        return 0;
    }

    @Override
    public String toString() {
        return "Triángulo equilátero de lado " + this.lado;
    }
    
    

}
