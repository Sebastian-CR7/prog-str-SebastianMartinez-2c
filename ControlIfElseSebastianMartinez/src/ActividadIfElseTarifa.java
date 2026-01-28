import java.util.Scanner;

public class ActividadIfElseTarifa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad, tarifa=0;
        boolean estudiante;

        System.out.println("Ingrese su edad: ");
        edad = scanner.nextInt();
        System.out.println("Eres estudiante: (TRUE/FALSE)");
        estudiante = scanner.nextBoolean();

        if (edad<0 || edad>120){
            System.out.println("La edad es invalida");
        } else if (edad<12) {
            tarifa = 50;
        } else if (edad>=12 && edad<=17) {
            if (estudiante=true){
                tarifa = 60;
            }else {
                tarifa = 80;
            }
        } else if (edad>=18) {
            if (estudiante=true){
                tarifa = 90;
            }else {
                tarifa = 120;
            }
        }

        System.out.println("La edad ingresada es: "+edad);
        System.out.println("Es estudiante: "+(estudiante ? "SI":"NO"));
        System.out.println("La tarifa es de $ "+tarifa);
    }
}