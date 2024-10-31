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
        dias = obtencion.nextInt(); //Indicamos la cantidad de dias
        System.out.print("Indicame la cantidad de horas:");
        horas = obtencion.nextInt(); // Indicamos la cantidad de horas
        System.out.print("Indicame la cantidad de minutos:");
        minutos = obtencion.nextInt();
        segundos = conversionSegundos(dias,horas,minutos); // Llamando a conversionSegundos para obtener cantidad en segundos
        System.out.println("Con una cantidad de " + dias + " dias " + horas + " horas y " + minutos + " minutos tenemos un total de " + segundos + " segundos");

    }

    /**
     * El siguiente metodo muestra la cantidad de segundos en dias,horas y minutos
     * @param dias la cantidad de dias con la que trabajaremos
     * @param horas la cantidad de horas
     * @param minutos la cantidad de horas
     * @return la cantidad de segundos total de las anteriores
     */
    static int conversionSegundos(int dias,int horas, int minutos) {
        int diasSegundos = dias*86400; //Convirtiendo dias a segundos y guardandolo
        int horasSegundos = horas*3600; // Convirtiendo horas a segundos y guardandolo
        int minutosSegundos = minutos*60; // Convirtiendo minutos a segundos
        return diasSegundos+horasSegundos+minutosSegundos; // Devolviendo la suma total de segundos
    }
}
