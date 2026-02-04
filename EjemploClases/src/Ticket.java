public class Ticket {
    public Ticket(){

    }
    private final double DESCUENTO = .10;
    private final double PRECIO = 10;
    public double subtotal;
    public double descuentocalculado;
    public double total;

    public void process(int cantidad){
        calcularSubtotal(cantidad);
        calcularDescuento(this.subtotal);
        calcularTotal(this.subtotal);
    }

    private void  calcularSubtotal(int cantidad){
        this.subtotal=cantidad*PRECIO;
    }

    private void calcularDescuento(double subtotal){
        this.descuentocalculado=subtotal*DESCUENTO;
    }

    private void calcularTotal(double subtotal){
        this.total=subtotal-this.descuentocalculado;
    }

    public void imprimirTicket (double cantidad){
        System.out.println("-.-.-.-.-.-.-.-.-TICKET-.-.-.-.-.-.-.-.-");
        System.out.println("La cantidad de articulos fue "+cantidad);
        System.out.println("El subtotal fue: "+this.subtotal);
        System.out.println("El descuento calculado fue de: "+this.descuentocalculado);
        System.out.println("El total es: "+this.total);
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");


    }
}