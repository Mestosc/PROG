package Ejercicio9;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class RegistroClima {
    static LocalDate fecha = LocalDate.now();
    static DateTimeFormatter dat = DateTimeFormatter.ofPattern("yyyyMMdd");

    public static boolean crearFichero(ArrayList<Double> temperaturas) {
        fecha.format(dat);
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(fecha + ".dat"));
            objectOutputStream.writeObject(temperaturas);
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    public static ArrayList<Double> obtenerArchivo() {
        ObjectInputStream objectInputStream = null;
        fecha.format(dat);
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(fecha + ".dat"));
            return (ArrayList<Double>) objectInputStream.readObject();
        } catch (IOException e) {
            System.out.println("Excepcion");
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no localizada");
        } finally {
            if (objectInputStream!=null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
        return new ArrayList<>();
    }
}
