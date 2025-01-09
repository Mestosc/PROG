public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println(anadirComaEntreCaracteres("Señor y Señora",'-',4));
        System.out.println(reemplazarCaracterPorOtro("Señor y Señora",'o','b',3));

    }
    static String anadirComaEntreCaracteres(String cadena,char caracter,int num_inserciones) {
        StringBuilder cadena_nueva = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            cadena_nueva.append(c);
            if (i < num_inserciones)  {
                cadena_nueva.append(caracter);
            }
        }
        return cadena_nueva.toString(); /* Tambien se podria hacer con String concatenandolo yo al final lo hice asi
        el IDE no se me queja y funciona bien ya que simplemente va añadiendo al final el caracter y luego la coma yo lo hice asi por que de la otra manera me lie luego lo hice asi en el main y asi se quedo*/
    }
    static String reemplazarCaracterPorOtro(String cadena, char caracter_reemplazar_por, char caracter_reemplazar, int num_reemplazo) {
        num_reemplazo++;
        StringBuilder cadena_nueva = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            boolean prueba = i<num_reemplazo;
            if (c == caracter_reemplazar_por && prueba) {
                cadena_nueva.append(caracter_reemplazar);
            } else {
                cadena_nueva.append(c);
            }
        }
        return cadena_nueva.toString();
    }
}
