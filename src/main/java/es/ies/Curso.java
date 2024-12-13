package es.ies;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class Curso {
    private String nombre;
    private int codigo;
    private List<Estudiante> estudiantes;

    /**
     * Constructor por defecto
     */
    public Curso() {}

    /**
     * Constructor con el atributo principal
     * @param codigo del curso
     */
    public Curso(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Constructor de los atributos de la clase
     * @param nombre del curso
     * @param codigo del curso
     * @param estudiantes del curso
     */
    public Curso(String nombre, int codigo, List<Estudiante> estudiantes) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Estudiante> getEstudiantes() {
        return this.estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    /**
     * Funcion para agregar estudiantes al curso
     * @param lista donde agregar los estudiantes
     * @param estudiante a agregar
     * @return true/false
     */
    public boolean agregarEstudiante(List<Estudiante> lista, Estudiante estudiante){
        return true;
    }

    /**
     * Funcion para listar estudiantes
     * @param lista de estudiantes
     * @return string
     */
    public String listarEstudiante(List<Estudiante>lista){
        return "Soy un estudiante";
    }

    /**
     * Metodo equals de la clase
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Curso)) {
            return false;
        }
        Curso curso = (Curso) o;
        return codigo == curso.codigo;
    }

    /**
     * Funcion hashcode de la clase
     */
    @Override
    public int hashCode() {
        return Objects.hash(nombre, codigo, estudiantes);
    }

    /**
     * Metodo toString de la clase
     */
    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", codigo='" + getCodigo() + "'" +
            ", estudiantes='" + getEstudiantes() + "'" +
            "}";
    }
    
}
