# Concatenación

La **concatenación** es el proceso de unir dos o más valores para formar una sola cadena de texto (`String`).

En Java, la concatenación se realiza principalmente mediante el operador `+`.



## Operador de concatenación (`+`)

Cuando uno de los operandos es una cadena de texto (`String`), el operador `+` une ambos valores.

```java id="4i6f7q"
String nombre = "Juan";
String apellido = "Pérez";

String nombreCompleto = nombre + " " + apellido;

System.out.println(nombreCompleto);
```

**Salida:**

```text id="1ix2zh"
Juan Pérez
```



## Concatenar texto y variables

Es muy común combinar texto con el contenido de variables.

```java id="9tnl4r"
String nombre = "Ana";
int edad = 25;

System.out.println("Nombre: " + nombre);
System.out.println("Edad: " + edad);
```

**Salida:**

```text id="fsyq1h"
Nombre: Ana
Edad: 25
```



## Concatenar diferentes tipos de datos

Java convierte automáticamente los valores a texto cuando se concatenan con una cadena.

```java id="ohs4ps"
String producto = "Laptop";
double precio = 15999.99;
boolean disponible = true;

System.out.println("Producto: " + producto);
System.out.println("Precio: $" + precio);
System.out.println("Disponible: " + disponible);
```

**Salida:**

```text id="z3m8a0"
Producto: Laptop
Precio: $15999.99
Disponible: true
```



## Concatenación y operaciones matemáticas

Hay que tener cuidado con el orden de evaluación.

```java id="e2z2qf"
System.out.println("Resultado: " + 5 + 3);
```

**Salida:**

```text id="4oqqx5"
Resultado: 53
```

Java concatena de izquierda a derecha:

1. `"Resultado: " + 5` → `"Resultado: 5"`
2. `"Resultado: 5" + 3` → `"Resultado: 53"`

Si se desea realizar la operación matemática primero:

```java id="u5r8w6"
System.out.println("Resultado: " + (5 + 3));
```

**Salida:**

```text id="v8t5z5"
Resultado: 8
```



## Concatenación con caracteres

```java id="ewz7wq"
char inicial = 'J';

System.out.println("Inicial: " + inicial);
```

**Salida:**

```text id="10gn4f"
Inicial: J
```



## Uso de `concat()`

La clase `String` posee el método `concat()` para unir cadenas.

```java id="v33s4t"
String nombre = "Juan";
String apellido = " Pérez";

String completo = nombre.concat(apellido);

System.out.println(completo);
```

**Salida:**

```text id="gbrq9o"
Juan Pérez
```

También puede encadenarse:

```java id="13rtlw"
String mensaje = "Hola"
                    .concat(" ")
                    .concat("Mundo");

System.out.println(mensaje);
```



## Concatenación usando `String.format()`

Permite crear cadenas con formato.

```java id="3ocp8r"
String nombre = "Carlos";
int edad = 30;

String mensaje = String.format(
    "Nombre: %s, Edad: %d",
    nombre,
    edad
);

System.out.println(mensaje);
```

**Salida:**

```text id="6wfy2n"
Nombre: Carlos, Edad: 30
```



## Concatenación eficiente con `StringBuilder`

Cuando se realizan muchas concatenaciones dentro de ciclos o procesos repetitivos, es recomendable utilizar `StringBuilder`.

```java id="fg2x3p"
StringBuilder texto = new StringBuilder();

texto.append("Hola");
texto.append(" ");
texto.append("Mundo");

System.out.println(texto);
```

**Salida:**

```text id="hgvz1y"
Hola Mundo
```

#### Ejemplo con ciclo

```java id="i1k8dr"
StringBuilder numeros = new StringBuilder();

for (int i = 1; i <= 5; i++) {
    numeros.append(i).append(" ");
}

System.out.println(numeros);
```

**Salida:**

```text id="yz8qej"
1 2 3 4 5
```



## Ejemplos prácticos

### Crear un nombre completo

```java id="m30c4w"
String nombre = "Juan";
String apellido = "Mendez";

String completo = nombre + " " + apellido;

System.out.println(completo);
```



### Mostrar información de un usuario

```java id="i1mhtj"
String nombre = "Laura";
int edad = 22;
String carrera = "Ingeniería";

System.out.println(
    "Nombre: " + nombre +
    ", Edad: " + edad +
    ", Carrera: " + carrera
);
```
