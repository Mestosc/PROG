public abstract class BienInmob {
    String rua;
    int numero;
    String localidade;
    double prezo;
    Operacion operacion;

    public BienInmob(String rua, Operacion operacion, double prezo, String localidade, int numero) {
        this.rua = rua;
        this.operacion = operacion;
        this.prezo = prezo;
        this.localidade = localidade;
        this.numero = numero;
    }
    public abstract double calcularGanancia();
}
