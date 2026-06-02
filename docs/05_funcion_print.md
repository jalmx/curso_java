# Salida de datos. Función *print*

En Java, `print()` se utiliza para mostrar información en la consola. Pertenece principalmente al objeto `System.out`.

Muestra el texto **sin saltar a la siguiente línea**.

```java
System.out.print("Hola");
System.out.print(" Mundo");
```

**Salida:**

```
Hola Mundo
```



## `System.out.println()`

Muestra el texto y **agrega un salto de línea al final**.

```java
System.out.println("Hola");
System.out.println("Mundo");
```

**Salida:**

```
Hola
Mundo
```



## `System.out.printf()`

Permite imprimir texto con formato, similar a C.

```java
String nombre = "Alejandro";
int edad = 30;

System.out.printf("Nombre: %s, Edad: %d\n", nombre, edad);
```

**Salida:**

```
Nombre: Alejandro, Edad: 30
```

### Especificadores de formato

| Especificador | Tipo |
| ------------- ||
| `%s`          | String                      |
| `%d`          | Entero (`int`)              |
| `%f`          | Decimal (`float`, `double`) |
| `%c`          | Carácter                    |
| `%b`          | Boolean                     |

Ejemplo:

```java
double precio = 19.95;

System.out.printf("Precio: %.2f\n", precio);
```

**Salida:**

```
Precio: 19.95
```

`%.2f` significa mostrar 2 decimales.



## `System.out.format()`

Es prácticamente igual a `printf()`.

```java
System.out.format("Valor: %d%n", 100);
```

**Salida:**

```
Valor: 100
```



## Concatenación con `print` y `println`

```java
String nombre = "Ana";
int edad = 25;

System.out.println("Nombre: " + nombre + ", Edad: " + edad);
```

**Salida:**

```
Nombre: Ana, Edad: 25
```



## Imprimir variables

```java
int x = 10;
double y = 3.14;
boolean activo = true;

System.out.println(x);
System.out.println(y);
System.out.println(activo);
```

**Salida:**

```
10
3.14
true
```



## Comparación

| Método      | Salto de línea | Formato |
| ----------- | -------------- | ------- |
| `print()`   | ❌ No           | ❌ No    |
| `println()` | ✅ Sí           | ❌ No    |
| `printf()`  | Depende (`\n`) | ✅ Sí    |
| `format()`  | Depende (`\n`) | ✅ Sí    |

### Ejemplo

```java
public class EjemploPrint {
    public static void main(String[] args) {

        System.out.print("Hola ");
        System.out.print("Java");

        System.out.println();

        System.out.println("Nueva línea");

        String nombre = "Alejandro";
        int edad = 30;

        System.out.printf("Nombre: %s, Edad: %d%n", nombre, edad);

        double salario = 12345.6789;
        System.out.printf("Salario: %.2f%n", salario);
    }
}
```

**Salida:**

```
Hola Java
Nueva línea
Nombre: Alejandro, Edad: 30
Salario: 12345.68
```
## Secuencias de escape

Las **secuencias de escape** son combinaciones de caracteres que comienzan con una barra invertida (`\`) y permiten representar caracteres especiales dentro de cadenas de texto (`String`) o caracteres (`char`).

Por ejemplo, si queremos mostrar comillas dobles dentro de un texto, Java podría confundirlas con el final de la cadena. Para solucionar esto usamos una secuencia de escape.

```java
System.out.println("Mi nombre es \"Juan\"");
```

**Salida:**

```text
Mi nombre es "Juan"
```



### Secuencias de escape más utilizadas

| Secuencia | Descripción                 |
|  |  |
| `\n`      | Salto de línea              |
| `\t`      | Tabulación horizontal       |
| `\"`      | Comilla doble               |
| `\'`      | Comilla simple              |
| `\\`      | Barra invertida (`\`)       |
| `\b`      | Retroceso (Backspace)       |
| `\r`      | Retorno de carro            |
| `\f`      | Salto de página (Form Feed) |



### Salto de línea (`\n`)

Permite continuar la impresión en una nueva línea.

```java
System.out.println("Hola\nMundo");
```

**Salida:**

```text
Hola
Mundo
```



### Tabulación (`\t`)

Inserta un espacio de tabulación.

```java
System.out.println("Nombre\tEdad");
System.out.println("Ana\t20");
```

**Salida:**

```text
Nombre  Edad
Ana     20
```



### Comillas dobles (`\"`)

Permite imprimir comillas dentro de una cadena.

```java
System.out.println("Ella dijo: \"Hola\"");
```

**Salida:**

```text
Ella dijo: "Hola"
```



### Comilla simple (`\'`)

Se utiliza principalmente dentro de caracteres o cadenas.

```java
System.out.println("No te preocupes, estoy bien");
System.out.println("El carácter es: '\''");
```

**Salida:**

```text
No te preocupes, estoy bien
El carácter es: '
```



### Barra invertida (`\\`)

Para mostrar una barra invertida es necesario escribir dos.

```java
System.out.println("C:\\Usuarios\\Josef\\Documentos");
```

**Salida:**

```text
C:\Usuarios\Josef\Documentos
```



### Retroceso (`\b`)

Elimina el carácter anterior al mostrarse.

```java
System.out.println("Holaa\b");
```

**Salida aproximada:**

```text
Hola
```

> El comportamiento puede variar según la consola utilizada.



### Retorno de carro (`\r`)

Regresa el cursor al inicio de la línea actual.

```java
System.out.print("Hola");
System.out.print("\rAdiós");
```

**Salida habitual:**

```text
Adiós
```



### Salto de página (`\f`)

Representa un salto de página. Actualmente tiene poco uso en consolas modernas.

```java
System.out.println("Página 1\fPágina 2");
```



### Ejemplo completo

```java
public class SecuenciasEscape {

    public static void main(String[] args) {

        System.out.println("=== Ejemplos de secuencias de escape ===");

        System.out.println("Salto de línea:\nHola\nMundo");

        System.out.println("\nTabulación:");
        System.out.println("Nombre\tEdad");

        System.out.println("\nComillas:");
        System.out.println("\"Java\" es un lenguaje de programación.");

        System.out.println("\nBarra invertida:");
        System.out.println("C:\\Archivos\\Java");

        System.out.println("\nComilla simple:");
        System.out.println("Carácter: '\''");
    }
}
```

**Salida:**

```text
=== Ejemplos de secuencias de escape ===
Salto de línea:
Hola
Mundo

Tabulación:
Nombre  Edad

Comillas:
"Java" es un lenguaje de programación.

Barra invertida:
C:\Archivos\Java

Comilla simple:
Carácter: '
```