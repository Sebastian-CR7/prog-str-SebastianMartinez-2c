import java.util.Scanner;

public class InputValidator {
    public String leerTextoNoVacio(Scanner sc,String msg){
        while (true){
            System.out.println(msg);
            String text = sc.nextLine();
            if (!text.isEmpty()){
                return text;
            }
            System.out.println("El nombre no puede estar vacio");
        }
    }
    public double leerDoubleEnRango(Scanner sc,String msg,double min,double max){
        double value;
        while (true){
            System.out.println(msg);
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
    public int leerIntEnRango(Scanner sc,String msg,double min,double max){
        int value;
        while (true){
            System.out.println(msg);
            if (sc.hasNextInt()){
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
    public boolean leerBoolean(Scanner sc, String msg){
        while (true){
            System.out.println(msg);
            if (sc.hasNextBoolean()){
                return sc.nextBoolean();
            }else {
                System.out.println("El dato no es uno de los indicados");
                sc.nextLine();
            }
        }
    }

}
