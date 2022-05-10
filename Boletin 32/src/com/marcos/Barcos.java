package com.marcos;

public abstract class Barcos {

    private float eslora;
    private String matricula;

    public Barcos() {
    }

    public Barcos(float eslora,String matricula) {
        this.eslora = eslora;
        this.matricula = matricula;
    }

    public float getEslora() {
        return eslora;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "eslora=" + eslora +
                '}';
    }

    public abstract float calcularAluguer(int dias);
}
