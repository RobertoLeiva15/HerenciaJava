package herencia;

// CLASE HIJA
public class FacturaContado extends Factura {

    private double descuento;

    public FacturaContado(int numero, Cliente cliente, double total, double descuento) {
        super(numero, cliente, total);
        this.descuento = descuento;
    }

    @Override
    public double calcularTotal() {

        double resultado = total - descuento;

        // validar que no sea negativo
        if (resultado < 0) {
            return 0;
        }

        return resultado;
    }
}