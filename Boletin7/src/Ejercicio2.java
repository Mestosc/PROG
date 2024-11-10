public class Ejercicio2 {
    public static void main(String[] args) {
        int numeroAprobados=0, numeroSuspensos=0,totalNotas=0;
        boolean notaMayor,otraMayor;
        int[] notas = {5,2,9,3,4,5,6,1,5,6,7,2,4,3,2,5,4,7,8,9,10,4,2,6,1,6,3,6,4,3};
        for (int i = 0;i<notas.length;i++) {
            totalNotas += notas[i]; // Haciendo la suma de todas las notas para la media
            if (notas[i]>=5) { // Si tienen 5 o mas estan aprobados y lo contamos
                numeroAprobados++; // Aumentando cuenta de los aprobados
            }
            else { // Si no tienen 5 o más estan suspensos y lo contamos
                numeroSuspensos++; // Aumentando cuenta de los suspensos
            }
        }
        System.out.println("El numero de aprobados es:" + numeroAprobados);
        System.out.println("El numero de suspensos es:" + numeroSuspensos);
        System.out.println("La media es de " + ((double) totalNotas / notas.length));
    }
}
