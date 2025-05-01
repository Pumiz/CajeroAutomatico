/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author taekw
 */
public class DispensadorBilletes {
     
     private List<Billete> billetes500 = new ArrayList<>();
     private List<Billete> billetes1000 = new ArrayList<>();
     private List<Billete> billetes2000 = new ArrayList<>();
     private List<Billete> billetes10000 = new ArrayList<>();

     public boolean addBilletes500(Billete billete500) {
          return billetes500.add(billete500);
     }

     public boolean addBilletes1000(Billete billete1000) {
          return billetes1000.add(billete1000);
     }

     public boolean addBilletes2000(Billete billete2000) {
          return billetes2000.add(billete2000);
     }

     public boolean addBilletes10000(Billete billete10000) {
          return billetes10000.add(billete10000);
     }

     public List<Billete> getBilletes10000() {
          return billetes10000;
     }

     public List<Billete> getBilletes1000() {
          return billetes1000;
     }

     public List<Billete> getBilletes2000() {
          return billetes2000;
     }

     public List<Billete> getBilletes500 (){ return billetes500; }

     public static boolean gestorEntregaBilletes(int montoRetiro){
          int billeteMenorDenominacion = 500;
          int billeteMayorDenominacion = 10000;
          int maxCantidadEntregaBilletes = 10;  //Cantidad maxima de billetes que salen por la boca de cajero

          int entregaBillete10mil = 0;
          int entregaBillete2mil = 0;
          int entregaBilleteMil = 0;
          int entregaBilleteQuini = 0;

          boolean state = true; //false para cambiar cuando se termine de entregar los billetes
          int montoRetiroRestante = montoRetiro;

/*          while(montoRetiro==montoRetiroRestante){

          }*/
               for(int i=0; i <= maxCantidadEntregaBilletes; i++) {
                    // && verificar que hayan billetes en la lista
                    // Este if se usa porque por lo general se sacan varios billetes de mas alta denominacion y
                    // solo 1 o ninguno de menor denominacion.

/*                         montoRetiroRestante -= billeteMayorDenominacion;
                         entregaBillete10mil += 1;
                         if (montoRetiroRestante < billeteMayorDenominacion) {
                              state = true;
                              System.out.println("Cantidad billetes entregados de $10000: " + entregaBillete10mil);
                              System.out.println(montoRetiroRestante);
                              break;
                         }*/


                         while (montoRetiroRestante >= 10000) {
                              montoRetiroRestante -= 10000;
                              entregaBillete10mil += 1;

                         }
                    System.out.println("Cantidad billetes entregados de $10000: " + entregaBillete10mil);
                    System.out.println(montoRetiroRestante);
                    while (montoRetiroRestante >= 2000) {
                              montoRetiroRestante -= 2000;
                              entregaBillete2mil += 1;

                    }
                    System.out.println("Cantidad billetes entregados de $2000: " + entregaBillete2mil);
                    System.out.println(montoRetiroRestante);
                    while (montoRetiroRestante >= 1000) {
                         montoRetiroRestante -= 1000;
                         entregaBilleteMil += 1;
                    }
                    System.out.println("Cantidad billetes entregados de $1000: " + entregaBilleteMil);
                    while (montoRetiroRestante == 500) {
                              entregaBilleteQuini += 1;
                         }
                    System.out.println("Cantidad billetes entregados de $500: " + entregaBilleteQuini);
                    System.out.println(montoRetiroRestante);


                         if (montoRetiroRestante == 0) break;

               }

          return state;
     }

}
