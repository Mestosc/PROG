public class Ejercicio6 {
    public static void main(String[] args) {
        String texto = "www. javadende0. com";
        int ind = texto.indexOf("d");
        int longitud = texto.length();
        String cadena1 = texto.substring(0,ind);
        String cadena2 = texto.substring(ind,longitud);
        System.out.println("Resultado final tras unirlo:" + cadena1 +cadena2);
    }
}
