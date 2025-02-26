package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("OJD",20.3,10,"0393203S");
        Conta conta = new Conta("OJD",256.10,10,"0393203S");
        conta.ingreso(20);
        System.out.println("Conta 1 antes:" +conta1.getSaldo());
        conta.transferencia(conta1,10.10);
        System.out.println(conta.getSaldo());
        System.out.println("Conta 1 despues" +conta1.getSaldo());
    }
}
