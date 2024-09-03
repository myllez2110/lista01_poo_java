package com.lista02.app;
import java.util.Scanner;

public class Exercicio02 {
    public static void resultado(){

        Scanner sc = new Scanner(System.in);

        int num1, num2;
        
        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println("O número "+num1+" é maior que o número "+num2);
        } 
        else if (num2 > num1){
            System.out.println("O número "+num2+" é maior que o número "+num1);
        }
        else if (num1 == num2){
            System.out.println("Os números são iguais");
        }
        else {
            System.out.println("Esta opção não é reconhecida");
        }
        sc.close();
    }
}
