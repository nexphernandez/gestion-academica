package es.ies;
import java.util.Objects;

/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class Profesor extends Persona{
    private String especialidad;

    /**
     * Constructor por defecto
     */
    public Profesor(){}

    /**
     * Contructor con la clave primaria
     * @param id del profesor
     */
    public Profesor(String id){
        super(id);
    }    

    /**
     * Constructor de los atributos de la clase
     * @param id del profesor
     * @param nombre del profesor
     * @param especialidad del rofesor
     */
    public Profesor(String id, String nombre, String especialidad){
        super(id, nombre);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Metodo equals de la clase persona
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Profesor)) {
            return false;
        }
        Profesor profesor = (Profesor) o;
        return Objects.equals(especialidad, profesor.especialidad);
    }

    /**
     * Metodo hashcode de la clase persona
     */
    @Override
    public int hashCode() {
        return Objects.hash(especialidad);
    }

    /**
     * Metodo toString de la clase persona
     */
    @Override
    public String toString() {
        return "{" +
            " especialidad='" + getEspecialidad() + "'" +
            "}";
    }

}
