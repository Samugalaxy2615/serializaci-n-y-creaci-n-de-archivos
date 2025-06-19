import java.io.Serializable;

/**
 * Clase abstracta que representa una persona genérica.
 */
public abstract class Persona implements Serializable {
    private static final long serialVersionUID = 1L;

    protected String nombre;
    protected int edad;
    protected String direccion;

    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "nombre='" + nombre + '-' +
                ", edad=" + edad +
                ", direccion='" + direccion + '-' +
                '}';
    }
}