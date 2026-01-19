import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("MENÚ DE OPCIONES");
            System.out.println("1. Calcular IMC");
            System.out.println("2. Calcular área de un rectángulo");
            System.out.println("3. Convertir °C a °F");
            System.out.println("4. Calcular area de un circulo");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opcion: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Seleccionaste calcular IMC");
                    System.out.println("Ingresa el peso (kg): ");
                    double peso = scanner.nextDouble();
                    System.out.println("Ingresa la altura (m): ");
                    double altura = scanner.nextDouble();
                    System.out.println("El IMC es: "+calcuIMC(peso, altura));
                    break;
                case 2:
                    System.out.println("Seleccionaste calcular área de un rectángulo");
                    System.out.println("Ingresa la base: ");
                    double base = scanner.nextDouble();
                    System.out.println("Ingresa la altura: ");
                    double alturaRec = scanner.nextDouble();
                    System.out.println("El area es: "+calcuarearectangulo(base, alturaRec));
                    break;
                case 3:
                    System.out.println("Seleccionaste convertir °C a °F");
                    System.out.println("Ingresa los grados (°C): ");
                    double grados = scanner.nextDouble();
                    System.out.println("Grados °F: "+convertirgrados(grados));
                    break;
                case 4:
                    System.out.println("Seleccionaste calcular area de un circulo");
                    System.out.println("Ingresa el radio: ");
                    double radio = scanner.nextDouble();
                    System.out.println("El area del circulo es: "+areacirculo(radio));
                    break;
                case 5:
                    System.out.println("Seleccionaste SALIR del programa:)");
                    break;
                default:
                    System.out.println("Opcion incorrecta. Por favor selecciona una de las opciones");

            }
            System.out.println();
        }while (choice !=5);

        scanner.close();

    }

    /**
     * Calcula el Índice de Masa Corporal
     * @param peso ->El peso ingresado en Kg
     * @param altura ->La altura ingresada en m
     * @return El valor del IMC calculado
     */
    public static double calcuIMC (double peso, double altura){
        return peso / (altura * altura);
    }

    /**
     * Calcula el area del rectangulo
     * @param base ->El valor de la base del rectangulo
     * @param alturaRec ->El valor de la altura del rectangulo
     * @return El area del rectangulo
     */
    public static double calcuarearectangulo (double base, double alturaRec){
        return base * alturaRec;
    }

    /**
     * Convertir de grados °C a °F
     * @param grados -> Los grados °C ingresados
     * @return La conversion de los grados en °F
     */
    public static double convertirgrados (double grados){
        return (grados * 1.8) + 32;
    }

    /**
     * Calcula el area de un circulo
     * @param radio ->El valor del radio ingresado
     * @return El valor del area del circulo
     */
    public static double areacirculo (double radio){
        return Math.PI * Math.pow(radio, 2);
    }
}
