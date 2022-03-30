package com.Boletin27;

import javax.swing.*;
import java.awt.*;

public class metodosInterfaz {
    JFrame marco;
    JPanel panel1;
    JPanel panel2;
    JTextField liñatexto1,liñatexto2;
    JTextArea area ;
    JLabel etiqueta1,etiqueta2;
    JButton boton1, boton2,boton3;

    public void crearcompoñentes() {
        //instanciamos
        marco = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        liñatexto1 = new JTextField();
        liñatexto2 = new JTextField();
        area = new JTextArea("Area de texto");
        etiqueta1 = new JLabel("Nome");
        etiqueta2 = new JLabel("Password");
        boton1 = new JButton("PREMER");
        boton2 = new JButton("LIMPAR");
        boton3 = new JButton("Boton");
        //Caracteristicas
        panel1.setLayout(null);
        marco.setSize(650, 650);
        panel1.setSize(600, 600);
        marco.setBackground(Color.white);
        etiqueta1.setToolTipText("Nome");
        etiqueta1.setBounds(200,250,100,25);
        etiqueta2.setToolTipText("Password");
        etiqueta2.setBounds(200,350,100,25);
        area.setToolTipText("Area de texto");
        area.setBounds(350,450,200,100);
        liñatexto1.setBounds(400,250,100,25);
        liñatexto2.setBounds(400,350,100,25);
        boton1.setToolTipText("PREMER");
        boton1.setBounds(300,600,100,25);
        boton2.setToolTipText("LIMPAR");
        boton2.setBounds(600,600,100,25);


        panel1.add(liñatexto1);
        panel1.add(liñatexto2);
        panel1.add(area);
        panel1.add(etiqueta1);
        panel1.add(etiqueta2);
        panel1.add(boton1);
        panel1.add(boton2);
        marco.add(panel1);

        marco.setLocationRelativeTo(marco); //pon no medio
        marco.setBounds(100,50,600,400);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }
}
