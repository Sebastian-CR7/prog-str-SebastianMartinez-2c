public class ShippingCalculator {
    public ShippingCalculator(){}

    private double subtotal, total, iva;

    public double calcularsubtotal(double pesoKg,int distanciaKm,int tipoServicio, boolean esZonaRemota){
        double costoBase, costoPeso = pesoKg * 12, costoDistancia, subtotal;

        if (tipoServicio==1){
            costoBase = 50;
        }else {
            costoBase = 90;
        }

        if (distanciaKm <= 50){
            costoDistancia = 20;
        } else if (distanciaKm<=200) {
            costoDistancia = 60;
        }else {
            costoDistancia = 120;
        }

        subtotal = costoBase + costoPeso + costoDistancia;

        if (esZonaRemota){
            subtotal += subtotal*.10;
        }

        this.subtotal =subtotal;
        return this.subtotal;

    }

    public double calcularIVA(double subtotal){
        this.iva = subtotal * .16;
        return this.iva;
    }

    public double calcularTotal(double subtotal,double iva){
        this.total = subtotal + iva;
        return this.total;
    }

}
