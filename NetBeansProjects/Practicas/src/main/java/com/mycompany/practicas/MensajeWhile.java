/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practicas;

/**
 *
 * @author xizuth
 */
public class MensajeWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje = "Mecatronica es mas chido!!";
        int contador = 0; //variable auxiliar que nos ayuda a contar

        while (contador < 50) {
            System.out.println((1 + contador) + " - " + mensaje);
            contador = contador + 1;
        }
    }

}
