package herencia;

public class MainEjercicio2 {

    public static void main(String[] args) {

        // ===============================
        // EJERCICIO 2
        // ===============================

        /*
        Como use herencia:
        Hice una clase Cuenta con saldo.
        Luego hice CuentaCorriente que hereda de Cuenta
        y le agregue un limite para poder sacar mas dinero.

        Metodos que cambie:
        Cambie el metodo retirar() para permitir sobregiro.

        Pruebas que hice:
        Cree una cuenta y trate de retirar dinero dentro
        y fuera del limite para ver que funcione bien.
        */

        CuentaCorriente cuenta = new CuentaCorriente(100, 50);

        cuenta.mostrarSaldo();

        cuenta.retirar(120); // permitido
        cuenta.mostrarSaldo();

        cuenta.retirar(50); // ya no deberia permitir
        cuenta.mostrarSaldo();
    }
}