import java.io.*;
import java.util.List;

/**
 * Clase que maneja la serialización y lectura/escritura de archivos de texto.
 */
public class RegistroHandler {
    public static void serializar(List<Persona> personas, String archivo) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(personas);
            System.out.println("Datos serializados en " + archivo);
        }
    }

    public static List<Persona> deserializar(String archivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (List<Persona>) ois.readObject();
        }
    }

    public static void escribirEnTexto(List<Persona> personas, String archivo) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Persona persona : personas) {
                writer.write(persona.toString());
                writer.newLine();
            }
            System.out.println("Datos escritos en " + archivo);
        }
    }

    public static void leerDesdeTexto(String archivo) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            System.out.println("Contenido de " + archivo + ":");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        }
    }
}