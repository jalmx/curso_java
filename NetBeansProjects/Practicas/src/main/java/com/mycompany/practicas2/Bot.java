package com.mycompany.practicas2;

import java.util.Random;
import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        String[] mensajesBienvenida = {"Hola", "Holiss!!", "Bienvenido"};
        String nombres[] = {"Botcito", "Bot de la ESI","Superbot"};
        String mensajes[] = {"Vamos a echar unas guamas!", "Vamos a jugar xbox",
        "Vamos al billar"};
        String mensajesEvil[] = {"Te vere en la llamas del infierno",
        "Mientras duermas entrare a tu cuarto y te voy a decuartizar",
        "okis >:)", ":("};
        
        System.out.println(mensajesBienvenida[
                r.nextInt(mensajesBienvenida.length)]);
        System.out.println("Como te llamas?!");
        String nombreUser = sc.nextLine();
        String nombreBot = nombres[r.nextInt(nombres.length)];
        System.out.printf("Es un gusto concerte %s!!, Mi nombre es %s\n", 
                nombreUser, nombreBot);
        System.out.println("Cuantos años tienes?");
        int edadUser = sc.nextInt();
        System.out.println("Wow!! Yo tengo "+ (edadUser + r.nextInt(10)) );
        System.out.println("Quieres se mi amigo?!! [1)SI 2)NO]");
        int respuesta = sc.nextInt();
        if(respuesta == 1){
            System.out.println(mensajes[r.nextInt(mensajes.length)]);
        }else{
            System.out.println(mensajesEvil[r.nextInt(mensajesEvil.length)]);
        }
    }
}
