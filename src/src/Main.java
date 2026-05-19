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
        System.out.println("🎯 TESTE DA INTERFACE BRINCAVEL 🎯");
        System.out.println("=========================================");
        System.out.println("Objetos DIFERENTES que implementam a MESMA interface!");
        
        
        List<Brincavel> coisasParaBrincar = new ArrayList<>();
        
        System.out.println("\n--- Adicionando Cachorro (classe Pet) ---");
        Cachorro cachorro = new Cachorro("Rex", 3, "Cachorro", tutor, "Labrador");
        coisasParaBrincar.add(cachorro);
        
        System.out.println("\n--- Adicionando Criança (classe diferente) ---");
        Crianca crianca = new Crianca("Joãozinho", 8);
        coisasParaBrincar.add(crianca);
        
        System.out.println("\n--- Adicionando Brinquedo (classe diferente) ---");
        Brinquedo brinquedo = new Brinquedo("Bola", "Esportivo");
        coisasParaBrincar.add(brinquedo);
        
        
        System.out.println("\n=========================================");
        System.out.println("🔄 CHAMANDO MÉTODOS DA INTERFACE (POLIMORFISMO)");
        System.out.println("=========================================");
        System.out.println("Mesmo método brincar() se comporta DIFERENTE para cada objeto!\n");
        
        for (Brincavel item : coisasParaBrincar) {
            item.brincar();
            System.out.println("   ⏱️ Tempo médio de brincadeira: " + item.tempoBrincada() + " minutos");
            System.out.println();
        }
        
       
        System.out.println("\n=========================================");
        System.out.println("📋 VERIFICANDO OS TIPOS REAIS");
        System.out.println("=========================================");
        
        for (Brincavel item : coisasParaBrincar) {
            if (item instanceof Cachorro) {
                System.out.println("✅ " + ((Cachorro) item).getNome() + " é um Cachorro!");
                ((Cachorro) item).latir();
            } else if (item instanceof Crianca) {
                System.out.println("✅ " + ((Crianca) item).getNome() + " é uma Criança!");
                ((Crianca) item).estudar();
            } else if (item instanceof Brinquedo) {
                System.out.println("✅ " + ((Brinquedo) item).getNome() + " é um Brinquedo!");
            }
            System.out.println();
        }
        
        
        System.out.println("\n=========================================");
        System.out.println("✅ INTERFACE FUNCIONANDO!");
        System.out.println("=========================================");
        System.out.println("✓ Interface Brincavel foi criada");
        System.out.println("✓ Cachorro, Crianca e Brinquedo implementam Brincavel");
        System.out.println("✓ São classes de hierarquias DIFERENTES");
        System.out.println("✓ Array/List da interface funcionou");
        System.out.println("✓ Polimorfismo com interface: mesmo método, comportamentos diferentes!");
        
        scanner.close();
    }
}