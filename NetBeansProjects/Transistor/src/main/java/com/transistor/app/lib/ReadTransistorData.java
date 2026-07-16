/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.transistor.app.lib;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author xizuth
 */
public class ReadTransistorData {

    /**
     * Ruta del sistema de archivos donde se encuentra el archivo a leer.
     */
    private final String filePath;

    /**
     * Lista dinámica donde se guardan los valores numéricos extraídos del
     * archivo.
     */
    private final List<List<String>> data;

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
    public ReadTransistorData(String filePath) {
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
    public List<List<String>> getData() {

        try {
            // Abre el archivo especificado en la ruta utilizando la clase Scanner
            Scanner sc = new Scanner(new File(this.filePath));

            // Ciclo que se ejecuta mientras existan más líneas de texto en el archivo
            while (sc.hasNext()) {
                // Intenta convertir el texto de la línea actual a un objeto Double y lo añade a la lista

                data.add(this.getRowData(sc.nextLine()));
            }
            sc.close();

        } catch (Exception ex) {
            // Captura cualquier error (archivo no encontrado, error de formato numérico, etc.) y retorna null
            return null;
        }

        // Retorna la lista con los elementos leídos exitosamente
        return data;
    }

    public List<String> getRowData(String row) {
        List<String> rowList = new ArrayList<>();

        for (String r : row.split(",")) {
            rowList.add(r);
        }

        return rowList;
    }

    public static void saveData(List<List<String>> data) throws IOException {
        FileWriter fw = null;
        try {
            File archivo = new File(CONST.FILE_LOCAL);
            archivo.createNewFile();

            fw = new FileWriter(archivo);
            
            for (int i = 0; i < data.size(); i++) {
                String d = data.get(i).toString().replace("[", "").replace("]", "") + "\n";
                fw.write(d);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                fw.close();
            }
        }

    }

    public static void main(String[] args) {
        ReadTransistorData rd = new ReadTransistorData("transistores.csv");
        System.out.println(rd.getData());
    }
}
