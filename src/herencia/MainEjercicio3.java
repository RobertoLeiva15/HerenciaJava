package herencia;

public class MainEjercicio3 {

    public static void main(String[] args) {

        // ===============================
        // EJERCICIO 3
        // ===============================

        //Como use herencia:
        //Hice una clase Producto con el nombre.
        //Luego hice ProductoPerecedero que hereda de Producto y le agregue la fecha de vencimiento.

        //Metodos que cambie:
        //Cambie el metodo mostrar() para que tambien muestre la fecha de vencimiento.

        //Pruebas que hice:
        //Cree un producto perecedero y use los metodos
        //mostrar() y estaVencido() para ver los datos.
        

        ProductoPerecedero prod = new ProductoPerecedero("Arroz", "15/08/2026");

        prod.mostrar();
        prod.estaVencido();
    }
}
