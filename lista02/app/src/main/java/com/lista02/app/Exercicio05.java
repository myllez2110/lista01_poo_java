package com.lista02.app;
import java.util.Scanner;

public class Exercicio05 {
    public static void resultado(){
  
        Scanner sc = new Scanner(System.in);

        
        String usuario="admin";
        String senha="admin";
        String u="";
        String s="";

        System.out.print("Digite o Usuário: ");
        u=sc.nextLine();

        System.out.print("Digite a Senha: ");
        s=sc.nextLine();

        if (!usuario.equals(u) && senha.equals(s)) {
            System.out.println("Usuário incorreto");
        }
        else if (usuario.equals(u) && !senha.equals(s)) {
            System.out.println("Senha incorreta");
        }
        else if (!usuario.equals(u) && !senha.equals(s)) {
            System.out.println("Usuário e Senha incorretos");
        }
        else if (usuario.equals(u) && senha.equals(s)) {
            System.out.println("Login efetuado com sucesso");
        }
        sc.close();
    }
}
