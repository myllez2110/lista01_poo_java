package com.lista01.app;

import java.util.Scanner;

public class Exercicio07 {
    public static void resultado(){

        Scanner leia = new Scanner(System.in);

        int alturaDesejada;
        System.out.print("Vamos construir um Quadrilátero. Qual será a altura deste quadrilátero? ");
        alturaDesejada = leia.nextInt();
        
        int larguraDesejada;
        System.out.print("Vamos construir um Quadrilátero. Qual será a largura deste quadrilátero? ");
        larguraDesejada = leia.nextInt();

        leia.close();

        if(larguraDesejada==alturaDesejada){

            System.out.println("\nMuito bem! Como este Quadrilátero tem lados iguais, ele é um QUADRADO!\n"
                    +"Aqui está seu Quadrado com tamanho de "+alturaDesejada+" por "+larguraDesejada+":");
            
            for(int numAstC=0;numAstC<alturaDesejada;numAstC++){
                System.out.print("\n");
                for(int numAstL=0; numAstL<larguraDesejada;numAstL++)
                    System.out.print("* ");
            }            
        }
        else if(larguraDesejada!=alturaDesejada){

            System.out.println("\nMuito bem! Como este Quadrilátero tem lados diferentes, ele é um RETÂNGULO!\n"
                    +"Aqui está seu Retângulo com tamanho de "+alturaDesejada+" por "+larguraDesejada+":");
            
            for(int numAstC=0;numAstC<alturaDesejada;numAstC++){
                System.out.print("\n");
                for(int numAstL=0; numAstL<larguraDesejada;numAstL++)
                    System.out.print("* ");
            }            
        }
        if(larguraDesejada==alturaDesejada){
        System.out.println("\nO que achou de seu novo Quadrado?\nDivirta-se com ele ou construa outros quadriláteros de tamanhos variados!!!\n");
        }
        else if(larguraDesejada!=alturaDesejada){
        System.out.println("\nO que achou de seu novo Retângulo?\nDivirta-se com ele ou construa outros quadriláteros de tamanhos variados!!!\n");
        }
    }
}
