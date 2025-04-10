package Ejercicio1;

import java.io.*;
import java.util.ArrayList;

public class Clientes {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    public Clientes() {
        clientes = leerArchivoClientes();
        if (clientes==null) {
            clientes = new ArrayList<>();
        }
    }
    public Clientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    public ArrayList<Cliente> leerArchivoClientes() {
        ObjectInputStream entrada = null;
        try {
            entrada = new ObjectInputStream(new FileInputStream("src/Ejercicio1/listaClientes.dat"));
            return (ArrayList<Cliente>) entrada.readObject();
        } catch (IOException e) {
            System.err.println("Ha habido un error de entrada entrada " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error objeto no encontrado");
        } finally {
            if (entrada!=null) {
                try {
                    entrada.close();
                } catch (IOException e) {
                    System.err.println("Ha habido un fallo al cerrar el archivo");
                }
            }
        }
        return null;
    }
    public void guardarClientes() {
        ObjectOutputStream salida = null;
        try {
            salida = new ObjectOutputStream(new FileOutputStream("src/Ejercicio1/listaClientes.dat"));
            salida.writeObject(clientes);
        } catch (IOException e) {
            System.err.println("Ha habido un error de entrada salida " + e.getMessage());
        } finally {
            if (salida!=null) {
                try {
                    salida.close();
                } catch (IOException e) {
                    System.err.println("Ha habido un fallo al cerrar el archivo");
                }
            }
        }
    }
}
