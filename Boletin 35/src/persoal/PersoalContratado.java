package persoal;



import java.util.GregorianCalendar;

public class PersoalContratado extends Persoal {

    private double soldoBase;
    private int anosTraballados;

    public PersoalContratado() {
    }

    public PersoalContratado(String DNI, String nome, String apelidos, GregorianCalendar dataIngreso, double soldoBase, int anosTraballados) {
        super(DNI, nome, apelidos, dataIngreso);
        this.soldoBase = soldoBase;
        this.anosTraballados = anosTraballados;
    }

    public double getSoldoBase() {
        return soldoBase;
    }

    public void setSoldoBase(double soldoBase) {
        this.soldoBase = soldoBase;
    }

    public int getAnosTraballados() {
        return anosTraballados;
    }

    public void setAnosTraballados(int anosTraballados) {
        this.anosTraballados = anosTraballados;
    }

    @Override
    public String toString() {
        return super.toString()+"PersoalContratado{" +
                "soldoBase=" + soldoBase +
                ", anosTraballados=" + anosTraballados +
                '}';
    }

    @Override
    public double calcularSueldo() {
        double soldoFinal;
        if (this.anosTraballados == 0 | this.anosTraballados<4){
            soldoFinal = soldoBase+soldoBase*0.05;
        }else if(this.anosTraballados>3 | this.anosTraballados<8){
            soldoFinal = soldoBase+soldoBase*0.1;
        }else if(this.anosTraballados > 7 | this.anosTraballados<16){
            soldoFinal = soldoBase+soldoBase*0.15;
        }else{
            soldoFinal = soldoBase+soldoBase*0.2;
        }
        return soldoFinal;
    }
}
