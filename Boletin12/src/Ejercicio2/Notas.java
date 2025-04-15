package Ejercicio2;

import java.io.*;
import java.util.ArrayList;

public class Notas {
    ArrayList<String> notas;
    public Notas() {
        notas = leerNotas();
    }
    public void escribirNota(String nota) {
        notas.add(nota);
        escribirNota();
    }
    private void escribirNota() {
        BufferedWriter escritor = null;
        try {
            escritor = new BufferedWriter(new FileWriter("notas.txt",true));
            for (String nota : notas) {
                escritor.write(nota);
                escritor.newLine();
            }
        } catch (IOException e) {
            System.err.println("Se ha dado un error de entrada salida: " + e.getMessage());
        } finally {
            if (escritor!=null) {
                try {
                    escritor.close();
                } catch (IOException e) {
                    System.out.println("Error en cierre" + e.getMessage());
                }
            }
        }
    }
    public ArrayList<String> leerNotas() {
        ArrayList<String> paraNotas = new ArrayList<>();
        BufferedReader lector = null;
        try {
            lector = new BufferedReader(new FileReader("notas.txt"));
            String lectura = lector.readLine();
            while (lectura!=null && !lectura.isEmpty()) {
                paraNotas.add(lectura);
                lectura = lector.readLine();
            }
        } catch (IOException e) {
            System.err.println("Se ha dado un error de entrada salida: " + e.getMessage());
        } finally {
            if (lector!=null) {
                try {
                    lector.close();
                } catch (IOException e) {
                    System.out.println("Error en cierre" + e.getMessage());
                }
            }
        }
        return paraNotas;
    }
    public String obtenerNotas(String filter) {
        String not="";
        for (String nota : notas) {
            if (nota.contains(filter)) not += nota + "\n";
        }
        return not;
    }
    public String obtenerNotas() {
        String not="";
        for (String nota : notas) {
            not += nota + "\n";
        }
        return not;
    }
}
