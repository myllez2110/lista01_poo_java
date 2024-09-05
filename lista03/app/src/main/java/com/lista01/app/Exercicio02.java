package com.lista01.app;
import java.util.Scanner;

public class Exercicio02 {
    public static void resultado(){

        Scanner leia = new Scanner(System.in);
        int num;
        System.out.print("\nDigite um número para ver sua tabuada: ");
        num = leia.nextInt();        
        
        System.out.print("\nA tabuada de "+num+" é:\n");
        System.out.println(num+" x 1 = "+(num*1));
        System.out.println(num+" x 2 = "+(num*2));
        System.out.println(num+" x 3 = "+(num*3));
        System.out.println(num+" x 4 = "+(num*4));
        System.out.println(num+" x 5 = "+(num*5));
        System.out.println(num+" x 6 = "+(num*6));
        System.out.println(num+" x 7 = "+(num*7));
        System.out.println(num+" x 8 = "+(num*8));
        System.out.println(num+" x 9 = "+(num*9));
        System.out.println(num+" x 10 = "+(num*10));
        leia.close();
    }
}
