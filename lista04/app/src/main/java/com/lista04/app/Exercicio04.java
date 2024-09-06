package com.lista04.app;

public class Exercicio04 {
    public static void resultado(){
        int[] lista = {3, 5, 6, 7, 8, 10, 22, 55, 110};
        int numerosP=0;
        for (int i = 0; i < lista.length; i++) {            
            if (lista[i]%2==0){numerosP++;}
        }
        System.out.println("\nO total é de "+numerosP+" números pares \n\n");

    }

}
