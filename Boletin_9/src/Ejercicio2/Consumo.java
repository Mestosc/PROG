package Ejercicio2;

public class Consumo {
    double km; // Km recorridos
    double litros; // Son los litros consumidos
    double velocidadMedia;
    double prezoGasolina; // Precio de la gasolina

    public Consumo() {}

    public Consumo(double km, double litros, double velocidadMedia, double prezoGasolina) {
        this.km = km;
        this.litros = litros;
        this.velocidadMedia = velocidadMedia;
        this.prezoGasolina = prezoGasolina;
    }
    public double consumoEuros() {
        return litros*prezoGasolina;
    }
    public double getTiempo() {
        return km/velocidadMedia;
    }
}
