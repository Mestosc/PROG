package Ejercicio2;

public class Socio extends Persoa {

    String direccion;
    String dataAlta;
    double cuotaMensual;
    Fecha dataIngreso;

    public Socio(String dni, String nome, String dataIngreso, String dataAlta, String direccion) {
        super(dni, nome);
        this.direccion = direccion;
        this.dataAlta = dataAlta;
        String[] dataI = dataIngreso.split("/");
        this.dataIngreso = new Fecha(Integer.parseInt(dataI[0]),Integer.parseInt(dataI[1]),Integer.parseInt(dataI[2]));
    }

    @Override
    public void gastosIngresos() {
        Asociacion.beneficios += cuotaMensual;
    }
}
