package herencia;

public class MainEjercicio7 {

    public static void main(String[] args) {

        // ===============================
        // EJERCICIO 7
        // ===============================

        //Como use herencia:
        //Hice una clase Vehiculo con marca y velocidad.
        //Luego hice Moto que hereda de Vehiculo y le agregue la cilindrada.

        //Metodos que cambie:
        //Cambie el metodo mostrarInfo() para que tambien muestre la cilindrada.

        //Pruebas que hice:
        //Cree una moto y use mostrarInfo()
        //para ver que muestre todos los datos.

        Moto moto = new Moto("Yamaha", 120, 150);

        moto.mostrarInfo();
    }
}