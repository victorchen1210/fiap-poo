package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cadastro do Pet ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Tipo (cachorro, gato, etc.): ");
        String tipo = scanner.nextLine();

        Pet meuPet = new Pet(nome, idade, tipo);

        System.out.println("\n--- Meu Pet ---");
        meuPet.exibirInfo();
        meuPet.brincar();
        meuPet.dormir();

        scanner.close();
    }
}