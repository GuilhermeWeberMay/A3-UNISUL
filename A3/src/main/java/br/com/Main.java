package br.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaração de variaveis
        int opcao;
        System.out.println("XYZ COMERCIO DE PRODUTOS LTDA.");
        System.out.println("SISTEMA DE CONTAS A PAGAR\n");
        System.out.println("MENU PRINCIPAL\n");
        System.out.println("1 - CADASTRO DE CONTAS");
        System.out.println("2 - BAIXA DE CONTAS");
        System.out.println("3 - RELATÓRIOS");
        System.out.println("0 - FINALIZAR");
        System.out.print("OPÇÃO : ");
        opcao = sc.nextInt();

    }
}