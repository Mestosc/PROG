package Ejercicio10;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
/**
* Añadimos las utilidades para gestionar el fichero de salida, con el mapa
* @author Oscar Rodriguez
* @version 1.0
**/
public class Fichero {
    /**
     * Guarda un objeto Map en un fichero
     * @param fichero El nombre del archivo a escribir
     * @param map El objeto map que queremos escribir
     * @return un booleano que es true si la operacion fue correcta
     **/
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
    /**
     * Obtencion de fichero  
     * @param nombreFichero El nombre del fichero del que extraer el Hashmap
     * @return El objeto tipo map que contiene la informacion o uno vacio si el fichero no tiene la informacion o no existe
     **/
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
