import java.util.Scanner;

public class SolicitarNota {
    public static void main(String[] args) {

        //Declaramos las variables de la nota, la suma de las varias notas y por ultimo la media de las varias notas
        int nota, sumaNotas = 0, cantidadAlumnos = 0, media;

        // Declaramos Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Indicame la nota que tiene cada alumno se sale con -1: ");

        nota = input.nextInt();

        do {

            // Igualamos la suma a la nota más si misma esto hara que cuando añadamos más notas se nos acumule
            sumaNotas = nota + sumaNotas;

            // Para poder actualizar la cantidad desde el bucle necesitamos tener una seccion de entrada que referencie a notas dentro del mismo
            nota = input.nextInt();

            /*Incrementamos la cantidad de Alumnos cada vez que añadimos la nota de un alumno la cantidad de Alumnos con la que se trabaja es distinta
             * más concretamente si añadimos más notas se refiere a más alumnos*/
            cantidadAlumnos++;

        }while (nota!=-1);
        media = sumaNotas/cantidadAlumnos;
        System.out.println("La media de notas de los alumnos es " + media);
    }}