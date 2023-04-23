/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacroParcial;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Cuadrado {

    private int lado1, lado2;
    private String color;
    public static int borde = 10;

    //Constructores
    public Cuadrado(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrado(int lado1, int lado2, String color) {
//        this.lado1 = lado1;
//        this.lado2 = lado2;
        this(lado1, lado2); //Llamando al constructor de 2 atributos
        this.color = color;
    }

    //getters y setters
    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        if (lado1 > 0) {
            this.lado1 = lado1;
        }
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        if (lado2 < 0) {
            System.err.println("Error lado2 no puede ser negativo");
        } else {
            this.lado2 = lado2;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String pinta() {
        String c = "";
        for (int i = 0; i < this.lado1; i++) {  //filas
            for (int j = 0; j < this.lado2; j++) {  //columnas
                //Si la fila es la primera o la última pongo "-"
                if (i == 0 || i == this.lado1 - 1) {
                    c += "-";
                    //Si la columna es la primera o la última: |
                } else if (j == 0 || j == this.lado2 - 1) {
                    c += "|";
                    //En el resto de posiciones pongo un espacio:
                } else {
                    c += " ";
                }
            }
            c += "\n";
        }
        return c;
    }

    public String pintaMal() {
        String c = "";
        for (int i = 0; i < this.lado1; i++) {
            for (int j = 0; j < this.lado2; j++) {
                c += "-";
            }
            c += "\n";
        }
        return c;
    }

    public String pintaV2() {
        String c = "";
        for (int i = 0; i < this.lado2; i++) {
            c += "-";
        }
        c += "\n";
        for (int i = 0; i < this.lado1 - 2; i++) {
            for (int j = 0; j < this.lado2; j++) {
                if (j == 0 || j == this.lado2 - 1) {
                    c += "|";
                } else {
                    c += " ";
                }
            }
            c += "\n";
        }
        for (int i = 0; i < this.lado2; i++) {
            c += "-";
        }
        return c;
    }

    public double calculaArea() {
//        if (this.lado1 <= 0 || this.lado2 <= 0) {
//            return 0;
//        }
//        return this.lado1 * this.lado2;
        return calculaArea(this.lado1, this.lado2);
    }

    public static double calculaArea(double lado1, double lado2) {
        if (lado1 <= 0 || lado2 <= 0) {
            return 0;
        }
        return lado1 * lado2;
    }

//    public String imprimeInfo() {
//        String retorno = "Lado1: " + this.lado1
//                + ", Lado 2: " + this.lado2;
//        if (color != null) {
//            retorno += ", Color: " + this.color;
//        }
//        return retorno;
//    }
    @Override
    public String toString() {
        String retorno = "Lado1: " + this.lado1
                + ", Lado 2: " + this.lado2;
        if (color != null) {
            retorno += ", Color: " + this.color;
        }
        return retorno;
    }

}
