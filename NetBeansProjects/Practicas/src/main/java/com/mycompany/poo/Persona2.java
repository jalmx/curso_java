/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author xizuth
 */
public class Persona2 {

    public String nombre = "Persona";
    public int edad = 18;

    public void saludar() {
        System.out.println(this.nombre + " dice: Holiiss!!! ");
    }

    public void decirEdad() {
        System.out.println("Mi edad es " + this.edad);
    }
    
    public int calcularEdad(int anio){
        int edadActual = 2026 - anio;
       // System.out.println("La edad es " + edadActual);
        return edadActual;
    }
    
    public void cenar(String comida, String bebida){
        System.out.println("Voy a cenar "+ comida + " y bebere " + bebida);
    }
    
    public static void main(String[] args) {
        Persona2 dayana = new Persona2();
        
        dayana.nombre = "Dayana";
        dayana.saludar();
        dayana.decirEdad();
        
        int edad = dayana.calcularEdad(2000);
        System.out.println("La edad actua es de " + edad +" anios");
        
        dayana.cenar("Torta de cochinita", "coca");
    }
}
