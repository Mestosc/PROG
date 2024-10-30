import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Introduzca un numero");
        Scanner introduccion = new Scanner(System.in);
        eco(introduccion.nextInt());
        introduccion.close();
    }
    static void eco(int veces) {
        for (int i = 0;i<veces;i++) {
            System.out.println("Ecoo...");
        }
    }
}
