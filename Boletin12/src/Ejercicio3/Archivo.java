package Ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Archivo {
	public Archivo() {
		BufferedReader bufferedReader = null;
		try {
			String cadenaFinal = "";
			bufferedReader = new BufferedReader(new FileReader("notas.txt"));
			String linea = bufferedReader.readLine();
			while (linea != null) {
				cadenaFinal += linea + " ";
				linea = bufferedReader.readLine();
			}
			mostrarResult(cadenaFinal);
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
		String limpia = linea.replaceAll("[^\\p{L}\\p{Nd}]+", " ").trim();
		String[] pal = limpia.split("\\s+");
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
