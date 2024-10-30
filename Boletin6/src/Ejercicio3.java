import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int caso, longitud;
        Scanner datos = new Scanner(System.in);
        System.out.print("Indica si deseas calcular area o volumen usando numeros 1(area), 2(volumen");
        caso = datos.nextInt();
        System.out.print("Indicame la longitud del cuadrado");
        longitud = datos.nextInt();
        calcularCubo(caso, longitud);

    }

    /**
     * Calculara el area o el volumen, segun lo que se indique y necesitaremos pasarle la longitud del lado
     *
     * @param caso         si calculamos area o volumen
     * @param longitudLado la longitud del lado del cubo
     */
    static void calcularCubo(int caso, int longitudLado) {
        if (caso==1) {
            System.out.println("El area del cubo cuyo lado es " + longitudLado + " " + (6*(longitudLado*longitudLado)));
        }
        else {
            System.out.println("El volumen del cubo cuyo lado es " + longitudLado + " " + (longitudLado*longitudLado*longitudLado));
        }
    }
}
