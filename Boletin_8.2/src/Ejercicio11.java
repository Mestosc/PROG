public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println(formatearNombre("OsCar","rodRiguez"));
    }
    static String formatearNombre(String nombre, String apellido) {
        nombre = nombre.trim();
        apellido = apellido.trim();
        return capitalizar(nombre) + " " + capitalizar(apellido);
    }

    /**
     * Convierte la primera letra en mayuscula y la devuelve
     * @param palabra la palabra de la que quiero tener su primera letra en mayscula
     * @return la palabra con la primera letra en mayuscula
     */
    static String capitalizar(String palabra) {
        palabra = palabra.toLowerCase();
        char primera = palabra.charAt(0);
        return Character.toUpperCase(primera) + palabra.substring(1);
    }
}
