package herencia;

//CLASE PADRE
public class Persona {
	
	    // Atributos protegidos (acceso para clases hijas)
	    protected String nombre;
	    protected int edad;

	    // Constructor
	    public Persona(String nombre, int edad) {
	        this.nombre = nombre;
	        this.edad = edad;
	    }

	    // Método mostrar
	    public void mostrar() {
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Edad: " + edad);
	    }
	}