/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Perro extends Animal implements Ruido {

    private String vacunas;

    public Perro(String nombre, String vacunas) {
        super(nombre);
        this.vacunas = vacunas;
    }

    @Override
    public String comer() {
        return "Soy un perro y como";
    }

    @Override
    public String hacerRuido() {
        try {
            Thread.sleep(Ruido.duracion * 1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return "Guau";
    }

    @Override
    public String toString() {
        //Ejemplo: "Perro - Toby. Km: 0 - Rabia"
        return "Perro - " + super.toString() + " - " + this.vacunas;
    }

    @Override
    public boolean equals(Object obj) {
        Perro p = (Perro)obj;
        if (super.equals(p) && this.vacunas.equals(p.vacunas)){
            return true;
        }
        return false;
    }

}
