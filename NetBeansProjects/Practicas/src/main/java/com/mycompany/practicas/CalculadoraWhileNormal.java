package com.mycompany.practicas;

import java.util.Scanner;
public class CalculadoraWhileNormal {
    public static void main(String[] args) {
        // Suma y resta con opcion de salir, caso que den una opcion
        // que no existe dar mensaje de error

        //1. con opcion
        //2. break
        Scanner sc = new Scanner(System.in);
        
        int opt = 0;
        
        while (opt != 3) {// inicia while
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
        }// termina while
    }
}
