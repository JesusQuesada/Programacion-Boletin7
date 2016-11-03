
package boletin7_1;

public class Libro {
    private String titulo, autor;
    int numLibros, numPrest;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numLibros, int numPrest) {
        this.titulo = titulo;
        this.autor = autor;
        this.numLibros = numLibros;
        this.numPrest = numPrest;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumLibros() {
        return numLibros;
    }

    public int getNumPrest() {
        return numPrest;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumLibros(int numLibros) {
        this.numLibros = numLibros;
    }

    public void setNumPrest(int numPrest) {
        this.numPrest = numPrest;
    }
    
 
    public void prestamoLibro(Libro lib, int prestamo){
        
        if (numLibros > prestamo){
            lib.setNumPrest(lib.getNumPrest()+prestamo);
            System.out.println("True ");
        }
        else
            System.out.println("False ");
        }
    public void devolucionLibro(Libro lib, int devolucion){
        if (numPrest > devolucion){
            lib.setNumPrest(lib.getNumPrest()-devolucion);
            System.out.println("True ");
        }
        else
            System.out.println("False ");
        }

    @Override
    public String toString() {
        return "número libros= " + numLibros + "\nLibros prestados = " + numPrest;
    }
        
}
 

