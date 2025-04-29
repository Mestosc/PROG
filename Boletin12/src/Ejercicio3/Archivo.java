package Ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;

import javax.swing.text.AbstractDocument.LeafElement;

public class Archivo {
	public Archivo() {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("notas.txt"));
			String linea = bufferedReader.readLine();
			while (linea != null) {
				mostrarResult(linea);
				linea = bufferedReader.readLine();
			}
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
		String[] pal = linea.split(" ");
			for (int i = 0; i < pal.length;i++) {
				System.out.printf("%s: %d %n", pal[i], contarPalabras(linea,pal[i]));
		}
	}
	public int contarPalabras(String texto, String palabra) {
	    String[] palbras = texto.split(" ");
	    int contador=0;
		for (int i = 0; i < texto.length; i++) {
			if (palbras.equals(palabra))
				contador++;
		}
		return contador;
    }
}
