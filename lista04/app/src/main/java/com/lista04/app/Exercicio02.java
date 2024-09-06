package com.lista04.app;

public class Exercicio02 {
    public static void resultado(){;

        double[] vendas = {10.00, 5.50, 16.00, 1.00, 2.50, 1.00};
        
        double valorMenor=500;
        double valorMaior=0;

        for(int i=0; i<6;i++){
            if (valorMenor>vendas[i]){valorMenor = vendas[i];}
            if (valorMaior<vendas[i]){valorMaior = vendas[i];}            
        }
        System.out.println("A maior venda foi de R$"+valorMaior);
        System.out.println("A menor venda foi de R$"+valorMenor);

    }
}
