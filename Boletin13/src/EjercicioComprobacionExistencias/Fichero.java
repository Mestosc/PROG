package EjercicioComprobacionExistencias;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Fichero {
    public static boolean guardarFichero(String fichero, Map<String,Integer> map) {
        ObjectOutputStream buff = null;
        try {
            buff = new ObjectOutputStream(new FileOutputStream(fichero));
            buff.writeObject(map);
            return true;
        } catch (IOException e) {
            System.err.println("Error ha habido algun problema al leer el fichero " + e.getMessage());
        } finally {
            if (buff!=null) {
                try {
                    buff.close();
                } catch (IOException e) {
                    System.err.println("Fallo al cerrar el archivo " + e.getMessage());
                }
            }
        }
        return false;
    }
    public static Map<String,Integer> obtenerFichero(String nombreFichero) {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(nombreFichero));
            return (Map<String, Integer>) objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            System.err.println("No se encontro la clase buscada " + e.getMessage());
        }
        catch (IOException e){
                System.err.println("Error ha habido algun problema al leer el fichero " + e.getMessage());
        } finally {
            if (objectInputStream!=null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    System.err.println("Fallo al cerrar el archivo " + e.getMessage());
                }
            }
        }
        return new HashMap<>();
    }
}
