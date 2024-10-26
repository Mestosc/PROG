import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numeroMult = 0,control;
        // Definimos el Scanner
        Scanner lectura = new Scanner(System.in);

        //Hacemos la lectura del numero
        int numero = lectura.nextInt();

        do {
            int numeroFinal = numero + numeroMult;
            System.out.println(numero + "x" + numeroMult + " = " + numeroFinal);
            numeroMult++;
            control = lectura.nextInt();
        } while (control!=0);
    }
}
