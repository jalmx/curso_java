/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practicas;

/**
 *
 * @author xizuth
 */
public class MensajeCalificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int calificacion = 6;
        
        if(calificacion < 6 && calificacion >= 0){
            System.out.println("Lastima margarito");
        }
        if(calificacion >=6 && calificacion <7){
            System.out.println("De panzaso");
        }
        if(calificacion >= 7 && calificacion <8){
            System.out.println("Echale punch");
        }
        if(calificacion >= 8 && calificacion <9){
            System.out.println("Bien, pueedes mejorar");
        }
        if(calificacion >= 9 && calificacion <10){
            System.out.println("Muy bien, te falto paquito");
        }
        if(calificacion == 10){
            System.out.println("Excelente");
        }
        if(calificacion < 0  || calificacion >10){
            System.out.println("Calificacion no posible");
        }
    }
}
