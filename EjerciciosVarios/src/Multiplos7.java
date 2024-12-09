/**
 * Esta clase nos permite saber multiplos de 7 menores que 100
 * @author Oscar Rodriguez
 * @version 1.0
 * **/
public class Multiplos7 {
    public static void main(String[] args) {

        // Numero del que sacamos multiplos asi si deseas establecer otro mediante un Scanner se puede
        int multiplosDe = 7;

        // Limite en cantidad asi si quieres poner otro limite a traves de un Scanner
        int limite = 100;
        /* Al dividir 100/numero usando enteros
        se consigue saber el numero por el que se puede multiplicar ese numero sin que sobrepase el 100*/

        for (int numero = 1;numero<=limite/multiplosDe; numero++) {
            System.out.println("Los multiplos de " + multiplosDe + " menores que 100 son " + multiplosDe + "x" + numero + ":"  + numero*multiplosDe);
        }
    }
}