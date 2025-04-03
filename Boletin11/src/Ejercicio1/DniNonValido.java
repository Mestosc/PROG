package Ejercicio1;

public class DniNonValido extends RuntimeException {
    public DniNonValido(String cause) {
        super("DNI non valido: " + cause);
    }
    public DniNonValido() {
        super("DNI non valido: Formato non correcto");
    }
}
