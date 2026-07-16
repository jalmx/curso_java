# Estructura de archivo JAVA

De primera instancia si nunca haz programado es muy extraño ver muchas cosas en un archivo que prácticamente no hace nada; sin embargo, debemos asimilarlo y tomarlo como una verdad absoluta, dado que para entenderlo hay que recorrer un poco el camino, hasta que cada linea toma todo el sentido del mundo.

Con esto pasamos a ver la estructura base que llevara casi todos los archivo en JAVA y mas los que comenzaremos a hacer

```java
package com.mycompany.practicas; // el nombre del paquete

public class Main { //inicia la clase

    //función main, donde comienza la aplicación
    public static void main(String[] args) {

        // aqui va el codigo de nuestra aplicación

    } //termina la funcion main

} //termina la clase
```

**La estructura anterior por el momento SIEMPRE se escribirá así, sin preguntar nada y respetando cada símbolo en él.**

Por convención el nombre del archivo en donde va la `función main` se llamará `Main.java`. La extension de los archivos en `JAVA`, es `.java`.

!!! warning
    **Por el momento no se escribirá NADA de NADA fuera de las llaves de la función, esta estrictamente prohibido colocar algo (ya prenderemos dónde, cómo y porqué)**. Por el momento ten fé ciega 😄.

## Sintaxis

La sintaxis en un lenguaje es como saber las reglas ortográfica de cualquier idioma. Cada lenguaje de programación tiene la suya, en este caso en JAVA tiene sus reglas:

```java
package com.mycompany.practicas;

public class Impresion {

    public static void main(String[] args) {

        System.out.println("Hola");
    }
}

```


