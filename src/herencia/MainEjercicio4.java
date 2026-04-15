package herencia;

public class MainEjercicio4 {

    public static void main(String[] args) {

        // ===============================
        // EJERCICIO 4
        // ===============================

        //Como use herencia:
        //Hice una clase Transporte con la capacidad.
        //Luego hice Bus que hereda de Transporte y le agregue la ruta.

        //Metodos que cambie:
        //Cambie el metodo descripcion() para que tambien muestre la ruta.

        //Pruebas que hice:
        //Cree un bus y use el metodo descripcion()
        //para ver que muestre todos los datos.

        Bus bus = new Bus(45, "Jutiapa - Guatemala");

        bus.descripcion();
    }
}