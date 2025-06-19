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

## Estructura repositorio:
![image](https://github.com/user-attachments/assets/4443043a-3719-4791-9a4a-0a7e70339763)

## 📋 Resultado Esperado en Consola
Datos serializados en personas.ser
PersonaComun{nombre='Laura', edad=28, direccion='Calle Falsa 123'}
Laura es una persona común.
Estudiante{nombre='Carlos', edad=20, direccion='Cra 45'}, carrera='Ingeniería'
Carlos es un estudiante de Ingeniería.
Profesor{nombre='Diana', edad=40, direccion='Av. Siempre Viva'}, asignatura='Matemáticas'
Diana es profesor de Matemáticas.
Datos escritos en personas.txt
Contenido de personas.txt:
PersonaComun{nombre='Laura', edad=28, direccion='Calle Falsa 123'}
Estudiante{nombre='Carlos', edad=20, direccion='Cra 45'}, carrera='Ingeniería'
Profesor{nombre='Diana', edad=40, direccion='Av. Siempre Viva'}, asignatura='Matemáticas'


## ✅ Ejecucion en tiempo real 
![image](https://github.com/user-attachments/assets/fcf49b20-c00c-4561-b62c-4529ccc4888b)



