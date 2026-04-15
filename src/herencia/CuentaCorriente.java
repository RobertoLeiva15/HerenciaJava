package herencia;

// CLASE HIJA
public class CuentaCorriente extends Cuenta {

    private double limite;

    public CuentaCorriente(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }

    @Override
    public void retirar(double monto) {

        // aqui permito retirar mas dinero usando el limite
        if (saldo + limite >= monto) {
            super.retirar(monto);
            System.out.println("Retiro realizado");
        } else {
            System.out.println("No puedes retirar, sobrepasa el limite");
        }
    }
}