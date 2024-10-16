//import Math Esto no funciona

import static java.lang.Math.pow;

public class ejercicio3 {

    public static void main(String[] args) {
        /*
        Aqui depende del caso de uso si necesitamos que el programa almacene los resultados de las operaciones para
        su posterior uso necesitaremos usar variables especificas para los resultados,
         pero como aqui no se especifica he decidido adoptar la solucion
        para el caso de uso más mayoritario y normal que es el usar varibales, aunque si es solo imprimir por pantalla
        no es requerido
         */
        int m,n,p,q,r;
        int i;
        m = 10;
        n = 2;
        // Primera operacion
        int resultadoOperacion = (m + n) / n;
        System.out.println("El resultado de la primera operacion a) es: " + resultadoOperacion);
        // Segunda operacion
        p = 4;
        r = 1;
        int s = 1;
        int resultadoOperacion2 = (((m + n) / p) / (p - r) / s);
        System.out.println("El resultado de la segunda operacion b) es: " + resultadoOperacion2);
        // Tercera operacion
        q = 2;
        int resultadoOperacion3 = (m + 4)/(p-q);
        System.out.println("El resultado de la tercera operacion c) es: " + resultadoOperacion3);
        // Cuarta operacion
        int c = 200;
        int t = 400;
        int resultadoOperacion4 = (c * r * t)/100;
        System.out.println("El resultado de la tercera operacion d) es: " + resultadoOperacion4);
        // Quinta operacion
        int resultadoOperacion5 = (m+n) / (p + (q/r));
        System.out.println("El resultado de la quinta operacion e) es: " + resultadoOperacion5);
        // Sexta operacion
        int resultadoOperacion6 = (m / n) * (p+q);
        System.out.println("El resultado de la sexta operacion f) es: " + resultadoOperacion6);
        // Septima operacion
        i = 2;
        // Esto seria usando la libreria math:
        int te = 4;
        double resultadoOperacion7 = n*(pow(1+i, t)*i) / (pow(1+i,t)- 1);
        System.out.println("El resultado de la sexta operacion g) es: " + resultadoOperacion7);
        }

    }