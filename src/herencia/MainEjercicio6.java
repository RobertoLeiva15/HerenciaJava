package herencia;

public class MainEjercicio6 {

    public static void main(String[] args) {

        // ===============================
        // EJERCICIO 6
        // ===============================

        //Como use herencia:
        //Hice una clase Animal con un metodo de sonido.
        //Luego hice Perro que hereda de Animal.

        //Metodos que cambie:
        //Cambie el metodo hacerSonido() para que el perro ladre.

        //Pruebas que hice:
        //Cree un perro y llame al metodo hacerSonido()
        //para ver que cambie el sonido.

        Perro perro = new Perro();

        perro.hacerSonido();
    }
}