# Saludador

Aplicación de escritorio en Java 21 y JavaFX. El estudiante solicita un saludo, el sistema pide nombre, edad y hora (AM/PM) y luego saluda por nombre mencionando la edad. La hora se solicita, pero no se usa en el mensaje.

## Requisitos

- **JDK 21** instalado y disponible en el PATH (`java -version`)
- **Maven** instalado y disponible en el PATH (`mvn -version`)

## Cómo ejecutar

Desde la **raíz del proyecto** (la carpeta que contiene este `README.md` y el `pom.xml`):

```bash
mvn javafx:run
```

Se abrirá la ventana **Saludador**. Pulse **Solicitar saludo**, complete nombre, edad y hora (AM/PM) y pulse **Aceptar**.

## Estructura de carpetas

```
lab-saludo/
├── pom.xml
├── README.md
├── docs/                          # Documentación del laboratorio
├── prompts/                       # Prompts utilizados
└── src/main/java/com/lab/saludo/
    ├── App.java                   # Punto de entrada JavaFX
    ├── modelo/
    │   └── Estudiante.java
    ├── vista/
    │   ├── VistaPrincipal.java    # Botón «Solicitar saludo»
    │   └── VistaPedirDatos.java   # Formulario nombre, edad y hora
    └── controlador/
        └── SaludadorControlador.java
```
