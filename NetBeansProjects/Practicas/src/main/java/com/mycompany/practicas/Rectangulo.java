/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practicas;

/**
 *
 * @author xizuth
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double base = 4.65;
        double altura = 345.2;

        double area = base * altura;
        double perimetro = (2 * base) + (2 * altura);

        System.out.printf("El ares es %f\n", area);
        System.out.printf("El perimetro es %f\n", perimetro);
    }

}
