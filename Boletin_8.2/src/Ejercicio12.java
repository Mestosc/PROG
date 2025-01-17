public class Ejercicio12 {
    public static void main(String[] args) {
        String texto = "Hola como estas bello amigo, tu presencia me es grata";
        String[] palabras = palabrasDivididas(texto);
        System.out.println(contarPalabras(palabras));
        System.out.println(palabraMasLarga(palabras));
    }
    static String[] palabrasDivididas(String texto) {
       return texto.split(" ");
    }

    /**
     * Contar palabras, cuenta las palabras que hay
     * @param palabras palabras a contar
     * @return el numero de palabras
     */
    static int contarPalabras(String[] palabras) {
        int contador = 0;
        for (String palabra : palabras) {
            if (palabra.length() <= 1) continue;
            contador++;
        }
        return contador;
    }
    static void eliminarSignosRaros(String[] palabras) {
        for (int i = 0;i<palabras.length;i++) {
            String nueva = "";
            for (int j = 0; j < palabras[i].length(); j++) {
                char c = palabras[i].charAt(j);
                if (Character.isLetter(c)) {
                    nueva += c;
                }
            }
            palabras[i] = nueva;
        }
    }
    static String palabraMasLarga(String[] palabra) {
        eliminarSignosRaros(palabra);
        int masLarga = 0;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[masLarga].length()<palabra[i].length()) {
                masLarga = i;
            }
        }
        return palabra[masLarga];
    }
}
