package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.acelerar(-12);
        coche.acelerar(10);
        coche.frenar(10);
        System.out.println(coche.getVelocidade());
    }
}
