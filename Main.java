import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal para ejecutar el programa.
 */
public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new PersonaComun("Laura", 28, "Calle Falsa 123"));
        personas.add(new Estudiante("Carlos", 20, "Cra 45", "Ingeniería"));
        personas.add(new Profesor("Diana", 40, "Av. Siempre Viva", "Matemáticas"));

        try {
            RegistroHandler.serializar(personas, "personas.ser");
            List<Persona> personasLeidas = RegistroHandler.deserializar("personas.ser");

            for (Persona persona : personasLeidas) {
                System.out.println(persona);
                if (persona instanceof Deberes deber) {
                    deber.mostrarRol();
                }
            }

            RegistroHandler.escribirEnTexto(personasLeidas, "personas.txt");
            RegistroHandler.leerDesdeTexto("personas.txt");

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}