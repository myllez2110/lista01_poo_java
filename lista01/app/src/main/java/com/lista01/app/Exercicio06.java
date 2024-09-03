package com.lista01.app;

import java.util.Scanner;;

public class Exercicio06 {
    public static void resultado(){

        Scanner sc = new Scanner(System.in);

        float dist, gasolina, mediaconsumo;
        
        System.out.print("Em quilômetros, digite a distancia percorrida: ");
        dist = sc.nextFloat();
        
        System.out.print("Em litros, digite o total de combustível gasto: ");
        gasolina = sc.nextFloat();

        mediaconsumo = (dist/gasolina);

        System.out.println("O a média é: "+mediaconsumo+"km/l");
        sc.close();
        }
}
