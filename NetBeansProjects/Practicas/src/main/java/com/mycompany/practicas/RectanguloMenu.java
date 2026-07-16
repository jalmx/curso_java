package com.mycompany.practicas;

import java.util.Scanner;

public class RectanguloMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        System.out.println("AREA-PERIMETRO RECTANGULO");
        System.out.println("1)Area\n2)Perimetro\n3)Salir");
        opt = sc.nextInt();

        if (opt == 1) {
            System.out.println("AREA");
            System.out.println("Da la base:");
            double base = sc.nextDouble();
            System.out.println("Da la altura");
            double altura = sc.nextDouble();
            System.out.printf("El area es %.2f", base * altura);
        } else if (opt == 2) {
            System.out.println("PERIMETRO");
            System.out.println("Da la base:");
            double base = sc.nextDouble();
            System.out.println("Da la altura");
            double altura = sc.nextDouble();
            System.out.printf("El area es %.2f", (2 * base) + (2 * altura));
        }else if(opt == 3){
            System.out.println("Saliendo");
        }else {
            System.out.println("Opcion no existe");
        }
    }
}
