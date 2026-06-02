# Operadores aritméticos

En esta sección veremos los operadores aritméticos básicos que podemos encontrar en Java.

| Nombre | Símbolo | Descripción |
| ------ | :-----: ||
| Agrupación       |  `()`   | Agrupa operaciones y altera la precedencia |
| Suma             |   `+`   | Realiza la suma aritmética                 |
| Resta            |   `-`   | Realiza la resta aritmética                |
| Multiplicación   |   `*`   | Realiza la multiplicación aritmética       |
| División         |   `/`   | Realiza la división aritmética             |
| Residuo o Módulo |   `%`   | Devuelve el residuo de una división        |

## Precauciones

* El único símbolo para dividir es `/`.
* El único símbolo para multiplicar es `*`.
* Los paréntesis `( )` únicamente agrupan expresiones. No multiplican.

## Ejemplo

```java
public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int valor1 = 4;
        int valor2 = 3;

        int suma = valor1 + valor2;
        int resta = valor1 - valor2;
        int multiplicacion = valor1 * valor2;
        double division = (double) valor1 / valor2;
        int modulo = valor1 % valor2;

        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("La multiplicación es " + multiplicacion);
        System.out.println("La división es " + division);
        System.out.println("El residuo es " + modulo);
    }
}
```

## Resultado

```text
La suma es 7
La resta es 1
La multiplicación es 12
La división es 1.3333333333333333
El residuo es 1
```



## Operador unitario (-)

El operador unitario negativo multiplica el valor por `-1`.

```java
public class OperadorUnitario {

    public static void main(String[] args) {

        int valor = 4;
        int inverso = -valor;

        System.out.println("valor: " + valor);
        System.out.println("valor negativo: " + inverso);
    }
}
```

### Resultado

```text
valor: 4
valor negativo: -4
```



## Operador de asignación (=)

El operador de asignación (`=`) almacena un valor dentro de una variable.

```java
int edad = 25;
String nombre = "Juan";
```

> No es lo mismo asignar que comparar. Para comparar igualdad se utiliza `==`.

Ejemplo:

```java
int a = 5;
int b = 5;

System.out.println(a == b); // true
```



## Precedencia de operadores

Java utiliza una precedencia muy similar a C y C++.

| Orden | Operador                      |     |     |
| :: | -- |  |  |
|   1   | `()`, `[]`, `.`, `x++`, `x--` |     |     |
|   2   | `++x`, `--x`, `!`, `(tipo)`   |     |     |
|   3   | `*`, `/`, `%`                 |     |     |
|   4   | `+`, `-`                      |     |     |
|   5   | `<<`, `>>`, `>>>`             |     |     |
|   6   | `<`, `<=`, `>`, `>=`          |     |     |
|   7   | `==`, `!=`                    |     |     |
|   8   | `&`                           |     |     |
|   9   | `^`                           |     |     |
|  10   | `                             | `   |     |
|  11   | `&&`                          |     |     |
|  12   | `                             |     | `   |
|  13   | `=`                           |     |     |
|  14   | `,`                           |     |     |

### Ejemplo

```java
int resultado = 2 + 3 * 4;
System.out.println(resultado);
```

Resultado:

```text
14
```



## Funciones matemáticas

Java proporciona funciones matemáticas mediante la clase `Math`.

No es necesario importar ninguna librería adicional.

### Funciones más utilizadas

| Función         | Descripción           |
|  |  |
| `Math.sqrt(x)`  | Raíz cuadrada         |
| `Math.pow(b,e)` | Potencia              |
| `Math.abs(x)`   | Valor absoluto        |
| `Math.ceil(x)`  | Redondeo hacia arriba |
| `Math.floor(x)` | Redondeo hacia abajo  |
| `Math.cos(x)`   | Coseno (radianes)     |
| `Math.sin(x)`   | Seno (radianes)       |
| `Math.tan(x)`   | Tangente (radianes)   |

### Ejemplo

```java
public class FuncionesMatematicas {

    public static void main(String[] args) {

        double potencia = Math.pow(2, 3);
        double raiz = Math.sqrt(25);
        double redondeoArriba = Math.ceil(25.3);
        double redondeoAbajo = Math.floor(25.7);

        double angulo = Math.toRadians(45);

        double coseno = Math.cos(angulo);
        double seno = Math.sin(angulo);
        double tangente = Math.tan(angulo);

        System.out.println("2 al cubo es: " + potencia);
        System.out.println("La raíz de 25 es: " + raiz);
        System.out.println("Redondeo arriba de 25.3 es: " + redondeoArriba);
        System.out.println("Redondeo abajo de 25.7 es: " + redondeoAbajo);

        System.out.printf("Coseno de 45° es: %.2f%n", coseno);
        System.out.printf("Seno de 45° es: %.2f%n", seno);
        System.out.printf("Tangente de 45° es: %.2f%n", tangente);
    }
}
```



## Ejemplo con operadores aritméticos

### Calcular el área y perímetro de un cuadrado

```java
public class Cuadrado {

    public static void main(String[] args) {

        double lado = 4.31;

        System.out.println("CALCULADORA DEL CUADRADO");
        System.out.println("El valor del lado es " + lado);

        double perimetro = lado * 4;
        System.out.println("El perímetro es " + perimetro + " u");

        double area = lado * lado;
        System.out.println("El área es " + area + " u²");
    }
}
```



### Ejercicios con operadores aritméticos

1. **Calculadora del círculo**
   * Calcular área y perímetro utilizando un radio almacenado en una variable.

2. **Calculadora del rectángulo**
   * Calcular área y perímetro utilizando base y altura almacenadas en variables.

3. **Calculadora del triángulo**
   * Calcular área y perímetro utilizando los valores almacenados en variables.



## Operador de incremento y decremento

Los operadores de incremento (`++`) y decremento (`--`) aumentan o disminuyen una unidad el valor de una variable.

### Incremento

```java
int x = 5;

x++;

System.out.println(x);
```

Resultado:

```text
6
```

### Decremento

```java
int x = 5;

x--;

System.out.println(x);
```

Resultado:

```text
4
```

### Pre-incremento y Post-incremento

```java
int x = 5;

System.out.println(++x);
```

Resultado:

```text
6
```

```java
int x = 5;

System.out.println(x++);
System.out.println(x);
```

Resultado:

```text
5
6
```

!!! Note
    `++x` incrementa primero y luego devuelve el valor.

    `x++` devuelve el valor actual y después incrementa la variable.
