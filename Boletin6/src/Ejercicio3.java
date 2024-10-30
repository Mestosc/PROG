import java.util.Scanner;
/**
 * Esta clase nos solcita un numero para saber de que caso se trata el calculo y la longitud del lado
 * @author Oscar Rodriguez
 * @version 1.0
 * **/
public class Ejercicio3 {
    public static void main(String[] args) {
        int tareaHacer, longitud; //Declaramos las variables operacionales
        Scanner datos = new Scanner(System.in);
        System.out.print("Indica si deseas calcular area o volumen usando numeros 1(area), 2(volumen):"); // Informamos las opciones que hayy que se introduzcan
        tareaHacer = datos.nextInt(); // Solcitamos el numero de tarea
        System.out.print("Indicame la longitud del cubo:"); // Pedimos que se nos indique la longitud del cubo
        longitud = datos.nextInt();
        calcularCubo(tareaHacer, longitud); //Aplicamos el metodo para obtener segun cada caso una u otra cosa

    }

    /**
     * Calculara el area o el volumen, segun lo que se indique y necesitaremos pasarle la longitud del lado
     *
     * @param caso         si calculamos area o volumen
     * @param longitudLado la longitud del lado del cubo
     */
    static void calcularCubo(int caso, int longitudLado) {
        switch (caso) { // Usando switch para determinar que hacer en un caso u otro
            case 1->{ // Si se aplica el primer caso mostramos mostramos el mensaje correspondiente junto con el calculo
                System.out.println("El area del cubo cuyo lado es " + longitudLado + ": " + (6*(longitudLado*longitudLado)));
            }
            case 2->{ // Si se aplica el segundo caso no lo haremos
                System.out.println("El volumen del cubo cuyo lado es " + longitudLado + ": " + (longitudLado*longitudLado*longitudLado));
        }}
    }
}
