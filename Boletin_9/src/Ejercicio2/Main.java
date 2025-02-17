package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Consumo consumo = new Consumo();
        consumo.setKm(50);
        consumo.setPrezoGasolina(1.57);
        Consumo consumo1 = new Consumo(100,30,30,0.90);
        System.out.println(consumo1.consumoMedio());
        consumo.setLitros(40);
        System.out.println(consumo1.velocidadMedia);
    }
}
