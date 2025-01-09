public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println(saberPalindromo("anita lava la tina"));
        System.out.println(cadenaSoloConsonantes("logaritmos"));
        System.out.println(cadenaSoloVocales("consonantes"));
        System.out.println(cadenaConSiguienteVocal("vestiario"));
    }
    static String cadenaConSiguienteVocal(String texto) {
        StringBuilder nuevaCadena = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            c = switch (c) {
                case 'a'-> 'e';
                case 'e'-> 'i';
                case 'i'-> 'o';
                case 'o'->'u';
                case 'u'->'a';
                default -> c;
            }; // Uso del switch case 'nuevo' para hacer que si el caracter coincide con una de las vocales existentes se cambie con la siguiente
            nuevaCadena.append(c);
        }
        return nuevaCadena.toString();
    }
    static String cadenaSoloVocales(String texto) {
        texto = texto.toLowerCase();
        StringBuilder cadena = new StringBuilder();
        for (int i = 0; i < texto.length() ; i++) {
            char c = texto.charAt(i);
            boolean esVocal = c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
            if (esVocal) {
                cadena.append(c);
            }
        }
        return cadena.toString();
    }
    static String cadenaSoloConsonantes(String texto) {
        texto = texto.toLowerCase();
        StringBuilder cadena = new StringBuilder();
        for (int i = 0; i < texto.length() ; i++) {
            char c = texto.charAt(i);
            boolean esVocal = c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
            if (!esVocal && Character.isLetter(c)) {
                cadena.append(c);
            }
        }
        return cadena.toString();
    }
    static boolean saberPalindromo(String texto) {
        texto = texto.replace(" ","");
        String inverso = new StringBuilder(texto).reverse().toString();
        return texto.equalsIgnoreCase(inverso);
    }
}
