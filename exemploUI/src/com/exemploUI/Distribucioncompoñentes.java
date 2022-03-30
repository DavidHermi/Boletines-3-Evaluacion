package com.exemploUI;

import javax.swing.*;
import java.awt.*;

public class Distribucioncompoñentes {

    JFrame marco ;
    JPanel panel ;
    JButton boton1,boton2,boton3,boton4 ;

    public void distribuidorFlowLayout(){


        marco = new JFrame("Marco");
        panel = new JPanel() ;
        boton1 = new JButton();
        boton2 = new JButton();
        boton3 = new JButton();
        boton4 = new JButton();

        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        marco.add(panel);

        marco.setLocationRelativeTo(marco); //pon no medio
        marco.setBounds(100,50,600,400);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);



    }

    public void  compoñentes (String tipo){

        marco = new JFrame(tipo);
        marco.setSize(600,600);
        panel = new JPanel() ;
        panel.setSize(600,600);
        boton1 = new JButton();
        boton2 = new JButton();
        boton3 = new JButton();
        boton4 = new JButton();


    }

    public void pecharVentana(){
       marco.setLocationRelativeTo(marco);
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }

    public void layout2(){
       this.compoñentes("Flowlayout");
       panel.setLayout(new FlowLayout(FlowLayout.LEFT,50,20));
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        marco.add(panel);
             this.pecharVentana();
    }
public void  disBoxLayout(){
this.compoñentes("Boxlayout");
panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
    panel.add(boton1);
    panel.add(boton2);
    panel.add(boton3);
    panel.add(boton4);
    marco.add(panel);
    this.pecharVentana();
}
public void disBorderlayout(){
    this.compoñentes("Borderlayout");
    panel.setLayout(new BorderLayout());
    panel.add(boton1,BorderLayout.NORTH) ;
    panel.add(boton2,BorderLayout.SOUTH);
    panel.add(boton3,BorderLayout.CENTER);
    panel.add(boton4,BorderLayout.EAST);
    marco.add(panel);
    this.pecharVentana();



}
    public void disGridlayout () {
this.compoñentes("GridLayout");
panel.setLayout(new GridLayout(2,3));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        marco.add(panel);
        this.pecharVentana();

    }


}
