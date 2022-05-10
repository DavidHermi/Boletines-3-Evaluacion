package subclases;

import com.marcos.Barcos;

public class Veleros extends Barcos {

    private int nMastiles;

    public Veleros() {
    }

    public Veleros(float eslora, int nMastiles, String matricula) {
        super(eslora,matricula);
        this.nMastiles = nMastiles;
    }

    public int getnMastiles() {
        return nMastiles;
    }

    public void setnMastiles(int nMastiles) {
        this.nMastiles = nMastiles;
    }

    @Override
    public String toString() {
        return super.toString()+"Veleros{" +
                "nMastiles=" + nMastiles +
                '}';
    }

    @Override
    public float calcularAluguer(int dias) {
        return ((this.nMastiles*8)+(10*super.getEslora()))*dias;

    }
}
