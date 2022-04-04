package com.Boletin27;

import javax.swing.*;
import java.awt.*;

public class metodosInterfaz {
    JFrame marco;
    JPanel panel1;
    JPanel panel2;
    JTextField liñatexto1,liñatexto2;
    JTextArea area,area2;
    JLabel etiqueta1,etiqueta2;
    JButton boton1, boton2,boton3;
    JList lista ;

    public void crearcompoñentes() {
        //instanciamos
        marco = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        liñatexto1 = new JTextField();
        liñatexto2 = new JTextField();
        area = new JTextArea("Area de texto");
        area2 = new JTextArea("Area de texto") ;
        etiqueta1 = new JLabel("Nome");
        etiqueta2 = new JLabel("Password");
        boton1 = new JButton("PREMER");
        boton2 = new JButton("LIMPAR");
        boton3 = new JButton("Boton");
        lista = new JList<>();
        //Caracteristicas
        panel1.setLayout(null);
        panel2.setLayout(null);
        marco.setSize(650, 650);
        panel1.setSize(600, 600);
        marco.setBackground(Color.white);
        etiqueta1.setToolTipText("Nome");
        etiqueta1.setBounds(100, 100, 100, 25);
        etiqueta2.setToolTipText("Password");
        etiqueta2.setBounds(100, 150, 100, 25);
        area2.setToolTipText("Area de texto");
        area2.setBounds(470,800,200,400);
        liñatexto1.setBounds(250, 100, 200, 25);
        liñatexto2.setBounds(250, 150, 200, 25);
        boton1.setBounds(130, 350, 150, 50);
        boton2.setBounds(330, 350, 150, 50);
        boton3.setBounds(300,800,100,25);
        lista.setBounds(120,800,150,150);

        DefaultListModel modelo = new DefaultListModel<>(); //para añadir elemento a un JList usamos un modelo
        modelo.addElement("ElementoLista1\n");
        modelo.addElement("ElementoLista2\n");
        modelo.addElement("ElementoLista3\n");
        lista.setModel(modelo);



        panel1.add(liñatexto1);
        panel1.add(liñatexto2);
        panel1.add(etiqueta1);
        panel1.add(etiqueta2);
        panel1.add(boton1);
        panel1.add(boton2);
        marco.add(panel1);

        panel2.add(lista);
        panel2.add(boton3);
        panel2.add(area2) ;
        marco.add(panel2);



        marco.setLocationRelativeTo(marco); //pon no medio
        marco.setBounds(100,50,600,400);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }
}
