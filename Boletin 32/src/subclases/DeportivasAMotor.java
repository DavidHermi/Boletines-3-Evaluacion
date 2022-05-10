package subclases;

import com.marcos.Barcos;

import javax.swing.*;

public class DeportivasAMotor extends Barcos {

    private float potencia;

    public DeportivasAMotor() {
    }

    public DeportivasAMotor(float eslora, float potencia, String matricula) {
        super(eslora, matricula);
        this.potencia = potencia;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return super.toString()+"DeportivasAMotor{" +
                "potencia=" + potencia +
                '}';
    }

    @Override
    public float calcularAluguer(int dias) {
        return ((this.potencia*2)+(10*super.getEslora()))*dias;
    }
}
