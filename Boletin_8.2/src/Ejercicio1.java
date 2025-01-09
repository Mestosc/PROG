public class Ejercicio1 {
    public static void main(String[] args) {
        String cadena = "Hola señor como se encuentra usted en este dia";
        imprimirCadaDos(cadena);
        imprimirPrimerosCaracteres(cadena);
        imprimirTresUltimosCaracteres(cadena);
    }
    static void imprimirPrimerosCaracteres(String texto) {
        System.out.println(texto.substring(0,2));
    }
    static void imprimirTresUltimosCaracteres(String texto) {
        int longitud = texto.length();
        System.out.println(texto.substring(longitud-3,longitud));
    }
    static void imprimirCadaDos(String texto) {
        for (int i = 0;i<texto.length();i+=2) {
            char c = texto.charAt(i);
            System.out.print(c);
        }
        System.out.println();
    }
}