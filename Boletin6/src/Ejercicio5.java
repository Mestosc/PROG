import java.util.Scanner;
/**
 * Nos permite introducir dos intervalos de tiempo (horas y minutos) y mediante el metodo diferenciaMin
 * obtener la diferencia en minutos
 * @author Oscar Rodriguez
 * @version 1.0
 * **/
public class Ejercicio5 {

    public static void main(String[] args) {

    }

    /**
     * Esta funcion nos devuelve la diferencia entre dos intervalos de tiempo en horas y minutos
     * @param hora1 la primera cantidad de horas que vamos a introducir
     * @param minuto1 la primera cantidad de minutos que vamos a introducir
     * @param hora2 la segunda cantidad de horas que vamos a introducir
     * @param minuto2 la segunda cantidad de horas que vamos a introducir
     * @return La diferencia entre hora1 minuto1 y hora2 minuto2
     */
    static int diferenciaMin (int hora1, int minuto1, int hora2, int minuto2) {
        int minutosHora1,minutosHora2, diferenciaTotal; //Declaramos algunas de las variables que usaremos

        /*Para poder calcular correctamente la diferencia necesitaremos primero tenerlo
        en un solo tipo de cantidad es decir o lo hacemos en Horas o en minutos o en segundos pero siempre en un solo tipo
        */
        minutosHora1 = hora1 * 60; // Para convertir la hora1 a minutos y guardarlo
        minutosHora2 = hora2 * 60; // Para convertir la hora2 a minutos y guardarlo
        int totalMinutos1 = minutosHora1 + minuto1; // Para averiguar el total de minutos para la primera cantidad de tiempo
        int totalMinutos2 = minutosHora2 + minuto2; // Para averiguar el total de minutos para la primera cantidad de tiempo
        diferenciaTotal = (totalMinutos1>totalMinutos2) ? totalMinutos1 - totalMinutos2 : totalMinutos2-totalMinutos1; /* Usamos un condicional ternario para si el total de minutos1 es
         mayor al total de minutos2 en caso de que lo sea restamos asi, en caso de que no lo sea a la inversa*/
        return diferenciaTotal; // Hacer que se devuelva la cantidad resultante


    }
}
