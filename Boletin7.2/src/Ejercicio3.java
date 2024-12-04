import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador=0;
        String[][] barcos = {{"~", "B", "~", "~"},
                {"~", "B", "~", "~"},
                {"B", "B", "B", "B"},
                {"~", "B", "~", "~"}};
        mostrarTablero(barcos);
        do {
        System.out.println("Introduzca primera coordenada para disparar:");
        int coordenada1 = sc.nextInt();
        System.out.println("Introduzca segunda coordenada para disparar:");
        int coordenada2 = sc.nextInt();
        contador += disparar(barcos,coordenada1,coordenada2);
        } while (contador<7);
        finalizacion(barcos);
    }

    static void mostrarTablero(String[][] tablero) {
        for (String[] strings : tablero) {
            for (int j = 0; j < strings.length; j++) {
                System.out.print("~");
            }
            System.out.print("\n");
        }
    }

    /**
     * Disparar a un barco, en el juego hundir la flota
     * @param tablero el tablero donde jugamos
     * @param coordenada1 La fila a la que disparamos
     * @param coordenada2 La columna a la que disparamos
     * @return El valor del contador
     */
    static int disparar(String[][] tablero, int coordenada1, int coordenada2) {
        int cont=0;
        if (saberNave(tablero[coordenada1][coordenada2])){
            System.out.println("Ha disparado a el barco ubicando en las coordenadas " + coordenada1 + " " + coordenada2);
            tablero[coordenada1][coordenada2] = "X"; // Cambiamos el valor del tablero en esas coordenadas a "X"
            cont++; // Aumentamos el contador
            // TODO Hacer que muestre el tablero solo con el agua y los barcos
            return cont; // Devolvemos el valor final del contador
        }
        else {
            System.out.println("Ha disparado a agua"); // Indicamos que disparamos a agua
        }
        return 0; // Si no se cumple la condicion detonante
    }

    /**
     * Saber si disparamos a un barco
     * @param valorCoordenadas el valor de las coordenadas donde esta lo que queremos comprobar
     * @return verdadero si es un barco falso si no
     */
    static boolean saberNave(String valorCoordenadas) {
        return valorCoordenadas.equals("B");
    }
    static void finalizacion(String[][] tablero) {
        for (String[] strings : tablero) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
        System.out.println("Enorabuena has ganado");
    }
}
