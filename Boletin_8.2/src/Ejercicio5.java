public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println(obtenerPrimerasLetras("Universal Serial Bus"));
        System.out.println(capitalizar("república arxentina"));
    }

    /**
     * Metodo capitalizar convierte a mayusculas, palabras separadas por espacio
     * @param texto El texto que queremos convertir a mayusculas
     * @return el texto con la primera en mayuscula
     */
    static String capitalizar(String texto) {
        String[] partes = texto.split(" ");
        String nuevaCadena = "";
        for (String parte : partes) {
            char primera = parte.charAt(0);
            nuevaCadena += Character.toUpperCase(primera) + parte.substring(1)+ " ";
        }
        return nuevaCadena;
    }
    static String obtenerPrimerasLetras(String cadena) {
        StringBuilder caden = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isUpperCase(c)) {
                caden.append(c);
            }
        }
        return caden.toString();
    }
}
