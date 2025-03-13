package Ejercicio2;

public class Socio extends Persoa implements GastosIngresos {
    String direccion;
    double cuotaMensual;
    Fecha dataIngreso;

    public Socio(String dni, String nome, String dataIngreso, String direccion, double cuotaMensual) {
        super(dni, nome);
        this.direccion = direccion;
        String[] dataI = dataIngreso.split("/");
        this.cuotaMensual = cuotaMensual;
        this.dataIngreso = new Fecha(Integer.parseInt(dataI[0]),Integer.parseInt(dataI[1]),Integer.parseInt(dataI[2]));
    }
    public String aCadea() {
        return super.aCadea() + " Direccion: %s, Cuota: %.2f y la fecha de alta es %s".formatted(direccion,cuotaMensual,dataIngreso.toString());
    }
    @Override
    public double gastosIngresos() {
        beneficios += cuotaMensual;
        return cuotaMensual;
    }
}
