/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Autobus extends Vehiculo implements Gasolina {

    private String matricula;
    private int gasolina;

    public Autobus(String matricula) {
        super();
        this.matricula = matricula;
        this.gasolina = 0;
    }

    public Autobus(String matricula, int gasolina, int km, boolean averiado) {
        super(km, averiado);
        this.matricula = matricula;
        this.gasolina = gasolina;
    }

    @Override
    public boolean avanzar(int km) {
        //Si gasolina suficiente: 1 litro/km
        if (2 * this.gasolina < km) {
            return false;
        }
        //llamo a super.avanzar para comprobar que no está averiado
        //y actualizar el atributo km
        boolean ret = super.avanzar(km);
        if (this.getKm() > 1000) {
            this.setAveriado(true);
        }
        return ret;
    }

    @Override
    public int repostar(int dinero) {
        this.gasolina += dinero * Gasolina.precioGasolina;
        return this.gasolina;
    }

    @Override
    public String toString() {
        return this.matricula + " - Gasolina: " + this.gasolina + ". " + super.toString();
    }
}
