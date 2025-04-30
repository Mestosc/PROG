package Ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Archivo {
	public Archivo() {
		BufferedReader bufferedReader = null;
		try {
			StringBuilder cadenaFinal = new StringBuilder();
			bufferedReader = new BufferedReader(new FileReader("notas.txt"));
			String linea = bufferedReader.readLine();
			while (linea != null) {
				cadenaFinal.append(linea).append(" ");
				linea = bufferedReader.readLine();
			}
			mostrarResult(cadenaFinal.toString());
		} catch (IOException exception) {
		    System.err.println("Error no se ha localizado el archivo");
		} finally {
			if (bufferedReader != null) {
			    try {
					bufferedReader.close();
			    } catch (IOException e) {
					System.err.println("Ha habido un error en el cierre del archivo");
			    }
			}
		}
	}
	public void mostrarResult(String linea) {
		String limpia = linea.replaceAll("[^\\p{L}\\p{Nd}]+", " ").trim(); // Esto lo encontre por ahi es para limpiar el texto de espacios extraños que puedan afectar en la ejecucion
		String[] pal = limpia.split("\\s+"); // Esto es para tener en cuenta cosas como el doble espacio o la tabulacion segun he encontrado
        for (String actual : pal) {
            System.out.printf("%s: %d %n", actual, contarPalabras(linea,actual));
        }
	}
	public int contarPalabras(String texto, String palabra) {
	    String[] palbras = texto.split(" ");
	    int contador=0;
        for (String palbra : palbras) {
            if (palbra.equals(palabra))
                contador++;
        }
		return contador;
    }
}
