package es.ies;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class Biblioteca {
    private String nombre;
    private List<Libro>libros;

    /**
     * Constructor por defecto
     */
    public Biblioteca() {
    }

    /**
     * Constructor de los atributos de la clase
     * @param nombre de la biblioteca
     * @param libros de la biblioteca
     */
    public Biblioteca(String nombre, List<Libro> libros) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return this.libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Funcion para registrar libros
     * @return true/false
     */
    public boolean registrarLibros(){
        return true;
    }

    /**
     * Metodo equals de la clase
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Biblioteca)) {
            return false;
        }
        Biblioteca biblioteca = (Biblioteca) o;
        return Objects.equals(nombre, biblioteca.nombre);
    }

    /**
     * Metodo hashcode de la clase
     */
    @Override
    public int hashCode() {
        return Objects.hash(nombre, libros);
    }

    /**
     * Metodo toString de la clase
     */
    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", libros='" + getLibros() + "'" +
            "}";
    }

}
