package com.lista04.app;

public class Exercicio03 {
    public static void resultado(){
        double[] vendas = {10.00, 5.50, 16.00, 1.00, 2.50, 1.00};
        double faturamento=0d;

        for (int i = 0; i < vendas.length; i++) {
            faturamento = faturamento + vendas[i];
        }
        System.out.println("\n\n\nDETALHAMENTO DO DIA:");
        System.out.println("Foram realizadas "+vendas.length+" vendas no dia");
        System.out.println("Faturamento do dia: R$"+faturamento);
        System.out.println("Ticket médio de vendas do dia: R$"+faturamento / vendas.length);
    }
}
