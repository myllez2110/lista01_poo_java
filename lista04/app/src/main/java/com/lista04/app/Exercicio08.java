package com.lista04.app;

import java.util.Scanner;

public class Exercicio08 {
    public static void resultado(){
        System.out.println("Esta é sua lista de compras.\nDIGITE:");
        System.out.println("1 - Para ver sua lista");
        System.out.println("2 - Para adicionar um item");
        System.out.println("3 - Para remover um item");
        System.out.println("4 - Para ordenar os itens por preço");
        System.out.println("\n0 - Para encerrar");

        String[] lista = new String[9]; 
        double[] preco = new double[9];  
        int[] posicao = new int[9];      

        String maior;    
        String menor;    
        double precoMaior; 
        double precoMenor;

        String itemAdicionado;  
        double precoAdicionado; 
        int posicaoAdicionada;  
        int remocao;            
        int opcao;             
        int tamanhoLista=0;     
        int repetidor;          

        Scanner leia = new Scanner(System.in);
        opcao = leia.nextInt();
        Scanner leiaString = new Scanner(System.in);
        Scanner leiaDouble = new Scanner(System.in);
        Scanner leiaIndex = new Scanner(System.in);
        


        for (int i = 0; i < lista.length; i++) { 
            lista[i]="Vazio";
            preco[i]=0d;
        }

        while(opcao!=0){

            switch (opcao) {
                case 1:
                    System.out.println("\n\nLISTA DE COMPRAS:");
                    for (int i = 0; i < lista.length; i++) {
                        System.out.println(i+1+" - "+lista[i]+" | R$"+preco[i]);
                    }
                break;                    
                case 2:
                    System.out.println("\nADICIONAR ITEM:");                    
                    if(tamanhoLista<lista.length){
                        for (int i = 0; i < lista.length; i++) {
                            if(lista[i].equals("Vazio")){
                                System.out.print("Digite o nome do item: ");
                                itemAdicionado=leiaString.nextLine();
                                System.out.print("Insira o preço do item: R$");
                                precoAdicionado=leiaDouble.nextDouble();
                                System.out.println("\n");
                                lista[i]=itemAdicionado;
                                preco[i]=precoAdicionado;
                                posicaoAdicionada=i;
                                posicao[i]=posicaoAdicionada;

                                tamanhoLista++;
                                break;
                            }                        
                        }                    
                }
                else {
                    System.out.println("Lista de compras cheia\n");
                }
                
                break;
                case 3:
                    System.out.println("\nREMOVER ITEM:"); 
                    System.out.println("Esta é sua lista de compras:");
                    for (int i = 0; i < lista.length; i++) {
                    System.out.println(i+1+" - "+lista[i]+" | R$"+preco[i]);
                }
                System.out.println("Qual item deseja remover?");
                if (tamanhoLista==0)
                    {System.out.println("\nLista Completamente VAZIA\nRetornando ao MENU");}
                else{
                    remocao = leiaIndex.nextInt();
                    if (remocao>lista.length||remocao<0){
                        System.out.println("Opção não existe na lista");
                    }
                    else if(lista[remocao-1].equals("Vazio")){
                        System.out.println("Espaço "+remocao+" ja se encontra vazio");
                    }
                    else{
                    lista[remocao-1]="Vazio";
                    preco[remocao-1]=0d;                        
                    tamanhoLista--;
                    System.out.println("Item "+remocao+" removido da lista");
                    }
                }
                break;
                case 4:                    
                    System.out.println("\n\nLISTA DE COMPRAS ORDENADA:");
                    repetidor=0;                                            
                    while(repetidor<10){                                    
                        for (int i = 0; i < lista.length; i++) {           
                            for(int i2 = 0; i2 < lista.length; i2++){       
                            
                                if(preco[i]>preco[i2]){ 
                                    if(i>i2){           
                                    }
                                    else if(i<i2){      
                                        menor=lista[i]; 
                                        maior=lista[i2];
                                        lista[i]=maior; 
                                        lista[i2]=menor;
                                        precoMenor=preco[i];
                                        precoMaior=preco[i2];
                                        preco[i]=precoMaior;
                                        preco[i2]=precoMenor;
                                    }

                                }
                            }   
                        }            
                        repetidor++; 
                    }   
                for (int i = 0; i < posicao.length; i++) {
                    System.out.println(i+1+" - "+lista[i]+" | R$"+preco[i]);                   
                }                     
                repetidor=0;
                break;
                case 0:
                System.out.println("\n\nEncerrando aplicação");
                break;
                default:
                System.out.println("\n\nDigite uma das opções do Menu");

                break;                    
            }
            System.out.println("\nMENU\n1-Ver lista\n2-Adicionar Item\n3-Remover Item\n4-Ordenar por Preço\n0-Sair");
            opcao = leia.nextInt();
        }
        System.out.println("Encerrando aplicação\n\n");
        leia.close();
        leiaString.close();
        leiaIndex.close();
        leiaDouble.close();

    }

}
