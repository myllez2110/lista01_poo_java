package com.lista02.app;
import java.util.Scanner;

public class Exercicio03 {
    public static void resultado(){

        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.println("\nVocê tem mais de 65 anos? \n1-Sim\n0-Não");
        opcao=sc.nextInt();
            if (opcao==1) {
                System.out.println("Vá para a fila preferencial");
            } else {
                System.out.println("\nVocê é uma Pessoa com Deficiência(PCD)? \n1-Sim\n0-Não");
                opcao=sc.nextInt();
                if (opcao==1) {
                    System.out.println("Vá para a fila preferencial");
                } else {
                    System.out.println("\nVocê é Gestante? \n1-Sim\n0-Não");
                    opcao=sc.nextInt();
                    if (opcao==1) {
                        System.out.println("Vá para a fila preferencial");
                    } else {
                        System.out.println("Vá para a fila comum");
                    }
                }
            }  
        sc.close();      
    }

}
