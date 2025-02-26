package Ejercicio4;

public class Conta {
    private String nome;
    private String numeroConta;
    private double tipoInterese;
    private double saldo;
    public Conta() {}
    public void ingreso(double valor) {
        this.saldo += Math.abs(valor);
    }
    public void transferencia(Conta contaDestino, double valor) {
        reintegro(valor);
        contaDestino.ingreso(valor);
    }
    public void reintegro(double valor) {
        if (valor<0) System.out.println("No es posible hacer un reintegro negativo");
        else this.saldo -= valor;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        if (numeroConta.length()==8) this.numeroConta = numeroConta;
    }

    public double getTipoInterese() {
        return tipoInterese;
    }

    public void setTipoInterese(double tipoInterese) {
        this.tipoInterese = tipoInterese;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(String nome, double saldo, double tipoInterese, String numeroConta) {
        this.nome = nome;
        this.saldo = saldo;
        this.tipoInterese = tipoInterese;
        setNumeroConta(numeroConta);
    }
}
