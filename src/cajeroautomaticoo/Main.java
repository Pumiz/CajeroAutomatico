/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajeroautomaticoo;

import model.Billete;
import model.CajeroAutomatico;
import model.DispensadorBilletes;
import model.Usuario;

/**
 *
 * @author taekw
 */
public class Main {

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
          Billete billete500_1 = new Billete (500, "A001");
          
          
          DispensadorBilletes dispenser = new DispensadorBilletes();
          
          dispenser.addBilletes1000(billete500_1);
          
          CajeroAutomatico cajeroLink = new CajeroAutomatico("Link01", dispenser);
          
          try {
               if(cajeroLink.verificarPin(1234, 5034) == true){
                    System.out.println("Bienvenido");
               }
               
          } catch (Exception e){
               System.out.println(e.getMessage());
          }
          
          
          
          
     }
     
}
