package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Clientes clientes = new Clientes();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1.Engadir novo cliente\n2.Modificar Cliente existente\n3.Dar de baixa\n4.Listar Cliente\n5.Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            realizacionOpciones(opcion, sc, clientes);
        } while (opcion!=5);
    }

    private static void realizacionOpciones(int opcion, Scanner sc, Clientes clientes) {
        switch (opcion) {
            case 1-> {
                creacionCliente(sc, clientes);
            }
        case 2-> {
            modificarClienteExistente(sc, clientes);
        }
        case 3-> {
            System.out.println("Introduzca el nombre del cliente al que quiera dar de baja:");
            var nombreCliente = sc.nextLine();
            var cliente = obtenerClienteDesdeNome(clientes, nombreCliente);
            clientes.getClientes().remove(cliente);
            clientes.guardarClientes();
        }
        case 4 -> {
                for (int i = 0; i < clientes.getClientes().size(); i++) {
                    System.out.println(clientes.getClientes().get(i).getId() +"." + clientes.getClientes().get(i).getNome());
                }
                System.out.println();
            }
        }
    }

    private static void modificarClienteExistente(Scanner sc, Clientes clientes) {
        System.out.println("Digame el nombre del cliente al que quiere modificarle informacion:");
        var opt1 = sc.nextLine();
        System.out.println("Digame que desea modificar:\n1.Nombre\n2.Telefono");
        var opt2 = sc.nextInt();
        sc.nextLine();
        Cliente clienteModificar = obtenerClienteDesdeNome(clientes,opt1);
        if (opt2==1 && isValidClient(clienteModificar)) {
            clienteModificar.setNome(opt1);
        } else if (opt2==2 && isValidClient(clienteModificar)) {
            clienteModificar.setTelefono(opt1);
        }
        clientes.guardarClientes();
    }

    private static boolean isValidClient(Cliente clienteModificar) {
        return clienteModificar != null;
    }

    private static void creacionCliente(Scanner sc, Clientes clientes) {
        System.out.println("Introduzca nombre del cliente:");
        var nombreCliente = sc.nextLine();
        System.out.println("Introduzca el numero de telefono:");
        var numeroTelefono = sc.next();
        sc.nextLine();
        clientes.getClientes().add(new Cliente(generarID(clientes),nombreCliente,numeroTelefono));
        clientes.guardarClientes();
    }

    public static String generarID(Clientes clientes) {
        String ulitmoID = obtenerUltimoID(clientes);
        return Integer.toString(Integer.parseInt(ulitmoID)+1);
    }
    public static String obtenerUltimoID(Clientes clientes) {
        if (clientes.getClientes().isEmpty()) return "0";
        return clientes.getClientes().get(clientes.getClientes().size()).getId();
    }
    public static Cliente obtenerClienteDesdeNome(Clientes clientes,String nome) {
        for (Cliente cliente : clientes.getClientes()) {
            if (cliente.getNome().equals(nome)) return cliente;
        }
        return null;
    }
}
