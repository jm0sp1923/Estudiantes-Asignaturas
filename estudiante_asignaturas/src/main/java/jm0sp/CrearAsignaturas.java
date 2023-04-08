package jm0sp;
import java.util.Scanner;

public class CrearAsignaturas{
    Scanner sc = new Scanner(System.in);
    String A[][];

    CrearAsignaturas(String asignatura[][], int contador,int codigoAsignaturas){
        System.out.println("Digite el nombre de la asignatura: ");
        String nombre = sc.nextLine();

        System.out.println("Digite la cantidad de creditos de la asignatura: ");
        String creditos = sc.nextLine();

        asignatura[contador][0] = nombre;
        asignatura[contador][1] = creditos;
        asignatura[contador][2] = ""+codigoAsignaturas;
        
        this.A = asignatura;
    }
   
}