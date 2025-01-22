public class Ejercicio12 {
    public static void main(String[] args) {
        String texto = "Unha frase para comparar palabras en lonxitude";
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
        //int contador = 0;
        return palabras.length;
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

    /**
     * Obtener la palabra más larga del texto
     * @param palabra la lista de palabras
     * @return la palabra más larga
     */
    static String palabraMasLarga(String[] palabra) {
        eliminarSignosRaros(palabra);
        int masLarga = 0;
        for (int i = 1; i < palabra.length; i++) {
            if (palabra[masLarga].length()<palabra[i].length()) {
                masLarga = i;
            }
        }
        return palabra[masLarga];
    }
}
