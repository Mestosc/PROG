package Ejercicio4;

public class Conta {
    private String nome;
    private String numeroConta;
    private double tipoInterese;
    private double saldo;
    public Conta() {}
    public void ingreso(int valor) {
        this.saldo += Math.abs(valor);
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
