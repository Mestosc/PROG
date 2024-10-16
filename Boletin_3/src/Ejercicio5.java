public class Ejercicio5 {
    /**
     * Tenemos un conjunto de tres valores comparamos los tres para saber cual es el mayor
     * luego mostramos el valor mayor por pantalla
     * @author oscar
     **/
    public static void main(String[] args) {
        int valor1 = 23;
        int valor2 = 4;
        int valor3 = 32;
        if (valor1>valor2 && valor1>valor3) { /*Comparamos primero valor1 y 2 luego comparamos valor 1 y 3
         si el valor de 1 es mayor a esos dos, 1 es mayor y lo imprimimos por pantalla por eso se usa AND*/
            System.out.println("El valor mayor es " + valor1);
        }
        else if (valor2>valor3) { /*Aqui usamos un else if para ver si el 2º valor es mayor al tercero como ya
         comprobamos si es mayor que el primero, no hace falta volver a hacerlo*/
            System.out.println("El valor mayor es " + valor2);
        }
       else { //Y luego si el valor2 no es mayor al valor3 es la unica situacion que queda y se refleja
            System.out.println("El valor mayor es " + valor3);
            }
        }
        }
