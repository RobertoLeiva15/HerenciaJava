package herencia;

// CLASE HIJA
public class ProductoPerecedero extends Producto {

    private String fechaVencimiento;

    public ProductoPerecedero(String nombre, String fechaVencimiento) {
        super(nombre);
        this.fechaVencimiento = fechaVencimiento;
    }

    // Metodo para ver si esta vencido (simulado)
    public void estaVencido() {
        // aqui solo muestro la fecha, no estoy comparando fechas reales
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Vence en: " + fechaVencimiento);
    }
}