import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        String palabra = "sentimentalismo";
        System.out.println(secuenciaFinal(obtenerSecuenciaLetras(palabra,4)));
    }
    static String secuenciaFinal(String[] secuencia) {
        String cadenaFinal="";
        for (String cadena : secuencia) {
            cadenaFinal += cadena + ",";
        }
        return cadenaFinal;
    }
    /**
     * Obtener lista de letras de un texto de numero en numero
     * @param palabra la palabra
     * @param numCaracteresSecuencia el numero de caracteres de cada secuencia
     * @return la lista de letras
     */
    static String[] obtenerSecuenciaLetras(String palabra, int numCaracteresSecuencia) {
        int secuencias = palabra.length()-(numCaracteresSecuencia-1);
        String[] resultado = new String[secuencias];
        for (int i = 0;i<resultado.length;i++) {
            resultado[i] = palabra.substring(i,numCaracteresSecuencia+i);;
        }
        return resultado;
    }
}