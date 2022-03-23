package com.Boletin26;

import javax.swing.*;
import java.awt.*;

public class MetodosInterfaz {

    JFrame marco;
    JPanel panel;
    JLabel etiqueta;
    JTextField liñatexto, liñatexto2;
    JButton boton1, boton2;





    public void crearcompoñentes() {
        //instanciamos
        marco = new JFrame();
        panel = new JPanel();
        etiqueta = new JLabel("Etiqueta");
        liñatexto = new JTextField("Hola");
        liñatexto2 = new JTextField("Adios");
        boton1 = new JButton("Boton1");
        boton2 = new JButton("Boton2");
        //damoslle caracteristicas
        panel.setLayout(null);
        marco.setSize(650, 650);
        panel.setSize(600, 600);
        marco.setBackground(Color.RED);
        etiqueta.setBounds(300,300,75,50);
        liñatexto.setBounds(600,300,200,75 );
        boton1.setText("Boton1");
        boton1.setBounds(300,600,100,100);
        boton2.setToolTipText("limpa o texto");
        boton2.setBounds(600,600,100,100);


        panel.add(etiqueta);
        panel.add(liñatexto);
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);

        marco.setLocationRelativeTo(marco); //pon no medio
        marco.setBounds(100,50,600,400);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }


}
