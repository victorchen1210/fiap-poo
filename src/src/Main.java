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

        
        System.out.println("\n=========================================");
        System.out.println("TESTANDO HERANÇA - CACHORRO");
        System.out.println("=========================================");
        
        System.out.println("\n--- Criando um Cachorro ---");
        Cachorro meuCachorro = new Cachorro("Rex", 3, "Cachorro", tutor, "Labrador");
        
        System.out.println("\n--- Métodos do Cachorro ---");
        meuCachorro.exibirInfo();
        meuCachorro.latir();
        meuCachorro.buscarOsso();
        meuCachorro.brincar();
        meuCachorro.alimentar(2);
        
        
        System.out.println("\n=========================================");
        System.out.println("TESTANDO HERANÇA - GATO");
        System.out.println("=========================================");
        
        System.out.println("\n--- Criando um Gato ---");
        Gato meuGato = new Gato("Mimi", 2, "Gato", tutor, "Siamês");
        
        System.out.println("\n--- Métodos do Gato ---");
        meuGato.exibirInfo();
        meuGato.miar();
        meuGato.arranharMoveis();
        meuGato.brincar();
        meuGato.dormir();
        
       
        System.out.println("\n=========================================");
        System.out.println("TESTANDO POLIMORFISMO");
        System.out.println("=========================================");
        
        Pet pet1 = new Cachorro("Thor", 4, "Cachorro", tutor, "Pastor Alemão");
        Pet pet2 = new Gato("Luna", 1, "Gato", tutor, "Frajola");
        
        System.out.println("\n--- Lista de Pets (Polimorfismo) ---");
        pet1.exibirInfo();
        System.out.println();
        pet2.exibirInfo();
        
        
        System.out.println("\n=========================================");
        System.out.println("ATRIBUTOS EXCLUSIVOS DE CADA CLASSE");
        System.out.println("=========================================");
        
        System.out.println("\nCachorro específico:");
        System.out.println("   Raça: " + meuCachorro.getRaca());
        
        System.out.println("\nGato específico:");
        System.out.println("   Pelagem: " + meuGato.getPelagem());
        
        System.out.println("\n=========================================");
        System.out.println("✅ HERANÇA FUNCIONANDO!");
        System.out.println("   - Cachorro e Gato são subclasses de Pet");
        System.out.println("   - Cada um tem seu atributo exclusivo");
        System.out.println("   - Cada um tem seu método exclusivo");
        System.out.println("   - Polimorfismo funcionando (Pet pode ser qualquer animal)");
        
        scanner.close();
    }
}