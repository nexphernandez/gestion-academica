package es.ies;

public class Profesor extends Persona{
    private String especialidad;

    public Profesor(){}

    public Profesor(String id, String nombre, String especialidad){
        super(especialidad, nombre);
        this.especialidad = especialidad;
    }


}
