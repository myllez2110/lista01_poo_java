package com.lista01.app;
import java.util.Scanner;

public class Exercicio08 {
    public static void resultado(){
        Scanner sc = new Scanner(System.in);

        float tempF, tempC, tempK;

        System.out.println("Digite a temperatura fornecida em Fahrenheit: ");
        tempF = sc.nextFloat();

        tempC = ((tempF-32)/1.8f);
        tempK = (tempC+273.15f);
        System.out.println("Convertendo para Celsius, "
                            +"a temperatura está em "+tempC+"°C ("+tempF+"°F ou "+tempK+"K)");
        sc.close();
    }
}
