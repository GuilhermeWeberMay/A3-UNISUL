package br.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaração de variaveis
        int opcao;

        // Menu inicial
        System.out.println("XYZ COMERCIO DE PRODUTOS LTDA.");
        System.out.println("SISTEMA DE CONTAS A PAGAR\n");
        System.out.println("MENU PRINCIPAL\n");
        System.out.println("1 - CADASTRO DE CONTAS");
        System.out.println("2 - BAIXA DE CONTAS");
        System.out.println("3 - RELATÓRIOS");
        System.out.println("0 - FINALIZAR");
        System.out.print("OPÇÃO : ");
        opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println("XYZ COMERCIO DE PRODUTOS LTDA.");
            System.out.println("SISTEMA DE CONTAS A PAGAR");
            System.out.println("\nCADASTRO DE CONTAS");
            System.out.println("1 - INCLUSÃO");
            System.out.println("2 - ALTERAÇÃO");
            System.out.println("3 - CONSULTAR");
            System.out.println("4 - EXCLUSÃO");
            System.out.println("0 - RETORNAR");
            System.out.print("OPÇÃO : ");
        }
    }
}