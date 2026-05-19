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

        // ======================================
        // TESTE 1: TENTAR CRIAR OBJETO DA CLASSE ABSTRATA
        // ======================================
        System.out.println("\n=========================================");
        System.out.println("TESTE 1: TENTANDO CRIAR UM PET GENÉRICO");
        System.out.println("=========================================");
        System.out.println("❌ A linha abaixo vai dar ERRO de compilação!");
        System.out.println("   Pois Pet é uma classe ABSTRATA!");
        
        // Pet petGenerico = new Pet("Generico", 1, "Generico", tutor);
        // ⬆️ DESCOMENTE ESSA LINHA PARA VER O ERRO!
        
        System.out.println("\n✅ ERRO ESPERADO: 'Cannot instantiate the type Pet'");
        System.out.println("   Isso prova que a classe está ABSTRATA!");

        // ======================================
        // TESTE 2: CRIAR OBJETOS DAS SUBCLASSES (FUNCIONA)
        // ======================================
        System.out.println("\n=========================================");
        System.out.println("TESTE 2: CRIANDO OBJETOS DAS SUBCLASSES");
        System.out.println("=========================================");
        
        List<Pet> meusPets = new ArrayList<>();

        System.out.println("\n--- Criando Cachorro ---");
        Cachorro cachorro = new Cachorro("Rex", 3, "Cachorro", tutor, "Labrador");
        meusPets.add(cachorro);

        System.out.println("\n--- Criando Gato ---");
        Gato gato = new Gato("Mimi", 2, "Gato", tutor, "Siamês");
        meusPets.add(gato);

        System.out.println("\n--- Criando Pássaro ---");
        Passaro passaro = new Passaro("Piu", 1, "Pássaro", tutor, "Amarela");
        meusPets.add(passaro);
        
        // ======================================
        // TESTE 3: POLIMORFISMO COM CLASSE ABSTRATA
        // ======================================
        System.out.println("\n=========================================");
        System.out.println("TESTE 3: POLIMORFISMO COM CLASSE ABSTRATA");
        System.out.println("=========================================");
        System.out.println("A variável é do tipo Pet (abstrato), mas o objeto REAL é:");
        
        for (Pet pet : meusPets) {
            pet.emitirSom();  // Polimorfismo funcionando!
        }
        
        // ======================================
        // TESTE 4: MÉTODOS EXCLUSIVOS
        // ======================================
        System.out.println("\n=========================================");
        System.out.println("TESTE 4: MÉTODOS EXCLUSIVOS DE CADA CLASSE");
        System.out.println("=========================================");
        
        for (Pet pet : meusPets) {
            if (pet instanceof Cachorro) {
                ((Cachorro) pet).latir();
            } else if (pet instanceof Gato) {
                ((Gato) pet).miar();
            } else if (pet instanceof Passaro) {
                ((Passaro) pet).voar();
            }
        }
        
        // ======================================
        // CONCLUSÃO
        // ======================================
        System.out.println("\n=========================================");
        System.out.println("✅ CLASSE ABSTRATA FUNCIONANDO!");
        System.out.println("=========================================");
        System.out.println("✓ Pet agora é abstract");
        System.out.println("✓ Não podemos criar new Pet() - gera erro");
        System.out.println("✓ Podemos criar new Cachorro(), new Gato(), new Passaro()");
        System.out.println("✓ O método emitirSom() é abstrato e foi implementado em cada subclasse");
        System.out.println("✓ Polimorfismo continua funcionando com classe abstrata!");
        
        scanner.close();
    }
}