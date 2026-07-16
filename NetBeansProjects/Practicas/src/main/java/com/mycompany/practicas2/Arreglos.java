/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practicas2;

import java.util.Scanner;

/**
 *
 * @author xizuth
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarar array de 5 espacios vacios
        int numeros[] = new int[4];

        //declarar un array con 4 valores inicializado
        double numeros2[] = {3.7, 4.55, 34.23, 10.05};

        // agregar datos a un array
        // quiero agregar 5, 7, 10, 4
        numeros[0] = 5;
        numeros[1] = 7;
        numeros[2] = 10;
        numeros[3] = 4;

        System.out.println("El valor en la posicion 1: " + numeros[0]);
        System.out.println("El valor en la posicion 2: " + numeros[1]);
        System.out.println("El valor en la posicion 3: " + numeros[2]);
        System.out.println("El valor en la posicion 4: " + numeros[3]);
        // cambiando el valor de la posicion 3 por el valor de 6 e imprimen
        numeros[2] = 6;
        System.out.println("El valor en la posicion 1: " + numeros[0]);
        System.out.println("El valor en la posicion 2: " + numeros[1]);
        System.out.println("El valor en la posicion 3: " + numeros[2]);
        System.out.println("El valor en la posicion 4: " + numeros[3]);

        for (int i = 0; i < 4; i++) {
            System.out.printf("El array de doubles, posicion[%d]: %f\n",
                    i, numeros2[i]);
        }
        //crear un array que contenga 5 frutas, 4 cargadas por default y 
        // depues cargar la ultima de manera indipendiente e imprimir todo
        Scanner sc = new Scanner(System.in);
        String frutas[] = {"Manzana", "Pera", "Platano", "Kiwi", "Durazno",""};
        frutas[5] = "Piña";

        for (int i = 0; i < frutas.length; i++) {
            System.out.printf("Fruta numero %d: %s\n", i, frutas[i]);
        }
    }

}
