# Curso JAVA

# Operadores Aritméticos

|   **Nombre**   | **Símbolo** |          **Descripción**          |
| :------------: | :---------: | :-------------------------------: |
|   Asignación   |      =      |       Asignar un valor dado       |
|      Suma      |     \+      |          Operación suma           |
|     Resta      |      -      |          Operación resta          |
| Multiplicación |     \*      |        Operación producto         |
|    División    |      /      |        Operación división         |
|    Residuo     |      %      | Retorna el residuo de la división |


# Operadores Aritméticos combinados

|   **Nombre**   | **Símbolo** |   **Descripción**   |
| :------------: | :---------: | :-----------------: |
|      Suma      |     \+=     | x = x \+ 3 -> x\+=3 |
|     Resta      |     -=      |  x = x - 3 -> x-=3  |
| Multiplicación |     \*=     | x = x \* 3 -> x\*=3 |
|    División    |     /=      |  x = x / 3 -> x/=3  |
|    Residuo     |     %=      |  x = x % 3 -> x%=3  |
|   Incremento   |    \+\+     | x = x \+ 1 -> x\+\+ |
|   Decremento   |     --      |  x = x - 1 -> x--   |


- Segunda Ley de Newton. Calcular la fuerza si un objeto tiene una aceleración de $10m/s^2$ y una masa de 2.5kg. Después\, si el objeto incrementa su aceleración a $12.6m/s^2$. $F = m a$
- Conversiones. Realizar programa para conversión de unidades\, de centímetros a pulgadas y de pulgadas a centímetros. $2.54 cm = 1 inch$


# Método print

```java
print(“Texto”); //impresión básica

println(“Texto”); //impresión con salto de línea

printf(“Texto”); //impresión con formato

// Ejemplo de printf(); es decir, impresión con formato

double peso = 85.3656;

printf(“Mi peso es %.2f kgrs”, peso);//impresión con formato
//-> Mi peso es 85.37 kgrs <- Salida
```

# Printf - Especificadores de formato

| **Carácter** |   **Tipo de salida**    | **Ejemplo**  |
| :----------: | :---------------------: | :----------: |
|    **d**     |         Entero          | %d <br> %5d  |
|    **f**     |   Flotantes y dobles    | %f <br> 2.3f |
|    **e**     | Con notación científica | %83e <br> %e |
|    **s**     |     String (Texto)      | %s <br> %12s |
|    **c**     |        Caracter         |  %c<br>%2c   |

# 3. Estructuras de Decisión y Control

# Operadores de relación

| **Operador** |  **Descripción**  | **Ejemplo** | **Resultado** |
| :----------: | :---------------: | :---------: | :-----------: |
|    **==**    |     Igual que     |   8 == 9    |     false     |
|    **<**     |     Menor que     |    9 < 4    |     false     |
|    **>**     |     Mayor que     |   0 > -4    |     true      |
|    **<=**    | Menor o igual que |   9 <= 20   |     true      |
|    **>=**    | Mayor o igual que |   3 >= 6    |     false     |
|    **!=**    |   Diferente de    |   4 != 4    |     false     |

OperadoresRelacion.java

# Sentencia de decisión IF

```java
if(condicionVerdadera){//si la condición se cumple entra al bloque del código

  	//en caso de que sea verdadero, ejecuta éste código
}

if(5 >= 4){
    System.out.println(“5 es mayor o igual a 4”);
}

```

# Ejercicio - Aprobado-Reprobado

- Hacer un programa que nos indique si el alumno aprobó o reprobó la materia.
-Realizar un programa que diga si el número es par o impar y si el número es mayor 10\, que diga un mensaje que el dígito dado es superior a 10.

![](assets/Programacion%20JAVA_7.png)

# Operadores lógicos

|       **AND**        |               |
| :------------------: | :-----------: |
|    **Operación**     | **Resultado** |
| False  **&&**  False |     False     |
| False  **&&**  True  |     False     |
| True  **&&**  False  |     False     |
|  True  **&&**  True  |     True      |

|       **OR**       |               |
| :----------------: | :-----------: |
|   **Operación**    | **Resultado** |
| False  \|\|  False |     False     |
| False  \|\|  True  |     True      |
| True  \|\|  False  |     True      |
|  True  \|\|  True  |     True      |

|    **NOT**    |               |
| :-----------: | :-----------: |
| **Operación** | **Resultado** |
|  **!** True   |     False     |
|  **!** False  |     True      |

| **Nombre** | **Símbolo** |      **Aplicación**      | **Resultado** |
| :--------: | :---------: | :----------------------: | :-----------: |
|  **AND**   |     &&      | (5 == 5)  **&&**  (4==4) |     True      |
|   **OR**   |             |                          |               | (9 > 3)  ** |  | **  false | True |
|  **NOT**   |      !      |          !false          |     True      |


# Ejercicio - Aprobado-Reprobado con mensaje

Realizar un programa que diga una frase dependiendo de su calificación.

Si obtuvo menos de 6 ->  _“Lastima Margarito”_

Si obtuvo de 6 hasta menos de 7->  _“De panzazo”_

Si obtuvo de 7 hasta menos de 8 ->  _“Echale más punch”_

Si obtuvo de 8 hasta menos de 9 ->  _“Bien\, puedes mejorar”_

Si obtuvo de 9 hasta menos de 10 ->  _“Muy bien\, te falto tantito”_

Si obtuvo 10 ->  _“Excelente\, con toda la actitud”_

_Si da otro valor que no esté definido dirá “No es posible”_

CalificacionesMensaje.java

# Leyendo datos del teclado

<span style="color:#000000"> _Se importa el objeto Scanner\, se genera una instancia._ </span>

<span style="color:#700080"> **import** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">java</span>  <span style="color:#000000">.</span>  <span style="color:#1ab1cd">util</span>  <span style="color:#000000">.</span>  <span style="color:#1ab1cd">Scanner</span>  <span style="color:#000000">; </span>  <span style="color:#a05000"> _//se importa la librería\, debe ir al inicio del archivo_ </span>

<span style="color:#1ab1cd">Scanner</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">leer</span>  <span style="color:#000000"> </span>  <span style="color:#ee11ff"> **=** </span>  <span style="color:#000000"> </span>  <span style="color:#700080"> **new** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">Scanner</span>  <span style="color:#000000">(</span>  <span style="color:#1ab1cd">System</span>  <span style="color:#000000">.</span>  <span style="color:#1ab1cd">in</span>  <span style="color:#000000">); </span>  <span style="color:#a05000"> _//crea instancia dentro de main_ </span>

<span style="color:#008050">String</span>  ** **  <span style="color:#1ab1cd">texto </span>  <span style="color:#ee11ff"> **=** </span>  ** **  <span style="color:#1ab1cd">leer</span>  **.**  <span style="color:#1ab1cd">next</span>  **(); **  <span style="color:#a05000"> _//lee y guarda texto_ </span>

<span style="color:#008050">String</span>  ** **  <span style="color:#1ab1cd">texto </span>  <span style="color:#ee11ff"> **=** </span>  ** **  <span style="color:#1ab1cd">leer</span>  **.**  <span style="color:#1ab1cd">nextLine</span>  **(); **  <span style="color:#a05000"> _//lee y guarda texto_ </span>

<span style="color:#008050">int</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">entero</span>  <span style="color:#000000"> </span>  <span style="color:#ee11ff"> **=** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">leer</span>  <span style="color:#000000">.</span>  <span style="color:#1ab1cd">nextInt</span>  <span style="color:#000000">(); </span>  <span style="color:#a05000"> _//lee y guarda entero_ </span>

<span style="color:#008050">double</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">doble</span>  <span style="color:#000000"> </span>  <span style="color:#ee11ff"> **=** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">leer</span>  <span style="color:#000000">.</span>  <span style="color:#1ab1cd">nextDouble</span>  <span style="color:#000000">();</span>  <span style="color:#a05000"> _//lee y guarda doble_ </span>


# Sentencia de decisión IF-ELSE

<span style="color:#700080"> **if** </span>  <span style="color:#000000">(</span>  <span style="color:#1ab1cd">condicionVerdadera</span>  <span style="color:#000000">)\{</span>

<span style="color:#000000">	</span>  <span style="color:#a05000"> _//en caso que sea verdadero\, ejecuta éste código_ </span>

<span style="color:#000000">\}</span>  <span style="color:#700080"> **else** </span>  <span style="color:#000000">\{</span>

<span style="color:#000000">	</span>  <span style="color:#a05000"> _//en caso contrario\, se ejecuta éste código_ </span>

<span style="color:#000000">\}</span>

# Ejercicio - Qué sexo eres

Generar un programa que pregunte qué sexo eres\, si es Hombre que diga “Macho alfa lomo plateado”\, de lo contrario que diga “Eres una linda señorita”.

![](assets/Programacion%20JAVA_8.png)

# If anidado

<span style="color:#700080"> **if** </span>  <span style="color:#000000">(</span>  <span style="color:#1ab1cd">condicionVerdadera</span>  <span style="color:#000000">)\{</span>

<span style="color:#a05000"> _//en caso que sea verdadero\, ejecuta éste código_ </span>

<span style="color:#000000">\}</span>  <span style="color:#700080"> **else** </span>  <span style="color:#000000"> </span>  <span style="color:#700080"> **if** </span>  <span style="color:#000000">(</span>  <span style="color:#1ab1cd">condicionVerdadera</span>  <span style="color:#000000">)\{</span>

<span style="color:#000000">	</span>  <span style="color:#a05000"> _//de lo contrario si\, se ejecuta_ </span>

<span style="color:#000000">\}</span>  <span style="color:#700080"> **else** </span>  <span style="color:#000000">\{</span>

<span style="color:#a05000"> _//en caso contrario\, se ejecuta éste código_ </span>

<span style="color:#000000">\}</span>


# Operador Ternario (?:)

<span style="color:#1ab1cd">condicion</span>  <span style="color:#000000"> </span>  <span style="color:#ee11ff"> **?** </span>  <span style="color:#000000"> </span>  <span style="color:#201090">true</span>  <span style="color:#000000"> :  </span>  <span style="color:#201090">false</span>

<span style="color:#700080"> **if** </span>  <span style="color:#000000"> (</span>  <span style="color:#1ab1cd">x</span>  <span style="color:#000000"> </span>  <span style="color:#ee11ff"> **>** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">n</span>  <span style="color:#000000">)\{</span>

<span style="color:#000000">	</span>  <span style="color:#1ab1cd">variable</span>  <span style="color:#000000"> </span>  <span style="color:#ee11ff"> **=** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">a</span>  <span style="color:#000000">;</span>

<span style="color:#000000">\}</span>  <span style="color:#700080"> **else** </span>  <span style="color:#000000">\{</span>

<span style="color:#000000">	</span>  <span style="color:#1ab1cd">variable</span>  <span style="color:#000000"> </span>  <span style="color:#ee11ff"> **=** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">b</span>  <span style="color:#000000">;</span>

<span style="color:#000000">\}</span>

<span style="color:#1ab1cd">variable</span>   <span style="color:#ee11ff"> **=** </span>  (  <span style="color:#1ab1cd">x</span>   <span style="color:#ee11ff"> **>** </span>   <span style="color:#1ab1cd">n</span>  )  <span style="color:#ee11ff"> **?** </span>   <span style="color:#1ab1cd">a</span>  :  <span style="color:#1ab1cd">b</span>

# Sentencia de decisión SWITCH

<span style="color:#700080"> **switch** </span>  <span style="color:#000000">(</span>  <span style="color:#1ab1cd">variable</span>  <span style="color:#000000">)\{</span>

<span style="color:#700080"> **case** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">opcion1</span>  <span style="color:#000000">:</span>

<span style="color:#a05000"> _//código_ </span>

<span style="color:#700080"> **break** </span>  <span style="color:#000000">;</span>

<span style="color:#700080"> **case** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">opcion2</span>  <span style="color:#000000">:</span>

<span style="color:#a05000"> _//código_ </span>

<span style="color:#700080"> **break** </span>  <span style="color:#000000">;</span>

<span style="color:#700080"> **default** </span>  <span style="color:#000000">:</span>

<span style="color:#000000">	</span>  <span style="color:#a05000"> _//código_ </span>

<span style="color:#000000">\}</span>

**Opción a comparar**

**Ejecuta ésta sección si no se cumple ningún caso**

# Ejercicio - Calculadora básica

Crear un menú dando las opciones para seleccionar que se desea calcular. Opciones: 1. Suma\, 2. Resta\, 3 Multiplicación\, 4 División y al final arrojar el resultado de la operación\, en caso que no exista la operación\, lanzará el mensaje que no existe dicha operación.

![](assets/Programacion%20JAVA_9.png)


# Sentencias de control - FOR

_Separado por punto y coma (;)_

<span style="color:#700080"> **for** </span>  <span style="color:#000000">( </span>  <span style="color:#1ab1cd">inicio</span>  <span style="color:#000000">; </span>  <span style="color:#1ab1cd">condicion</span>  <span style="color:#000000"> ; </span>  <span style="color:#1ab1cd">∆</span>  <span style="color:#000000"> )\{</span>

<span style="color:#000000">	</span>  <span style="color:#a05000"> _//código que se va a repetir hasta que la condición sea   falsa_ </span>

<span style="color:#000000">\}</span>

<span style="color:#700080"> **for** </span>  <span style="color:#000000">( </span>  <span style="color:#1ab1cd">inicio</span>  <span style="color:#000000"> ; </span>  <span style="color:#1ab1cd">tope</span>  <span style="color:#000000"> ; </span>  <span style="color:#1ab1cd">incremento</span>  <span style="color:#ee11ff"> **/** </span>  <span style="color:#1ab1cd">decremento</span>  <span style="color:#000000"> )\{</span>

<span style="color:#000000">	</span>  <span style="color:#a05000"> _//código que se va a repetir hasta que la condición sea   falsa_ </span>

<span style="color:#000000">\}</span>

# Ejercicio - Imprimiendo tablas de multiplicar

Realizar un programa que imprima la tabla de 7\, que hasta la multiplicación hasta el 10.

Realizar un programa que realice la tabla que el usuario quiera conocer\, debe llegar hasta el 10 la multiplicación.

![](assets/Programacion%20JAVA_10.png)


# Ejercicio - Media

Solicitar al usuario la cantidad de números que va a ingresar de un conjunto\, e ir pidiendo uno a uno; al final\, dar el resultado de la media.

![](assets/Programacion%20JAVA_11.png)

# Break y Continue

Solicitar al usuario 8 números y el programa ignorará los números pares.

Solicitar al usuario los números de un conjunto\, he ir pidiendo uno a uno; al final dar el resultado de la media. Para salir\, debe dar el valor de -1.

![](assets/Programacion%20JAVA_12.png)

# Arreglos (array)

Es una estructura de datos\, una colección de elementos\, en éste caso es una colección de referencias.

**Características:**

Espacio definido

Índice de posición

Solo puede contener un solo tipo elemento

![](assets/Programacion%20JAVA_13.png)

![](assets/Programacion%20JAVA_14.png)

# Arrays - Estadística

Realizar programa que calcule la media y la desviación estándar de un conjunto de datos que ingrese el usuario\, previamente se solicita el total de datos.

![](assets/Programacion%20JAVA_15.png)

![](assets/Programacion%20JAVA_16.png)


# Arreglos (array)

<span style="color:#1ab1cd">tipo</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">nombre</span>  <span style="color:#000000">\[\] </span>  <span style="color:#ee11ff"> **=** </span>  <span style="color:#000000"> </span>  <span style="color:#700080"> **new** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">tipo</span>  <span style="color:#000000">\[</span>  <span style="color:#1ab1cd">tamaño</span>  <span style="color:#000000">\]; </span>  <span style="color:#a05000"> _//declaración vacío pero su espacio _ </span>  <span style="color:#a05000"> _definido_ </span>

<span style="color:#1ab1cd">tipo</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">nombre</span>  <span style="color:#000000">\[\] </span>  <span style="color:#ee11ff"> **=** </span>  <span style="color:#000000"> \{</span>  <span style="color:#1ab1cd">valor1</span>  <span style="color:#000000">\, </span>  <span style="color:#1ab1cd">valor2</span>  <span style="color:#000000">\, </span>  <span style="color:#1ab1cd">valor3</span>  <span style="color:#000000">\}; </span>  <span style="color:#a05000"> _//asignando los valores _ </span>

<span style="color:#008050">int</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">miArreglo</span>  <span style="color:#000000">\[\] </span>  <span style="color:#ee11ff"> **=** </span>  <span style="color:#000000"> </span>  <span style="color:#700080"> **new** </span>  <span style="color:#000000"> </span>  <span style="color:#008050">int</span>  <span style="color:#000000">\[</span>  <span style="color:#106040">4</span>  <span style="color:#000000">\]; </span>  <span style="color:#a05000"> _//array con 4 espacios _ </span>  <span style="color:#a05000"> _vacíos_ </span>

<span style="color:#008050">int</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">segundoArreglo</span>  <span style="color:#000000">\[\] </span>  <span style="color:#ee11ff"> **=** </span>  <span style="color:#000000"> \{</span>  <span style="color:#106040">4</span>  <span style="color:#000000">\, </span>  <span style="color:#106040">3</span>  <span style="color:#000000">\, </span>  <span style="color:#106040">7</span>  <span style="color:#000000">\, </span>  <span style="color:#106040">9</span>  <span style="color:#000000">\};</span>  <span style="color:#a05000"> _//array con 4 datos_ </span>


# Array nxm

Array bidimensionales\, tridimensionales\, de dimensión  _n x m_ .

<span style="color:#008050">int</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">miArreglo</span>  <span style="color:#000000">\[\]\[\] </span>  <span style="color:#ee11ff"> **=** </span>  <span style="color:#000000"> </span>  <span style="color:#700080"> **new** </span>  <span style="color:#000000"> </span>  <span style="color:#008050">int</span>  <span style="color:#000000">\[</span>  <span style="color:#106040">4</span>  <span style="color:#000000">\]\[</span>  <span style="color:#106040">4</span>  <span style="color:#000000">\]; </span>  <span style="color:#a05000"> _//array de 4 x 4 _ </span>

<span style="color:#008050">int</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">segundoArreglo</span>  <span style="color:#000000">\[\] </span>  <span style="color:#ee11ff"> **=** </span>  <span style="color:#000000"> \{ </span>

<span style="color:#000000">	\{</span>  <span style="color:#106040">4</span>  <span style="color:#000000">\, </span>  <span style="color:#106040">3</span>  <span style="color:#000000">\, </span>  <span style="color:#106040">7</span>  <span style="color:#000000">\, </span>  <span style="color:#106040">9</span>  <span style="color:#000000">\}\,</span>

<span style="color:#000000">\{</span>  <span style="color:#106040">4</span>  <span style="color:#000000">\, </span>  <span style="color:#106040">3</span>  <span style="color:#000000">\, </span>  <span style="color:#106040">7</span>  <span style="color:#000000">\, </span>  <span style="color:#106040">9</span>  <span style="color:#000000">\}</span>

<span style="color:#000000">\};</span>  <span style="color:#a05000"> _//array con 2 x 4 _ </span>

![](assets/Programacion%20JAVA_17.png)

Realizar la combinación de un nombre con un color al azar\, debe estar contenido en un array\, tres nombres y 8 colores. Cargando todos los datos desde un inicio.

Realizar un combinador de parejas\, en un array bidimensional\, pedir los nombres de los hombres y mujeres\, posterior hacer parejas aleatorias. Sin importar que se repitan.

![](assets/Programacion%20JAVA_18.png)

# Sentencias de control - WHILE & DO-WHILE

<span style="color:#700080"> **while** </span>  <span style="color:#000000">(</span>  <span style="color:#1ab1cd">condicionVerdadera</span>  <span style="color:#000000">)\{</span>

<span style="color:#000000">	</span>  <span style="color:#a05000"> _//código que se ejecuta mientras la condición se cumpla (true)_ </span>

<span style="color:#000000">\}</span>

<span style="color:#700080"> **do** </span>  <span style="color:#000000">\{</span>

<span style="color:#000000">	</span>  <span style="color:#a05000"> _//código que se ejecuta mientras la condición se cumpla (true)\, pero entra la primera vez_ </span>

<span style="color:#000000">\}</span>  <span style="color:#700080"> **while** </span>  <span style="color:#000000">(</span>  <span style="color:#1ab1cd">condicionVerdadera</span>  <span style="color:#000000">);</span>

# Ejercicio - Imprimiendo tablas de multiplicar (while)

Realizar un programa que imprima la tabla de 9\, que llegue hasta el 10.

Realizar un programa que realice la tabla que el usuario quiera conocer\, debe llegar hasta el 10.

![](assets/Programacion%20JAVA_19.png)

# 4. Programación Orientada a Objetos

# Objetos

![](assets/Programacion%20JAVA_20.png)

**Atributos y Comportamientos**

![](assets/Programacion%20JAVA_21.png)

![](assets/Programacion%20JAVA_22.png)

**Atributos y Comportamientos**

![](assets/Programacion%20JAVA_23.png)

# ¿Qué es un método?

Es un comportamiento (acción) que realiza un objeto (cosa).

Una secuencia de pasos ordenados.

Es un bloque o secuencia de código que se repite continuamente.

Hace una sola tarea\, y lo hace muy bien.

Su nombre se define con un verbo (acción).

Funciones de un objeto.

Modifica estados.

# Creación de Objetos

**Objeto = Clase**

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#700080"> **class** </span>  <span style="color:#000000"> </span>  <span style="color:#0000f0">MiObjeto</span>  <span style="color:#000000">\{ </span>  <span style="color:#a05000"> _//inicia la clase_ </span>

<span style="color:#008050">int</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">campo1</span>  <span style="color:#000000">;</span>

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#008050">void</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">miMetodo</span>  <span style="color:#000000">( )\{ </span>

<span style="color:#a05000"> _//cuerpo del método_ </span>

<span style="color:#000000">\}</span>

<span style="color:#000000">\}</span>  <span style="color:#a05000"> _//fin de la clase_ </span>

**Atributo = Campo**

**Método = Comportamientos**

# Campos y Métodos

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#008050">int</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">noPuertas</span>  <span style="color:#000000">; </span>  <span style="color:#a05000"> _// campo_ </span>  <span style="color:#a05000"> _ de tipo entero_ </span>

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#008050">void</span>  <span style="color:#000000"> </span>  <span style="color:#0000f0">acelerar</span>  <span style="color:#000000"> (   )  \{ </span>  <span style="color:#a05000"> _// comienza_ </span>  <span style="color:#a05000"> _ el método\, tipo void_ </span>

<span style="color:#000000">	</span>  <span style="color:#1ab1cd">System</span>  <span style="color:#000000">.</span>  <span style="color:#1ab1cd">out</span>  <span style="color:#000000">.</span>  <span style="color:#1ab1cd">println</span>  <span style="color:#000000">(</span>  <span style="color:#1ab1cd">“acelerando”</span>  <span style="color:#000000">);</span>

<span style="color:#000000">\}</span>

**Cuerpo del método**

**(Lo que hará el método)**

# Tipos de métodos

| **Nombre** |                  **Descripción**                  |
| :--------: | :-----------------------------------------------: |
|  **void**  | No devuelve ningún dato\, sólo realiza una acción |
|  **int**   |             Devuelve un valor entero              |
|  **long**  |          Devuelve un valor entero largo           |
| **float**  |            Devuelve un valor flotante             |
| **double** |         Devuelve un valor flotante largo          |
|  **char**  |          Devuelve un valor tipo carácter          |
|  **byte**  |            Devuelve un valor tipo byte            |
| **Objeto** |            Devuelve el tipo del objeto            |

# Creando Objeto

**Comportamientos:**

acelerar( ); \+ void

arrancar( ); \+ void

![](assets/Programacion%20JAVA_24.png)

# Creación de una nueva instancia de un Objeto

<span style="color:#1ab1cd">TipoObjeto</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">nombreInstancia</span>  <span style="color:#000000"> </span>  <span style="color:#ee11ff"> **=** </span>  <span style="color:#000000"> </span>  <span style="color:#700080"> **new** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">TipoObjeto</span>  <span style="color:#000000">( );</span>

_Debe terminar con paréntesis_

_Nos indica la creación de un nuevo objeto_

# Llamada métodos y campos

<span style="color:#ee11ff"> **<** </span>  <span style="color:#1ab1cd">nombreInstancia</span>  <span style="color:#ee11ff"> **>** </span>  <span style="color:#000000">.</span>  <span style="color:#ee11ff"> **<** </span>  <span style="color:#1ab1cd">método</span>  <span style="color:#ee11ff"> **>** </span>

<span style="color:#ee11ff"> **<** </span>  <span style="color:#1ab1cd">nombreInstancia</span>  <span style="color:#ee11ff"> **>** </span>  <span style="color:#000000">.</span>  <span style="color:#ee11ff"> **<** </span>  <span style="color:#1ab1cd">campo</span>  <span style="color:#ee11ff"> **>** </span>

# Niveles de acceso (Encapsulamiento)

|   **Nombre**    | **Clase** | **Package** | **Subclase** | **Todos** |
| :-------------: | :-------: | :---------: | :----------: | :-------: |
|     public      |    Sí     |     Sí      |      Sí      |    Sí     |
|    protected    |    Sí     |     Sí      |      Sí      |    No     |
| No especificado |    Sí     |     Sí      |      No      |    No     |
|     private     |    Sí     |     No      |      No      |    No     |

# Creando Objeto

**Atributos:**

noPuertas: \+ int

kilometraje: \+ long

**Comportamientos:**

acelerar(); \+ void

arrancar(); \+ void

![](assets/Programacion%20JAVA_25.png)

# Crear objeto - Persona

**Atributos:**

nombre: \+ String

edad: \+ int

**Métodos:**

saludar(): \+ void

decirEdad(): \+void

![](assets/Programacion%20JAVA_26.png)

# Métodos con argumentos

**Nombre del método**

**Argumentos separados por coma (\,)**

<span style="color:#700080"> **public** </span>  <span style="color:#000000">  </span>  <span style="color:#008050">void</span>  <span style="color:#000000">  </span>  <span style="color:#0000f0">comer</span>  <span style="color:#000000">  (  </span>  <span style="color:#008050">String</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">nombreComida</span>  <span style="color:#000000">)\{</span>

<span style="color:#1ab1cd"> </span>  <span style="color:#1ab1cd">System</span>  <span style="color:#000000">.</span>  <span style="color:#1ab1cd">out</span>  <span style="color:#000000">.</span>  <span style="color:#1ab1cd">println</span>  <span style="color:#000000">(</span>  <span style="color:#1ab1cd">“Como</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">una</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">rica</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">”</span>  <span style="color:#000000"> </span>  <span style="color:#ee11ff"> **\+ ** </span>  <span style="color:#1ab1cd">nombreComida</span>  <span style="color:#000000">);</span>

<span style="color:#000000">\}</span>

**Cuerpo del método**

# Crear objeto - Persona

![](assets/Programacion%20JAVA_27.png)

**Atributos:**

nombre: \+ String

edad: \+ int

**Métodos:**

saludar(): \+ void

decirEdad(): \+void

_calcularEdadActual(int anio): \+void_

_cenar(String comida\, String bebida): \+ void_

# Métodos con return

**Argumentos separados por coma (\,)**

**Nombre del método**

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#008050">int</span>  <span style="color:#000000"> </span>  <span style="color:#0000f0">anioNaciomiento</span>  <span style="color:#000000">( </span>  <span style="color:#008050">int</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">anioNacimiento</span>  <span style="color:#000000">\, </span>  <span style="color:#008050">int</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">anioActual</span>  <span style="color:#000000">)\{</span>

<span style="color:#008050">int</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">edad</span>  <span style="color:#000000"> </span>  <span style="color:#ee11ff"> **=** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">anioActual</span>  <span style="color:#000000"> </span>  <span style="color:#ee11ff"> **-** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">anioNacimiento</span>  <span style="color:#000000">;</span>

<span style="color:#000000">	</span>  <span style="color:#700080"> **return** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">edad</span>  <span style="color:#000000">;</span>

<span style="color:#000000">\}</span>

**Cuerpo del método**

_Valor que retorna_  **\, regresa a quien lo llamó**

# Objeto - Perro

**Atributos:**

nombre  : -String

raza : -String

**Métodos:**

ladrar(): \+ void

correr(int velocidad): \+ void

jugar(): \+ String : (pelota\, hueso\, chancla)

![](assets/Programacion%20JAVA_28.png)

# Objeto - Producto (set, get)

**Campos:**

precio: - double

nombe: - String

cantidad : - String

Comportamientos:

descripcionProducto(): \+ void

# Casting de tipos primitivos

Hacer conversión de tipos de datos primitivos.

_double_   _suma_  =  _(double)_  4;

![](assets/Programacion%20JAVA_29.png)

# Alcance de variables

_public class_   **MiClase** \{

_public int_   _variable1_ ; <span style="color:#aaaaaa">//variable global</span>

_public void_   _metodo1_ ()\{

_int_   _variable2_ ;  //variable local

_for_ ( _int _  _variable3_  = 0;  _variable_  < 6;  _variable_ \+\+)\{

//cuerpo del for

\}

\}

\}

# this

Hace referencia a si mismo.

<span style="color:#008050">String</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">nombre</span>  <span style="color:#000000">;</span>

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#008050">void</span>  <span style="color:#000000"> </span>  <span style="color:#0000f0">setNombre</span>  <span style="color:#000000">(</span>  <span style="color:#008050">String</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">nombre</span>  <span style="color:#000000">)\{</span>

<span style="color:#000000">	</span>  <span style="color:#700080"> **this** </span>  <span style="color:#000000">.</span>  <span style="color:#1ab1cd">nombre</span>  <span style="color:#000000"> </span>  <span style="color:#ee11ff"> **=** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">nombre</span>  <span style="color:#000000">;</span>

<span style="color:#000000">\}</span>

# Objeto - Auto (this, scope)

**Atributos:**

nombre: - String

Color: - String

encendido: -boolean

**Comportamientos**

arrancar: \+ void

apagar: \+ void

descripcion(): \+void

# Plain Old Java Object (POJO)

Una clase para un objeto básico\, con sus métodos de asignación (set) y obtención (get)\, que describe algún tipo de estructura o dato genérico.

![](assets/Programacion%20JAVA_30.png)

# Sobrecarga de métodos

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#008050">double</span>  <span style="color:#000000"> </span>  <span style="color:#0000f0">setAceleracion</span>  <span style="color:#000000">()\{</span>

<span style="color:#000000">\}</span>

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#008050">double</span>  <span style="color:#000000"> </span>  <span style="color:#0000f0">setAceleracion</span>  <span style="color:#000000">(</span>  <span style="color:#008050">int</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">tiempo</span>  <span style="color:#000000">)\{</span>

<span style="color:#000000">\}</span>

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#008050">double</span>  <span style="color:#000000"> </span>  <span style="color:#0000f0">setAceleracion</span>  <span style="color:#000000">(</span>  <span style="color:#008050">double</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">tiempo</span>  <span style="color:#000000">)\{</span>

<span style="color:#000000">\}</span>

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#008050">double</span>  <span style="color:#000000"> </span>  <span style="color:#0000f0">setAceleracion</span>  <span style="color:#000000">(</span>  <span style="color:#008050">double</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">tiempo</span>  <span style="color:#000000">\, </span>  <span style="color:#008050">boolean</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">turbo</span>  <span style="color:#000000">)\{</span>

<span style="color:#000000">\}</span>

# Argumentos de longitud variable

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#008050">double</span>  <span style="color:#000000"> </span>  <span style="color:#0000f0">suma</span>  <span style="color:#000000">(</span>  <span style="color:#008050">double</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">valor</span>  <span style="color:#000000">...)\{</span>

<span style="color:#000000">	</span>  <span style="color:#a05000"> _//código_ </span>

<span style="color:#000000">\}</span>

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#008050">double</span>  <span style="color:#000000"> </span>  <span style="color:#0000f0">suma</span>  <span style="color:#000000">(</span>  <span style="color:#008050">double</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">valor</span>  <span style="color:#000000">\[\])\{ </span>

<span style="color:#000000">	</span>  <span style="color:#a05000"> _//código_ </span>

<span style="color:#000000">\}</span>

# Constructores

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#700080"> **class** </span>  <span style="color:#000000"> </span>  <span style="color:#0000f0">MiObjeto</span>  <span style="color:#000000">\{ </span>

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">MiObjeto</span>  <span style="color:#000000">( )\{ </span>  <span style="color:#a05000"> _//constructor por default_ </span>

<span style="color:#a05000"> _//contenido del constructor_ </span>

<span style="color:#000000">\}</span>

<span style="color:#000000">\}</span>

**Mismo nombre de la  clase**

**Es**  ** lo primero que se manda a llamar al crear una **  **instancia.**

**Debe tener el mismo nombre que la clase**

# Constructores con argumentos

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#700080"> **class** </span>  <span style="color:#000000"> </span>  <span style="color:#0000f0">MiObjeto</span>  <span style="color:#000000">\{ </span>

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">MiObjeto</span>  <span style="color:#000000">()\{ </span>  <span style="color:#a05000"> _//constructor vacío_ </span>

<span style="color:#000000">\}</span>

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">MiObjeto</span>  <span style="color:#000000">(</span>  <span style="color:#1ab1cd">tipo</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">argumento</span>  <span style="color:#000000">)\{ </span>  <span style="color:#a05000"> _//constructor con argumento_ </span>

<span style="color:#000000">\}</span>

<span style="color:#000000">\}</span>

# Constructores (this)

Con la palabra reservada this se puede hacer la llama a otro constructor. Esto se realiza cuando se desea construir el objeto con datos por default desde el constructor vacío.

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">MyObjeto</span>  <span style="color:#000000">()\{</span>

<span style="color:#000000">	</span>  <span style="color:#700080"> **this** </span>  <span style="color:#000000">(</span>  <span style="color:#1ab1cd">“Sin</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">nombre”</span>  <span style="color:#000000">);</span>

<span style="color:#000000">\}</span>

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">MyObjeto</span>  <span style="color:#000000">(</span>  <span style="color:#008050">String</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">nombre</span>  <span style="color:#000000">)\{</span>

<span style="color:#000000">	</span>  <span style="color:#700080"> **this** </span>  <span style="color:#000000">.</span>  <span style="color:#1ab1cd">nombre</span>  <span style="color:#000000"> </span>  <span style="color:#ee11ff"> **=** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">nombre</span>  <span style="color:#000000">;</span>

<span style="color:#000000">\}</span>

# Metodos estáticos

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#700080"> **static** </span>  <span style="color:#000000"> </span>  <span style="color:#008050">void</span>  <span style="color:#000000"> </span>  <span style="color:#0000f0">nombreMetodoEstatico</span>  <span style="color:#000000">( )\{</span>

<span style="color:#000000">	</span>  <span style="color:#a05000"> _//cuerpo del método_ </span>

<span style="color:#000000">\}</span>

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#700080"> **static** </span>  <span style="color:#000000"> </span>  <span style="color:#008050">void</span>  <span style="color:#000000"> </span>  <span style="color:#0000f0">nombreMetodoEstatico</span>  <span style="color:#000000">(</span>  <span style="color:#1ab1cd">tipo</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">argumento</span>  <span style="color:#000000"> )\{</span>

<span style="color:#000000">	</span>  <span style="color:#a05000"> _//cuerpo del método_ </span>

<span style="color:#000000">\}</span>

**Se requiere que se genere una **  **instancia**

**No se crea uno nuevo aunque se genere una instancia**

# Llamada métodos y campos static

<span style="color:#ee11ff"> **<** </span>  <span style="color:#1ab1cd">Clase</span>  <span style="color:#ee11ff"> **>** </span>  <span style="color:#000000"> </span>  <span style="color:#000000">. </span>  <span style="color:#ee11ff"> **<** </span>  <span style="color:#1ab1cd">método</span>  <span style="color:#ee11ff"> **>** </span>

<span style="color:#ee11ff"> **<** </span>  <span style="color:#1ab1cd">Clase</span>  <span style="color:#ee11ff"> **>** </span>  <span style="color:#000000"> </span>  <span style="color:#000000">. </span>  <span style="color:#ee11ff"> **<** </span>  <span style="color:#1ab1cd">campo</span>  <span style="color:#ee11ff"> **>** </span>

# Objeto - Ley de Ohm

Crear una librería para la solución de Ley de Ohm.

![](assets/Programacion%20JAVA_31.png)

# Libreria Math

![](assets/Programacion%20JAVA_32.png)

**sqrt()** : Raíz cuadrada

**pow():**  potencia

**sin()** : seno

**cos()** : coseno

**abs()** : valor absoluto

![](assets/Programacion%20JAVA_33.png)

![](assets/Programacion%20JAVA_34.png)

# Campos final

Una variable tipo FINAL significa que ese valor jamás va a cambiar\, no se puede cambiar una vez dado un valor.

La forma de declararlo es en Mayúsculas y separados por guión bajo (\_)

<span style="color:#700080"> **final** </span>  <span style="color:#000000"> </span>  <span style="color:#008050">double</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">PI</span>  <span style="color:#000000"> </span>  <span style="color:#ee11ff"> **=** </span>  <span style="color:#000000"> </span>  <span style="color:#106040">3.141592653589793</span>  <span style="color:#000000">;</span>

<span style="color:#700080"> **final** </span>  <span style="color:#000000"> </span>  <span style="color:#008050">long</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">VELOCIDAD\_DE\_LA\_LUZ</span>  <span style="color:#000000"> </span>  <span style="color:#ee11ff"> **=** </span>  <span style="color:#000000"> </span>  <span style="color:#106040">300000000</span>  <span style="color:#000000">;</span>

# Objeto - Segunda Ley de Newton

Crear un objeto de la segunda Ley de Newton\, teniendo como campo static y final la gravedad.

![](assets/Programacion%20JAVA_35.png)

# Clases envolturas (Wrapper)

Las clases envolturas son la equivalencia de los tipos primitivos en Objetos

Integer

Double

Float

Character

Boolean

# Métodos static de Wrappers

<span style="color:#008050">Double</span>  <span style="color:#000000">.</span>  <span style="color:#1ab1cd">paserDouble</span>  <span style="color:#000000">(</span>  <span style="color:#1ab1cd">“98</span>  <span style="color:#106040">.56</span>  <span style="color:#1ab1cd">”</span>  <span style="color:#000000">);</span>

<span style="color:#008050">Double</span>  <span style="color:#000000">.</span>  <span style="color:#1ab1cd">toString</span>  <span style="color:#000000">(</span>  <span style="color:#106040">43.54</span>  <span style="color:#000000">);</span>

<span style="color:#008050">Integer</span>  <span style="color:#000000">.</span>  <span style="color:#1ab1cd">parseInt</span>  <span style="color:#000000">(</span>  <span style="color:#106040">34</span>  <span style="color:#000000">);</span>

<span style="color:#008050">Integer</span>  <span style="color:#000000">.</span>  <span style="color:#1ab1cd">toString</span>  <span style="color:#000000">(</span>  <span style="color:#1ab1cd">“5”</span>  <span style="color:#000000">);</span>

# Null (comparación, argumento)

Objeto  _null_  hace referencia a que el objeto  _no tiene ninguna referencia_ . Es decir\, sólo tiene asignado un espacio en memoria listo para usarse pero aún no contiene nada.

<span style="color:#1ab1cd">Objeto</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">myObjeto</span>  <span style="color:#000000"> </span>  <span style="color:#ee11ff"> **=** </span>  <span style="color:#000000"> </span>  <span style="color:#201090">null</span>  <span style="color:#000000">; </span>  <span style="color:#ee11ff"> **->** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">Objeto</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">myObjeto</span>  <span style="color:#000000">;</span>

<span style="color:#700080"> **if** </span>  <span style="color:#000000">( </span>  <span style="color:#1ab1cd">objeto</span>  <span style="color:#000000"> </span>  <span style="color:#ee11ff"> **==** </span>  <span style="color:#000000"> </span>  <span style="color:#201090">null</span>  <span style="color:#000000">)\{</span>

<span style="color:#000000">	</span>  <span style="color:#a05000"> _//significa que no existe el objeto\, no está definido o no contiene ninguna referencia_ </span>

<span style="color:#000000">\}</span>

Cuando se instancia una clase\, todos los objetos se inicializan con null\, igual a los primitivos que se inicializan con 0.

# Herencia

Es una propiedad que existe en la POO\, en la cual se puede crear una clase general y conforme se va  _heredando_  se va haciendo especializada en una o más clases.

_Clase Padre _  **-->**   _Clase hija_  ( _heredada_ )

_Super clase_   **-->**   _Subclase_

Al hacer la herencia\, todos los campos y métodos son pasados a la clase hija.

![](assets/Programacion%20JAVA_36.png)

# Extends

La forma de generar la herencia es usando la palabra reservada  _extends_ .

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#700080"> **class** </span>  <span style="color:#000000"> </span>  <span style="color:#0000f0">ClaseHija</span>  <span style="color:#000000"> </span>  <span style="color:#700080"> **extends** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">ClasePadre</span>  <span style="color:#000000">\{</span>

<span style="color:#000000">	</span>  <span style="color:#a05000"> _//cuerpo de la clase_ </span>

<span style="color:#000000">\}</span>


# Clase Object

Toda clase al ser creada por default está heredado de Object.

La clase object tiene los métodos:

clone();

_toString();_

finalize();

getClass();

_equals();_

# Sobre escritura de métodos (Override)

Dentro de la herencia se pueden modificar los comportamientos; es decir\, las acciones que realiza un método o adicionar acciones diferentes en la subclase. Esto se conoce como sobreescritura de métodos.

Se identifica con una  _anotación_  ( _@_ ) y la palabra override (sobre escritura).

<span style="color:#505050">@Override</span>

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#008050">String</span>  <span style="color:#000000"> </span>  <span style="color:#0000f0">toString</span>  <span style="color:#000000">( )\{</span>

<span style="color:#000000">	</span>  <span style="color:#a05000"> _//cuerpo del método_ </span>

<span style="color:#000000">\}</span>

# toString()

Cuando se manda a imprimir un objeto\, lo que realmente se manda a llamar es el método  _toString()_  que contiene dicho objeto.

Es una buena práctica siempre sobrescribir el método  _toString() _ en todas las clases que creemos.

<span style="color:#1ab1cd">System</span>  <span style="color:#000000">.</span>  <span style="color:#1ab1cd">out</span>  <span style="color:#000000">.</span>  <span style="color:#1ab1cd">println</span>  <span style="color:#000000">(</span>  <span style="color:#1ab1cd">myObjeto</span>  <span style="color:#000000">);</span>

<span style="color:#ee11ff"> **\<=>** </span>

<span style="color:#1ab1cd">System</span>  <span style="color:#000000">.</span>  <span style="color:#1ab1cd">out</span>  <span style="color:#000000">.</span>  <span style="color:#1ab1cd">println</span>  <span style="color:#000000">(</span>  <span style="color:#1ab1cd">myObjeto</span>  <span style="color:#000000">.</span>  <span style="color:#1ab1cd">toString</span>  <span style="color:#000000">());</span>

# super

Usar la palabra reservada  _super_  es muy similar a usar la palabra  _this_, la diferencia que  _super_  hace referencia a la clase padre y  _this_  a la clase actual. De esta manera podemos acceder a los métodos y campos de  _clase padre siempre y cuando sean publics o protected_ .

<span style="color:#505050">@Override</span>

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#008050">String</span>  <span style="color:#000000"> </span>  <span style="color:#0000f0">toString</span>  <span style="color:#000000">( )\{</span>

<span style="color:#000000">	</span>  <span style="color:#700080"> **return** </span>  <span style="color:#000000"> </span>  <span style="color:#700080"> **super** </span>  <span style="color:#000000">.</span>  <span style="color:#1ab1cd">toString</span>  <span style="color:#000000">() </span>  <span style="color:#ee11ff"> **\+** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">“contenido</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">de</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">la</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">clase</span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">actual”</span>  <span style="color:#000000">;</span>

<span style="color:#000000">\}</span>

# Sobrecarga de constructores por herencia (super)

Sobrecarga de constructores por herencia se realiza siempre y cuando exista un constructor con parámetros en su clase padre.

<span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#700080"> **class** </span>  <span style="color:#000000"> </span>  <span style="color:#0000f0">Aguila</span>  <span style="color:#000000"> </span>  <span style="color:#700080"> **extends** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">Ave</span>  <span style="color:#000000">\{</span>

<span style="color:#000000">	</span>  <span style="color:#700080"> **public** </span>  <span style="color:#000000"> </span>  <span style="color:#1ab1cd">Aguila</span>  <span style="color:#000000">()\{</span>

<span style="color:#000000">		</span>  <span style="color:#700080"> **super** </span>  <span style="color:#000000">(); </span>  <span style="color:#a05000"> _//llama al constructor de Ave por default_ </span>

<span style="color:#000000">\}</span>

<span style="color:#000000">\}</span>

Si existe un constructor con parámetros forzosamente debe ser implementado.

_public class_  Aguila  _extends_   **Ave\{**

private String color;

_public_  Aguila(String tipo\, String color)\{

_super_ (tipo); //llama al constructor de Ave por default

_this_ .color = color;

**\}**

**\}**

# Final class

Al poner final a la clase lo que genera es que  **no se pueda hacer herencia de ésta**   **clase** ; es decir\,  _no puede tener clases hijas o subclases._

_public _  _final_  _ class_  MyClass\{

//cuerpo de la clase

\}

# Final Method

Al poner final un método  _no podrá sobre escribirse en clases hijas_ . Esto se hace cuando no se quiere permitir que modifiquen las acciones del método aplicando herencia.

_public _  _final_  _ void_   _miMetodo_ \{

//cuerpo del método

\}

# Polimorfismo

Nos permite programar de forma general\, nos permite escribir programas que procesen objetos que compartan la misma superclase en un jerarquía de clases\, como si todos fueran objetos de la superclase.

![](assets/Programacion%20JAVA_37.png)

# Clases abstractas

No se puede crear una instancia a partir de esta clase.

Son clases demasiados generales para crear un objeto.

Contiene uno o más métodos abstractos.

Los constructores no puede ser abstractos.

Comportamientos estáticos no pueden ser abstractos.

Los métodos por default son  _public._

_public _  _abstract_  _ class _  **MiObjeto\{**  //inicia la clase

_abstract_  _ void _  **miMetodo** ( ); // no tiene cuerpo el método

**\}** //fin de la clase

# Interfaces

Describe un conjunto de métodos que pueden llamarse sobre un objeto\, para indicar al objeto que realice cierta tarea.

Los métodos son abstract.

Es implícito que sea public.

Es implícito que sea abstract.

![](assets/Programacion%20JAVA_38.png)

_public _  _interface _  **MiObjeto\{**  //inicia la clase

_void _  **miMetodo** ( ); //no tiene cuerpo el método

**\}** //fin de la clase

![](assets/Programacion%20JAVA_39.png)

![](assets/Programacion%20JAVA_40.png)

![](assets/Programacion%20JAVA_41.png)

# Interfaces como constantes

Los campos de una interfaz por default son  _constantes y estaticos_ .

_public _  _interface _  **Constantes\{**  //inicia la clase

_int _  **VOLAR = 5 ** ; //equivale a -> public static final VOLAR = 5;

**\}** //fin de la clase

# Clases internas

_public class_   **MiObjeto\{**

_public_  _ _  **MiObjeto** ( )\{ //constructor por default

//contenido del constructor

\}

_private class_   **ObjetoInterno\{ **  **//clase interna**

**\}**

**\}**

# Clases anonimas

_ActionListener actionListener  = _  _new_   _ActionListener_  **( ) \{**

_@Override_

_public void _ actionPerformed(ActionEvent e) ** \{**

_JOptionPane.showMessageDialog(null\, "Mi primer ventana");_

** \}**

**        \};**

# 5. Excepcitions

# Excepciones

Ocurre cuando hay un problema.

Permite escribir programas tolerantes a fallas y robustos.

Sucede cuando se quiere realizar una acción que no es posible.

Se lanza cuando el programa no sabe qué hacer al recibir un tipo diferente.

Se ejecuta cuando no encuentra algún archivo que necesite.

# Errores más comunes

Al realizar una división por cero\, se genera un error matemático y por consiguiente de lógica de programación.

Al recorrer un array y se intenta acceder a un índice que no existe\, nos lanza un error de que la posición no existe.

Un error común es cuando se quiere acceder a un objeto (su referencia) y éste no tienen ( _null_ ).

# Manejo de Excepciones

_try_  **\{**

//ejecución de código normal

**\}**  _catch_ ( _Exception nombre_ ) **\{**

//si sucede un error\, se trata el error aquí

**\}**

# Multiple manejo de Excepciones

_try_  **\{**

//ejecución de código normal

**\}**  _catch_ ( _Exception nombre_ ) **\{**

//si sucede un error y es del tipo de Exception

**\}**  _catch_ ( _ExceptionN nombreN_ ) **\{**

//si sucede un error y es del tipo de Exception

**\}**


# Manejo de Excepciones (finally)

_try_  **\{**

//ejecución de código normal

**\}**  _catch_ ( _Exception_ ) **\{**

//si sucede un error\, se trata el error aquí

**\}**

_finally_  **\{**

**	// se ejecuta exista o no un error**

**\}**

# Excepciones verificadas y no verificadas

Una excepción  _verificada_  es cuando forzosamente debe usarse un bloque  _try-catch_ .

Una excepción  _NO verificada_  es cuando no es necesario especificar el bloque  _try-catch_ .

# Jerarquía de Excepciones

![](assets/Programacion%20JAVA_42.png)

# Excepción NO verificadas (throw)

_public void_   **miMetodo ** ( )  **\{**

_if_ ( _enNegativo_ ) \{

_throw_   _new_   _NumberFormatException_ (“Número negativo”);

\}

**\}**

_public void_   **miMetodo ** ( )   _throws_  _ _  _Exception_  **\{**

_if_ ( _error_ ) \{

_throw_   _new_   _Exception_ (“Número negativo”);

\}

**\}**

# Lanzando excepción (throws)

Cuando no se quiere tratar un error\, se puede lanzar al siguiente método por el que fue invocado.

_public void_   **miMetodo ** ( )   _throws_  _ _  _Exception\, IOException_  **\{**

//cuerpo del método

**\}**

# Creando excepciones propias

_public class_   **MiException **  _extends_  ** Exception\{**

_public_  _ _  **MiException** ( )\{ //constructor por default

//contenido del constructor

\}

**\}**

# 6. Clases genericas

# Genericos



* Las clases y métodos pueden contener cualquier tipo de parámetro.
* El parámetro puede tener cualquier tipo de referencia; es decir\, cualquier objeto.
* No acepta tipos primitivos.
* Pueden existir  _interfaces_  _\, clases _  _abstractas_  genéricas.
* El constructor no necesitas  _<>_ .
* Por convención sólo se usa una letra y son:
  * E
  * T


# Genericos (sintaxis)

Para usarlos se encierran entre  _\< >_

_public class_   **MiObjeto**  _\<E>_  **\{**

_public_  _ _  _void_  ** method** (  _E_  element)\{ //recibe un tipo E

\}

_public_  _ \<E>_  ** method** ( )\{ retorna un tipo E

\}

_Public static _  _ _  _\<E>_  ** **  _void _  **method** (  _E_  element)\{ //recibe un tipo E y es del tipo E

\}

**\}**

# Genericos (instancia)

**ClaseGenerica **  _\<TipoObjeto>_  ** miGenerico = **  _new  _  **ClaseGenerica**  _<>_  **( );**

**ArrayList **  _\<Persona> _  **personas = new ArrayList<>();**

# Genericos (varios valores)

_public class_   **MiObjeto**  _\< E, T, N >_  **\{**

_public_  _ _  _void_  ** method** (  _E_  element)\{ //recibe un tipo E

\}

_public_  _ \<T>_  ** method** (  _E_  element)\{ retorna un tipo E

\}

_Public static _  _ _  _\<E>_  ** **  _void _  **method** (  _E_  element\,  _T_  thing)\{ //recibe un tipo E y es del tipo E

\}

**\}**

# Tipos RAW

Si no se especifica el tipo entre _ \< >_,  entonces es de tipo RAW; es decir\, tipo crudo\, por ende\, el compilador lo toma por default como tipo Object.

**ClaseGenerica **  _miGenerico_  ** = **  _new  _  **ClaseGenerica**  _ _  **( );**

# 7. Colecciones

# List, ArrayList

Es una colección ordena que puede contener elementos duplicados.

Es una  _interfaz_  que implementa _ ArrayList\, LinkedList y Vector_ .

Es una interfaz genérica.

El más usado por su velocidad es  **ArrayList** .

# foreach

_for_ ( **TipoBase**   _elemento_ :  _Colección_  )\{

//Cuerpo del for

\}

_ArrayList_  _\<String>_   _valores_  =  _new_   _ArrayList_ <>();

_for_ ( **String**   _value_ :  _names_  )\{

//Cuerpo del for

\}

# Map, HashMap

Map es una interfaz.

Los objetos Maps asocian claves a valores.

No pueden contener llaves duplicadas.

La clase más utilizada es  _HashMap_ .

# 8. Interfaz Gráfica

# Elementos de Interfaz - Ventana

![](assets/Programacion%20JAVA_43.png)

# Elementos de Interfaz

Botones(Button)

Etiquetas (Label)

![](assets/Programacion%20JAVA_44.png)

![](assets/Programacion%20JAVA_45.png)

Campo de texto

Área de texto

![](assets/Programacion%20JAVA_46.png)

![](assets/Programacion%20JAVA_47.png)

Botón tipo radio

RadioButton

Caja de chequeo

CheckBox

![](assets/Programacion%20JAVA_48.png)

![](assets/Programacion%20JAVA_49.png)

# Eventos



* Un evento es un método que se dispara cuando sucede un cambio en un elemento.
* **Eventos:**
* _Click_  (Action)
* _Mouse_
  * Entrar el mouse
  * Sale el mouse
* _Teclado_
  * Teclas
* …


# Apps UI

# Apps

Generador de Números aleatorios\, con la opción de límite.

Generador de contraseña segura.

Convertidor de temperatura Celsius\, Fahrenheit\, Kelvin.

Aplicación de notas.

# 9. Manipulación de Archivos

# Clase File

Se pueden crear archivos o carpetas

_File_   _archivo_  =  _new_   _File_ (“Nombre archivo con extensión”);

_archivo._  _createNewFile();_

_File_   _carpeta_  =  _new_   _File_ (“Nombre de la carpeta”);

_archivo._  _mkdir();_

# 10. Aplicación

# Base de Datos

![](assets/Programacion%20JAVA_50.png)

# SQLite

Crear (Create)

Leer (Read)

Actualizar (Update)

Borrar (Delete)

# Base de datos

# CRUD

**CREATE TABLE**  \[name\_table\] (\[columns\_name\] \[data\_type\]\,...) **;**

**CREATE TABLE**  employee  **(** \_id  **INTEGER**, name  **TEXT**, age  **INTEGER);**

# Lenguaje de Consulta (SQL)

# CREATE

**INSERT INTO**  \[name\_table\]  **VALUES(** name\_columns **);**

**INSERT INTO ** employee  **VALUES( ** 4\, “Juan”\, 28  **);**

# Lenguaje de Consulta (SQL)

# INSERT

**SELECT**  \[columns\]  **FROM**  table **;**

**SELECT**  name\, age  **FROM**  employee **;**

# Lenguaje de Consulta (SQL)

# READ

**UPDATE**  name\_table  **SET**  column\_name\,...  **WHERE**  condition;

**UPDATE**  employee  **SET**

name = “Juan Carlos”\, age = 29   **WHERE ** id = 2 ** ;**

# Lenguaje de Consulta (SQL)

# UPDATE

**DELETE FROM**  name\_table  **WHERE**  condition;

**DELETE FROM**  employee  **WHERE**  id = 2;

# Lenguaje de Consulta (SQL)

# DELETE

# Documentación

_[http://www.sqlitetutorial.net/](http://www.sqlitetutorial.net/)_

_[https://www.sqlite.org/](https://www.sqlite.org/)_

_[https://github.com/xerial/sqlite-jdbc](https://github.com/xerial/sqlite-jdbc)_

![](assets/Programacion%20JAVA_51.png)

# Aplicación Java con DB

# Extras

# Lenguajes que has aprendido

![](assets/Programacion%20JAVA_52.png)

![](assets/Programacion%20JAVA_53.png)

![](assets/Programacion%20JAVA_54.png)

![](assets/Programacion%20JAVA_55.png)

![](assets/Programacion%20JAVA_56.png)

# Herramientas que operan con JVM

![](assets/Programacion%20JAVA_57.png)

![](assets/Programacion%20JAVA_58.png)

![](assets/Programacion%20JAVA_59.png)

![](assets/Programacion%20JAVA_60.png)

![](assets/Programacion%20JAVA_61.png)

# El curso que ha tomado cuesta

![](assets/Programacion%20JAVA_62.png)

_[http://education.oracle.com/pls/web\_prod-plq-dad/db\_pages.getpage?page\_id=609&get\_params=dc:D67234\,clang:EN\#tabs-3](http://education.oracle.com/pls/web_prod-plq-dad/db_pages.getpage?page_id=609&get_params=dc:D67234,clang:EN#tabs-3)_

[http://www.alejandro-leyva.com](http://www.alejandro-leyva.com)

[contacto@alejandro-leyva.com](mailto:contacto@alejandro-leyva.com)

[https://www.linkedin.com/in/alejandro-leyva-consult/](https://www.linkedin.com/in/alejandro-leyva-consult/)

[https://www.facebook.com/leyva.consult/](https://www.facebook.com/leyva.consult/)

# Contacto

# Ing. Alejandro Leyva

![](assets/Programacion%20JAVA_63.png)

![](assets/Programacion%20JAVA_64.png)

# Bibliografía

Denning\, P. J. (2001). Origin of virtual machines and other virtualities. En IEEE Annals of the History of Computing.

Goldberg\, H. (2000). What is virtual instrumentation? En IEEE Instrumentation and Measurement Magazine.

National Instruments (2011). Recuperado el 12 de abril\, 2011\, de  _[http://www.ni.com](http://www.ni.com)_

_[https://myopenlab.org/inicio/](https://myopenlab.org/inicio/)_

_[https://myopenlab.wixsite.com/myopenlab](https://myopenlab.wixsite.com/myopenlab)_

