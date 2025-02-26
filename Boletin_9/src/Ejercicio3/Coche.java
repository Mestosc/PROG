package Ejercicio3;

public class Coche {
    private int velocidade;
    public Coche() {}
    public int getVelocidade() {
        return velocidade;
    }
    public void acelerar(int valor) {
       velocidade += Math.abs(valor);
    }
    public void frenar(int valor) {
        if (velocidade-valor<0) velocidade = 0;
        else velocidade -= valor;
    }
}