/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.util.Arrays;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Flor {

    private String especie;
    private double[] petalos;

    public Flor(String especie) {
        this.especie = especie;
        petalos = new double[0];
    }

    public int anadirPetalo(double longitud) {
        //Aumento en 1 la dimensión de petalos
        double[] petalosAux = new double[petalos.length + 1];
        for (int i = 0; i < petalos.length; i++) {
            petalosAux[i] = petalos[i];
        }
        petalosAux[petalosAux.length - 1] = longitud;
        this.petalos = petalosAux;
        return this.petalos.length;
    }

    public void crecerPetalos(double longitud) {
        for (int i = 0; i < petalos.length; i++) {
            petalos[i] += longitud; //petalos[i] = petalos[i] + longitud;
        }
    }

    public double mediaPetalos() {
        double suma = 0;
        for (int i = 0; i < petalos.length; i++) {
            suma += petalos[i];
        }
        return suma / petalos.length;
    }

    @Override
    public String toString() {
        return "Flor: " + especie + ", petalos: " + Arrays.toString(petalos) + '}';
    }

}
