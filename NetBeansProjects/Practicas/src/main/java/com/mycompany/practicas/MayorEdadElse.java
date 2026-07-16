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
public class MayorEdadElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Dame tu edad:");
        int edad = scanner.nextInt();
        
        if(edad >= 18){
            System.out.println("Te toca tambo");
        }else{
            System.out.println("Taz tierno");
        }
    }
    
}
