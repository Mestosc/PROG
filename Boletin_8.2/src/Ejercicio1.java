public class Ejercicio1 {
    public static void main(String[] args) {
        String cadena = "Hola señor como se encuentra usted en este dia";
    }
    static void imprimirPrimerosCaracteres(String texto) {
        System.out.println(texto.substring(0,2));
    }
    static void imprimirTresUltimosCaracteres(String texto) {
        int longitud = texto.length();
        System.out.println(texto.substring(longitud-3,longitud));
    }
}