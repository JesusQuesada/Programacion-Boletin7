
package boletin7_1;

public class Boletin7_1 {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.setTitulo("El Quijote");
        libro1.setAutor("Cervantes");
        libro1.setNumLibros(10);
        libro1.setNumPrest(2);
        libro1.toString();
        libro1.prestamoLibro(libro1,20);
        libro1.toString();
        libro1.devolucionLibro(libro1,5);
        libro1.toString();
    }
    
}
