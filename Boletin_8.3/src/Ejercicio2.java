public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Introduzca el titulo de una web:");
        String texto = """
                ¿De dónde viene?
                
                Al contrario del pensamiento popular, el texto de Lorem Ipsum no es simplemente texto aleatorio. Tiene sus raices en una pieza cl´sica de la literatura del Latin, que data del año 45 antes de Cristo, haciendo que este adquiera mas de 2000 años de antiguedad. Richard McClintock, un profesor de Latin de la Universidad de Hampden-Sydney en Virginia, encontró una de las palabras más oscuras de la lengua del latín, "consecteur", en un pasaje de Lorem Ipsum, y al seguir leyendo distintos textos del latín, descubrió la fuente indudable. Lorem Ipsum viene de las secciones 1.10.32 y 1.10.33 de "de Finnibus Bonorum et Malorum" (Los Extremos del Bien y El Mal) por Cicero, escrito en el año 45 antes de Cristo. Este libro es un tratado de teoría de éticas, muy popular durante el Renacimiento. La primera linea del Lorem Ipsum, "Lorem ipsum dolor sit amet..", viene de una linea en la sección 1.10.32
                
                El trozo de texto estándar de Lorem Ipsum usado desde el año 1500 es reproducido debajo para aquellos interesados. Las secciones 1.10.32 y 1.10.33 de "de Finibus Bonorum et Malorum" por Cicero son también reproducidas en su forma original exacta, acompañadas por versiones en Inglés de la traducción realizada en 1914 por H. Rackham.
                
                """;
        formatear(texto);
    }
    static void formatear(String textoWeb) {
       int indiceSalto = textoWeb.indexOf("\n");
       String textoAntesSalto = textoWeb.substring(0,indiceSalto);
       String textoDespuesSalto = textoWeb.substring(indiceSalto+1);
       textoAntesSalto = "<h1>" + textoAntesSalto + "</h1>";
       textoDespuesSalto = "<p>\n" + textoDespuesSalto.trim() + "\n   </p>";
       String textoFinal = "<html>" + "\n <head>\n </head>\n<body>\n" + textoAntesSalto + "\n   " + textoDespuesSalto + "\n" + " </body>\n</html>";
       System.out.println(textoFinal);

    }
}
