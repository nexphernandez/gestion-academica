package es.ies;
import java.util.Objects;
/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class Materia {
    private String nombre;
    private String codigo;

    /**
     * Constructor por defecto
     */
    public Materia() {}
    
    /**
     * Constructor del atributo clave
     * @param codigo de la materia
     */
    public Materia(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Constructor de los atributos de la clase
     * @param nombre de la materia
     * @param codigo de la materia
     */
    public Materia(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Metodo equals de la clase
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Materia)) {
            return false;
        }
        Materia materia = (Materia) o;
        return Objects.equals(codigo, materia.codigo);
    }

    /**
     * Metodo hashCode de la clase
     */
    @Override
    public int hashCode() {
        return Objects.hash(nombre, codigo);
    }

    /**
     * Metodo hasCode de la clase
     */
    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", codigo='" + getCodigo() + "'" +
            "}";
    }
    
}
