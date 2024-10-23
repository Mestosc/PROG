/**
 * Esta clase nos permite saber multiplos de 7 menores que 100
 * @author Oscar Rodriguez
 * @version 1.0
 * **/
public class Multiplos7 {
    public static void main(String[] args) {

        // Numero del que sacamos multiplos
        int multiplosDe = 7;
        /* Al dividir 100/numero usando enteros
        se consigue saber el numero por el que se puede multiplicar ese numero sin que sobrepase el 100*/

        for (int numero = 1;numero<=100/multiplosDe; numero++) {
            System.out.println("Los multiplos de +" + multiplosDe + "menores que 100 son:"  + numero*multiplosDe);
        }
    }
}