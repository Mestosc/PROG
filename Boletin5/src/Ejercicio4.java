import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numeroMult = 0,control;
        // Definimos el Scanner
        Scanner lectura = new Scanner(System.in);

        // Indicamos que queremos que se introduzca un numero
        System.out.print("Introduce el número base para multiplicar (0 para terminar): ");
        //Hacemos la lectura del numero
        int numero = lectura.nextInt();

        do {
            int numeroFinal = numero * numeroMult;
            System.out.println(numero + "x" + numeroMult + " = " + numeroFinal);
            numeroMult++;
            if (lectura.hasNextInt()) {
                control = lectura.nextInt();
        }
            else {
                lectura.next(); // Limpiar la entrada inválida
                control = -1; // Continuar el bucle
        }
        } while (control!=0);
        lectura.close();
    }
}
