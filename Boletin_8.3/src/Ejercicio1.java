import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        String palabra = "frigorífico";
        System.out.println(secuenciaFinal(obtenerSecuenciaLetras(palabra,4)));
    }
    static String secuenciaFinal(ArrayList<String> secuencia) {
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
    static ArrayList<String> obtenerSecuenciaLetras(String palabra, int numCaracteresSecuencia) {
        ArrayList<String> resultado = new ArrayList<>();
        for (int i = 0; i < palabra.length(); i++) {
            String sub = palabra.substring(i,numCaracteresSecuencia+i);
            resultado.add(sub);
            if (i==7) break;
        }
        return resultado;
    }
}