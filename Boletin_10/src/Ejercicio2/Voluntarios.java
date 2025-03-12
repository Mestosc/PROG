package Ejercicio2;

public class Voluntarios extends Trabajador {
    private int edade;
    private String profesion;
    private double horas;

    public Voluntarios(String dni, String nome, String dataIngreso, int edade, String profesion, double horas) {
        super(dni, nome, dataIngreso);
        this.edade = edade;
        this.profesion = profesion;
        this.horas = horas;
    }
    public String aCadea() {
        return super.aCadea() + " Edad: %d, Profesion: %s, Horas: %.2f".formatted(edade,profesion,horas);
    }
    @Override
    public void gastosIngresos() {
        beneficios -= 3;
    }
}
