package jm0sp;

public class MostrarAsignaturas{
 MostrarAsignaturas(String asignaturas[][],int contadorAsignaturas){
    System.out.println("  NOMBRE ||  CREDITOS || CODIGO");
        for(int i = 0;i<contadorAsignaturas;i++){
            for(int j = 0; j<3;j++){
                 System.out.print("  "+asignaturas[i][j]+"     ");
                }System.out.println();
            }
        }
    }
