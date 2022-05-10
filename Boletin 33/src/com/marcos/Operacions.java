package com.marcos;

import java.util.ArrayList;
import java.util.Collections;


public class Operacions <T extends Comparable>{

    T dato;


    public Operacions() {
    }

    public Operacions(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Operacions{" +
                "dato=" + dato +
                '}';
    }

    public void calcularMaximo(ArrayList<T>listado){

        T maxNum = (T) Collections.max(listado); //tengo que hacer el cast porque Collections.max() devulve un tipo Object.

        System.out.println("El numero maximo del array es el: "+maxNum);
    }

    public void calcularMinimo(ArrayList<T>listado){

        T minNum = (T) Collections.min(listado);

        System.out.println("El numero minimo del array es el: "+minNum+"\n");
    }

    public int buscarObxecto(ArrayList<T>listado, Alumno a){

        boolean existe = listado.contains(a);
        int posicion = 0;
        for(int i=0;i< listado.size();i++){
            if(existe==true){
                posicion = i;
            }else{
                posicion=-1;
            }
        }
        return posicion;
    }

    public Object eliminarObxecto(ArrayList<T>listado, Alumno a){
        boolean existe = listado.contains(a);

        for(int i=0;i< listado.size();i++){
            if(existe==true){
                listado.remove(a);
            }else{
                System.out.println("O obxecto non se encontra");
            }
        }
        return a;
    }
}
