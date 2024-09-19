package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Que ambientação você prefere");
        System.out.println("1 - sci fi");
        System.out.println("2 - medieval");
        Integer opcaoAmpientacao = leitor.nextInt();

        System.out.println("Qual genero voce prefere");
        System.out.println("1 - comedia");
        System.out.println("2 - drama");
        Integer opcaoGenero = leitor.nextInt();



        if (opcaoAmpientacao == 1 && opcaoGenero == 1)
            System.out.println("Homens de Preto");
        if (opcaoAmpientacao == 1 && opcaoGenero == 2)
            System.out.println("Arrival");
        if (opcaoAmpientacao == 2 && opcaoGenero == 1)
            System.out.println("Shrek");
        if (opcaoAmpientacao == 2 && opcaoGenero == 2)
            System.out.println("Gladiador");
        else
            System.out.println("As opções escolhidas são inválidas");
    }
}