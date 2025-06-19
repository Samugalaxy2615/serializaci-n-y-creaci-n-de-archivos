/**
 * Clase que representa a un profesor.
 */
public class Profesor extends Persona implements Deberes {
    private static final long serialVersionUID = 1L;

    private String asignatura;

    public Profesor(String nombre, int edad, String direccion, String asignatura) {
        super(nombre, edad, direccion);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public void mostrarRol() {
        System.out.println(nombre + " es profesor de " + asignatura + ".");
    }

    @Override
    public String toString() {
        return super.toString() + ", asignatura='" + asignatura + "'";
    }
}