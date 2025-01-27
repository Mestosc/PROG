public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Introduzca el titulo de una web:");
        String texto = """
                ¿Por qué lo usamos?
                
                Es un hecho establecido hace demasiado tiempo que un lector se distraerá con el contenido del texto de un sitio mientras que mira su diseño. El punto de usar Lorem Ipsum es que tiene una distribución más o menos normal de las letras, al contrario de usar textos como por ejemplo "Contenido aquí, contenido aquí". Estos textos hacen parecerlo un español que se puede leer. Muchos paquetes de autoedición y editores de páginas web usan el Lorem Ipsum como su texto por defecto, y al hacer una búsqueda de "Lorem Ipsum" va a dar por resultado muchos sitios web que usan este texto si se encuentran en estado de desarrollo. Muchas versiones han evolucionado a través de los años, algunas veces por accidente, otras veces a propósito (por ejemplo insertándole humor y cosas por el estilo).
                
                """;
        formatear(texto);
    }
    static void formatear(String textoWeb) {
       int indiceSalto = textoWeb.indexOf("\n");
       String textoAntesSalto = textoWeb.substring(0,indiceSalto);
       String textoDespuesSalto = textoWeb.substring(indiceSalto+1);
       textoAntesSalto = "<h1>" + textoAntesSalto + "</h1>";
       textoDespuesSalto = "<p>\n" + textoDespuesSalto.trim() + "\n   </p>";
       String textoFinal = "<html>" + "\n   " + textoAntesSalto + "\n   " + textoDespuesSalto + "\n" + "</html>";
       System.out.println(textoFinal);

    }
}
