package jm0sp;



public class MostrarAlumnos {
   int contadorEstudiantesM;
   String matrizEstudiantes[][];
   String edades[][] = new String[100][5];
  int k;
    MostrarAlumnos(String estudiantes[][], int contadorEstudiantes,int contadorEdad){
        contadorEstudiantesM = contadorEstudiantes;
        matrizEstudiantes = estudiantes;
        k = contadorEdad;
        edadMayor();
       // meterFilas();
        mostrar();
        
    }

    
    int posicion = 0;
    void edadMayor(){
        int mayor = Integer.parseInt(matrizEstudiantes[0][3]);
        for(int i = 0;i <contadorEstudiantesM;i++){
            if(mayor <Integer.parseInt(matrizEstudiantes[i][3])){ 
                mayor = Integer.parseInt(matrizEstudiantes[i][3]);
               for(int p =0;p<5;p++){
                edades[k][p] = matrizEstudiantes[i][p];
                } 
                System.out.print("Variable k: "+k);
                k++;
            }
            
        }
        System.out.println("mayor: "+ mayor);
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
             for(int j =0;j<4;j++){
                  System.out.print(" "+matrizEstudiantes[i][j]+" ");
             }System.out.println();
          } 
    }
    
}
