/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author xizuth
 */
public class Auto {
    
    public String nombre = "Mi carrito";
    public int noPuertas = 4;
    public long kilometraje = 1489;
    
    public void arrancar() {
        System.out.println("Arrancando la nave del olvido");
    }

    public void acelerar() {
        System.out.println("Metiendole punch!!! -->>");
    }

    public static void main(String[] args) {
        
        Auto carrito1 = new Auto();//creando una instancia de Auto
        Auto carrito2 = new Auto(); // creo otra instancia de Auto
        
        System.out.println("Carrito 1: "+carrito1.nombre);
        System.out.println("no Puertas: "+carrito1.noPuertas);
        System.out.println("Kilometraje: "+carrito1.kilometraje);
        carrito1.arrancar();
        carrito1.acelerar();
        
        System.out.println("Carrito 2: "+carrito2.nombre);
        System.out.println("no Puertas: "+carrito2.noPuertas);
        System.out.println("Kilometraje: "+carrito2.kilometraje);
        carrito2.arrancar();
        carrito2.acelerar();
    }

}
