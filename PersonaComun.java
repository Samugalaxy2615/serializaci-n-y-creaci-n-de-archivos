/**
 * Clase que representa a una persona común y corriente.
 */
public class PersonaComun extends Persona implements Deberes {
    private static final long serialVersionUID = 1L;

    public PersonaComun(String nombre, int edad, String direccion) {
        super(nombre, edad, direccion);
    }

    @Override
    public void mostrarRol() {
        System.out.println(nombre + " es una persona común.");
    }
}