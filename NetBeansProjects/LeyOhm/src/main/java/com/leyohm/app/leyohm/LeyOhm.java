/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.leyohm.app.leyohm;

/**
 *
 * @author xizuth
 */
public class LeyOhm {

    public static void main(String[] args) {
        //Es el archivo Main (principal) punto de entrada
        // es el archivo de donde se va a ejecutar
        // la aplicacion final
        Principal ventana = new Principal(); //hago una instancia de la app
        ventana.setVisible(true); //con esto es visible la ventana
        ventana.setLocationRelativeTo(null);// centro la ventana en la pantalla
    }
}
