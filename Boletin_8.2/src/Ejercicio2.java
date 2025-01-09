public class Ejercicio2 {
    public static void main(String[] args) {
        String cadena = "separar";
        System.out.println(anadirCaracter(cadena,','));
    }
    static String anadirCaracter(String cadena, char caracter) {
        StringBuilder cadena_nueva = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            cadena_nueva.append(c);
            if (i == cadena.length()-1)  {
                break;
            }
            cadena_nueva.append(caracter);
        }
        return cadena_nueva.toString();
    }
}
