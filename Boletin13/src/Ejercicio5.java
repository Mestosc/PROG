import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca numeros, se sale con -1:");
        int num;
        List<Integer> enteros = new ArrayList<>();
        boolean salida;
        do {
            System.out.print("Introduzca numero: ");
            num = sc.nextInt();
            salida = num !=-1;
            if (salida) {
                enteros.add(num);
            }
        } while (salida);
        for (int i = 0;i<enteros.size();i+=2) {
            System.out.println(enteros.get(i)*100);
        }
    }
}
