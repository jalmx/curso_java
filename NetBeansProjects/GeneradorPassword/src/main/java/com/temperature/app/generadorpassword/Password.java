/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.temperature.app.generadorpassword;

import java.util.Random;

/**
 *
 * @author xizuth
 */
public class Password {

    /**
     * Devolver las letras
     *
     * @return
     */
    private String getLetterLower() {
        String letters = "";

        for (char i = 'a'; i <= 'z'; i++) {
            letters += Character.toString(i);
        }
        return letters;
    }

    /**
     * Retorna las lestra en mayusculas
     *
     * @return
     */
    private String getLetterUpper() {
        return this.getLetterLower().toUpperCase();
    }

    /**
     * Retorna un string con los numeros del 0 al 9
     *
     * @return
     */
    private String getNumbers() {
        String numbers = "";

        for (int i = 0; i < 10; i++) {
            numbers += Integer.toString(i);
        }
        return numbers;
    }

    private String getSymbols() {
        return "|!\"#$%&/()=¿?¡]*_:;,.-{}+\\\'°¬~`";
    }

    public String getPassword(int length) {
        String password = "";
        String characters[] = {
            this.getLetterLower(),
            this.getLetterUpper(),
            this.getSymbols(),
            this.getNumbers()};
        
        Random r = new Random();
        
        while (password.length() < length) {
            
            String symbol = characters[ r.nextInt(characters.length)];
            password += String.valueOf(
                    symbol.charAt(
                            r.nextInt(symbol.length())
                    )
            );      
        }//termina while
        return password;
    }

    public static void main(String[] args) {
        System.out.println(new Password().getPassword(10));
    }
}
