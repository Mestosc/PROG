import java.util.Scanner; // Importamos la clase Scanner para poder leer lo que el usuario escribe

public class Numerosprimos { // Definimos nuestra clase principal, que se llama "Numerosprimos"
    public static void main(String[] args) { // Este es el métod principal donde empieza a ejecutarse el programa
        int numero = 0;
        Scanner dato = new Scanner(System.in); // Creamos un objeto scanner para leer datos del teclado
        System.out.print("Introduce un número: "); // Pedimos al usuario que escriba un número
        int introducido = dato.nextInt(); // Leemos el número que el usuario ha escrito y lo guardamos en la variable 'introducido'

        // Mensaje que informa al usuario sobre qué números se van a mostrar
        System.out.println("Los números primos hasta " + introducido + " son:");

        for (numero=2; numero<=introducido;numero++) {
            boolean esPrimo = true;

            /*Iteramos un divisor si el resto de ese valor dividido por un numero que no sea el mismo,
              * 0 o 1 da 0 es divisible sabemos que no es primo y salimos del bucle
              * si no cumple esa condicion iteramos hasta el numero anterior al introducido y en ese caso es primo salimos de ese bucle
             */
            for (int divisor=2;divisor<introducido;divisor++) {
                if (introducido % divisor == 0) {
                    esPrimo = false;
                    break;
                }
            }
            // Si el numero es primo imprimimos las iteraciones hechas por el primer bucle for que es en el que estamos
            if (esPrimo) {
                System.out.println(numero);
            }
        }

        dato.close(); // Cerramos el scanner para liberar los recursos que estaba usando
    }
}
