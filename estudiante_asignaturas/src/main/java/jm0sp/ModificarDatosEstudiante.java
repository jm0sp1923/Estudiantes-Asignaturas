package jm0sp;

import java.util.Scanner;

public class ModificarDatosEstudiante{
    String x[][];
    boolean existe = false;
    Scanner sc = new Scanner(System.in);
    ModificarDatosEstudiante(String estudiante[][],int fila){
        System.out.print("Digite el codigo de el estudiante: ");
        String codigo  = sc.nextLine();


        for(int i = 0;i<fila;i++){
            if(Integer.parseInt(codigo) == Integer.parseInt(estudiante[0][0])){

                System.out.print("Digite el nuevo nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Digite el nuevo apellido: ");
                String apellido = sc.nextLine();
                System.out.print("Digite la nueva edad: ");
                String edad = sc.nextLine();
                System.out.print("Digite el nuevo genero(F || M): ");
                String genero = sc.nextLine();
        
                estudiante[i][1] = nombre;
                estudiante[i][2] = apellido;
                estudiante[i][3] = edad;
                estudiante[i][4] = genero;
                existe = true;
                this.x = estudiante;
                return;
            }
            
        }
        if(existe == false){
        System.out.println("Estudiante no encontrado");
        System.out.println("Presione una tecla para continuar....");
        sc.nextLine();
        this.x = estudiante;
        }
    }
    public static void limpiarPantalla()  {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        }
}
