package jm0sp;

import java.util.Scanner;


public class CrearEstudiante {
    String x[][];
    Scanner sc = new Scanner(System.in);
    
    CrearEstudiante(String estudiante[][], int fila,int codigo){
        System.out.println("Digite el nombre");
        String nombre = sc.nextLine();
        System.out.println("Digite el apellido");
        String apellido = sc.nextLine();
        System.out.println("Digite la edad");
        String edad = sc.nextLine();
        System.out.println("Digite el genero(F || M)");
        String genero = sc.nextLine();

        estudiante[fila][0] = ""+codigo;
        estudiante[fila][1] = nombre;
        estudiante[fila][2] = apellido;
        estudiante[fila][3] = edad;
        estudiante[fila][4] = genero;
        
        this.x = estudiante;
    }
}
