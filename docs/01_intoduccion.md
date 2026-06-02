# Introducción al Lenguaje

## ¿Qué es JAVA?

Java es un lenguaje de programación de propósito general\, concurrente\, orientado a objetos\, compilado\, multi hilo.

Permiten que los desarrolladores de aplicaciones escriban el programa una vez y lo ejecuten en cualquier dispositivo (conocido en inglés como WORA\, o "write once\, run anywhere").

![imagen](assets/Programacion%20JAVA_1.png)

## ¿Por qué JAVA?

- El código compilado (bytecode) es ejecutado en una máquina virtual (JVM)
- JAVA es un lenguaje compilado, esto lo hace rápido y seguro para cualquier tipo de aplicación.
- Si deseas entrar al desarrollo móvil, debes saber JAVA.

## Proceso de compilación y ejecución

### Archivo `.java`

Creamos nuestro archivo fuente en un editor\, como Netbeans

### Compilación

Nuestro archivo fuente `.java` pasa por el compilador\, se verifica y si es correcto se compila. Generando un archivo  de tipo __ByteCode__

### JAVA VIRTUAL MACHINE

Para poder ejecutar nuestro programa\, se toma el archivo  **ByteCode**\, el cual es pasado a la JVM\, la cual interpreta el archivo compilado.

## Nuestro primer “Hola mundo”

![imagen](assets/Programacion%20JAVA_2.png)

### Proceso de compilación en terminal

Se abre la terminal y se ejecuta el compilador `javac` y posteriormente se ejecuta la Java Virtual Machine (*JVM*)

```bash
javac   nombreArchivo.java  	# compilación
java   nombreArchivo 		# ejecución de programa
```

![imagen](assets/Programacion%20JAVA_3.png)

### Programa en JAVA

![imagen](assets/Programacion%20JAVA_4.png)


## Nombrar archivos (Clases)

**Debe comenzar con Mayúscula, de lo contrario será con minúscula, ejemplo: `HolaMundo.java`**

### Sólo puede contener

- Letras (A,B,C...Z)
- Números (0,1,2,...9)
- Guion bajo (_)
- Signo de peso ($)

### No puede

- Comenzar con número
- Tener espacios
- Tener acentos 
- Sensible a mayúsculas y minúsculas

