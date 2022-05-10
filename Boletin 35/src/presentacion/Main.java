package presentacion;

import datos.ListaEmpleados;
import persoal.Persoal;
import persoal.PersoalArreo;
import persoal.PersoalContratado;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        ArrayList<Persoal>listaPersoal = new ArrayList<>();

        Persoal arreo = new PersoalArreo("34636j","eherh","ergregerg", (GregorianCalendar) Calendar.getInstance(),90,100);
        Persoal contr = new PersoalContratado("856856856k","ergrege","regergerg",(GregorianCalendar) Calendar.getInstance(),1000,50);

        ListaEmpleados.añadirPersoal(listaPersoal,arreo);
        ListaEmpleados.añadirPersoal(listaPersoal,contr);

        for(Persoal empresa:listaPersoal){
            System.out.println(empresa.getClass()+empresa.toString());
            System.out.println(empresa.getClass()+" --> Soldo Final = "+empresa.calcularSueldo()+"€");
        }
    }
}
