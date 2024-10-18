import java.util.Scanner;
/** Permite a traves del numero del DNI sacar la letra correspondiente
 * @author Oscar Rodriguez
 * @version 1.0
 * **/
public class Ejercicio5 {
    public static void main(String[] args) {
        String letra;
        Scanner numero = new Scanner(System.in);
        System.out.println("Introduzca su numero de DNI:");
        int DNI = numero.nextInt();
        int valorLetra = DNI % 23;
        letra = switch (valorLetra) {
           case 0-> "T";
           case 1-> "R";
           case 2-> "W";
           case 3-> "A";
           case 4-> "G";
           case 5-> "M";
           case 6-> "Y";
           case 7-> "F";
           case 8-> "P";
           case 9-> "D";
           case 10-> "X";
           case 11-> "B";
           case 12-> "N";
           case 13-> "J";
           case 14-> "Z";
           case 15-> "S";
           case 16-> "Q";
           case 17-> "V";
           case 18-> "H";
           case 19-> "L";
           case 20-> "C";
           case 21-> "K";
           case 22-> "E";
           default -> "";
        };
        System.out.println("La letra para el siguiente " + DNI + " es " + letra);
    }
}
