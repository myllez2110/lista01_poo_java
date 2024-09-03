package com.lista02.app;
import java.util.Scanner;

public class Exercicio04 {
    public static void resultado(){

        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.println("Sua idade: ");
        idade = sc.nextInt();

        if (idade >= 18){
            System.out.println("Pode entrar normalmente no evento");;
        } 
              else if (idade < 18 && idade >= 16){
                  System.out.println("Pode entrar no evento somente acompanhado de responsável");
              } 
                    else {
                        System.out.println("Não pode entrar no evento");
                    }
    sc.close();
    }
}
