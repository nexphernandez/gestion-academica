package es.ies;
import java.util.Objects;
/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class Libro {
    private String autor;
    private String titulo;

    /**
     * constructor de por defecto
     */
    public Libro() {
    }

    
    public Libro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Libro autor(String autor) {
        setAutor(autor);
        return this;
    }

    public Libro titulo(String titulo) {
        setTitulo(titulo);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Libro)) {
            return false;
        }
        Libro libro = (Libro) o;
        return Objects.equals(autor, libro.autor) && Objects.equals(titulo, libro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autor, titulo);
    }

    @Override
    public String toString() {
        return "{" +
            " autor='" + getAutor() + "'" +
            ", titulo='" + getTitulo() + "'" +
            "}";
    }
    
}
