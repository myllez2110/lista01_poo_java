package com.lista01.app;

import java.util.Scanner;

public class Exercicio01 {
    public static void resultado(){
        //double pois o enunciado não indica que os números são inteiros.
        
        double n1, n2;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o primeiro número: ");
        n1 = sc.nextDouble();

        System.out.print("\nDigite o segundo número: ");
        n2 = sc.nextDouble();
        
        double soma = n1 + n2;
        System.out.print("\nResultado da soma é: " + soma);

        //fechar o scanner.
        sc.close();
    }
}
