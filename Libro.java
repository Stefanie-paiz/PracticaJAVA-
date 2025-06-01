public class Libro {
    private String id;
    private String titulo;
    private String edicion;
    private String autor;

    public Libro(String id, String titulo, String edicion, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.edicion = edicion;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{id='" + id + "', titulo='" + titulo + "', edicion='" + edicion + "', autor='" + autor + "'}";
    }
}