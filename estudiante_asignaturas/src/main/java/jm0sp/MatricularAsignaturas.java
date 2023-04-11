package jm0sp;

import java.util.Scanner;

public class MatricularAsignaturas{
    Scanner sc = new Scanner(System.in);
    String x [][];
    int contadorEstudiantesM;
    int contadorAsignaturasM;
    int contadorMatriculasM;
    

    String matrizEstudiantes[][];
    String matrizAsignaturas[][];
    String matrizMatriculas[][];

    String alumno;  	
    String codigoEstudiante;  
    int contador = 0;  
    int cantCreditosEstudiante;
    MatricularAsignaturas(String estudiantes[][], String asignaturas[][], String matriculas[][],int contadorEstudiantes, int contadorAsignaturas, int contadorMatriculas){
        System.out.println("Digite el codigo de el alumno que quiere matricular");
        String codigo = sc.nextLine();
        matrizEstudiantes = estudiantes;
        matrizAsignaturas = asignaturas;
        matrizMatriculas = matriculas;
        contadorAsignaturasM = contadorAsignaturas;
        contadorMatriculasM = contadorMatriculas;
        boolean existe = false;
        for(int i = 0;i<contadorEstudiantes;i++){
            if(Integer.parseInt(codigo)  == Integer.parseInt(estudiantes[i][0])){
                existe = true;
                alumno  = estudiantes[i][1];
                codigoEstudiante = estudiantes[i][0];
                menu();
                return;
            }
        }
        if(!existe){
            System.out.println("Estudiante no encontrado");;    
            return;
        }
    }

    void validarCreditos(){
        
    }

    void menu(){
        int opc = 0;
            System.out.println("Bienvenido "+alumno);
        do{
            System.out.println("Quiere matricular asignaturas?");
            System.out.println("1. si");
            System.out.println("2. no");
            opc = sc.nextInt();
            switch(opc){
                case 1:{
                    mostrarAsignaturas();
                    contadorMatriculasM++;
                    break;
                }
                case 2:{
                    System.out.println("Salir");
                    return;
                }
            }
        }while(opc > 0 && opc < 2);
    }

    void mostrarAsignaturas(){
        new MostrarAsignaturas(matrizAsignaturas, contadorAsignaturasM);
        System.out.print("Digite el codigo de la asignatura que quiere matricular: ");
        int codigoAsignatura = sc.nextInt();
        saberCodigo(codigoAsignatura);
    }
    String nombreAsignatura,cantCreditos,codigoAsignaturaM;
    void saberCodigo(int codigoAsignatura){
        boolean existe = false;
        for(int i = 0;i<contadorAsignaturasM;i++){
            if(codigoAsignatura == Integer.parseInt(matrizAsignaturas[i][2])){
                nombreAsignatura = matrizAsignaturas[i][0];
                cantCreditos = matrizAsignaturas[i][1];
                codigoAsignaturaM = matrizAsignaturas[1][2];
                existe = true;
                llenarMatricula();
            }
        }
        if(!existe){
            System.out.println("No existe esa asignatura"); 
            this.x = matrizMatriculas;
            return;
        }
    }

    void llenarMatricula(){
        System.out.println(contadorMatriculasM);
        matrizMatriculas[contadorMatriculasM][0] = alumno;
        matrizMatriculas[contadorMatriculasM][1] = codigoAsignaturaM;
        matrizMatriculas[contadorMatriculasM][2] = nombreAsignatura;
        matrizMatriculas[contadorMatriculasM][3] = cantCreditos;
        this.x = matrizMatriculas;
        this.contador = contadorMatriculasM;
        return;
    }
}