import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        InputValidator inputvalidator = new InputValidator();
        GradeService gradeservice = new GradeService();
        //I-P-0
        //INPUT
         String nom = inputvalidator.leerTextoNoVacio(sc, "Ingresa el nombre del alumno: ");
        double p1 = inputvalidator.leerDoubleEnRango(sc, "Ingresa la calificacion parcial 1: ", 0, 100);
        double p2 = inputvalidator.leerDoubleEnRango(sc, "Ingresa la calificacion parcial 2: ", 0, 100);
        double p3 = inputvalidator.leerDoubleEnRango(sc, "Ingresa la calificacion parcial 3: ", 0, 100);
        int asistencias = inputvalidator.leerIntEnRango(sc, "Ingresa las asistencias. ", 0, 100);
        boolean entrega = inputvalidator.leerBoolean(sc,"El alumno entrego el proyecto (true/false): ");
        //PROCESS
        double promedio = gradeservice.calcularPromedio(p1,p2,p3);
        double fin = gradeservice.calcularFinal(promedio,asistencias);
        String estado = gradeservice.determinarEstado(fin,asistencias,entrega);

        //OUTPUT
        GradeService.imprimirReporte(nom,p1,p2,p3,promedio,asistencias,entrega,fin,estado);
    }
}