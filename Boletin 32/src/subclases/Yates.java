package subclases;

import com.marcos.Barcos;

import javax.swing.*;

public class Yates extends Barcos {

    private float potencia;
    private int nCamarotes;

    public Yates() {
    }

    public Yates(float eslora, float potencia, int nCamarotes, String matricula) {
        super(eslora, matricula);
        this.potencia = potencia;
        this.nCamarotes = nCamarotes;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public int getnCamarotes() {
        return nCamarotes;
    }

    public void setnCamarotes(int nCamarotes) {
        this.nCamarotes = nCamarotes;
    }

    @Override
    public String toString() {
        return super.toString()+"Yates{" +
                "potencia=" + potencia +
                ", nCamarotes=" + nCamarotes +
                '}';
    }

    @Override
    public float calcularAluguer(int dias) {
        return ((this.potencia*2+this.nCamarotes*25)+(10*super.getEslora()))*dias;
    }
}
