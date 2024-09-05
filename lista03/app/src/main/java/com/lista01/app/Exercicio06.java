package com.lista01.app;

import java.util.Scanner;

public class Exercicio06 {
    public static void resultado(){
  
        Scanner leia = new Scanner(System.in);

        int andaresDesejados;
        int andaresFaltando;
        System.out.print("Vamos construir uma Pirâmide. Quantos andares você deseja construir? ");
        andaresDesejados = leia.nextInt();
        leia.close();

        int andaresConstruídos=0;
        andaresFaltando=andaresDesejados;

        System.out.println("\nMuito bem! Aqui está sua pirâmide com "+andaresDesejados+" andares:\n");
        while(andaresDesejados!=andaresConstruídos){
            for(int numeroEspacos=0; numeroEspacos<(andaresFaltando); numeroEspacos++){
                System.out.print(" ");
            }
            for(int numeroAsteriscos=0; numeroAsteriscos<=(andaresConstruídos); numeroAsteriscos++){
                System.out.print("* ");
            }            
            System.out.print("\n");

            andaresConstruídos++;
            andaresFaltando--;
        }
        System.out.println("\nO que achou de sua nova pirâmide?\nDivirta-se com ela ou construa outras de tamanhos variados!!!\n");

    }
}
