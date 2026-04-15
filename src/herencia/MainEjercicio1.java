package herencia;

public class MainEjercicio1 {

	public static void main(String[] args) {

		        // ===============================
		        // EJERCICIO 1
		        // ===============================

		        
		        //Como use herencia:
		        //Hice una clase Persona que tiene nombre y edad.
		        //Luego hice Docente y Estudiante que heredan de Persona, asi no repito codigo.

		        //Metodos que cambie:
		        //Cambie el metodo mostrar() en las clases hijas para que tambien muestren especialidad y carnet.

		        //Pruebas que hice:
		        //Cree un docente y un estudiante y use mostrar()
		        //para ver si todo funciona bien.
		        

		        Docente docente = new Docente("Roberto", 40, "Matematica");
		        Estudiante estudiante = new Estudiante("Carmen", 20, "2025001");

		        docente.mostrar();
		        System.out.println("-------------------");
		        estudiante.mostrar();
		    }
	}