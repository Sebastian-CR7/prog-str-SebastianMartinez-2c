import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        InputValidator inputvalidator = new InputValidator();
        ShippingCalculator calculator = new ShippingCalculator();
        //I-P-0
        //Input
        int servicio = inputvalidator.leerIntEnRango(sc,"Ingresa el tipo de servicio 1) Estandar 2) Express: ",1,2);
        double peso = inputvalidator.leerDoubleEnRango(sc,"Ingresa el peso en Kg(0.1-50.0): ",0.1,50.0);
        int distancia = inputvalidator.leerIntEnRango(sc,"Ingresa la distancia en Km(1-2000): ",1,2000);
        boolean remota = inputvalidator.leerBoolean(sc,"Ingresa si es zona remota (true/false): ");
        //Process
        double subTotal = calculator.calcularsubtotal(peso,distancia,servicio,remota);
        double iva = calculator.calcularIVA(subTotal);
        double total = calculator.calcularTotal(subTotal,iva);
        //Output
        imprimirTicket(servicio,peso,distancia,remota,subTotal,iva,total);
        }
    public static void imprimirTicket (int servicio,double peso,int distancia,boolean remota,double subtotal,double iva,double total){
        System.out.println(".-.-.-.-TICKET-.-.-.-.");
        System.out.println("Servicio: "+servicio);
        System.out.println("Peso: "+peso+"kg");
        System.out.println("Distancia: "+distancia+"km");
        System.out.println("Zona remota: "+remota);
        System.out.println("El subtotal es: "+subtotal);
        System.out.println("El IVA es: "+iva);
        System.out.println("TOTAL: "+total);
        System.out.println(".-.-.-.-.-.-.-.-.-.-.-.");
    }
}
