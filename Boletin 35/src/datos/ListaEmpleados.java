package datos;

import persoal.Persoal;

import java.util.ArrayList;

public class ListaEmpleados {

    public static ArrayList<Persoal> añadirPersoal(ArrayList<Persoal>listadoPersoal, Persoal obx){
        listadoPersoal.add(obx);
        return listadoPersoal;
    }


}
