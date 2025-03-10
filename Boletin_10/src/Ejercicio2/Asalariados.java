package Ejercicio2;

public class Asalariados extends Trabajador {
    private double sueldo;
    private double porcentajeSS;
    private double porcentajeIRPF;
    public Asalariados(String dni, String nome, String dataIngreso, double sueldo, double porcentajeSS, double porcentajeIRPF) {
        super(dni, nome, dataIngreso);
        this.sueldo = sueldo;
        this.porcentajeSS = porcentajeSS;
        this.porcentajeIRPF = porcentajeIRPF;
    }

    @Override
    public void gastosIngresos() {
        beneficios -= sueldo * (15/100);
    }
}
