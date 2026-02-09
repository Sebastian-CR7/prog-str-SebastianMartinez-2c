import java.util.Scanner;

public class GradeService {
    public GradeService() {}

    private double promedio, califfin;
    private String estado;
    private boolean entrega;

    public double calcularPromedio(double p1, double p2, double p3) {
        return (p1 + p2 + p3) / 3;
    }

    public double calcularFinal(double promedio, int asistencia) {
        return (promedio * .7) + (asistencia * .3);
    }

    public String determinarEstado(double notaFinal, int asistencia, boolean entrega) {
        if (asistencia < 80) {
            return "REPROBADO por asistencia";
        } else if (!entrega) {
            return "REPROBADO por proyecto";
        }
        if (califfin >= 70) {
            return "APROBADO";
        } else {
            return "REPROBADO por calificacion";
        }
    }

    public static void imprimirReporte(String nom,double p1,double p2,double p3,double promedio,int asistencias,boolean entrega,double califfin,String estado){
        System.out.println("-.-.-.-.REPORTE DE ALUMNO.-.-.-.-");
        System.out.println("Alumno: "+nom);
        System.out.println("Calificacion de parciales: 1)"+p1+" 2)"+p2+" 3)"+p3);
        System.out.println("Promedio de calificaciones: "+promedio);
        System.out.println("Asistencias: "+asistencias);
        System.out.println("Entrego el proyecto: "+entrega);
        System.out.println("Calificione final: "+califfin);
        System.out.println("Estado: "+estado);
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
    }
}