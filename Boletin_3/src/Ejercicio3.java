import java.util.Scanner;

/**
 * En este programa, pedimos un numero y verificamos si es mayor que 0 mostraremos el signo +,
 * si es menor que 0 mostraremos el signo -, y si el numero es 0 mostraremos el numero 0
 * @author oscar
 **/
public class Ejercicio3 {
    public static void main(String[] args) {
        // Declaramos la variable valor como un tipo entero
        int valor;
        // Definimos el objeto Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un numero:");
        valor = entrada.nextInt();
        entrada.close();
        if (valor >= 0) {
            if (valor==0){
                System.out.println(0);
            }
            else {
            System.out.println('+');
            }
        }
       else  {
            System.out.println('-');
        }

    }
}
