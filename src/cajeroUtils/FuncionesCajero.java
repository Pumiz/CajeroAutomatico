package cajeroUtils;



import model.DispensadorBilletes;
import model.Billete;

public class FuncionesCajero {

    public static void cargarDispenserCajero(DispensadorBilletes dispenser){
        Billete billete500_1 = new Billete(500);
        Billete billete1000_1 = new Billete( 1000);

        dispenser.addBilletes500(billete500_1);
        dispenser.addBilletes1000(billete1000_1);
    }


    public static boolean guardarBillete(int valorBillete, DispensadorBilletes dispenser){
        boolean state = false;

       switch (valorBillete){
        case 500:
            Billete nvoBillete500 = new Billete(500);
            if(dispenser.addBilletes500(nvoBillete500)) state = true;
            break;
        case 1000:
            Billete nvoBillete1000 = new Billete(1000);
            if( dispenser.addBilletes1000(nvoBillete1000)) state = true;
            break;
       case 2000:
            Billete nvoBillete2000 = new Billete(2000);
            if(dispenser.addBilletes2000(nvoBillete2000)) state = true;
            break;
       case 10000:
           Billete nvoBillete10000 = new Billete(10000);
           if(dispenser.addBilletes10000(nvoBillete10000)) state = true;
           break;
       default:
           System.out.println("El billete es invalido o falso.");
      }
        return state;
    }


    /*
    public static String numSerieAutoincremental(DispensadorBilletes dispenser, int valorBillete){
        List<Billete> listaBilletes = new ArrayList<>();
        String nSerie = "";

        listaBilletes = dispenser.getBilletes500();
        Billete ultimo = listaBilletes[0];


        return nSerie;
    }
    */
}
