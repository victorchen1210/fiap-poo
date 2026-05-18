package src;

import java.util.ArrayList;
import java.util.List;
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

        System.out.println("\n=========================================");
        System.out.println("CRIANDO DIFERENTES TIPOS DE PETS");
        System.out.println("=========================================");

        List<Pet> meusPets = new ArrayList<>();

        System.out.println("\n--- Adicionando Cachorro ---");
        Cachorro cachorro = new Cachorro("Rex", 3, "Cachorro", tutor, "Labrador");
        meusPets.add(cachorro);

        System.out.println("\n--- Adicionando Gato ---");
        Gato gato = new Gato("Mimi", 2, "Gato", tutor, "Siamês");
        meusPets.add(gato);

        System.out.println("\n--- Adicionando Pássaro ---");
        Passaro passaro = new Passaro("Piu", 1, "Pássaro", tutor, "Amarela");
        meusPets.add(passaro);
        
        System.out.println("\n--- Adicionando outro Cachorro ---");
        Cachorro cachorro2 = new Cachorro("Thor", 4, "Cachorro", tutor, "Pastor Alemão");
        meusPets.add(cachorro2);
        
        System.out.println("\n--- Adicionando outro Gato ---");
        Gato gato2 = new Gato("Luna", 1, "Gato", tutor, "Frajola");
        meusPets.add(gato2);

        System.out.println("\n=========================================");
        System.out.println("🔥 TESTE DE FOGO - POLIMORFISMO 🔥");
        System.out.println("O MESMO método emitirSom() se comporta de forma DIFERENTE!");
        System.out.println("=========================================");
        
        System.out.println("\n--- Chamando emitirSom() para cada pet na lista ---\n");
        
        for (Pet pet : meusPets) {
            pet.emitirSom();  
        }  // ← ESSA CHAVE ESTAVA FALTANDO!
        
        System.out.println("\n=========================================");
        System.out.println("DEMONSTRAÇÃO DETALHADA DO POLIMORFISMO");
        System.out.println("=========================================");
        
        System.out.println("\nA variável é do tipo Pet, mas o objeto REAL é:");
        
        for (int i = 0; i < meusPets.size(); i++) {
            Pet pet1 = meusPets.get(i);
            System.out.print((i + 1) + ". ");
            
            if (pet1 instanceof Cachorro) {
                System.out.print("Cachorro");
            } else if (pet1 instanceof Gato) {
                System.out.print("Gato");
            } else if (pet1 instanceof Passaro) {
                System.out.print("Pássaro");
            }
            
            System.out.print(" -> ");
            pet1.emitirSom();
        }
        
        System.out.println("\n=========================================");
        System.out.println("ACESSANDO MÉTODOS EXCLUSIVOS (COM CAST)");
        System.out.println("=========================================");
        
        for (Pet pet1 : meusPets) {
            if (pet1 instanceof Cachorro) {
                ((Cachorro) pet1).latir();  
            } else if (pet1 instanceof Gato) {
                ((Gato) pet1).miar();       
            } else if (pet1 instanceof Passaro) {
                ((Passaro) pet1).voar();    
            }
        }
        
        System.out.println("\n=========================================");
        System.out.println("INFORMAÇÕES DE TODOS OS PETS");
        System.out.println("=========================================");
        
        for (Pet pet1 : meusPets) {
            System.out.println();
            pet1.exibirInfo();
        }
        
        System.out.println("\n=========================================");
        System.out.println("✅ POLIMORFISMO FUNCIONANDO!");
        System.out.println("=========================================");
        System.out.println("✓ O mesmo método emitirSom() gerou resultados diferentes!");
        System.out.println("✓ 1 comando -> comportamentos diferentes!");
        System.out.println("✓ Foram criados " + meusPets.size() + " pets na lista");
        System.out.println("✓ Pet pode ser Cachorro, Gato ou Pássaro");
        System.out.println("✓ instanceof ajuda a identificar o tipo real");
        
        scanner.close();
    }
}