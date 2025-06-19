# Proyecto Java: Persistencia con Herencia, Interfaces y Serialización

Este proyecto demuestra cómo aplicar los principios de programación orientada a objetos en Java —como herencia, clases abstractas, interfaces e implementación de la interfaz `Serializable`— para lograr la **persistencia de datos** mediante **serialización binaria** y manejo de **archivos de texto**.

## 📌 Objetivo

Implementar un sistema que almacene, recupere y muestre información sobre distintos tipos de personas (`PersonaComun`, `Estudiante`, `Profesor`) usando buenas prácticas de programación y persistencia.

## 🧩 Estructura del Proyecto


## 🔁 Persistencia de Datos

Este proyecto realiza dos tipos de persistencia:

1. **Serialización binaria** (`personas.ser`):
   - Guarda objetos como flujo de bytes usando `ObjectOutputStream`
   - Se pueden recuperar con `ObjectInputStream`

2. **Archivo de texto** (`personas.txt`):
   - Guarda una representación legible del objeto con `BufferedWriter`
   - Se puede leer línea por línea con `BufferedReader`

## 💡 Interfaz `Deberes`

```java
public interface Deberes {
    void mostrarRol();
}

