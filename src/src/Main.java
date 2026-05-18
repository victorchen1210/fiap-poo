package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("--- CADASTRO DO TUTOR ---");
        System.out.print("Nome do Tutor: ");
        String nomeTutor = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        
        Tutor tutor = new Tutor(nomeTutor, telefone, email);

        
        System.out.println("\n--- CADASTRO DO PET ---");
        System.out.print("Nome do Pet: ");
        String nomePet = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Tipo (cachorro, gato, etc.): ");
        String tipo = scanner.nextLine();

        
        Pet meuPet = new Pet(nomePet, idade, tipo, tutor);

        
        System.out.println("\n=========================================");
        System.out.println("TESTANDO A ASSOCIAÇÃO PET <-> TUTOR");
        System.out.println("=========================================");

        System.out.println("\n【TESTE 1】Exibir informações do Pet (inclui Tutor):");
        meuPet.exibirInfo();

        System.out.println("\n【TESTE 2】Acessar dados do Tutor através do Pet:");
        System.out.println("   Nome do Tutor: " + meuPet.getTutor().getNome());
        System.out.println("   Telefone do Tutor: " + meuPet.getTutor().getTelefone());
        System.out.println("   Email do Tutor: " + meuPet.getTutor().getEmail());

        System.out.println("\n【TESTE 3】Chamar método diretamente do Tutor via Pet:");
        meuPet.getTutor().exibirInfo();

        
        System.out.println("\n=========================================");
        System.out.println("TESTANDO O ENCAPSULAMENTO (GETTERS E SETTERS)");
        System.out.println("=========================================");

        System.out.println("\n【TESTE 4】Usando GETTERS para ler valores:");
        System.out.println("   Nome via getNome(): " + meuPet.getNome());
        System.out.println("   Idade via getIdade(): " + meuPet.getIdade());
        System.out.println("   Tipo via getTipo(): " + meuPet.getTipo());
        System.out.println("   Energia via getEnergia(): " + meuPet.getEnergia());
        System.out.println("   Fome via getFome(): " + meuPet.getFome());

        System.out.println("\n【TESTE 5】Usando SETTERS com valores INVÁLIDOS:");
        meuPet.setIdade(-5);
        meuPet.setIdade(99);
        meuPet.setEnergia(-50);
        meuPet.setFome(-20);

        System.out.println("\n【TESTE 6】Verificando que valores inválidos NÃO foram alterados:");
        meuPet.exibirInfo();

        
        System.out.println("\n=========================================");
        System.out.println("TESTANDO MÉTODOS COMPORTAMENTAIS");
        System.out.println("=========================================");

        System.out.println("\n【TESTE 7】Brincar:");
        meuPet.brincar();

        System.out.println("\n【TESTE 8】Alimentar:");
        meuPet.alimentar(2);

        System.out.println("\n【TESTE 9】Passear:");
        meuPet.passear(30);

        System.out.println("\n【TESTE 10】Dormir:");
        meuPet.dormir();

        
        System.out.println("\n=========================================");
        System.out.println("STATUS FINAL");
        System.out.println("=========================================");
        meuPet.exibirInfo();
        
        System.out.println("\n✅ ASSOCIAÇÃO FUNCIONANDO!");
        System.out.println("   - Classe Pet conectada com classe Tutor");
        System.out.println("   - Pet tem um Tutor (composição)");
        System.out.println("   - Dados do Tutor acessíveis via Pet");

        scanner.close();
    }
}