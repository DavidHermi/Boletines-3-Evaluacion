package com.exemploUI;

import javax.swing.*;

public class Ventana1 {

    JFrame marco ;

    public void crearVentana1 () {
        // instanciamos o marco
        marco = new JFrame("Primeira ventana");
       //damoslle caracteristicas
        marco.setBounds(100,50,600,400);
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       marco.setVisible(true);


    }






}
