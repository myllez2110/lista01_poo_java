package com.lista01.app;

import java.util.Scanner;


public class Exercicio05 {
    public static void resultado(){

        Scanner leia = new Scanner(System.in);
        
        String usuario="admin";
        String senha="admin";
        String u="";
        String s="";
        int tentativas = 3;
        
        while(tentativas>=1){
            System.out.print("Digite o Usuário: ");
            u=leia.nextLine();
            System.out.print("Digite a Senha: ");
            s=leia.nextLine();
            
            
            if (usuario.equals(u) && senha.equals(s)) { //programação positiva, primeiro faz a afirmação com o return e depois as negações
                System.out.println("Login efetuado com sucesso");
                leia.close();
                return;
            }
            else if (!usuario.equals(u) && senha.equals(s)) {
                System.out.println("Usuário incorreto");
                tentativas--;
                if(tentativas>1){
                    System.out.println("Você tem mais "+tentativas+" tentativas para efetuar o login.\n");
                }
                else if(tentativas==1){
                    System.out.println("ALERTA! VOCÊ SÓ TEM MAIS UMA TENTATIVA ANTES DE BLOQUEAR SEU ACESSO\n");
                }
            }
            
            else if (usuario.equals(u) && !senha.equals(s)) {
                System.out.println("Senha incorreta");
                tentativas--;
                if(tentativas>1){
                    System.out.println("Você tem mais "+tentativas+" tentativas para efetuar o login.\n");
                }
                else if(tentativas==1){
                    System.out.println("ALERTA! VOCÊ SÓ TEM MAIS UMA TENTATIVA ANTES DE BLOQUEAR SEU ACESSO\n");
                }
            }
            
            else if (!usuario.equals(u) && !senha.equals(s)) {
                System.out.println("Usuário e Senha incorretos");
                tentativas--;
                if(tentativas>1){
                    System.out.println("Você tem mais "+tentativas+" tentativas para efetuar o login.\n");
                }
                else if(tentativas==1){
                    System.out.println("ALERTA! VOCÊ SÓ TEM MAIS UMA TENTATIVA ANTES DE BLOQUEAR SEU ACESSO\n");
                }
            }
            //bloqueador de acesso
            if(tentativas==0){
                System.out.println("\nSEU ACESSO FOI BLOQUEADO");
                leia.close();
                return;
            }
        }
        leia.close();
    }
}
