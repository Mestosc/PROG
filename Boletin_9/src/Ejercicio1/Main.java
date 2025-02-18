package Ejercicio1;

/// To **Run** code, press <shortcut actionId="Run"/> or
/// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Dioses malignos","H.P LofCraft",1990,(short) 200,10);
        libro1.amosar();
        Libro libro2 = new Libro("Dioses malignos","H.P LofCraft",1990,(short) 200,2);
        libro2.amosar();
    }
}