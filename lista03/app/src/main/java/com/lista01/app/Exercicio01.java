package com.lista01.app;

import java.util.Scanner;

public class Exercicio01 {
    public static void resultado(){
       
        Scanner leia = new Scanner(System.in);

        int segundos;
        System.out.print("\nDe 1 a 59, digite quantos segundos você deseja cronometrar: ");
        segundos = leia.nextInt();

        while(segundos<1 || segundos>59){            
                System.out.print("\nDe 1 a 59, digite quantos segundos você deseja cronometrar: ");
                segundos = leia.nextInt();            
        }

        
        if (segundos==1){System.out.println("Iniciando cronômetro com "+segundos+" segundo...");}
        else {System.out.println("Iniciando cronômetro com "+segundos+" segundos...");}
        
        for(int timer = 0; timer <= segundos; timer++){
            
            try {
                Thread.sleep(1000); // Aguarda 1 segundo                
                System.out.println("Segundos: " + timer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Timer finalizado!");
        leia.close();
    }
}
