package com.lista01.app;

import java.util.Scanner;;

public class Exercicio04 {
     public static void resultado(){
        int numero;

        System.out.print("\nDigite um número: ");
        Scanner sc = new Scanner(System.in);

        numero = sc.nextInt();

        System.out.print("\nO antecessor de "+numero+" é "+(numero-1));
        System.out.print("\nO sucessor de "+numero+" é "+(numero+1));
        sc.close();
    }

}
