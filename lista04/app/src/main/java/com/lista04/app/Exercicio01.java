package com.lista04.app;

public class Exercicio01 {
    public static void resultado(){

        double[] vendas = {10.00, 5.50, 16.00, 1.00, 2.50, 1.00};
        double soma=0;
        double valor;

        for(int i=0; i<6;i++){
            System.out.println((i+1)+"º venda | R$"+vendas[i]);
            valor = vendas[i];
            soma += valor;
            
        }
        System.out.println("_________________________");
        System.out.println("Fechamento do dia R$"+soma);
        System.out.println("_________________________");
    }
}
