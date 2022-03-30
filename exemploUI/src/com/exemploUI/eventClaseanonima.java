package com.exemploUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eventClaseanonima {

    JFrame marco ;
    JPanel panel ;
    JButton bVerde ;
    JButton bAzul ;
    public void crearEventos (){

        marco = new JFrame("Eventos");
        marco.setSize(800,600);
        panel = new JPanel();
        panel.setSize(800,600);
        bVerde = new JButton("Verde");
        bAzul =  new JButton("Azul");


        panel.add(bVerde);
        panel.add(bAzul);
        marco.add(panel);
        marco.setLocationRelativeTo(marco);
        bVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.GREEN);
            }
        } );
        bAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.BLUE);
            }
        });
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);


    }

}
