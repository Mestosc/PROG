public abstract class BienInmob {
    String rua;
    int numero;
    String localidade;
    double prezo;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public BienInmob(String rua, double prezo, String localidade, int numero) {
        this.rua = rua;
        this.prezo = prezo;
        this.localidade = localidade;
        this.numero = numero;
    }
    public abstract double calcularGanancia();
}
