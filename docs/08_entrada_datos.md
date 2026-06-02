# Leer datos de usario

La forma más común de leer datos desde el teclado es utilizando la clase `Scanner`, que pertenece al paquete `java.util`.


## La clase Scanner

Para utilizar `Scanner`, primero debemos importarla:

```java
import java.util.Scanner;
```

Luego creamos un objeto que leerá los datos desde el teclado:

```java
Scanner entrada = new Scanner(System.in);
```



## Leer una cadena de texto

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Hola " + nombre);
    }
}
```

**Ejemplo de ejecución**

```text
Ingrese su nombre: Juan
Hola Juan
```



## Leer un número entero


```java
Scanner entrada = new Scanner(System.in);

System.out.print("Ingrese su edad: ");
int edad = entrada.nextInt();

System.out.println("Edad: " + edad);
```



## Leer un número decimal

```java
Scanner entrada = new Scanner(System.in);

System.out.print("Ingrese un precio: ");
double precio = entrada.nextDouble();

System.out.println("Precio: " + precio);
```



## Leer un valor lógico

```java
Scanner entrada = new Scanner(System.in);

System.out.print("¿Es mayor de edad? (true/false): ");
boolean mayor = entrada.nextBoolean();

System.out.println("Respuesta: " + mayor);
```



## Leer una palabra

El método `next()` lee únicamente hasta encontrar un espacio.

```java
Scanner entrada = new Scanner(System.in);

System.out.print("Ingrese una palabra: ");
String palabra = entrada.next();

System.out.println("Palabra: " + palabra);
```

### Entrada

```text
Hola Mundo
```

### Salida

```text
Palabra: Hola
```



## Leer una línea completa

El método `nextLine()` permite leer toda la línea.

```java
Scanner entrada = new Scanner(System.in);

System.out.print("Ingrese su nombre completo: ");
String nombre = entrada.nextLine();

System.out.println(nombre);
```

### Entrada

```text
Juan Carlos Pérez
```

### Salida

```text
Juan Carlos Pérez
```



## Tabla de equivalencias Scanner vs scanf

| Tipo de dato            | scanf (C)   | Scanner (Java)     |
| -- | -- |  |
| Entero                  | `%d`        | `nextInt()`        |
| Decimal                 | `%f`        | `nextFloat()`      |
| Decimal doble precisión | `%lf`       | `nextDouble()`     |
| Carácter                | `%c`        | `next().charAt(0)` |
| Cadena (palabra)        | `%s`        | `next()`           |
| Línea completa          | No directo  | `nextLine()`       |
| Booleano                | No estándar | `nextBoolean()`    |



## Leer un carácter

No existe `nextChar()` en Java.

La forma habitual es:

```java
Scanner entrada = new Scanner(System.in);

System.out.print("Ingrese una letra: ");

char letra = entrada.next().charAt(0);

System.out.println("Letra: " + letra);
```

1. `next()` lee una palabra.
2. `charAt(0)` obtiene el primer carácter.



### Ejemplo

```java
import java.util.Scanner;

public class DatosUsuario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Edad: ");
        int edad = entrada.nextInt();

        System.out.print("Estatura: ");
        double estatura = entrada.nextDouble();

        System.out.print("Inicial del nombre: ");
        char inicial = entrada.next().charAt(0);

        System.out.println("\nDATOS INGRESADOS");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
        System.out.println("Inicial: " + inicial);

        entrada.close();
    }
}
```



# Cerrar Scanner

Cuando ya no se necesite la lectura de datos, es recomendable cerrar el objeto:

```java
entrada.close();
```