public class Ejercicio4 {
    public static void main(String[] args) {
        String hol = "James Gosling Created Java";
        String sinEspacio = hol.replaceAll(" ","");
        System.out.println(sinEspacio); // Llamando al metodo replaceAll que te permite pasarle un caracter y cambiar todas las coincidencias por otra cosa
    }
}
