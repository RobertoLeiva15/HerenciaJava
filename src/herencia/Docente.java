package herencia;

//CLASE HIJA
public class Docente extends Persona {

	    private String especialidad;

	    // Constructor usando super
	    public Docente(String nombre, int edad, String especialidad) {
	        super(nombre, edad);
	        this.especialidad = especialidad;
	    }

	    // Sobrescritura del método
	    @Override
	    public void mostrar() {
	        super.mostrar(); // reutiliza código
	        System.out.println("Especialidad: " + especialidad);
	    }
	}