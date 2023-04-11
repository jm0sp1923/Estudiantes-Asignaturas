package jm0sp;



public class MostrarAlumnos {
   int contadorEstudiantesM;
   String matrizEstudiantes[][];
   String edades[][] = new String[100][5];
    MostrarAlumnos(String estudiantes[][], int contadorEstudiantes,int contadorEdad){
        contadorEstudiantesM = contadorEstudiantes;
        matrizEstudiantes = estudiantes;
        edadMayor();
        mostrar();
    
    }

    
    void edadMayor(){
       
        for (int i = 0; i < contadorEstudiantesM; i++) {
            for (int j = 0; j < 5; j++) {
                edades[i][j] = matrizEstudiantes[i][j];
            }
        }

        String temp[];

        for (int i = 0; i < contadorEstudiantesM - 1; i++) {
            for (int j = 0; j < 5 - 1; j++) {
                int edad1 = Integer.parseInt(edades[i][3]);
                int edad2 = Integer.parseInt(edades[i+1][3]);
                if (edad1 > edad2) {
                    temp = edades[i];
                    edades[i] = edades[i+1];
                    edades[i+1] = temp;
                }
            }
        }
       
    }


    void mostrar(){
        System.out.println("Matriz Ordenada");
        for(int i = 0;i<contadorEstudiantesM;i++){
            for(int j =0;j<4;j++){
                System.out.print(" "+edades[i][j]+" ");
            }System.out.println();
         } 

         System.out.println("Matriz normal");
         for(int i = 0;i<contadorEstudiantesM;i++){
             for(int j =0;j<5;j++){
                  System.out.print(" "+matrizEstudiantes[i][j]+" ");
             }System.out.println();
          } 
    }
    
}
