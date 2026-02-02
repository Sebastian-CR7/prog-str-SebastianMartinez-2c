import java.util.Random;
import java.util.Scanner;

public class Main {
    static int fuerarango=0, nonumerico=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int min=1, max=100, intentos=0,maxintentos=7;
        boolean gano=false;

        int secret = random.nextInt(100)+1;

        System.out.println("Adivina el numero (1-100), tienes: "+maxintentos+" intentos para hacerlo:)");

        while(intentos<maxintentos){
            int numero=obtenerNumValido("Intento: "+(intentos+1),sc,min,max);
            intentos++;
            if(numero==secret){
                System.out.println("BIEN HECHO, GANASTE EN EL INTENTO: "+intentos);
                gano=true;
                break;
            }else if(numero> secret){
                System.out.println("El numero secreto es menor a "+numero);
            }else{
                System.out.println("El numero secreto es mayor a "+numero);
            }
        }
        if(!gano){
            System.out.println("Perdiste, el numero secreto era: "+secret);
        }
        System.out.println("Te pasaste del rango(menor-mayor): "+fuerarango+" veces.");
        System.out.println("Ingresaste un dato no numerico: "+nonumerico+" veces.");
    }

    public static int obtenerNumValido (String msj, Scanner sc, int min, int max){
        int entrada;

        while (true){
            System.out.println(msj);
            if (sc.hasNextInt()){
                entrada = sc.nextInt();

                if (entrada>=min && entrada<=max){
                    return entrada;
                }
                fuerarango++;
                System.out.println("El numero que se ingreso esta fuera del rango establecido:(");
            }else{
                System.out.println("El dato que se ingreso no es numerico");
                nonumerico++;
                sc.next();
            }
        }
    }
}