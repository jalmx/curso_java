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
public class Estadistica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantos datos tienes:");
        int n = sc.nextInt();
        
        double lista[] = new double[n];//aqui guardas los datos
        double suma = 0;
        for(int i = 0; i < lista.length; i++){
            System.out.printf("Da el valor " + (i+1)+": ");
            lista[i] = sc.nextDouble();
            suma += lista[i];
        }
        double media = suma / n;
        
        double sumaDesviacion =0;
        
        for(int i = 0; i< lista.length; i++){
            sumaDesviacion+=Math.pow(lista[i] - media,2);
        }
        double desviacion = Math.sqrt( sumaDesviacion/n);
        
        System.out.println("La media es " + media);
        System.out.println("La desviacion es " + desviacion);
    }
    
}
