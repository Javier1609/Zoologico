package visitantes;
public class generador_inf {
    private String nombre;
    private String habitat;
    private String descripcion;

    public void Generador_inf(String nombre, String habitat, String descripcion) {
        this.nombre = nombre;
        this.habitat = habitat;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
