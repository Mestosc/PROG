public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Introduzca el titulo de una web:");
        String texto = """
                Ejercicios Programacion
                Aqui estoy incluyendo los ejercicios más pequeños que nos manda hacer el profesor tipo boletines u otros ejercicios cosas más grandes que se puedan necesitar en repositorios diferentes seran añadidas en esos repositorios cuando sea necesario, si son ejercicios más grande se hara en un proyecto en especifico
                """;
        formatear(texto);
    }
    static void formatear(String textoWeb) {
       int indiceSalto = textoWeb.indexOf("\n");
       String textoAntesSalto = textoWeb.substring(0,indiceSalto);
       String textoDespuesSalto = textoWeb.substring(indiceSalto+1);
       textoAntesSalto = "<h1>" + textoAntesSalto + "</h1>";
       textoDespuesSalto = "<p>" + textoDespuesSalto.trim() + "</p>";
       String textoFinal = "<html>" + "\n " + textoAntesSalto + "\n " + textoDespuesSalto + "\n" + "</html>";
       System.out.println(textoFinal);

    }
}
