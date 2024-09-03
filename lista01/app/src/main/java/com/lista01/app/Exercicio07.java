package com.lista01.app;

import java.util.Scanner;

public class Exercicio07 {
    public static void resultado(){

        Scanner sc = new Scanner(System.in);

        String aluno;
        float nota1, nota2, nota3, nota4, media;

        System.out.print("Digite o nome: ");
        aluno = sc.nextLine();

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextFloat();

        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextFloat();

        System.out.print("Digite a terceira nota: ");
        nota3 = sc.nextFloat();

        System.out.print("Digite a quarta nota: ");
        nota4 = sc.nextFloat();

        media = ((nota1+nota2+nota3+nota4)/4);

        System.out.println("\nAluno(a): "+aluno+" | Média: "+media
                            +"\t| Nota 1: "+nota1+"\t| Nota 2: "+nota2
                            +"\t| Nota 3: "+nota3+"\t| Nota 4: "+nota4);

        sc.close();

    }
}
