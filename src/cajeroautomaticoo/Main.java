/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajeroautomaticoo;

import cajeroUtils.FuncionesCajero;
import model.CajeroAutomatico;
import model.DispensadorBilletes;

import java.util.Scanner;

/*
 *
 * @author taekw
 */
public class Main {


     /**
      * @param args the command line arguments
      */


     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          DispensadorBilletes dispenser = new DispensadorBilletes();
          FuncionesCajero.cargarDispenserCajero(dispenser);

          CajeroAutomatico cajeroLink = new CajeroAutomatico("Link01", dispenser);

          try {
               System.out.println("Ingrese un numero de tarjeta: ");
               int nTarjeta = scan.nextInt();
               cajeroLink.verificarTerjeta(nTarjeta);

               System.out.println("Ingrese el pin: ");
               int pin = scan.nextInt();
               cajeroLink.verificarPin(pin, nTarjeta);

                    int opcion;
                    do {
                         System.out.println("\n------ Menú Principal ------");
                         System.out.println("1. Consultar saldo");
                         System.out.println("2. Ingresar efectivo");
                         System.out.println("3. Retirar efectivo");
                         System.out.println("4. Salir");
                         System.out.print("Seleccione una opción: ");
                         opcion = scan.nextInt();

                         switch (opcion) {
                              case 1:
                                   double saldo = cajeroLink.mostrarSaldoCuenta(nTarjeta);
                                   System.out.println("Su saldo actual es: $" + saldo);
                                   break;

                              case 2:
                                   System.out.print("Ingrese un billete: (10000, 2000, 1000 o 500)");
                                   int valorBillete = scan.nextInt();
                                   if(FuncionesCajero.guardarBillete(valorBillete, dispenser)){
                                        double nvoSaldo = cajeroLink.agregarSaldo(valorBillete, nTarjeta);
                                        System.out.println("Usted ingreso: $" + valorBillete);
                                        System.out.println("Su saldo actual es de: $" + nvoSaldo);
                                   }
                                   break;
                                   /*
                              case 3:
                                   System.out.print("Ingrese la cantidad a retirar: ");
                                   double retiro = sc.nextDouble();
                                   if (retiro > 0 && retiro <= saldo) {
                                        saldo -= retiro;
                                        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                                   } else {
                                        System.out.println("Fondos insuficientes o cantidad inválida.");
                                   }
                                   break;
                              case 4:
                                   System.out.println("Gracias por usar el cajero. ¡Hasta luego!");
                                   break;
                                   */

                              default:
                                   System.out.println("Opción no válida.");
                                   break;
                         }
                    } while (opcion != 4);
               
          } catch (Exception e){
               System.out.println(e.getMessage());
          }
     }
}
