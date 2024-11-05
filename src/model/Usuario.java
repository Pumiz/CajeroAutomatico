/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author taekw
 */
public class Usuario {
     private int numeroTarjeta;
     private int pin;
     private Cuenta cuenta;

     public Usuario(int numeroTarjeta, int pin) {
          this.numeroTarjeta = numeroTarjeta;
          this.cuenta = new Cuenta("CajaAhorro01", 10000);
          this.pin = pin;
     }

     public int getPin() {
          return pin;
     }

     public Cuenta getCuenta() {
          return cuenta;
     }

     public int getNumeroTarjeta() {
          return numeroTarjeta;
     }

     
     
     public void setCuenta(Cuenta cuenta) {
          this.cuenta = cuenta;
     }


     


     
     
}
