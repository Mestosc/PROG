package Ejercicio2;

public class Socio extends Persoa {

    String direccion;
    String dataAlta;
    double cuotaMensual;

    public Socio(String dni, String nome, String dataIngreso, String dataAlta, String direccion) {
        super(dni, nome, dataIngreso);
        this.direccion = direccion;
        this.dataAlta = dataAlta;
    }

    @Override
    public void gastosIngresos() {
        Asociacion.beneficios += cuotaMensual;
    }
}
