package herencia;

public class MainEjercicio9 {

    public static void main(String[] args) {

        // ===============================
        // EJERCICIO 9
        // ===============================

        //Como use herencia:
        //Hice una clase Libro con titulo y autor.
        //Luego hice LibroDigital que hereda de Libro y le agregue el tamaño.

        //Metodos que cambie:
        //Cambie el metodo mostrarInfo() para que tambien muestre el tamaño en MB.

        //Pruebas que hice:
        //Cree un libro digital y use mostrarInfo()
        //para ver todos los datos.

        LibroDigital libro = new LibroDigital("Java Basico", "Roberto Leiva", 17.5);

        libro.mostrarInfo();
    }
}