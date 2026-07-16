# Proyectos de NetBeans

Repositorio de proyectos educativos desarrollados en **Java 25** con **Apache NetBeans 25** y **Maven**. Organizados de menor a mayor complejidad.

---

## 1. Practicas — Fundamentos de Java

![Java](https://img.shields.io/badge/Java-25-%23ED8B00?logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.9-%23C71A36?logo=apachemaven&logoColor=white)
![CLI](https://img.shields.io/badge/CLI-Console-black)

Serie de **30 ejercicios progresivos** que cubren desde fundamentos del lenguaje hasta programación orientada a objetos y manejo de archivos. Proyecto 100% de consola (sin interfaz gráfica).

[:octicons-link-external-16: Ver README completo](https://github.com/jalmx/curso_java/blob/main/NetBeansProjects/Practicas/README.md)

### Temas cubiertos

| Tema | Archivos |
|------|----------|
| Variables y tipos de datos | `Practicas.java`, `Suma.java` |
| Salida por consola | `Impresion.java`, `SecuenciaEscape.java` |
| Entrada de datos | `Leer.java` |
| Condicionales | `MayorEdadElse.java`, `OperadorTernario.java`, `MensajeCalificacion.java`, `CalculadoraSwitch.java`, `AprobadoNoAprobado.java` |
| Bucles | `Tabla13.java`, `UnoAl99.java`, `MensajeWhile.java`, `CalculadoraWhileNormal.java`, `CalculadoraWhileInfinito.java`, `MensajeFor.java`, `CalculadoraForNormal.java`, `CalculadoraForInfinito.java` |
| Números aleatorios | `AdivinaNumero.java`, `Bot.java` |
| Arreglos | `Arreglos.java`, `Estadistica.java` |
| POO | `Auto.java`, `Persona.java`, `Persona2.java` |
| Archivos | `ManipulacionArchivos.java` |
| Matemáticas | `SegundaLey1.java`, `Rectangulo.java`, `RectanguloMenu.java` |

### Estructura del proyecto

```
Practicas/
├── pom.xml
├── datos.csv
├── mi archivo.txt
└── src/main/java/com/mycompany/
    ├── practicas/         # 23 archivos — fundamentos
    ├── practicas2/        #  3 archivos — arreglos
    ├── poo/               #  3 archivos — POO
    └── files/             #  1 archivo  — archivos
```

---

## 2. Convertidor de Temperatura

![Java](https://img.shields.io/badge/Java-25-%23ED8B00?logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-GUI-blue)
![Maven](https://img.shields.io/badge/Maven-3.9-%23C71A36?logo=apachemaven&logoColor=white)

Aplicación de escritorio con interfaz gráfica **Swing** para convertir temperaturas entre **Celsius**, **Fahrenheit** y **Kelvin**.

[:octicons-link-external-16: Ver README completo](https://github.com/jalmx/curso_java/blob/main/NetBeansProjects/ConvertidorTemperatura/README.md)

### Capturas de pantalla

| Selección de unidad origen | Ingreso de valor y resultado | Conversión completada |
|:---:|:---:|:---:|
| ![Pantalla 1](assets/proyectos/temper_1.png) | ![Pantalla 2](assets/proyectos/temper_2.png) | ![Pantalla 3](assets/proyectos/temper_3.png) |

### Características

- Conversión entre Celsius, Fahrenheit y Kelvin (6 combinaciones)
- Radio buttons para unidad origen, combo box dinámico para destino
- Resultados formateados con 2 decimales
- Look & Feel Nimbus, ventana centrada no redimensionable

### Estructura de clases

| Clase | Descripción |
|-------|-------------|
| `ConvertidorTemperatura.java` | Punto de entrada (`main`) |
| `Principal.java` | JFrame con interfaz gráfica y eventos |

### Conceptos cubiertos

- Swing básico (`JFrame`, `JRadioButton`, `JComboBox`, `JButton`, `JTextField`)
- Layout managers (`GroupLayout`)
- Event handling (`ActionListener`)
- Formateo numérico (`String.format`)
- Lógica de conversión entre escalas

---

## 3. Ley de Ohm

![Java](https://img.shields.io/badge/Java-25-%23ED8B00?logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-GUI-blue)
![Maven](https://img.shields.io/badge/Maven-3.9-%23C71A36?logo=apachemaven&logoColor=white)

Aplicación educativa con interfaz gráfica **Swing** para calcular la **Ley de Ohm** (V = I × R). Introduce la separación entre lógica de negocio e interfaz.

[:octicons-link-external-16: Ver README completo](https://github.com/jalmx/curso_java/blob/main/NetBeansProjects/LeyOhm/README.md)

### Capturas de pantalla

| Ventana principal | Cálculo de Voltaje (V = I × R) |
|:-:|:-:|
| ![Ventana principal](assets/proyectos/ohm_1.png) | ![Cálculo de Voltaje](assets/proyectos/ohm_2.png) |

| Cálculo de Corriente (I = V / R) | Cálculo de Resistencia (R = V / I) |
|:-:|:-:|
| ![Cálculo de Corriente](assets/proyectos/ohm_3.png) | ![Cálculo de Resistencia](assets/proyectos/ohm_4.png) |

### Características

- Cálculo de **Voltaje** (V = I × R), **Corriente** (I = V / R) y **Resistencia** (R = V / I)
- Interfaz con Nimbus Look & Feel
- Resultados en fuente grande (48pt)
- Diseño con separadores entre secciones

### Estructura de clases

| Clase | Descripción |
|-------|-------------|
| `LeyOhm.java` | Punto de entrada (`main`), crea y centra la ventana |
| `Ohm.java` | Lógica de negocio: `calculateVoltage()`, `calculateCurrent()`, `calculateResistance()` |
| `Principal.java` | JFrame con interfaz gráfica y manejadores de eventos |

### Conceptos cubiertos

- Separación de responsabilidades (lógica vs UI)
- Clases de servicio con métodos estáticos
- Swing: `JButton`, `JTextField`, `JLabel`, `JTextArea`
- Manejo de eventos por botón
- Validación de entrada numérica

---

## 4. Generador de Contraseñas

![Java](https://img.shields.io/badge/Java-25-%23ED8B00?logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-GUI-blue)
![Maven](https://img.shields.io/badge/Maven-3.9-%23C71A36?logo=apachemaven&logoColor=white)

Aplicación de escritorio para generar contraseñas seguras y aleatorias con longitud personalizable y cuatro categorías de caracteres.

[:octicons-link-external-16: Ver README completo](https://github.com/jalmx/curso_java/blob/main/NetBeansProjects/GeneradorPassword/README.md)

### Capturas de pantalla

| Ventana principal | Generar contraseña | Confirmación |
|:-:|:-:|:-:|
| ![pass_1](assets/proyectos/pass_1.png) | ![pass_2](assets/proyectos/pass_2.png) | ![pass_3](assets/proyectos/pass_3.png) |

| Longitud aleatoria | Limpiar campos |
|:-:|:-:|
| ![pass_4](assets/proyectos/pass_4.png) | ![pass_5](assets/proyectos/pass_5.png) |

### Características

- **Longitud personalizable** – ingresa la cantidad de caracteres
- **Longitud aleatoria** – genera entre 4 y 19 caracteres
- **4 categorías**: minúsculas (`a–z`), mayúsculas (`A–Z`), números (`0–9`), símbolos (`|!"#$%&/()=¿?¡]*_:;,.-{}+'°¬~`)
- Botón **Limpiar** que restablece valores por defecto

### Estructura de clases

| Clase | Descripción |
|-------|-------------|
| `GeneradorPassword.java` | Punto de entrada (`main`) |
| `MainWindow.java` | JFrame con botones Generar, Random y Limpiar |
| `Password.java` | Algoritmo de generación con las 4 categorías |

### Conceptos cubiertos

- Generación aleatoria con `java.util.Random`
- Uso de `StringBuilder` para construcción eficiente de cadenas
- Manejo de conjuntos de caracteres (categorías)
- Swing: `JCheckBox`, `JSpinner`, `JTextField` no editable
- Eventos múltiples en una misma ventana

---

## 5. Estadística

![Java](https://img.shields.io/badge/Java-25-%23ED8B00?logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-GUI-blue)
![Maven](https://img.shields.io/badge/Maven-3.9-%23C71A36?logo=apachemaven&logoColor=white)
![CSV](https://img.shields.io/badge/CSV-Data%20Loading-green)

Aplicación de escritorio para cálculos estadísticos con carga de datos desde archivos **CSV**. Introduce lectura de archivos y operaciones matemáticas avanzadas.

[:octicons-link-external-16: Ver README completo](https://github.com/jalmx/curso_java/blob/main/NetBeansProjects/Estadistica/README.md)

### Capturas de pantalla

| Ventana principal | Carga de datos |
|:---:|:---:|
| ![Ventana principal](assets/proyectos/stati_1.png) | ![Carga de datos](assets/proyectos/stati_2.png) |

| Cálculo de resultados | Resultado final |
|:---:|:---:|
| ![Cálculo](assets/proyectos/stati_3.png) | ![Resultado](assets/proyectos/stati_4.png) |

### Características

- Carga de datos desde archivos **CSV**
- Cálculo de **media aritmética**
- Cálculo de **desviación estándar** poblacional
- Cálculo de **varianza**
- Cálculo de **moda** (soporta multimodalidad)
- Tabla visual para mostrar datos cargados

### Estructura de clases

| Clase | Descripción |
|-------|-------------|
| `Estadistica.java` | Punto de entrada (`main`) |
| `MainWindow.java` | JFrame con tabla, botones y panel de resultados |
| `Statistic.java` | Lógica: media, desviación estándar, varianza, moda |
| `ReadData.java` | Lector de archivos CSV |

### Conceptos cubiertos

- Lectura de archivos con `Scanner` y `File`
- Parseo de CSV
- `Math.pow()` y `Math.sqrt()`
- Algoritmos de moda (multimodal)
- Swing: `JTable`, `JScrollPane`, `JFileChooser`
- Actualización dinámica de componentes Swing

---

## 6. Transistor (Corte-Saturación)

![Java](https://img.shields.io/badge/Java-25-%23ED8B00?logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-GUI-blue)
![Maven](https://img.shields.io/badge/Maven-3.9-%23C71A36?logo=apachemaven&logoColor=white)
![CSV](https://img.shields.io/badge/CSV-Import%2FExport-green)

Aplicación de escritorio para el cálculo de resistencias de polarización de **transistores bipolares (BJT)** en modo corte-saturación. El proyecto más avanzado del repositorio, con múltiples ventanas, persistencia CSV y conversión automática de unidades.

[:octicons-link-external-16: Ver README completo](https://github.com/jalmx/curso_java/blob/main/NetBeansProjects/Transistor/README.md)

### Capturas de pantalla

| Ventana principal | Ventana de datos CSV |
|:-:|:-:|
| ![Main Window](assets/proyectos/screen1.png) | ![Data Window](assets/proyectos/screen2.png) |

### Características

- Cálculo de **Rb** (resistencia de base) y **Rc** (resistencia de colector)
- Cálculo de **Ib** (corriente de base) e **Ic** (corriente de colector)
- Conversión automática entre unidades (V, mA, µA, kΩ)
- Carga y guardado de datos de transistores desde/hacia archivos **CSV**
- Interfaz con look and feel **Nimbus**
- Visualización de resultados detallados

### Estructura de clases

```
com.transistor.app/
├── transistor/
│   └── Transistor.java          # Punto de entrada
├── ui/
│   ├── MainWindow.java          # Ventana principal (cálculos)
│   └── DataTrasistorWindow.java # Ventana de gestión CSV
├── lib/
│   ├── Calculate.java           # Fórmulas de polarización
│   ├── CONST.java               # Constantes y conversiones
│   └── ReadTransistorData.java  # Lector/escritor CSV
└── assets/
    └── tr.png                   # Icono del transistor
```

### Fórmulas implementadas

```
Ib  = Ic / β
Rb  = (VBB - VBE) / Ib
Rc  = (VCC - VRL - VCE) / Ic
```

### Conceptos cubiertos

- **Múltiples ventanas** (JFrame modales)
- Arquitectura con paquetes separados (`ui`, `lib`, `transistor`, `assets`)
- Clase de constantes (`CONST.java`) con `final static`
- Conversión entre unidades eléctricas
- **Persistencia CSV** bidireccional (lectura/escritura)
- Recursos embebidos (icono en `assets/`)
- Eventos de menú (`JMenuBar`, `JMenuItem`)
- Validación y parseo de datos complejos

---

## Resumen comparativo

| Proyecto | Líneas de código | Clases | Paquetes | GUI | Archivos | Dificultad |
|----------|:----------------:|:------:|:--------:|:---:|:--------:|:----------:|
| Practicas | ~1000 | 30 | 4 | No | No | :star: |
| ConvertidorTemperatura | ~150 | 2 | 1 | Swing | No | :star::star: |
| LeyOhm | ~200 | 3 | 1 | Swing | No | :star::star: |
| GeneradorPassword | ~200 | 3 | 1 | Swing | No | :star::star: |
| Estadistica | ~300 | 4 | 1 | Swing | CSV | :star::star::star: |
| Transistor | ~500 | 6 | 4 | Swing | CSV | :star::star::star::star: |

---

*Documentación generada a partir de los README de cada proyecto.*
*Curso de Java — [Alejandro Leyva](https://github.com/jalmx)*
