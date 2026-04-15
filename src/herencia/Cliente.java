package herencia;

// CLASE CLIENTE
public class Cliente {

    private String nombre;
    private String nit;

    public Cliente(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
    }

    // getters (encapsulamiento)
    public String getNombre() {
        return nombre;
    }

    public String getNit() {
        return nit;
    }
}