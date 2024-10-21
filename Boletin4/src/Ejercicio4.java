import java.util.Scanner;
/**
 * Nos permite si tenemos numeros del 0 al 99 pasarlos de numero a letra usando tres casos en especifico
 * para realizar el proceso
 * @version 1.0
 * @author Oscar Rodriguez
 * **/
public class Ejercicio4 {
    public static void main(String[] args) {
        // Incializamos el resultado de las decenas y las unidades
        String resultadoD;
        String resultadoU;
        //Incializamos el Scanner para poder reccibir input
        Scanner input = new Scanner(System.in);
        // Indicamos que queremos que se introduzcan valores entre el 0 y 99
        System.out.print("Introduzca un valor entre 0 e 99:");
        // Indicamos el valor a introducir
        int valor = input.nextInt();

        // Condicional para saber si el numero esta entre 10 y 20
        if (valor >= 10 && valor <= 20) {

            // Sirve para hacer los casos de los exclusivos que no se pueden hacer solo uniendo palabras
            switch (valor) {
                case 10 -> System.out.println("Diez");
                case 11 -> System.out.println("Once");
                case 12 -> System.out.println("Doce");
                case 13 -> System.out.println("Trece");
                case 14 -> System.out.println("Catorce");
                case 15 -> System.out.println("Quince");
                case 16 -> System.out.println("Dieciseis");
                case 17 -> System.out.println("Diecisiete");
                case 18 -> System.out.println("Dieciocho");
                case 19 -> System.out.println("Diecinueve");
                case 20 -> System.out.println("Veinte");
            }
        }

        // Si no esta comprendido en ese intervalo de 10 y 20 aplicaremos los casos para decenas y unidades
        else {

            // Primero guardaremos el valor de las decenas y las unidades en dos variables
            int decenas = valor / 10;
            int unidades = valor % 10;

            // Nos permite saber las decenas en letras
            resultadoD = switch (decenas) {
                case 2 -> "Veinti";
                case 3 -> "Treinta";
                case 4 -> "Cuarenta";
                case 5 -> "Cincuenta";
                case 6 -> "Sesenta";
                case 7 -> "Setenta";
                case 8 -> "Ochenta";
                case 9 -> "Noventa";
                default -> "";
            };

            // Nos permite saber las unidades en letras
            resultadoU = switch (unidades) {
                case 0 -> "cero";
                case 1 -> "uno";
                case 2 -> "dos";
                case 3 -> "tres";
                case 4 -> "cuatro";
                case 5 -> "cinco";
                case 6 -> "seis";
                case 7 -> "siete";
                case 8 -> "ocho";
                case 9 -> "nueve";
                default -> "";
            };

            // Comprobar si el valor es valido, los valores validos son aquellos iguales a 99 y aquellos que no son menores a menor que 0
            if ((valor <= 99) && !(valor < 0)) {
                // Si las unidades son 0 y las decenas no lo son, imprime solo el numero de las decenas
                 if (unidades == 0 && decenas != 0) {
                    System.out.println(resultadoD);
                }

                // Todos los numeros entre el 20 y 29 se escriben de forma particular por lo que simplemente los imprimimos de esa manera
                else if (valor >= 20 && valor <= 29) {
                    System.out.println(resultadoD + resultadoU);
                }

                // Los numeros menores que 10 no tienen decenas por tanto imprimimos solo unidades
                else if (valor < 10) {
                    System.out.println(resultadoU);
                }

                // Si no esta entre 20 y 29 y no es menor que 10 es decenas + y + unidades
                else {
                    System.out.println(resultadoD + " y " + resultadoU);
                }
            }

            // Este else hace referencia al if de los valores validos es decir indica los valores no validos
            else {
                System.out.println("Has introducido un valor no valido");
            }
        }

        // Cerramos el Scanner input
        input.close();
    }
}