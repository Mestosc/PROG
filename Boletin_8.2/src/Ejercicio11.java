public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println(formatearNombre(" osCaR  ","rodRigUez   "));
    }
    static String formatearNombre(String nombre, String apellido) {
        nombre = nombre.trim();
        apellido = apellido.trim();
        return capitalizar(nombre) + " " + capitalizar(apellido);
    }

    /**
     * Convierte la primera letra en mayuscula devuelve la palabra estando el resto en minuscula
     * @param palabra la palabra de la que quiero tener su primera letra en mayscula
     * @return la palabra con la primera letra en mayuscula
     */
    static String capitalizar(String palabra) {
        char primera = palabra.charAt(0);
        return Character.toUpperCase(primera) + palabra.substring(1).toLowerCase();
    }
}
