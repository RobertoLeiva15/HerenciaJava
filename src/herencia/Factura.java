package herencia;

// CLASE PADRE
public class Factura {

    protected int numero;
    protected Cliente cliente;
    protected double total;

    public Factura(int numero, Cliente cliente, double total) {
        this.numero = numero;
        this.cliente = cliente;
        this.total = total;
    }

    public double calcularTotal() {
        return total;
    }
}