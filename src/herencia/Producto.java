package herencia;

// CLASE PADRE
public class Producto {

    protected String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar() {
        System.out.println("Producto: " + nombre);
    }
}