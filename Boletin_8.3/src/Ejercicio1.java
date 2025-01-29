
public class Ejercicio1 {
    public static void main(String[] args) {
        String palabra = "frigorifico";
        System.out.println(secuenciaFinal(obtenerSecuenciaLetras(palabra,4)));
    }

    /// Obtener la secuencia final como un texto divido por , al estilo de lo siguiente
    ///
    /// **_frig,rigo,igor,gori,orif,rifi,ific,fico_**
    /// @param secuencia La lista de Strings que contiene las secuencias de caracteres varios
    /// @return La secuencia con el formato descrito anteriormente
    static String secuenciaFinal(String[] secuencia) {
        String cadenaFinal="";
        for (int i = 0;i<secuencia.length;i++) {
            if (i<secuencia.length-1) cadenaFinal += secuencia[i] + ",";
            else cadenaFinal += secuencia[i];
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