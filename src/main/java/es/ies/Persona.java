package es.ies;
import java.util.Objects;
/**
 * @author nexphernandez
 * @version 1.0.0
 */
public abstract class Persona {
    private String id;
    private String nombre;

    /**
     * Constructor por defecto
     */
    protected Persona(){}

    /**
     * Constructor con la clave primaria
     * @param id de la persona
     */
    protected Persona(String id){
        this.id = id;
    }

    /**
     * Constructor con los atributos de la clase
     * @param id de la persona
     * @param nombre de la persona
     */
    protected Persona(String id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Funcion que saluda
     * @return String con mensaje
     */
    public String saludar(){
        return "Hola yo soy" + nombre;
    }

    /**
     * Metodo equals de la clase persona
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return Objects.equals(id, persona.id);
    }

    /**
     * Metodo hashCode de la clase persona
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }

    /**
     * Metodo toString de la clase persona
     */
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            "}";
    }

}
