package Ejercicio2;

public class FechaInvalida extends RuntimeException {
    public FechaInvalida(String message) {
        super("Fecha invalida: " + message);
    }
    public FechaInvalida() {
        super("Fecha invalida");
    }
}
