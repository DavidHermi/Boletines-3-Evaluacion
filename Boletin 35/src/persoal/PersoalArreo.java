package persoal;



import java.util.GregorianCalendar;

public class PersoalArreo extends Persoal {

    private int numeroClientes;
    private double complemento;

    public PersoalArreo() {
    }

    public PersoalArreo(String DNI, String nome, String apelidos, GregorianCalendar dataIngreso, int numeroClientes, double complemento) {
        super(DNI, nome, apelidos, dataIngreso);
        this.numeroClientes = numeroClientes;
        this.complemento = complemento;
    }

    public int getNumeroClientes() {
        return numeroClientes;
    }

    public void setNumeroClientes(int numeroClientes) {
        this.numeroClientes = numeroClientes;
    }

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return super.toString()+"PersoalArreo{" +
                "numeroClientes=" + numeroClientes +
                ", complemento=" + complemento +
                '}';
    }

    @Override
    public double calcularSueldo() {
        return this.numeroClientes*this.complemento;
    }
}
