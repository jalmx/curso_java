# Variables en JAVA

## ¿Qué es una variable?

Una variable desde el punto de vista computacional, es un espacio en memoria con un nombre, es decir, un espacio determinado al momento de declarar la variable, se indica su tipo y cada tipo tiene cierto espacio en memoria. 

> Es un espacio virtual el cual quedará registrado en la memoria; el cual se podrá llamar en diferentes puntos de la programación cuantas veces la necesitemos. A este espacio se le da un nombre que nos indique para qué ha sido creada. Las variables pueden tomar cualquier tipo de valor

!!! example "Variables"

    ```java
    int edad = 20; //Variable que almacena un numero, la edad
    double altura = 1.7;
    char letra = 'a';
    String nombre = "Aprendiendo programación"; //Variable que almacena una frase (String)
    boolean isAlive = true //Variable que almacena un valor booleano
    ```

## Qué es declarar una variable?

**La declaración de una variable es reservar un espacio en memoria de la computadora**.
La computadora tiene cierta cantidad de memoria, la cual es repartida entre todos los programas y los propios procesos para ejecutar el sistema operativo. Cuando ejecutamos un programa, éste comienza reservar memoria para poder trabajar.

Entonces, al declarar variables estamos consumiendo memoria, la cual vamos a utilizar en algún momento, si estamos reservando el espacio significa que en algún otro momento necesitamos recuperar lo que hemos guardado para realizar otra operación, de lo contrario no necesitamos reservar memoria si el valor solo será utilizado una única vez.

## ¿Cómo nombrar una variable?

Dentro de la programación existen **buenas practicas** para declarar variables. Estas reglas se definen a lo largo del tiempo que ha evolucionado. Estas son las reglas genéricas para (casi) todos lenguajes. 

- Deben comenzar en minúscula
- Se escriben en minúsculas, las variantes se dan cuando son más de dos palabras.
- Solo puede contener números después de la primera letra.
- Sensibles a minúsculas y mayúsculas; es decir, si declaro una variable llamada `variable1` y otra llamada `Variable1`, para la computadora son variables o espacios de memoria distintos, aun que suenen igual, con el solo hecho de cambiar una letra, ya estamos hablando de una variable distinta.
- No pueden contener espacios entre letras o palabras
- No puede comenzar con números o símbolos
- No puede contener caracteres especiales, todos son caracteres especiales menos el abecedario ingles. Ejemplo: `!"·%&-+/()=?¿...`, los únicos símbolos permitidos son `$` y `_`.
- **El nombre debe ser descriptivo**; es decir, con solo leerlo podemos deducir qué hace o para qué fue declarada
- *(Regla especial):* Todo de escribe en ingles.
- *(Regla especial)*: Si se desea escribir una variable combinando dos palabras o más, se hace comenzando la siguiente palabra con mayuscula y todo pegado, a esto se le conoce como la convención `CamelCase`.
- Ejemplos:
    - `valor`
    - `valor1`
    - `valorUno`
    - `variableNueva`

## Tipos de datos

En Java existen dos grandes categorías de tipos de datos **primitivos** vs **objetos**:

### Tipos de datos primitivos

Son los tipos básicos que almacena directamente la variable.

#### Numéricos enteros

* `byte`
* `short`
* `int`
* `long`

##### Numéricos decimales

* `float`
* `double`

##### Texto y caracteres

* `char`
* `String` (objeto)

#### Lógicos

* `boolean`

### Tipos primitivos

| Tipo      | Tamaño       | Rango aproximado | Ejemplo                         |
| --------- | ------------ | ---------------- | ------------------------------- |
| `byte`    | 8 bits       | -128 a 127       | `byte edad = 25;`               |
| `short`   | 16 bits      | -32,768 a 32,767 | `short cantidad = 1000;`        |
| `int`     | 32 bits      | -2³¹ a 2³¹-1     | `int numero = 50000;`           |
| `long`    | 64 bits      | -2⁶³ a 2⁶³-1     | `long poblacion = 8000000000L;` |
| `float`   | 32 bits      | ±3.4E38          | `float precio = 19.99f;`        |
| `double`  | 64 bits      | ±1.7E308         | `double pi = 3.14159265359;`    |
| `char`    | 16 bits      | Carácter Unicode | `char letra = 'A';`             |
| `boolean` | 1 bit lógico | `true` o `false` | `boolean activo = true;`        |

### Ejemplo

```java
byte b = 10;
short s = 1000;
int i = 50000;
long l = 1000000L;

float f = 3.14f;
double d = 3.14159265359;

char c = 'J';
boolean bandera = true;
```

### Tipos de datos de referencia (objetos)

No almacenan el valor directamente, sino una referencia a un objeto en memoria.

### String

```java
String nombre = "Java";
```

### Arreglos (Arrays)

```java
int[] numeros = {1, 2, 3, 4, 5};
```

### Clases

```java
class Persona {
    String nombre;
}

Persona p = new Persona();
```

### Interfaces

```java
Runnable tarea;
```

### Enumeraciones (Enum)

```java
enum Dia {
    LUNES, MARTES, MIERCOLES
}

Dia hoy = Dia.LUNES;
```

### Colecciones

```java
import java.util.ArrayList;

ArrayList<String> nombres = new ArrayList<>();
```

### Referencia

* Clases
* Interfaces
* Arrays
* Enums
* Colecciones (`ArrayList`, `HashMap`, etc.)

## Comentarios

Siempre que escribimos un código queremos colocar un comentario con respecto a lo que hace el programa o dejarnos una nota para nuestro yo del futuro, obviamente estos comentarios no le interesa al compilador o al programa, es para nosotros.

Hay dos maneras de indicar un comentario, que son comentarios en línea o multilínea

### Comentarios de una sola línea

La forma de indicar un comentario de una línea es usando doble diagonal hacia adelante (`//`).

```c
// comentario de una línea
int edad = 3; // //en esta variable guardo el valor de 3
``` 

Todo lo que se escribe delante de `//` el compilador lo comienza a tomar como comentario, aun asi tenga código correcto y propio del lenguaje, dado que al saber que es un comentario lo va a ignorar.

### Comentarios multilínea

La forma de indicar un comentario multi línea es envolverlo con una diagonal con un asterisco y cierra con un asterisco y una diagonal (`/**/`).

Una de las ventajas es que se puede colocar codigo en cualquier parte sin ser parte del codigo.

```c
/*
* En esta sección se toma como un bloque de comentario
* Todo lo que esta escrito el compilador lo ignora porque 
* es una indicación para nosotros
*/

int valor = 5; /*también se puede ocupar como de una línea, lo importante es que este envuelto entre los símbolos correspondientes*/

float /*tipo de variable*/ altura /*nombre de variable*/ = 1.782; 
``` 

--- 
<!-- TODO: se movera al tema correspondiente -->
## Clase envolvente (Wrapper Class)

Estas clases permiten usar los valores primitivos dentro de colecciones y aprovechar métodos adicionales.


| Primitivo | Wrapper     |
| --------- | ----------- |
| `byte`    | `Byte`      |
| `short`   | `Short`     |
| `int`     | `Integer`   |
| `long`    | `Long`      |
| `float`   | `Float`     |
| `double`  | `Double`    |
| `char`    | `Character` |
| `boolean` | `Boolean`   |

Ejemplo:

```java
Integer numero = 10;
Double precio = 99.99;
Boolean activo = true;
```

