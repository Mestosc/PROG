import java.util.Scanner;

public class SolicitarNotaB {
    public static void main(String[] args) {


    double nota, sumaNotas = 0, cantidadAlumnos = 0, media;

    // Declaramos Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Indicame la nota que tiene cada alumno se sale con -1: ");

   while (true) {

        // Para poder actualizar la cantidad desde el bucle necesitamos tener una seccion de entrada que referencie a notas dentro del mismo
        nota = input.nextInt();

        // Aqui veremos si la nota es -1 en cuyo caso salimos del bucle como aqui la evaluacion se hace despues justo de introducir la nota desde dentro del bucle no hay que repetirlo fuera y funciona
        if (nota==-1) {
            break;
        }

        // Igualamos la suma a la nota más si misma esto hara que cuando añadamos más notas se nos acumule
        sumaNotas = nota + sumaNotas;


        /*Incrementamos la cantidad de Alumnos cada vez que añadimos la nota de un alumno la cantidad de Alumnos con la que se trabaja es distinta
         * más concretamente si añadimos más notas se refiere a más alumnos*/
        cantidadAlumnos++;

    }
   media = sumaNotas/cantidadAlumnos;
   System.out.println("La media de notas de los alumnos es " + media);
}}
