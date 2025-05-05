import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca numeros, se sale con -1:");
        int num;
        List<Integer> enteros = new ArrayList<>();
        do {
            System.out.print("Introduzca numero: ");
            num = sc.nextInt();
            if (num!=-1) {
                enteros.add(num);
            }
        } while (num != -1);
        for (int i = 0;i<enteros.size();i+=2) {
            System.out.println(enteros.get(i)*100);
        }
    }
}
