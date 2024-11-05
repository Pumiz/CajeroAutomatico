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
     
     
     

     public void addBilletes500(Billete billete500) {
          billetes500.add(billete500);
     }

     public void addBilletes1000(Billete billete1000) {
          billetes1000.add(billete1000);
     }

     public void addBilletes2000(Billete billete2000) {
          billetes2000.add(billete2000);
     }

     public void addBilletes10000(Billete billete10000) {
          billetes10000.add(billete10000);
     }
     
     


     
}
