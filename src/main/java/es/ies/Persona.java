package es.ies;

public abstract class Persona {
    private String id;
    private String nombre;

    /**
     * Constructor por defecto
     */
    public Persona(){}

    /**
     * Constructor con los atributos de la clase
     * @param id de la persona
     * @param nombre de la persona
     */
    public Persona(String id, String nombre){
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

}
