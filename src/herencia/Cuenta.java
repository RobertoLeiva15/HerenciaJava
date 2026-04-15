package herencia;

// CLASE PADRE
public class Cuenta {

    protected double saldo;

    // Constructor
    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    // Metodo retirar
    public void retirar(double monto) {
        saldo -= monto;
    }

    // Metodo mostrar saldo
    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }
}