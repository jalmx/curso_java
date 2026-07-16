# Prácticas de Java — De Cero

Serie de **30 ejercicios progresivos** de Java 25 con Apache NetBeans 25 y Maven.  
Proyecto educativo que cubre desde fundamentos del lenguaje hasta programación orientada a objetos y manejo de archivos.

## Requisitos

- **JDK 17+** (Java 25 compatible)
- **Apache NetBeans 25**
- **Apache Maven** (incluido en NetBeans)

## Cómo abrir el proyecto

1. Abre Apache NetBeans 25.
2. `File` → `Open Project...`
3. Selecciona la carpeta `Practicas/`.
4. NetBeans detectará `pom.xml` y cargará el proyecto Maven automáticamente.
5. Para ejecutar una clase, haz clic derecho sobre ella → `Run File` (o `Shift+F6`).

La clase principal por defecto es `com.mycompany.practicas.Practicas`.

## Estructura del proyecto

```
Practicas/
├── pom.xml                      # Configuración Maven (Java 25)
├── datos.csv                    # Datos de ejemplo para Estadistica
├── mi archivo.txt               # Archivo de prueba para File I/O
│
└── src/main/java/com/mycompany/
    │
    ├── practicas/               ### FUNDAMENTOS (23 archivos)
    │   ├── Practicas.java       # printf(), declaración de variables, %d
    │   ├── Suma.java            # Variables int, suma aritmética
    │   ├── Impresion.java       # Concatenación de strings con +
    │   ├── SecuenciaEscape.java # Secuencias de escape: \n, \t, \"
    │   ├── Leer.java            # Scanner: nextLine(), nextInt(), nextDouble()
    │   ├── MayorEdadElse.java   # if/else, operadores relacionales
    │   ├── OperadorTernario.java# Operador ternario ?: como if compacto
    │   ├── MensajeCalificacion.java # if encadenados con && y ||
    │   ├── CalculadoraSwitch.java   # switch, menú de operaciones
    │   ├── AprobadoNoAprobado.java  # if simple, lógica ≥ 6
    │   ├── AdivinaNumero.java   # Random, while(true), break
    │   ├── SegundaLey1.java     # double, F = m * a
    │   ├── Rectangulo.java      # Área y perímetro con double
    │   ├── RectanguloMenu.java  # Menú if/else if, entrada por Scanner
    │   ├── ParImpar10.java      # Módulo %, par/impar, > 10
    │   ├── Tabla13.java         # while y for, tabla de multiplicar
    │   ├── UnoAl99.java         # while, contador incremental
    │   ├── MensajeWhile.java    # while, contador, concatenación
    │   ├── CalculadoraWhileNormal.java # while(condición), menú switch
    │   ├── CalculadoraWhileInfinito.java # while(true) + break
    │   ├── MensajeFor.java      # for, operadores ++ y +=
    │   ├── CalculadoraForNormal.java   # for con condición de corte
    │   └── CalculadoraForInfinito.java # for(;;) infinito
    │
    ├── practicas2/              ### ARREGLOS (3 archivos)
    │   ├── Arreglos.java        # int[], double[], String[], for + .length
    │   ├── Estadistica.java     # Math.pow(), Math.sqrt(), media y σ
    │   └── Bot.java             # Random + String[], chatbot interactivo
    │
    ├── poo/                     ### POO (3 archivos)
    │   ├── Auto.java            # Clase, atributos, métodos, instancias
    │   ├── Persona.java         # this, múltiples objetos
    │   └── Persona2.java        # Métodos con parámetros y return
    │
    └── files/                   ### ARCHIVOS (1 archivo)
        └── ManipulacionArchivos.java # File, FileWriter, Scanner, JFileChooser
```

## Temas cubiertos (orden progresivo)

1. **Variables y tipos de datos** — `int`, `double`, `String`, declaración e inicialización
2. **Salida por consola** — `System.out.printf()`, `System.out.println()`, `%d`, `%f`, `\n`, `\t`
3. **Entrada de datos** — `Scanner`, `nextLine()`, `nextInt()`, `nextDouble()`
4. **Operadores** — Aritméticos (`+`, `-`, `*`, `/`), módulo (`%`), concatenación (`+`)
5. **Condicionales** — `if`, `if/else`, `if/else if`, `switch`, operador ternario (`?:`), operadores lógicos (`&&`, `||`)
6. **Bucles** — `while`, `for`, bucles infinitos, `break`, contadores
7. **Números aleatorios** — `java.util.Random`
8. **Arreglos** — Declaración, indexación, recorrido con `for` y `.length`
9. **Programación Orientada a Objetos** — Clases, atributos, métodos, `this`, encapsulación básica
10. **Manejo de archivos** — `java.io.File`, `FileWriter`, `Scanner` para lectura, `JFileChooser`
11. **Matemáticas** — `Math.pow()`, `Math.sqrt()`, cálculos estadísticos

## Licencia

```
Practicas - Serie de ejercicios progresivos de Java 25
Copyright (C) 2025  xizuth

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.
```

Hecho con fines educativos.
