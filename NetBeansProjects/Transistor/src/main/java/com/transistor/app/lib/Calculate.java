/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.transistor.app.lib;

/**
 *
 * @author xizuth
 */
public class Calculate {

    public static double V07 = 0.7;

    public static double getRb(double Vbb, double Vbe, double Ib) {

        return (Vbb - Vbe) / Ib;

    }

    public static double getIb(double Ic, int beta) {
        return Ic / beta;
    }

    public static double getRl(double Vcc, double VRl, double Vce, double Ic) {
        return (Vcc - VRl - Vce) / Ic;
    }

}
