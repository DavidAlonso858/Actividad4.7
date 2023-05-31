package alumnos;
import Alumno.Alumno;
import java.util.Scanner;

public class Alumnos {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    final int NUM_ALUMNOS = 5;
    Alumno[] alum = new Alumno[NUM_ALUMNOS];

    System.out.println("A continuación deberá introducir el nombre y la nota media de 5 alumnos.");

    String nombreIntroducido;
    double notaIntroducida;

    for (int i = 0; i < NUM_ALUMNOS; i++) {
      alum[i] = new Alumno();
      System.out.println("Alumno " + (i+1));
      System.out.print("Nombre: ");
      nombreIntroducido = entrada.nextLine();
      alum[i].nombre = nombreIntroducido;
      System.out.print("Nota media: ");
      notaIntroducida = Double.parseDouble(entrada.nextLine());
      alum[i].notaMedia = notaIntroducida;
    }

    System.out.println("Los datos introducidos son los siguientes:");

    double sumaDeMedias = 0;

    for (Alumno alumno : alum) {
      System.out.println("Nombre: " + alumno.nombre);
      System.out.println("Nota media: " + alumno.notaMedia);
      System.out.println("----------------------------");

      sumaDeMedias += alumno.notaMedia;
    }

    double mediaGlobal = sumaDeMedias / NUM_ALUMNOS;
    System.out.println("La media global de la clase es" + mediaGlobal);
  }
}