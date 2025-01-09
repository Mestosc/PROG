public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println(obtenerPrimerasLetras("universal serial bus"));
        System.out.println(capitalizar("república arxentina"));
        System.out.println(obtener_palabras_empiecen_A("Antes de abrir"));
    }

    /**
     * Metodo capitalizar convierte a mayusculas, palabras separadas por espacio
     * @param texto El texto que queremos convertir a mayusculas
     * @return el texto con la primera en mayuscula
     */
    static String capitalizar(String texto) {
        String[] partes = texto.split(" ");
        StringBuilder nuevaCadena = new StringBuilder();
        for (int i = 0;i<partes.length;i++) {
            char primera = partes[i].charAt(0);
            nuevaCadena.append(Character.toUpperCase(primera));
            nuevaCadena.append(partes[i].substring(1));
            if (i<partes.length-1) {
                nuevaCadena.append(" ");
            }
        }
        return nuevaCadena.toString();
    }
    static String obtenerPrimerasLetras(String cadena) {
        String[] partes = cadena.split(" ");
        StringBuilder caden = new StringBuilder();
        for (String parte : partes) {
            char primera = parte.charAt(0);
            caden.append(primera);
        }
        return caden.toString().toUpperCase();
    }
    static String obtener_palabras_empiecen_A(String texto) {
        String[] texto2 = texto.split(" ");
        StringBuilder cadenaFinal = new StringBuilder();
        for (int i = 0; i < texto2.length; i++) {
            char primera = texto2[i].charAt(0);
            if (primera == 'a' || primera == 'A') {
                cadenaFinal.append(texto2[i]);
                if (i==texto2.length-1) {
                    break;
                }
                cadenaFinal.append(" ");
            }
        }
        return cadenaFinal.toString();
    }
}
