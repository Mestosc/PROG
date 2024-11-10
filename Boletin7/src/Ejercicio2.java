public class Ejercicio2 {
    public static void main(String[] args) {
        int numeroAprobados=0, numeroSuspensos=0,totalNotas=0;
        int[] notas = {5,2,9,3,4,5,6,1,5,6,7,2,4,3,2,5,4,7,8,9,10,4,2,6,1,6,3,6,4,3};
        int mayor=notas[0]; // Asumimos que la nota mayor es el primer elemento
        for (int nota : notas) {
            for (int j = 1; j < notas.length; j++) { // Iterando desde el segundo
                if (notas[j] > mayor) { /*Si la nota desde el segundo elemento es mayor a la nota del primer elemento que*
            que consideramos mayor mayor sera asginado a ese elemento al iterar eso podremos averiguar cual es el numero mayor*/
                    mayor = nota;
                    break;
                }
            }
            totalNotas += nota; // Haciendo la suma de todas las notas para la media
            if (nota >= 5) { // Si tienen 5 o mas estan aprobados y lo contamos
                numeroAprobados++; // Aumentando cuenta de los aprobados
            } else { // Si no tienen 5 o más estan suspensos y lo contamos
                numeroSuspensos++; // Aumentando cuenta de los suspensos
            }
        }
        System.out.println("El numero de aprobados es:" + numeroAprobados);
        System.out.println("El numero de suspensos es:" + numeroSuspensos);
        System.out.println("La media es de " + ((double) totalNotas / notas.length));
        System.out.println("La nota mayor es:" + mayor);
    }
}
