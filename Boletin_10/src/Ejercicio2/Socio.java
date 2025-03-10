package Ejercicio2;

public class Socio extends Persoa {

    String direccion;
    String dataAlta;
    double cuotaMensual;
    String dataIngreso;

    public Socio(String dni, String nome, String dataIngreso, String dataAlta, String direccion) {
        super(dni, nome);
        this.direccion = direccion;
        this.dataAlta = dataAlta;
        this.dataIngreso = dataIngreso;
    }

    @Override
    public void gastosIngresos() {
        Asociacion.beneficios += cuotaMensual;
    }
}
