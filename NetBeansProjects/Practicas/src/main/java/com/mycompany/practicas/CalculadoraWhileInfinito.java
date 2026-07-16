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
public class CalculadoraWhileInfinito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        
        int opt = 0;
        
        while (true) {// inicia while-infinito
            System.out.println("CALCULADORA");
            System.out.println("1)Suma\n2)Resta\n3)Salir");
            opt = sc.nextInt();
            
            switch(opt){
                case 1:
                    System.out.println("Aqui hacemos la SUMA");
                    break;
                case 2: 
                    System.out.println("Aqui hacemos la RESTA");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("ERROR!!");
            }
            if(opt == 3){
                break;// break rompe el ciclo
            }
        }// termina while
    } 
}
