/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practicas;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author xizuth
 */
public class AdivinaNumero {

    public static void main(String[] args) {
        
        Random numero = new Random();// se crea el objeto random
        Scanner sc = new Scanner(System.in);
        int valorRandom =  numero.nextInt(0,10); //guardo el numero random
        int vidas = 3;
        
        System.out.println("El numero: " + valorRandom);//se eliminara despues
        
        System.out.println("== ADIVINA EL NUMERO ===");
        while(true){
            System.out.println("Dime el valor:");
            int valor = sc.nextInt();
            
            if(valorRandom == valor){
                System.out.println("Ganaste!! Adivinaste el numero");
                break;
            }else if(valor > valorRandom){
                System.out.println("El numero es menor");
                vidas--;
            }else if(valor < valorRandom){
                System.out.println("El numero es mayor!");
                vidas--;
            }
            if(vidas <= 0){
                System.out.println("PERDISTE :(");
                System.out.println("El numero era: " + valorRandom);
                break;
            }
        }
               
    }
}
