package com.marcos;

import subclases.DeportivasAMotor;
import subclases.Veleros;
import subclases.Yates;


import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Barcos>listadoBarcos = new ArrayList<>();

        int diasAluguer = Integer.parseInt(JOptionPane.showInputDialog("Inserte los dias que va a alquilar la embarcación:"));

        Barcos vel = new Veleros(15,5,"matricula1");
        Barcos embDep = new DeportivasAMotor(20,80,"matricula2");
        Barcos yat = new Yates(25,120,40,"matricula2");

        listadoBarcos.add(vel);
        listadoBarcos.add(embDep);
        listadoBarcos.add(yat);

        for(Barcos embarcaciones:listadoBarcos){
            System.out.println(embarcaciones.getClass()+" --> "+embarcaciones.calcularAluguer(diasAluguer)+" €");
        }
    }
}
