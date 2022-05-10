package com.marcos;

public class Alumno implements Comparable{

    private String nome;
    private int edad;

    public Alumno() {
    }

    public Alumno(String nome, int edad) {
        this.nome = nome;
        this.edad = edad;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno {" +
                "nome='" + nome + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

