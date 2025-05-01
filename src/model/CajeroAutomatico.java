/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author taekw
 */
public class CajeroAutomatico {
     
     private String modelo;
     private DispensadorBilletes billetes;
     
     
     private List<Usuario> usuarios = new ArrayList<>();
     
     

     public CajeroAutomatico(String modelo, DispensadorBilletes billetes) {
          this.modelo = modelo;
          this.billetes = billetes;
          usuarios.add(new Usuario(5034, 1234));
          usuarios.add(new Usuario(4732, 4321));
          usuarios.add(new Usuario(2492, 2222));
          usuarios.add(new Usuario(7842, 2024));
     }
     
     public Usuario verificarTerjeta(int numeroTarjetaIngresado) throws Exception{
          for (Usuario usuario: usuarios){
               if(usuario.getNumeroTarjeta() == numeroTarjetaIngresado){
                    return usuario;
               } else {
                    throw new Exception("El usuario no existe.");
               }
               
          }
          return null;
     }
     
     public boolean verificarPin(int pinTeclado, int numeroTarjeta) throws Exception{
          Usuario usuario = verificarTerjeta(numeroTarjeta);
          
          if (usuario.getPin() == pinTeclado){
             return true;  
          } else {
             throw new Exception ("El pin ingresado no coincide.");
          }
     }
     
     public double getSaldoCuenta(int numeroTarjeta){
          double saldo = 0;
          for (Usuario usuario: usuarios){
               if(usuario.getNumeroTarjeta() == numeroTarjeta){
                    Cuenta cuenta = usuario.getCuenta();
                    saldo = cuenta.consultarSaldo();
               }
          }

          return saldo;
     }

     public double agregarSaldo(double monto, int numeroTarjeta){
          double nvoSaldo = 0;
          for (Usuario usuario: usuarios){
               if(usuario.getNumeroTarjeta() == numeroTarjeta){
                    Cuenta cuenta = usuario.getCuenta();
                    cuenta.agregarSaldo(monto);
                    nvoSaldo = getSaldoCuenta(numeroTarjeta);
               }
          }
          return nvoSaldo;
     }

     public double retirarSaldo(int monto, int numeroTarjeta){
          double nvoSaldo = 0;
          if(monto >= 500) { //Billete menor demonimacion        NO ANDA BIEN ESTE IF
               for (Usuario usuario : usuarios) {
                    if (usuario.getNumeroTarjeta() == numeroTarjeta) {
                         Cuenta cuenta = usuario.getCuenta();
                         cuenta.retirarSaldo(monto);
                         nvoSaldo = getSaldoCuenta(numeroTarjeta);
                    }
               }
          } else {
               System.out.println("El cajero no puede entregar menos de $500");
          }
          return nvoSaldo;
     }
     
     
     
     
}
