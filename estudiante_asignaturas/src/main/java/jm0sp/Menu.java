package jm0sp;
import java.util.Scanner;

public class Menu{   

    Scanner sc = new Scanner(System.in);
    int contadorEstudiantes = 0;
    int contadorEdades = 0;
    int contadorAsignaturas = 0;
    int contadorMatriculas = 0;
    int codigoAlumnos = 100;
    int codigoAsignaturas = 200;
    
    String estudiantes[][] = new String[100][5];
    String asignaturas[][] = new String[100][3];
     String matriculas[][] = new String[100][4];
   
    Menu(){
        menu();
    }   

    public static void main( String[] args ){
        new Menu();
    }

    void menu(){
        int opc = 0;
        do{ 
            System.out.println("1. Crear Estudiante");
            System.out.println("2. Modificar datos del Estudiante");
            System.out.println("3. Crear Asignaturas");
            System.out.println("4. Visualizar Estudiante");
            System.out.println("5. Visualizar Asignaturas");
            System.out.println("6. Matricular Asignaturas");
            System.out.println("7. Ver Matriculas");
            System.out.println("8. Salir");
            opc = sc.nextInt(); 
        switch (opc) {
            case 1:{
            
                crearEstudiante();
                break;
                    }
            case 2:{
                
                modificarEstudiante();
                break;
                }
            case 3:{
                
                crearAsignaturas();
                break;
            }
            case 4:{
                mostrarEstudiantes();
                break;
            }
            case 5:{
                mostrarAsignaturas();
                break;
            }
            case 6:{
                matricularAsignaturas();

                break;
            }
            case 7:{
                mostrarMatriculas();
                break;
            }
            case 8:{
                return;
            }
            default:{
                break;
            }
        }
        }while(opc > 0 && opc < 8);
    }


    void crearEstudiante(){
     CrearEstudiante estudiante =new CrearEstudiante(estudiantes,contadorEstudiantes,codigoAlumnos);
     estudiantes = estudiante.x;
     contadorEstudiantes++;
     codigoAlumnos++;
    }
    void modificarEstudiante(){
        ModificarDatosEstudiante mE = new ModificarDatosEstudiante(estudiantes,contadorEstudiantes);
        estudiantes = mE.x;
    }
    void crearAsignaturas(){
        CrearAsignaturas cA = new CrearAsignaturas(asignaturas, contadorAsignaturas,codigoAsignaturas);
        asignaturas = cA.A;
        contadorAsignaturas++;
        codigoAsignaturas++;

    }
    void mostrarEstudiantes(){
      new MostrarAlumnos(estudiantes, contadorEstudiantes,contadorEdades);
      contadorEdades++;
    }
    void mostrarAsignaturas(){
    new MostrarAsignaturas(asignaturas, contadorAsignaturas);
}
    void matricularAsignaturas(){
        MatricularAsignaturas mA = new MatricularAsignaturas(estudiantes, asignaturas, matriculas, contadorEstudiantes, contadorAsignaturas, contadorMatriculas);
        matriculas = mA.x;
        contadorMatriculas = mA.contador;
       contadorMatriculas++;
    }
    void mostrarMatriculas(){
        new MostrarMatriculas(matriculas,contadorMatriculas);
    }



    //Limpiar Pantallla
    public static void limpiarPantalla()  {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
    }  
}
