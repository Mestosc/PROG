import java.util.Scanner;

public class Ejercicio1B {
    public static void main(String[] args) {
        //Esta es una propuesta más chapucera pero que puede ser más entendible
        Scanner dato = new Scanner(System.in);
        int valoresNegativos = 0;
        int valoresPositivos = 0;
        int valorCero = 0;
        for (int cantNum = 0;cantNum<10;cantNum++) {
            System.out.println("Introduce numero");
            int numero = dato.nextInt();
            if (numero < 0) {
                valoresNegativos++;
            }
            else if (numero == 0) {
                valorCero++;
            }
            else {
                valoresPositivos++;
            }
        }
        System.out.println("La cantidad de valores negativos es:" + valoresNegativos);
        System.out.println("La cantidad de valores positivos es:" + valoresPositivos);
        System.out.println("La cantidad de valores que sean igual a 0 es:" + valorCero);
    }
}
