public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println(saberPalindromo("anita lava la tina"));
        System.out.println(cadenaSoloConsonantes("logaritmos"));
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
