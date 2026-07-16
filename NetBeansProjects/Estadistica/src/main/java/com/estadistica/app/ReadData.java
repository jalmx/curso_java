package com.estadistica.app;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * La clase {@code ReadData} se encarga de leer información numérica desde un
 * archivo de texto o CSV externo y almacenarla en una lista en memoria.
 * <p>
 * Permite además extraer la primera línea del archivo para utilizarla como
 * título o encabezado.
 * </p>
 *
 * * @author TuNombre
 * @version 1.0
 */
public class ReadData {

    /**
     * Ruta del sistema de archivos donde se encuentra el archivo a leer.
     */
    private final String filePath;

    /**
     * Lista dinámica donde se guardan los valores numéricos extraídos del
     * archivo.
     */
    private final List<Double> data;

    /**
     * Almacena la primera línea leída del archivo (generalmente el nombre de la
     * columna).
     */
    private String title;

    /**
     * Constructor de la clase. Inicializa la ruta del archivo y prepara la
     * lista vacía.
     *
     * @param filePath Ruta absoluta o relativa del archivo (ej. "datos.csv").
     */
    public ReadData(String filePath) {
        this.filePath = filePath;
        this.data = new ArrayList<>();
    }

    /**
     * Lee el archivo línea por línea, extrae el título si corresponde y
     * convierte cada línea restante en un valor numérico de tipo
     * {@code Double}.
     *
     * * @param header Booleano que indica si el archivo cuenta con una línea
     * de encabezado. Nota: Actualmente el código asume que siempre se procesa
     * la primera línea como título.
     * @return Una lista {@code List<Double>} con los datos cargados, o
     * {@code null} si ocurre un error/excepción.
     */
    public List<Double> getData(boolean header) {

        try {
            // Abre el archivo especificado en la ruta utilizando la clase Scanner
            Scanner sc = new Scanner(new File(this.filePath));

            int c = 0; // Contador de líneas procesadas

            // Ciclo que se ejecuta mientras existan más líneas de texto en el archivo
            while (sc.hasNext()) {
                if (c == 0 && header) {
                    // Si es la primera línea, la guarda en la variable de instancia 'title'
                    title = sc.nextLine();

                } else {
                    // Intenta convertir el texto de la línea actual a un objeto Double y lo añade a la lista
                    data.add(Double.valueOf(sc.nextLine()));
                }
                c++;
            }
            sc.close();

        } catch (Exception ex) {
            // Captura cualquier error (archivo no encontrado, error de formato numérico, etc.) y retorna null
            return null;
        }

        // Retorna la lista con los elementos leídos exitosamente
        return data;
    }

    /**
     * Devuelve el título o encabezado obtenido del archivo.
     *
     * @return El texto de la primera línea del archivo, o {@code null} si no se
     * ha leído el archivo.
     */
    public String getTitle() {
        return this.title;
    }

    public static void main(String[] args) {

        ReadData rd = new ReadData("datos.csv");
        System.out.println(rd.getData(true));
        System.out.println(rd.getTitle());
    }
}
