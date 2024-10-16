import java.util.Scanner;
/**
 * Este programa nos permite si tenemos numeros del 1 al 99 pasarlos de numero a letra tenemos tres
 * casos a contemplar los exclusivos que se escriben de forma diferente, las decenas y las unidades luego
 * si tenemos decenas de 20 tenemos que escribir Veinti y luego si tenemos mayores a 20 debemos hacer con numero y numero
 * y en el caso de los exclusivos mostramos por pantalla directamente.
 * @author oscar
 * **/
public class EjercicioNumerosLetras {
    public static void main(String[] args) {
        String resultadoD = "";
        String resultadoU = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca un valor entre 0 e 99:");
        int valor = input.nextInt();
        if (valor>=10 && valor<=20) {
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
        else {
        int decenas = valor/10;
        int unidades = valor%10;
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
        if (unidades==0 && decenas!=0) {
            System.out.println(resultadoD);
        } else if (valor>=20 && valor<=29) {
            System.out.println(resultadoD + resultadoU);
        } else if (valor>=30) {
            System.out.println(resultadoD + " y " + resultadoU);
        } else {
            System.out.println(resultadoU);
        }
    } }
    }