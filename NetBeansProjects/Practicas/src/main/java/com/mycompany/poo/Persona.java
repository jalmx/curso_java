/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author xizuth
 */
public class Persona {
    
    public String nombre = "Persona";
    public int edad = 18;
    
    public void saludar(String saludo){
        System.out.println(this.nombre +" dice: Holiiss!!! " + saludo);
    }
    
    public void decirEdad(){
        System.out.println("Mi edad es " + this.edad);
    }
    
    public static void main(String[] args) {
        Persona dayana = new Persona();
        Persona chipol = new Persona();
        
        dayana.saludar("Dayana");
        dayana.saludar("Saul");
        dayana.saludar("Chipol");
        chipol.decirEdad();
    }
}
