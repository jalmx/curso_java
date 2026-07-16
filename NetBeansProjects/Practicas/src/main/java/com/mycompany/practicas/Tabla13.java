/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practicas;

/**
 *
 * @author xizuth
 */
public class Tabla13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tabla = 13;
        int limite = 25;
        int contador = 1;

        while (contador <= limite) {
            int resultado = tabla * contador;
            System.out.printf("%d x %d = %d\n", tabla, contador, resultado);
            contador++;
        }
        System.out.println("==============================");
        for (int i = 0; i <= limite; i++) {
            int resultado = tabla * i;
            System.out.printf("%d x %d = %d\n", tabla, i, resultado);
        }
    }

}
