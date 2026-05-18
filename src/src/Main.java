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

        System.out.println("\n--- MEU PET INICIAL ---");
        meuPet.exibirInfo();

        
        // TESTES DE ENCAPSULAMENTO
       
        System.out.println("\n=========================================");
        System.out.println("TESTANDO O ENCAPSULAMENTO (GETTERS E SETTERS)");
        System.out.println("=========================================");

         
        System.out.println("\n【TESTE 1】Usando GETTERS para ler valores:");
        System.out.println("   Nome via getNome(): " + meuPet.getNome());
        System.out.println("   Idade via getIdade(): " + meuPet.getIdade());
        System.out.println("   Tipo via getTipo(): " + meuPet.getTipo());
        System.out.println("   Energia via getEnergia(): " + meuPet.getEnergia());
        System.out.println("   Fome via getFome(): " + meuPet.getFome());

        
        System.out.println("\n【TESTE 2】Usando SETTERS com valores VÁLIDOS:");
        meuPet.setNome("Rex");
        meuPet.setIdade(5);
        meuPet.setTipo("Cachorro");
        meuPet.setEnergia(80);
        meuPet.setFome(30);
        meuPet.exibirInfo();

        
        System.out.println("\n【TESTE 3】Usando SETTERS com valores INVÁLIDOS (tentando burlar):");
        
        System.out.println("\n   --- Tentando idade negativa: ---");
        meuPet.setIdade(-5);  
        
        System.out.println("\n   --- Tentando idade maior que 30: ---");
        meuPet.setIdade(99);   
        
        System.out.println("\n   --- Tentando energia negativa: ---");
        meuPet.setEnergia(-50); 
        
        System.out.println("\n   --- Tentando fome negativa: ---");
        meuPet.setFome(-20);    
        
        System.out.println("\n   --- Tentando energia maior que 100: ---");
        meuPet.setEnergia(200); 
        
        System.out.println("\n   --- Tentando fome maior que 100: ---");
        meuPet.setFome(150);    

        
        System.out.println("\n【TESTE 4】Verificando que valores inválidos NÃO foram alterados:");
        meuPet.exibirInfo();

        System.out.println("\n=========================================");
        System.out.println("TESTANDO MÉTODOS COMPORTAMENTAIS COM ENCAPSULAMENTO");
        System.out.println("=========================================");
        
        System.out.println("\n【TESTE 5】Brincar (gasta energia, aumenta fome):");
        meuPet.brincar();
        
        System.out.println("\n【TESTE 6】Alimentar com quantidade válida:");
        meuPet.alimentar(2);
        
        System.out.println("\n【TESTE 7】Passear com tempo válido:");
        meuPet.passear(30);
        
        System.out.println("\n【TESTE 8】Dormir (recupera energia):");
        meuPet.dormir();

        // Status final
        System.out.println("\n=========================================");
        System.out.println("STATUS FINAL DO PET");
        System.out.println("=========================================");
        meuPet.exibirInfo();
        
        System.out.println("\n✅ ENCAPSULAMENTO FUNCIONANDO!");
        System.out.println("   - Atributos são private");
        System.out.println("   - Getters e Setters implementados");
        System.out.println("   - Regras nos setters protegem o objeto");

        scanner.close();
    }
}