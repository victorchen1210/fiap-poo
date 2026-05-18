package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CADASTRO DO PET ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Tipo (cachorro, gato, etc.): ");
        String tipo = scanner.nextLine();

        Pet meuPet = new Pet(nome, idade, tipo);

        System.out.println("\n--- MEU PET ---");
        meuPet.exibirInfo();

        // ======================================
        // TESTES DO MÉTODO ALIMENTAR
        // ======================================
        System.out.println("\n=========================================");
        System.out.println("TESTANDO O MÉTODO ALIMENTAR");
        System.out.println("=========================================");
        
        System.out.println("\n【TESTE 1】Quantidade inválida (negativo):");
        meuPet.alimentar(-1);
        
        System.out.println("\n【TESTE 2】Quantidade inválida (maior que 3):");
        meuPet.alimentar(5);
        
        System.out.println("\n【TESTE 3】Quantidade válida:");
        meuPet.alimentar(2);
        
        System.out.println("\n【TESTE 4】Outra quantidade válida:");
        meuPet.alimentar(1);

        // ======================================
        // TESTES DO MÉTODO PASSEAR
        // ======================================
        System.out.println("\n=========================================");
        System.out.println("TESTANDO O MÉTODO PASSEAR");
        System.out.println("=========================================");
        
        System.out.println("\n【TESTE 1】Tempo inválido (negativo):");
        meuPet.passear(-10);
        
        System.out.println("\n【TESTE 2】Tempo inválido (maior que 60):");
        meuPet.passear(90);
        
        System.out.println("\n【TESTE 3】Gastando energia para testar energia insuficiente:");
        meuPet.brincar();
        meuPet.brincar();
        meuPet.brincar();
        meuPet.brincar();
        meuPet.brincar();
        meuPet.brincar();
        meuPet.brincar();
        meuPet.brincar();
        
        System.out.println("\n【TESTE 4】Tempo válido mas energia insuficiente:");
        meuPet.passear(50);
        
        System.out.println("\n【TESTE 5】Recuperando energia com dormir:");
        meuPet.dormir();
        
        System.out.println("\n【TESTE 6】Tempo válido (dentro do limite):");
        meuPet.passear(30);
        
        System.out.println("\n【TESTE 7】Mais um teste válido:");
        meuPet.passear(15);

        // ======================================
        // STATUS FINAL
        // ======================================
        System.out.println("\n=========================================");
        System.out.println("STATUS FINAL DO PET");
        System.out.println("=========================================");
        meuPet.exibirInfo();

        scanner.close();
    }
}