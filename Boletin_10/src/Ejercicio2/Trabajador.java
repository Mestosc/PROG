package Ejercicio2;

public abstract class Trabajador extends Persoa {
    private String dataAlta;
    public Trabajador(String dni, String nome, String dataIngreso) {
        super(dni, nome);
        this.dataAlta = dataIngreso;
    }
}
