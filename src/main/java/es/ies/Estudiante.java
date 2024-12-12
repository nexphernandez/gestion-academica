package es.ies;
import java.util.Objects;
/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class Estudiante extends Persona{
    private String matricula;

    /**
     * constructor por defecto
     */
    public Estudiante(){
        super();
    }

    /**
     * Constructor con la clave primaria
     * @param matricula del estudiante
     */
    public Estudiante(String matricula){
        this.matricula = matricula;
    }

    /**
     * Constructor de los atributos de la clase
     * @param nombre del estudiante
     * @param id del estudiante
     * @param matricula del estudiante
     */
    public Estudiante(String nombre, String id,String matricula){
        super(id, nombre);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Funcion que dice que un estuidante esta estudiando
     * @return String con la respuesta
     */
    public String estudiar(){
        return "Estoy estudiando";
    }

    /**
     * Metodo equals de la clase estudiante.
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Estudiante)) {
            return false;
        }
        Estudiante estudiante = (Estudiante) o;
        return Objects.equals(matricula, estudiante.matricula);
    }

    /**
     * Metodo hashcode de la clase estudiante
     */
    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    /**
     * Metodo toString de la clase estudiante
     */
    @Override
    public String toString() {
        return "{" +
            " matricula='" + getMatricula() + "'" +
            "}";
    }

}
