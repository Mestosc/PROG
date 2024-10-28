import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int numero, suma=0;
        Scanner datos = new Scanner(System.in);

        for (int y=1; y<=10;y++) {
            System.out.print("Introduzca numero (salir con 999):");
            numero = datos.nextInt();
                if (numero==999) {
                    break;
                }
                suma += numero;
            }
        System.out.println(suma);
        datos.close();
        }
    }
