package com.lista02.app;

import java.util.Scanner;

public class Exercicio01 {
    public static void resultado(){
 
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        if(num%2==0 && num!=0){
            System.out.println("\nO número " + num + " é par");
            }
        else if (num%2!=0){
            System.out.println("\nO número " + num + " é ímpar");
            }
        else if (num==0){
            System.out.println("\nO número é zero");
            }
        else {
            System.out.println(num + " não é válido para esta operação");
            }
        sc.close();
    }
}
