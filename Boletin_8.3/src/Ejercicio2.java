public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Introduzca el titulo de una web:");
        String texto = """
                ¿De dónde viene?
                
                Al contrario del pensamiento popular, el texto de Lorem Ipsum no es simplemente texto aleatorio. Tiene sus raices en una pieza cl´sica de la literatura del Latin, que data del año 45 antes de Cristo, haciendo que este adquiera mas de 2000 años de antiguedad. Richard McClintock, un profesor de Latin de la Universidad de Hampden-Sydney en Virginia, encontró una de las palabras más oscuras de la lengua del latín, "consecteur", en un pasaje de Lorem Ipsum, y al seguir leyendo distintos textos del latín, descubrió la fuente indudable. Lorem Ipsum viene de las secciones 1.10.32 y 1.10.33 de "de Finnibus Bonorum et Malorum" (Los Extremos del Bien y El Mal) por Cicero, escrito en el año 45 antes de Cristo. Este libro es un tratado de teoría de éticas, muy popular durante el Renacimiento. La primera linea del Lorem Ipsum, "Lorem ipsum dolor sit amet..", viene de una linea en la sección 1.10.32
                
                El trozo de texto estándar de Lorem Ipsum usado desde el año 1500 es reproducido debajo para aquellos interesados. Las secciones 1.10.32 y 1.10.33 de "de Finibus Bonorum et Malorum" por Cicero son también reproducidas en su forma original exacta, acompañadas por versiones en Inglés de la traducción realizada en 1914 por H. Rackham.
                
                """;
        System.out.println(formatear(texto));
    }

    /// Formatea un texto como HTML añadiendo las correspondientes etiquetas ofreciendo un resultado como el siguiente
    /// ```html
    ///  <html>
    ///      <head>
    ///      </head>
    ///      <body>
    ///         <h1>¿De dónde viene?</h1>
    ///         <p>
    ///         Amigos mios bienvenidos a mi sitio
    ///         </p>
    ///      </body>
    ///    </html>
    /// ```
    /// @param textoWeb
    /// @return el texto con el formato descrito arriba
    static String formatear(String textoWeb) {
       int indiceSalto = textoWeb.indexOf("\n"); // Localizar el primer salto de linea
       String textoAntesSalto = textoWeb.substring(0,indiceSalto); // Obtener el texto antes del salto de linea
       String textoDespuesSalto = textoWeb.substring(indiceSalto+1); // Obtener el texto despues del salto de linea
       textoAntesSalto = "<h1>" + textoAntesSalto + "</h1>"; // Añadiendo la etiqueta <h1> al texto antes del salto
       textoDespuesSalto = "<p>\n" + textoDespuesSalto.trim() + "\n   </p>"; // Añadiendo etiqueta de parrafo al texto despues del salto y eliminando espacios molestos
        return "<html>" + "\n <head>\n </head>\n<body>\n" + textoAntesSalto + "\n   " + textoDespuesSalto + "\n" + " </body>\n</html>";
    }
}
