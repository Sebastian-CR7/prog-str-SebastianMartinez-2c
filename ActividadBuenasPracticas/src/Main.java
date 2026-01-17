import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLimite = pedirEntero(sc, "Ingresa un numero entero (positivo): ");
        int sumTotal = sumarHastaN(numLimite);
        System.out.println("El resultado: "+sumTotal);
    }

    /**
     * Metodo para obtener un entero con un mensaje personalizado
     * @param-> Se le pide al usuario que ingrese un numero
     * @return-> Numero entero
     */
    public static int pedirEntero (Scanner sc, String s){
        System.out.println(s);
        return sc.nextInt();
    }

    /**
     * Calcula la suma acumulada
     * @param-> Limite es el numero maximo a sumar
     * @return->La suma total
     */
    public static int sumarHastaN (int limite){
        int acumularSum = 0;
        for (int i = 1; i <= limite; i++) {
            acumularSum += i;
        }
        return acumularSum;
    }
}
