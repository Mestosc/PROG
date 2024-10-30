import java.util.Scanner;
/**
 * La clase nos preguntara por horas, minutos y segundos luego un metodo te dira los segundos totales
 * @author Oscar Rodriguez
 * @version 1.0
 * **/
public class Ejercicio4 {
    public static void main(String[] args) {
        int dias,horas,minutos,segundos; //Declaramos las variables basicas que necesitaremos
        Scanner obtencion = new Scanner(System.in);
        System.out.print("Indicame una cantidad de dias:");
        dias = obtencion.nextInt();
        System.out.print("Indicame la cantidad de horas:");
        horas = obtencion.nextInt();
        System.out.print("Indicame la cantidad de minutos:");
        minutos = obtencion.nextInt();
        segundos = conversionSegundos(dias,horas,minutos);
        System.out.println("Con una cantidad de " + dias + " dias " + horas + " horas y " + minutos + " minutos tenemos un total de " + segundos + " segundos");

    }

    /**
     * El siguiente metodo muestra la cantidad de segundos en dias,horas y minutos
     * @param dias
     * @param horas
     * @param minutos
     * @return
     */
    static int conversionSegundos(int dias,int horas, int minutos) {
        int diasSegundos = dias*86400;
        int horasSegundos = horas*3600;
        int minutosSegundos = minutos*60;
        return diasSegundos+horasSegundos+minutosSegundos;
    }
}
