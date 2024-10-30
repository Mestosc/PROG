import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int area,volumen,longitud;
        Scanner datos = new Scanner(System.in);
        System.out.print("Indica si deseas calcular area o volumen usando numeros 1(area), 2(volumen");
        int caso = datos.nextInt();
        System.out.print("Indicame la longitud del cuadrado");
        longitud = datos.nextInt();
        calcularAreaCubo(caso,longitud);

    }

    /**
     * Esta funcion calculara el area o el volumen, segun lo que se indique y necesitaremos pasarle la longitud del lado
     * @param caso si calculamos area o volumen
     * @param longitudLado la longitud del lado del cubo
     */
    static void calcularAreaCubo(int caso, int longitudLado) {


    }
}
