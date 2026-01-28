import java.util.Scanner;

public class ActividadSwitchCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, total;
        int opc;

        System.out.println("MENU DE OPERACIONES:");
        System.out.println("1) SUMAR");
        System.out.println("2) RESTAR");
        System.out.println("3) MULTIPLICAR");
        System.out.println("4) DIVIDIR");
        System.out.println("Selecciona la operacion que quieres realizar:");

        opc = scanner.nextInt();

        switch (opc){
            case 1:
                System.out.println("Ingresa el valor del primer numero: ");
                num1 = scanner.nextDouble();
                System.out.println("Ingresa el valor del segundo numero: ");
                num2 = scanner.nextDouble();
                total = num1+num2;
                System.out.println("El resultado es: "+total);
                break;
            case 2:
                System.out.println("Ingresa el valor del primer numero: ");
                num1 = scanner.nextDouble();
                System.out.println("Ingresa el valor del segundo numero: ");
                num2 = scanner.nextDouble();
                total = num1-num2;
                System.out.println("El resultado es: "+total);
                break;
            case 3:
                System.out.println("Ingresa el valor del primer numero: ");
                num1 = scanner.nextDouble();
                System.out.println("Ingresa el valor del segundo numero: ");
                num2 = scanner.nextDouble();
                total = num1*num2;
                System.out.println("El resultado es: "+total);
                break;
            case 4:
                System.out.println("Ingresa el valor del primer numero: ");
                num1 = scanner.nextDouble();
                System.out.println("Ingresa el valor del segundo numero: ");
                num2 = scanner.nextDouble();
                if (num2 == 0){
                    System.out.println("No se puede dividir entre 0");
                }else {
                    total = num1 / num2;
                    System.out.println("El resultado es: "+total);
                }
                break;
            default:
                System.out.println("OPCION INVALIDA:(");

        }

    }
}
