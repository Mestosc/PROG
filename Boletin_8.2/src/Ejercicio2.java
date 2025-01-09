public class Ejercicio2 {
    public static void main(String[] args) {
        String cadena = "separar";
        System.out.println(anadirCaracterEntreCaracteres(cadena));
        String cadena2 = "meu arquivo de texto.txt";
        System.out.println(cadena2.replace(" ","\\_"));
    }
    static String anadirCaracterEntreCaracteres(String cadena) {
        StringBuilder cadena_nueva = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            cadena_nueva.append(c);
            if (i == cadena.length()-1)  {
                break;
            }
            cadena_nueva.append(',');
        }
        return cadena_nueva.toString(); /* Tambien se podria hacer con String concatenandolo yo al final lo hice asi
        el IDE no se me queja y funciona bien ya que simplemente va añadiendo al final el caracter y luego la coma yo lo hice asi por que de la otra manera me lie luego lo hice asi en el main y asi se quedo*/
    }
}
