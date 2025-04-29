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

}
