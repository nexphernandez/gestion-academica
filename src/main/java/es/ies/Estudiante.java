package es.ies;

public class Estudiante extends Persona{
    private String matricula;

    public Estudiante(){
        super();
    }

    public Estudiante(String nombre, String id,String matricula){
        super(id, nombre);
        this.matricula = matricula;
    }
}
