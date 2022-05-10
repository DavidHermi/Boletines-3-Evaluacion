package persoal;

import java.util.GregorianCalendar;

public abstract class Persoal {
    private String DNI;
    private String nome;
    private String apelidos;
    private GregorianCalendar dataIngreso;

    public Persoal() {
    }

    public Persoal(String DNI, String nome, String apelidos, GregorianCalendar dataIngreso) {
        this.DNI = DNI;
        this.nome = nome;
        this.apelidos = apelidos;
        this.dataIngreso = dataIngreso;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public GregorianCalendar getDataIngreso() {
        return dataIngreso;
    }

    public void setDataIngreso(GregorianCalendar dataIngreso) {
        this.dataIngreso = dataIngreso;
    }

    @Override
    public String toString() {
        return "Persoal{" +
                "DNI='" + DNI + '\'' +
                ", nome='" + nome + '\'' +
                ", apelidos='" + apelidos + '\'' +
                ", dataIngreso=" + dataIngreso +
                '}';
    }

    public abstract double calcularSueldo();
}
