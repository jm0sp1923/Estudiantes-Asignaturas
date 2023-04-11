package jm0sp;

public class MostrarMatriculas {
      MostrarMatriculas(String matriculas[][], int contador){
        for(int i =0;i<contador;i++){
            for(int j = 0;j<4;j++){
                  System.out.print(" "+matriculas[i][j]);
               }
               System.out.println();
            }
      }
}
