/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practicas;

/**
 *
 * @author xizuth
 */
public class SegundaLey1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double masa = 2.5;
        double aceleracion = 10;
        
        double fuerza = masa * aceleracion;
        
        System.out.printf("La fueza es: %.2f N\n", fuerza);
        
        aceleracion = 12.6;
        
        fuerza = masa * aceleracion;
        
        System.out.printf("La nueva fuerza es %.3f N\n", fuerza);
    }
    
}
