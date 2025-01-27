public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Introduzca el titulo de una web:");
        formatear("Academia Web\n Bienvenidos a Academia Web donde aprendemos de todo menos web");
    }
    static void formatear(String textoWeb) {
       int indiceSalto = textoWeb.indexOf("\n");
       String textoAntesSalto = textoWeb.substring(0,indiceSalto);
       String textoDespuesSalto = textoWeb.substring(indiceSalto+1);
       textoAntesSalto = "<h1>" + textoAntesSalto + "</h1>";
       textoDespuesSalto = "<p>" + textoDespuesSalto.trim() + "</p>";
       System.out.println(textoAntesSalto+"\n"+textoDespuesSalto);

    }
}
