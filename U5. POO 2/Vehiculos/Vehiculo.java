/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public abstract class Vehiculo implements Comparable {

    private int km;
    private boolean averiado;

    public Vehiculo() {
        km = 0;
        averiado = false;
    }

    public Vehiculo(int km, boolean averiado) {
        this.km = km;
        this.averiado = averiado;
    }

    public boolean isAveriado() {
        return averiado;
    }

    public void setAveriado(boolean averiado) {
        this.averiado = averiado;
    }

    public int getKm() {
        return km;
    }

    public boolean avanzar(int km) {
        //Si el vehículo está averiado no puedo avanzar
        if (this.averiado) {
            return false;
        }
        this.km += km;
        if (this.km > 10000) {
            this.averiado = true;
        }
        return true;
    }

    public boolean reparar() {
        if (this.averiado) {
            this.averiado = false;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String ret = "Km: " + this.km + ". ";
        if (this.averiado) {
            ret += "Sí";
        } else {
            ret += "No";
        }
        ret += " está averiado.";
        return ret;
    }

    @Override
    public int compareTo(Object o) {
        Vehiculo v;
        try {
            v = (Vehiculo) o;
        } catch (Exception e) {
            return 0;
        }
        return v.km - this.km;
    }

}
