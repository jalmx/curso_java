package com.estadistica.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * La clase {@code Statistic} proporciona herramientas para realizar cálculos estadísticos básicos
 * sobre un conjunto de datos de tipo numérico (double).
 * <p>
 * Permite calcular la media, la desviación estándar, la varianza y la moda de una serie de datos.
 * </p>
 * * @author TuNombre
 * @version 1.0
 */
public class Statistic {

    /** Lista interna que almacena los datos numéricos sobre los cuales se realizarán los cálculos. */
    private ArrayList<Double> data = null;
    
    /** Almacena el valor de la media calculada. Se inicializa en -1 como bandera de control. */
    private double mean = -1;
    
    /** Almacena el valor de la desviación estándar calculada. */
    private double desv;
    
    /** Almacena el valor de la varianza calculada. Se inicializa en -1 como bandera de control. */
    private double variance = -1;

    /**
     * Constructor que acepta un arreglo unidimensional de tipo {@code double}.
     * Convierte el arreglo en un {@code ArrayList} interno para su manipulación.
     * * @param data Arreglo de datos numéricos flotantes.
     */
    public Statistic(double data[]) {
        this.data = new ArrayList<>();
        // Copia cada elemento del arreglo nativo a la lista dinámica
        for (double d : data) {
            this.data.add(d);
        }
    }

    /**
     * Constructor que acepta directamente una lista de tipo {@code ArrayList<Double>}.
     * * @param data Lista de datos numéricos en un objeto {@code ArrayList}.
     */
    public Statistic(ArrayList<Double> data) {
        this.data = data;
    }

    /**
     * Calcula y devuelve la media aritmética (promedio) de los datos.
     * * @return El promedio acumulado de todos los elementos en la lista.
     */
    public double getMean() {
        double sum = 0;
        mean = 0; // Reinicia el valor de la media para el cálculo actual

        // Suma iterativa de todos los valores del conjunto
        for (double d : this.data) {
            sum += d;
        }
        
        // Divide el total acumulado entre la cantidad de elementos
        mean = sum / this.data.size();
        return mean;
    }

    /**
     * Calcula y devuelve la desviación estándar poblacional de los datos.
     * <p>
     * Nota: Este método calcula internamente la varianza como paso previo.
     * </p>
     * @return La desviación estándar (raíz cuadrada de la varianza).
     */
    public double getDesvStd() {
        double sum = 0;

        // Si la media no ha sido calculada previamente (sigue en -1), la calcula primero
        if (mean == -1) {
            this.getMean();
        }

        // Sumatoria de las diferencias al cuadrado entre cada dato y la media: Σ(xi - x̄)²
        for (double d : this.data) {
            sum += Math.pow(this.mean - d, 2);
        }

        // Cálculo de la varianza (promedio de las diferencias al cuadrado)
        this.variance = sum / this.data.size();

        // La desviación estándar es la raíz cuadrada de la varianza
        this.desv = Math.sqrt(this.variance);
        return this.desv;
    }

    /**
     * Devuelve la varianza de los datos.
     * <p>
     * Si la varianza no se ha calculado antes, invoca al método de desviación estándar 
     * para forzar su cálculo.
     * </p>
     * * @return El valor de la varianza.
     */
    public double getVariance() {
        // Verifica si no se ha calculado la varianza previamente
        if (this.variance == -1) {
            this.getDesvStd(); // Al calcular la desviación, se calcula automáticamente la varianza
        }

        return variance;
    }

    /**
     * Determina la moda o modas del conjunto de datos.
     * <p>
     * Si ningún dato se repite (frecuencia máxima es 1), se asume que no hay moda
     * y el método retorna {@code null}. En caso de existir bimodalidad o multimodalidad,
     * se retornarán todos los valores que compartan la frecuencia máxima.
     * </p>
     * * @return Una lista {@code List<Double>} con el o los valores más frecuentes, 
     * o {@code null} si no hay repeticiones.
     */
    public List<Double> getModa() {
        // Mapa para registrar la frecuencia: Clave (Número) -> Valor (Cantidad de repeticiones)
        Map<Double, Integer> frequency = new HashMap<>();

        // Paso 1: Contar las ocurrencias de cada número en la lista
        for (double num : this.data) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        // Paso 2: Encontrar cuál es la frecuencia más alta registrada
        int maxFrecuencia = 0;
        for (int freq : frequency.values()) {
            if (freq > maxFrecuencia) {
                maxFrecuencia = freq;
            }
        }

        List<Double> modas = new ArrayList<>();

        // Si la frecuencia máxima es 1 o menos, significa que no hay números repetidos
        if (maxFrecuencia <= 1) {
            return null; 
        }

        // Paso 3: Filtrar y agregar a la lista todos los números que alcancen la frecuencia máxima
        for (Map.Entry<Double, Integer> entrada : frequency.entrySet()) {
            if (entrada.getValue() == maxFrecuencia) {
                modas.add(entrada.getKey());
            }
        }

        return modas;
    }

    
    public static void main(String[] args) {
        Statistic st = new Statistic(new double[]{1, 3, 4});

        System.out.println("Media: " + st.getMean());
        System.out.println("Desviación Estándar: " + st.getDesvStd());
        System.out.println("Moda(s): " + st.getModa());
    }
}