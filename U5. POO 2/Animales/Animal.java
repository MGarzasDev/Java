/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public abstract class Animal implements Comparable {

    private String nombre;
    private int cuentakilometros;

    public Animal(String nombre) {
        this.nombre = nombre;
        cuentakilometros = 0;
    }

    public void setCuentakilometros(int cuentakilometros) {
        this.cuentakilometros = cuentakilometros;
    }

    public int avanzar(int distancia) {
        cuentakilometros += distancia;
        return cuentakilometros;
    }

    public abstract String comer();

    @Override
    public String toString() {
        return this.nombre + ". Km: " + this.cuentakilometros;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Animal a = (Animal) obj;
        if (this.nombre.equals(a.nombre) && this.cuentakilometros == a.cuentakilometros) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        //un número negativo si this < obj; 
        //un número positivo si this > obj, 
        //y 0 si son iguales

//        if (this.nombre < .nombre){
//            return -1;
//        }
        Animal a = (Animal) o;
        if (this.nombre.compareTo(a.nombre) < 0) {
            return 1;
        } else if (this.nombre.compareTo(a.nombre) == 0) {
            return this.cuentakilometros - a.cuentakilometros;
//            if (this.cuentakilometros < a.cuentakilometros){
//                return 1;
//            }else if (this.cuentakilometros == a.cuentakilometros){
//                return 0;
//            }else{
//                return -1;
//            }
            //return 0;
        } else {
            return -1;
        }
    }

}
