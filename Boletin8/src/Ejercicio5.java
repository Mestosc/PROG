public class Ejercicio5 {
    public static void main(String[] args) {
        String texto = "java java java";
        mostrarCuantasConsonantesVocales(texto);
    }

    /**
     * Muestra la cantidad de vocales y consonantes hay en un texto
     * @param text el texto que queremos verificar
     */
    static void mostrarCuantasConsonantesVocales(String text) {
        int contadorVocales=0,contadorConsonantes=0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                boolean esVocal = c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
                if (esVocal) {
                    contadorVocales++;
                    continue;
                }
            contadorConsonantes++;
            }
        }
        System.out.println("Hay " + contadorConsonantes + " consonantes");
        System.out.println("Hay " + contadorVocales + " vocales");
    }
}
