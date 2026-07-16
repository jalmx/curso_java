/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practicas;

/**
 *
 * @author xizuth
 */
public class ParImpar10 {

    public static void main(String[] args) {
        int numero = 11;

        int par = numero % 2;

        if (par == 0) {
            System.out.printf("El numero %d es par\n", numero);
        }
        if (par != 0) {
            System.out.println("Es impar");
        }
        if (numero > 10) {
            System.out.printf("El valor %d es mayor a 10\n", numero);
        }
    }
}
