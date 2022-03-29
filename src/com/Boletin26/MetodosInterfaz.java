package com.Boletin26;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MetodosInterfaz implements ActionListener {

    JFrame marco;
    JPanel panel;
    JTextField liñatexto1,liñatexto2;
    JTextArea area ;
    JLabel etiqueta1,etiqueta2;
    JButton boton1, boton2;

    public void crearcompoñentes () {
        //instanciamos
        marco = new JFrame();
        panel = new JPanel();
        liñatexto1 = new JTextField();
        liñatexto2 = new JTextField();
        area = new JTextArea("Area de texto");
        etiqueta1 = new JLabel("Nome");
        etiqueta2 = new JLabel("Password");
        boton1 = new JButton("PREMER");
        boton2 = new JButton("LIMPAR");
        //Caracteristicas
        panel.setLayout(null);
        marco.setSize(650, 650);
        panel.setSize(600, 600);
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

        panel.add(liñatexto1);
        panel.add(liñatexto2);
        panel.add(area);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);
        boton1.addActionListener((ActionListener) this);

        marco.setLocationRelativeTo(marco); //pon no medio
        marco.setBounds(100,50,600,400);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
