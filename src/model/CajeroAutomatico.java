/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;

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
     
     public double mostrarSaldoCuenta(Cuenta cuenta){
          return cuenta.consultarSaldo();
     }
     
     /*
     public void retirarDinero(int cantidadRetirar, Usuario usuario){
          Cuenta cuentaUsuario = usuario.getCuenta();
          cuentaUsuario.retirarSaldo(cantidadRetirar);
          
          usuario.setCuenta(cuentaUsuario);
         
     
     }
     */
     
     public void retirarDinero(int cantidadRetirar, Usuario usuario){
          
          try {
               usuario.getCuenta().retirarSaldo(cantidadRetirar);
          } catch (Exception e){
               System.out.println(e.getMessage());
          }
          
          
          
     }
     
     
     
     
}
