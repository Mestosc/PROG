package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Clientes clientes = new Clientes();
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int opcion;
        do {
            System.out.println("1.Engadir novo cliente\n2.Modificar Cliente existente\n3.Dar de baixa\n4.Listar Cliente\n5.Salir");
            opcion = sc.nextInt();
            if (opcion==1) {
                System.out.println("Introduzca nombre del cliente:");
                var nombreCliente = sc.next();
                System.out.println("Introduzca el numero de telefono:");
                var numeroTelefono = sc.next();
                clientes.getClientes().add(new Cliente(Integer.toString(contador),nombreCliente,numeroTelefono));
                contador++;
                clientes.guardarClientes();
            } else if (opcion == 2) {
                System.out.println("Digame el nombre del cliente al que quiere modificarle informacion:");
                var opt1 = sc.next();
                System.out.println("Digame que desea modificar:\n1.Nombre\n2.Telefono");
                var opt2 = sc.nextInt();
                Cliente clienteModificar = obtenerClienteDesdeNome(clientes,opt1);
                if (opt2==1 && clienteModificar!=null) {
                    clienteModificar.setNome(opt1);
                } else if (opt2==2 && clienteModificar!=null) {
                    clienteModificar.setTelefono(opt1);
                }
                clientes.guardarClientes();
            } else if (opcion == 3) {
                System.out.println("Introduzca el nombre del cliente al que quiera dar de baja:");
                var nombreCliente = sc.next();
                var cliente = obtenerClienteDesdeNome(clientes,nombreCliente);
                clientes.getClientes().remove(cliente);
            } else if (opcion == 4) {
                for (int i = 0; i < clientes.getClientes().size(); i++) {
                    System.out.println(clientes.getClientes().get(i).getNome());
                }
            }
        } while (opcion!=5);
    }
    public static Cliente obtenerClienteDesdeNome(Clientes clientes,String nome) {
        for (Cliente cliente : clientes.getClientes()) {
            if (cliente.getNome().equals(nome)) return cliente;
        }
        return null;
    }
}
