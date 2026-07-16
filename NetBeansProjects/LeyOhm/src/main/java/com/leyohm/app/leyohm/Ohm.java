/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leyohm.app.leyohm;

/**
 *
 * @author xizuth
 */
public class Ohm {
    // tiene los calculos de Ley de ohm
    
    public double calculateVoltage(double current, double resistance){
        double voltage = current * resistance;
        return voltage;
    }
    
    public double calculateResistance(double voltage, double current){
        return voltage / current;
    }
    
    public double calculateCurrent(double voltage, double resistance){
        return voltage/ resistance;
    }
    
    public static void main(String[] args) {
        // este metodo main es solo de prueba
        Ohm leyOhm = new Ohm();
        double voltaje = 5.5;
        double resistencia = 1000;
        double corriente = 0.1;
        
        System.out.println("El voltaje es " + leyOhm.calculateVoltage(corriente, resistencia));
        System.out.println("La corriente es " + leyOhm.calculateCurrent(voltaje, resistencia));
        System.out.println("La resistencia es " + leyOhm.calculateResistance(voltaje, corriente));
        
    }
}
