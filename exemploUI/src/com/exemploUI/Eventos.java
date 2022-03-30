package com.exemploUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eventos implements ActionListener {
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
    bVerde.addActionListener((ActionListener) this);
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marco.setVisible(true);



}


    @Override
    public void actionPerformed(ActionEvent e) {
Object ob = e.getSource();
if (ob==bVerde) {

    panel.setBackground(Color.GREEN);
}
else {

 panel.setBackground(Color.BLUE);

    }



}
    }





