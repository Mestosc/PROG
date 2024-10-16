import java.util.Scanner;
/**
 * Nos permite si tenemos numeros del 0 al 99 pasarlos de numero a letra usando tres casos en especifico
 * para realizar el proceso
 * @version 1.0
 * @author Oscar Rodriguez
 * **/
public class NumerosLetras {
    public static void main(String[] args) {
        String resultadoD = "";
        String resultadoU = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca un valor entre 0 e 99:");
        int valor = input.nextInt();

        // Condicional para saber si el numero esta entre 10 y 20
        if (valor>=10 && valor<=20) {

        // Sirve para hacer los casos de los exclusivos que no se pueden hacer solo uniendo palabras
        switch (valor) {
            case 10:
                System.out.println("Diez");
                break;
            case 11:
                System.out.println("Once");
                break;
            case 12:
                System.out.println("Doce");
                break;
            case 13:
                System.out.println("Trece");
                break;
            case 14:
                System.out.println("Catorce");
                break;
            case 15:
                System.out.println("Quince");
                break;
            case 16:
                System.out.println("Dieciseis");
                break;
            case 17:
                System.out.println("Diecisiete");
                break;
            case 18:
                System.out.println("Dieciocho");
                break;
            case 19:
                System.out.println("Diecinueve");
                break;
            case 20:
                System.out.println("Veinte");
                break;
        }}

        // Si no esta comprendido en ese intervalo de 10 y 20 aplicaremos lo siguiente
        else {

        // Primero guardaremos el valor de las decenas y las unidades en dos variables
        int decenas = valor/10;
        int unidades = valor%10;

        // Nos permite saber las decenas en letras
        switch (decenas) {
            case 2:
                resultadoD = "Veinti";
                break;
            case 3:
                resultadoD = "Treinta";
                break;
            case 4:
                resultadoD = "Cuarenta";
                break;
            case 5:
                resultadoD = "Cincuenta";
                break;
            case 6:
                resultadoD = "Sesenta";
                break;
            case 7:
                resultadoD = "Setenta";
                break;
            case 8:
                resultadoD = "Ochenta";
                break;
            case 9:
                resultadoD = "Noventa";
                break;
        }

        // Nos permite saber las unidades en letras
        switch (unidades) {
            case 0:
                resultadoU = "Cero";
                break;
            case 1:
                resultadoU = "uno";
                break;
            case 2:
                resultadoU = "dos";
                break;
            case 3:
                resultadoU = "tres";
                break;
            case 4:
                resultadoU = "cuatro";
                break;
            case 5:
                resultadoU = "cinco";
                break;
            case 6:
                resultadoU = "seis";
                break;
            case 7:
                resultadoU = "siete";
                break;
            case 8:
                resultadoU = "ocho";
                break;
            case 9:
                resultadoU = "nueve";
                break;
        }

        // Si las unidades son 0 y las decenas no lo son imprime solo el numero para los que es valido
        if (unidades==0 && decenas!=0) {
            System.out.println(resultadoD);
        }

        // Todos los numeros entre el 20 y 29 se escriben de forma particular por lo que simplemente los imprimimos asi
        else if (valor>=20 && valor<=29) {
            System.out.println(resultadoD + resultadoU);
        }

        // Todos los numeros mayores a treinta se imprimen de la siguiente manera por lo que hacemos que se represente asi
        else if (valor>=30) {
            System.out.println(resultadoD + " y " + resultadoU);
        }

        //Si no hay decenas, no es mayor que 30 y no esta entre 20 y 29 es decir son solo unidades, se refleja aqui
        else {
            System.out.println(resultadoU);
        }
    }
    }

}