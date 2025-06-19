/**
 * Clase que representa a un estudiante.
 */
public class Estudiante extends Persona implements Deberes {
    private static final long serialVersionUID = 1L;

    private String carrera;

    public Estudiante(String nombre, int edad, String direccion, String carrera) {
        super(nombre, edad, direccion);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public void mostrarRol() {
        System.out.println(nombre + " es un estudiante de " + carrera + ".");
    }

    @Override
    public String toString() {
        return super.toString() + ", carrera='" + carrera + "'";
    }
}