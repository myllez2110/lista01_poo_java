package com.lista01.app;

import java.util.Scanner;

public class Exercicio03 {
    public static void resultado (){
        double valor_real;
        //declarado para poder ser mudado dependendo da cotação.
        double valor_dolar = 5.25;
        double valor_total;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o valor em reais: ");
        valor_real = sc.nextDouble();

        valor_total = valor_real / valor_dolar;

        System.out.printf("\nValor em dólar: %.2f", valor_total);
        
        sc.close();
    }
}
