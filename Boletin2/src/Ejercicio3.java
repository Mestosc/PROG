//Importacion de librerias

import java.util.Scanner;
/**
 * Nos permite introducir el valor de un dolar en euro y a partir de eso convertir
 * de una divisa a otra
 * @author Oscar Rodriguez
 * @version 1.0
 * **/
public class Ejercicio3 {
    public static void main(String[] args) {
        double Euros,valorDolar,cantDolares;
        //Estableciendo Scanner
        Scanner inputMoneda = new Scanner(System.in);
        System.out.print("Introduzca el cambio en dolares(cuantos dolares vale un euro) a dia de hoy:");
        valorDolar = inputMoneda.nextDouble();
        System.out.print("Introduzca cambio en €:");
        Euros = inputMoneda.nextDouble();
        //Cerramos flujo de datos del objeto inputEuros
        inputMoneda.close();
        /* Aquí se especifica el valor al momento de hacer el ejercicio si no se actualiza no se garantiza que los resultados
           se mantengan en el tiempo. Lo hice así en principio la otra forma es más logica
         valorDolar = 1.1080658; por ese motivo se cambio para que  */
        cantDolares = Euros * valorDolar ;
        System.out.println("La cantidad de dolares de " + Euros + "€ es " + cantDolares + "$");
    }

}