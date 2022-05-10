package com.marcos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Operacions obx = new Operacions();

        //ejercicio 1

        ArrayList<Integer>serieNumerosINT = new ArrayList<>();
        serieNumerosINT.add(1);
        serieNumerosINT.add(2);
        serieNumerosINT.add(3);
        serieNumerosINT.add(4);

        System.out.println("***ARAY INT***\n");
        obx.calcularMaximo(serieNumerosINT);
        obx.calcularMinimo(serieNumerosINT);

        //comprobacion de que el ejercicio 1 funciona.

        ArrayList<Double>serieNumerosDOU = new ArrayList<>();
        serieNumerosDOU.add(1.67);
        serieNumerosDOU.add(0.01);
        serieNumerosDOU.add(100.90);
        serieNumerosDOU.add(5.90);

        System.out.println("***ARRAY DOUBLE***\n");
        obx.calcularMaximo(serieNumerosDOU);
        obx.calcularMinimo(serieNumerosDOU);

        //probamos con el objeto alumno

        ArrayList<Alumno>serieAlumnoSTR = new ArrayList<>();
        serieAlumnoSTR.add(new Alumno("Alfonso",56));
        serieAlumnoSTR.add(new Alumno("Ricardo",34));
        serieAlumnoSTR.add(new Alumno("Rigoberto",25));
        Alumno al = new Alumno("Romero",38);
        serieAlumnoSTR.add(al);

        System.out.println("A posicion do obxecto buscado é "+obx.buscarObxecto(serieAlumnoSTR,al));

        System.out.println("***EXERCICIO 2***\n");

        System.out.println("O obxecto "+obx.eliminarObxecto(serieAlumnoSTR,al)+" foi eliminado");


    }
}
