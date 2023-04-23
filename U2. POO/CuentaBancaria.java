/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class CuentaBancaria {

    //1. Atributos
    private String iban;
    private String tipo;
    private double saldo;
    private String titular;
    private int limiteCajero;

    //2. Constructores
    public CuentaBancaria() {
    }


    public CuentaBancaria(String iban, String titular) {
        this.iban = iban;
        this.titular = titular;
    }

    public CuentaBancaria(String iban, double saldo, String titular) {
        this.iban = iban;
        this.saldo = saldo;
        this.titular = titular;
    }

    public CuentaBancaria(String iban, String tipo, double saldo, String titular, int limiteCajero) {
        this.iban = iban;
        this.tipo = tipo;
        this.saldo = saldo;
        this.titular = titular;
        this.limiteCajero = limiteCajero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getLimiteCajero() {
        return limiteCajero;
    }

    public void setLimiteCajero(int limiteCajero) {
        this.limiteCajero = limiteCajero;
    }

   
    
    
    
}
