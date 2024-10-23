public class Multiplos7 {
    /**
     * Esta clase nos permite saber multiplos de 7 menores que 100
     * @author Oscar Rodriguez
     * @version 1.0
     * **/
    public static void main(String[] args) {

        /* Al dividir 100/numero usando enteros
        se consigue saber el numero por el que se puede multiplicar ese numero sin que sobrepase el 100*/

        for (int numero = 1;numero<=100/7; numero++) {
            System.out.println("Los multiplos de siete menores que 100 son:"  + numero*7);
        }
    }
}