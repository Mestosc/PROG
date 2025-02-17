package Ejercicio2;

public class Consumo {
    private double km; // Km recorridos
    private double litros; // Son los litros consumidos
    private double velocidadMedia;
    private double prezoGasolina; // Precio de la gasolina

    public double getKm() {
        return km;
    }

    public double getLitros() {
        return litros;
    }

    public double getVelocidadMedia() {
        return velocidadMedia;
    }

    public double getPrezoGasolina() {
        return prezoGasolina;
    }

    public Consumo() {}

    public Consumo(double km, double litros, double velocidadMedia, double prezoGasolina) {
        this.km = km;
        this.litros = litros;
        this.velocidadMedia = velocidadMedia;
        this.prezoGasolina = prezoGasolina;
    }
    public double consumoMedio() {
        return litros/getTiempo();
    }
    public double consumoEuros() {
        return litros*prezoGasolina;
    }
    public double getTiempo() {
        return km/velocidadMedia;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public void setVelocidadMedia(double velocidadMedia) {
        this.velocidadMedia = velocidadMedia;
    }

    public void setPrezoGasolina(double prezoGasolina) {
        this.prezoGasolina = prezoGasolina;
    }
}
