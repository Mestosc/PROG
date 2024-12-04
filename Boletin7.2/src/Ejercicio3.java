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
        contador = disparar(barcos,coordenada1,coordenada2,contador);
        } while (contador<7);
        finalizacion(barcos);
    }

    static void mostrarTablero(String[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("~");
            }
            System.out.print("\n");
        }
    }
    static int disparar(String[][] tablero, int coordenada1, int coordenada2,int cont) {
        if (saberNave(tablero[coordenada1][coordenada2])){
            System.out.println("Ha disparado a el barco ubicando en las coordenadas " + coordenada1 + " " + coordenada2);
            tablero[coordenada1][coordenada2] = "X";
            cont++;
            // TODO Hacer que muestre el tablero solo con el agua y los barcos
            return cont;
        }
        else {
            System.out.println("Ha disparado a agua");
        }
        return 0;
    }
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
