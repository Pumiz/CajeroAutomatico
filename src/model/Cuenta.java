/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author taekw
 */
public class Cuenta {
     private String numeroCuenta;
     private double saldo;

     public Cuenta(String numeroCuenta, int saldo) {
          this.numeroCuenta = numeroCuenta;
          this.saldo = saldo;
     }
     
     public void depositarSaldo(int deposito){
          saldo += deposito;
     }
     
     
     public void retirarSaldo(int retiro) throws Exception {
          if (saldo >= retiro){
               saldo -= retiro;
          } else {
               throw new Exception ("El saldo es insufiente.");
          }
          
     }
     
     public double consultarSaldo(){
          return saldo;
     }
     
     public String consultarNumeroCuenta(){
          return numeroCuenta;
     }
     
     
             
     
}
