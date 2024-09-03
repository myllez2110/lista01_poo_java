package com.lista02.app;
import java.util.Scanner;

public class Exercicio08 {
    public static void resultado(){

        Scanner sc = new Scanner(System.in);

        int erros=0, acertos=0, perguntas=0, resposta;

        System.out.println("Boas vindas ao SerraQuiz! \n"
                            +"Acerte as perguntas e some pontos. "
                            +"Erre 3 e perca tudo!!");


        while (erros<3){            
            System.out.println("Acertos: "+acertos+" | Erros: "+erros);
            System.out.println("Pergunta número 1:\n"
                +"Qual é o nome do tipo int?\n"
                +"1)Integro\n2)Inteiro\n3)Int apenas\n4)Caracter\n5)Numérico");
            resposta=sc.nextInt();
            if (resposta==2) {acertos+=1; perguntas+=1;}  
            if (resposta!=2) {erros+=1; perguntas+=1;}

            System.out.println("Acertos: "+acertos+" | Erros: "+erros);
            System.out.println("Pergunta número 2:\n"
                +"Qual palavra-chave em Java é usada para definir uma classe?\n"
                +"1)new\n2)object\n3)Extends\n4)interface\n5)Classe");
            resposta=sc.nextInt();
            if (resposta==5) {acertos+=1; perguntas+=1;}  
            if (resposta!=5) {erros+=1; perguntas+=1;}    

            System.out.println("Acertos: "+acertos+" | Erros: "+erros);
            System.out.println("Pergunta número 3:\n"
            +"Qual das seguintes opções NÃO é um tipo primitivo em Java?\n"
            +"1)String\n2)int\n3)float\n4)char\n5)boolean");
            resposta=sc.nextInt();
            if (resposta==1) {acertos+=1; perguntas+=1;}  
            if (resposta!=1) {erros+=1; perguntas+=1;}
            if (erros==3) {
                break;
            }

            System.out.println("Acertos: "+acertos+" | Erros: "+erros);
            System.out.println("Pergunta número 4:\n"
                +"Qual dos seguintes é o método correto para iniciar a execução de um programa Java?\n"
                +"1)start\n2)run()\n3)main()\n4)init()\n5)execute()");
            resposta=sc.nextInt();
            if (resposta==3) {acertos+=1; perguntas+=1;}  
            if (resposta!=3) {erros+=1; perguntas+=1;}
            if (erros==3) {
                break;
            }

            System.out.println("Acertos: "+acertos+" | Erros: "+erros);
            System.out.println("Pergunta número 5:\n"
                +"Qual é o valor padrão de uma variável do tipo boolean em Java?\n"
                +"1)true\n2)undefined\n3)0\n4)false\n5)null");
            resposta=sc.nextInt();            
            if (resposta==4) {acertos+=1; perguntas+=1;}  
            if (resposta!=4) {erros+=1; perguntas+=1;}         
            if (erros==3 || perguntas==5) {
                break;
            }

        }
        

        if (erros==3) {     
            System.out.println("3 erros!");
        }
        else if (acertos == 5) {
            System.out.println("Acertou todas!");
        }
        else {
            System.out.println("Você fez "+acertos+" pontos");
        }
        sc.close();
    }

}
