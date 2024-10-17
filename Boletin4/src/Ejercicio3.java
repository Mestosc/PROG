import java.util.Scanner;
/**
 * Aqui se implementa la funcionalidad
 * **/
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner introduccionD = new Scanner(System.in);
        int numero = introduccionD.nextInt();
        int valorAbsoluto = (numero<=-1) ? -numero:numero;
        System.out.println("El valor absoluto del numero " + numero + " es " + valorAbsoluto);
    }
}
