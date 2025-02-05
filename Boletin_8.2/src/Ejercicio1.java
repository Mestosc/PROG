public class Ejercicio1 {
    public static void main(String[] args) {
        String cadena = "Hola señor como se encuentra usted en este dia";
        imprimirCadaDos(cadena);
        imprimirPrimerosCaracteres(cadena);
        imprimirTresUltimosCaracteres(cadena);
        imprimirNormaleInverso(cadena);
    }
    static void imprimirPrimerosCaracteres(String texto) {
        System.out.println(texto.substring(0,2));
    }
    static void imprimirTresUltimosCaracteres(String texto) {
        System.out.println(texto.substring( texto.length()-3));
    }
    static void imprimirCadaDos(String texto) {
        for (int i = 0;i<texto.length();i+=2) {
            char c = texto.charAt(i);
            System.out.print(c);
        }
        System.out.println();
    }
    static void imprimirNormaleInverso(String texto) {
        System.out.print(texto);
        String invertido = new StringBuilder(texto).reverse().toString();
        System.out.println(invertido);
    }
}