package herencia;

public class MainEjercicio8 {

    public static void main(String[] args) {

        // ===============================
        // EJERCICIO 8
        // ===============================

        //Como use herencia:
        //Hice una clase Figura con un metodo calcularArea().
        //Luego hice Rectangulo y Circulo que heredan de Figura.

        //Metodos que cambie:
        //Cambie el metodo calcularArea() en cada clase
        //para que calcule el area segun la figura.

        //Pruebas que hice:
        //Cree un rectangulo y un circulo y calcule sus areas
        //para ver si dan bien los resultados.

        Rectangulo rect = new Rectangulo(6, 4);
        Circulo circ = new Circulo(5);

        System.out.println("Area rectangulo: " + rect.calcularArea());
        System.out.println("Area circulo: " + circ.calcularArea());
    }
}