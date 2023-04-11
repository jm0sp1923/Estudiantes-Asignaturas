package jm0sp;

public class pruebas {
    pruebas(){
        String edades[][]  = {
            {"123", "Juan", "Pérez", "20", "M"},
            {"456", "María", "González", "22", "F"},
            {"789", "Carlos", "Rodríguez", "19", "M"},
            {"234", "Laura", "Sánchez", "21", "F"}
        };

        String temp[];

        temp = edades[1];
        for(int i =0;i<5;i++){
            System.out.println(temp[i]);
        }
        
    }

    public static void main(String[] args) {
        new pruebas();
    }
}
