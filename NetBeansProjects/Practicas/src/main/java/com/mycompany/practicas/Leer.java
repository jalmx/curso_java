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
public class Leer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); //objeto para leer de teclado
        
        String nombre = "";
        System.out.println("Da tu nombre: ");
        nombre = leer.nextLine();// voy a leer un string del usuario
        
        System.out.println("Hola, mucho gusto " + nombre +" :D ");
        
        System.out.println("Da tu edad");
        int edad = leer.nextInt();
        System.out.println("Orale, yo tengo " + (edad +5) +" anios");
        
        System.out.println("Cuanta lana traes?");
        double dinero = leer.nextDouble();
        System.out.println("Prestame " + ( dinero - 5)+ " pesos");
        
    }
    
}
