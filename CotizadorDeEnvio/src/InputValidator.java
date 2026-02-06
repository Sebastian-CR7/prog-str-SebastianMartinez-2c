import java.util.Scanner;

public class InputValidator {

    public double leerDoubleEnRango(Scanner sc, String message,double min,double max){
        double value;
        while (true){
            System.out.println(message);
            if (sc.hasNextDouble()){
                value = sc.nextDouble();
                if (value>=min && value<=max){
                    return value;
                }
                System.out.println("ERROR. El numero esta fuera del rango");
            }else {
                System.out.println("ERROR. El valor no es numerico");
                sc.nextLine();
            }
        }
    }
    public int leerIntEnRango(Scanner sc,String message,double min,double max){
        int value;
        while (true){
            System.out.println(message);
            if (sc.hasNextDouble()){
                value=sc.nextInt();
                if (value>=min && value<=max){
                    return value;
                }
                System.out.println("ERROR. El numero esta fuera del rango");
            }else {
                System.out.println("ERROR. El valor no es numerico");
                sc.nextLine();
            }
        }
    }
    public boolean leerBoolean(Scanner sc,String message){
        while (true){
            System.out.println(message);
            if (sc.hasNextBoolean()){
                return sc.nextBoolean();
            }else {
                System.out.println("El dato no es uno de los indicados (true-false)");
                sc.nextLine();
            }
        }
    }

}
