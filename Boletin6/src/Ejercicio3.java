import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int area,volumen,longitud;
        Scanner datos = new Scanner(System.in);
        System.out.print("Indicame el area del cubo:");
        area = datos.nextInt();
        System.out.print("Indicame el volumen del cubo:");
        volumen = datos.nextInt();
        System.out.print("Indicame la longitud del cubo:");
        longitud = datos.nextInt();
        calcularAreaCubo(area,volumen,longitud);

    }
    static void calcularAreaCubo(int area, int volume, int longitudLado) {

    }
}
