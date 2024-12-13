package es.ies;

import java.sql.Date;
import java.util.Objects;
/**
 * @author nexphernandez
 * @version 1.0.0
 */

public class Examenes {
    private Date fecha;

    /**
     * Constructor por defecto
     */
    public Examenes() {
    }

    /**
     * Cosntructor de los atributos de la clase
     * @param fecha de los examenes
     */
    public Examenes(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Funcion para programar un examen
     * @return true/false
     */
    public boolean programar(){
        return true;
    }

    /**
     * Metodo equals de la clase
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Examenes)) {
            return false;
        }
        Examenes examenes = (Examenes) o;
        return Objects.equals(fecha, examenes.fecha);
    }

    /**
     * Metodo hashCode de la clase
     */
    @Override
    public int hashCode() {
        return Objects.hash(fecha);
    }

    /**
     * Metodo toString de la clase
     */
    @Override
    public String toString() {
        return "{" +
            " fecha='" + getFecha() + "'" +
            "}";
    }
    
}
