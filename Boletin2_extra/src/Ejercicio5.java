import java.util.Scanner;
/**
 * Primero solicitamos entrada sobre los elementos, que requerimos saber para hacer los calculos
 * @author oscar
 * **/
public class Ejercicio5 {
    public static void main(String[] args) {
        double sueldoFijo, ventasDin, distancia, diaDesp;
        Scanner cantidades = new Scanner(System.in);
        System.out.print("Introduzca sueldo fijo:");
        sueldoFijo = cantidades.nextDouble();
        System.out.print("Introduzca km realizados:");
        distancia = cantidades.nextDouble();
        System.out.print("Introduzca valor ventas:");
        ventasDin = cantidades.nextDouble();
        System.out.print("Introduzca numero dias que estuvo fuera:");
        diaDesp = cantidades.nextDouble();
        // Calculo sueldo bruto
        double sueldoBruto = sueldoFijo+((ventasDin*5)/100)+(2*distancia)+(30*diaDesp);
        // Calculo sueldo liquido
        double sueldoLiquido = sueldoBruto-((sueldoBruto*18)/100)-36;
        // Mostrar por pantalla
        System.out.println("El sueldo bruto es:" + sueldoBruto + "€");
        System.out.println("El sueldo liquido es:" + sueldoLiquido + "€");
        cantidades.close();
    }
}
