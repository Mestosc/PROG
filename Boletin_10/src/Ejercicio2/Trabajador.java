package Ejercicio2;

public abstract class Trabajador extends Persoa {
    public Fecha dataAlta;
    public Trabajador(String dni, String nome, String dataIngreso) {
        super(dni, nome);
        String[] dataI = dataIngreso.split("/");
        this.dataAlta = new Fecha(Integer.parseInt(dataI[0]),Integer.parseInt(dataI[1]),Integer.parseInt(dataI[2]));
    }
    public String aCadea() {
        return super.aCadea() + " Fecha de ingreso: %s".formatted(dataAlta.toString());
    }
}
