/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practicas;

import java.util.Scanner;

/**
 *
 * @author xizuth
 */
public class CalculadoraSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1)Suma\n2)Resta\n3)Mult\n4)Div");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("Da el valor 1");
                double n1 = sc.nextDouble();
                System.out.println("Da el valor 2");
                double n2 = sc.nextDouble();
                System.out.println("La suma es " + (n1 + n2));
                break;
            case 2:
                System.out.println("Aqui va la resta");
                break;
            case 3:
                System.out.println("Aqui la multiplicacion");
                break;
            case 4:
                System.out.println("Aqui la division");
                break;
            default:
                System.out.println("La opcion no existe");
        }
    }
}
