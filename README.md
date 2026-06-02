# Curso de programación en JAVA de Cero

Documentación de un curso de Java desde cero, cubriendo fundamentos hasta temas avanzados como POO, colecciones, bases de datos e interfaz gráfica.

## Contenido del curso

| Módulo | Archivo | Descripción |
| ------ | ------- | ----------- |
| 1 | [`01_introduccion.md`](docs/01_intoduccion.md) | ¿Qué es Java?, proceso de compilación, primer "Hola Mundo", reglas para nombrar archivos |
| 2 | [`02_variables.md`](docs/02_variables.md) | Variables, tipos primitivos y de referencia, reglas de nomenclatura, comentarios, Wrapper Classes |
| 3 | [`03_declaracion_de_variables.md`](docs/03_declaracion_de_variables.md) | Sintaxis de declaración y asignación, constantes con `final` |
| 4 | [`04_estructura_archivo.md`](docs/04_estructura_archivo.md) | Estructura base de un archivo Java (`package`, `class`, `main`) |
| 5 | [`05_funcion_print.md`](docs/05_funcion_print.md) | `print()`, `println()`, `printf()`, `format()`, concatenación |
| 6 | [`index.md`](docs/index.md) | Archivo principal que integra todos los temas |

## Temas cubiertos

- **Fundamentos:** Sintaxis básica, variables, tipos de datos, comentarios
- **Operadores:** Aritméticos, relacionales, lógicos, combinados
- **Control de flujo:** `if/else`, `switch`, operador ternario, `for`, `while`, `do-while`, `break/continue`
- **Arreglos:** Unidimensionales, bidimensionales (`n x m`)
- **POO:** Clases, objetos, métodos, constructores, `this`, `static`, `final`, sobrecarga, herencia, `super`, `@Override`, polimorfismo, clases abstractas, interfaces
- **Manejo de errores:** `try/catch/finally`, excepciones verificadas y no verificadas, `throw/throws`, excepciones personalizadas
- **Genéricos:** Clases y métodos genéricos, tipos RAW
- **Colecciones:** `ArrayList`, `HashMap`, `foreach`
- **Interfaz gráfica:** Ventanas, botones, etiquetas, campos de texto, eventos
- **Archivos:** Clase `File`, creación de archivos y directorios
- **Librería `Math`:** Funciones matemáticas (`sqrt`, `pow`, `sin`, `cos`, `abs`)


## For developer

1. I used `uv` for environment
2. Create a venv with uv: `uv venv .venv --python 3.9`
3. Activate the venv with `source .venv/bin/activate`
4. Install poetry with `uv pip install poetry`
5. Install dependencies with `poetry install --no-ansi`
6. Run the command to view live `poetry run mkdocs serve --livereload`
7. Done!
