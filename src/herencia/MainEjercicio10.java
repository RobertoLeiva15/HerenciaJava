package herencia;

public class MainEjercicio10 {

    public static void main(String[] args) {

        // ===============================
        // EJERCICIO 10
        // ===============================

        //Como use herencia:
        //Hice una clase Factura como base.
        //Luego hice FacturaContado y FacturaCredito que heredan de Factura.

        //Metodos que cambie:
        //Cambie calcularTotal() para aplicar descuento o recargo.

        //Pruebas que hice:
        //Cree una factura al contado y una a credito
        //para ver si calcula bien los totales.

        Cliente cliente = new Cliente("Roberto", "1234567");

        FacturaContado fc = new FacturaContado(1, cliente, 100, 20);
        FacturaCredito fcr = new FacturaCredito(2, cliente, 100, 30, 3);

        System.out.println("Total contado: " + fc.calcularTotal());
        System.out.println("Total credito: " + fcr.calcularTotal());
    }
}