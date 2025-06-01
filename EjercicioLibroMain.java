import java.util.LinkedHashSet;

public class EjercicioLibroMain {
    public static void main(String[] args) {
        LinkedHashSet<Libro> libros = new LinkedHashSet<>();

        libros.add(new Libro("1", "El Alquimista", "1ra", "Paulo Coelho"));
        libros.add(new Libro("2", "Cien Años de Soledad", "1ra", "Gabriel García Márquez"));
        libros.add(new Libro("3", "Don Quijote", "2da", "Miguel de Cervantes"));

        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}