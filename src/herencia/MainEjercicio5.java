package herencia;

public class MainEjercicio5 {

    public static void main(String[] args) {

        // ===============================
        // EJERCICIO 5
        // ===============================

        //Como use herencia:
        //Hice una clase Empleado con nombre y salario.
        //Luego hice Gerente que hereda de Empleado y le agregue un bono.

        //Metodos que cambie:
        //Cambie el metodo calcularSalario() para que sume el bono.

        //Pruebas que hice:
        //Cree un gerente y calcule su salario total
        //para ver si suma bien el bono.

        Gerente gerente = new Gerente("Roberto", 2500, 500);

        double total = gerente.calcularSalario();

        System.out.println("Salario total: " + total);
    }
}