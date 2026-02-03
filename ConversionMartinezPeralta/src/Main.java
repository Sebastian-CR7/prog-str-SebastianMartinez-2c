import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int opcion=0, opc1=0, opc2=0, opc3=0, opc4=0, totalconversion;
        double dato, resul=0;

        do {
            System.out.println("Menu de CONVERSIONES:");
            System.out.println("1) °C a °F");
            System.out.println("2) °F a °C");
            System.out.println("3) Km a Millas");
            System.out.println("4) Millas a Km");
            System.out.println("5) SALIR");

            try {
                System.out.println("Elija una de las opciones: ");
                opcion = sc.nextInt();

                if (opcion<1 || opcion>5){
                    System.out.println("El valor esta fuera del rango");
                    continue;
                }

                switch (opcion){
                    case 1:
                        dato=leerDatoValido(sc, "Ingresa los grados Celsius: ");
                        resul=(dato*9/5) +32;
                        System.out.println(+dato+"°C son "+resul+"°F");
                        opc1++;
                        break;
                    case 2:
                        dato=leerDatoValido(sc, "Ingresa los grados Fahrenheit: ");
                        resul=(dato-32) * 5/9;
                        System.out.println(+dato+"°F son "+resul+"°C");
                        opc2++;
                        break;
                    case 3:
                        dato=leerDatoValido(sc, "Ingresa los kilometros: ");
                        resul=(dato*0.621371);
                        System.out.println(+dato+"Km son "+resul+"millas");
                        opc3++;
                        break;
                    case 4:
                        dato=leerDatoValido(sc, "Ingresa las millas: ");
                        resul=(dato/0.621371);
                        System.out.println(+dato+"Millas son "+resul+"Km");
                        opc4++;
                        break;
                    case 5:
                        System.out.println("SALISTE del programa:)");
                        break;
                }

            } catch (InputMismatchException error){
                System.out.println("ERROR, ingresa dato numerico dentro del rango del menu");
                sc.next();
            }

        }while (opcion!=5);
        totalconversion= opc1+opc2+opc3+opc4;
        System.out.println("TOTAL de las conversiones realizadas: "+totalconversion);
        System.out.println("Conversiones de la opcion 1: "+opc1);
        System.out.println("Conversiones de la opcion 2: "+opc2);
        System.out.println("Conversiones de la opcion 3: "+opc3);
        System.out.println("Conversiones de la opcion 4: "+opc4);
    }

    public static double leerDatoValido(Scanner sc, String msj){
        double entrada;
        while (true){
            System.out.println(msj);
            if (sc.hasNextDouble()){
                entrada= sc.nextDouble();
                return entrada;
            }else {
                System.out.println("ERROR. Debes de ingresar un valor numerico");
                sc.next();
            }


        }
    }
}