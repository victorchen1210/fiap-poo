package src;

public class Pet {
    
    String nome;
    int idade;
    String tipo;
    int energia = 100;
    int fome = 0;

    
    public Pet(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    
    public void brincar() {
        System.out.println(nome + " está brincando 🐾");
        energia -= 10;
        fome += 5;
        System.out.println("   Energia: " + energia + " | Fome: " + fome);
    }

    public void dormir() {
        System.out.println(nome + " está dormindo 😴");
        energia = 100;
        System.out.println("   Energia recuperada: " + energia);
    }

    public void exibirInfo() {
        System.out.println("Pet: " + nome + " | Idade: " + idade + " | Tipo: " + tipo);
        System.out.println("   Energia: " + energia + " | Fome: " + fome);
    }

    
    public void alimentar(int quantidade) {
        System.out.println("\n--- Tentando alimentar " + nome + " com " + quantidade + " porções ---");
        
        if (quantidade <= 0) {
            System.out.println("❌ ERRO: Quantidade inválida! Use um número positivo.");
        } else if (quantidade > 3) {
            System.out.println("❌ ERRO: " + nome + " não pode comer " + quantidade + " porções! Máximo é 3.");
        } else {
            fome -= quantidade * 10;
            if (fome < 0) {
                fome = 0;
            }
            System.out.println("✅ " + nome + " comeu " + quantidade + " porção(ões)!");
            System.out.println("   Fome agora: " + fome);
        }
    }

    
    public void passear(int tempo) {
        System.out.println("\n--- " + nome + " vai passear por " + tempo + " minutos ---");
        
        if (tempo <= 0) {
            System.out.println("❌ ERRO: Tempo inválido! Use um número positivo.");
        } else if (tempo > 60) {
            System.out.println("❌ ERRO: " + nome + " não pode passear " + tempo + " minutos! Máximo é 60.");
        } else if (energia < tempo) {
            System.out.println("❌ ERRO: " + nome + " está com pouca energia (" + energia + ") para passear " + tempo + " min.");
        } else {
            energia -= tempo;
            fome += tempo / 10;
            System.out.println("✅ " + nome + " aproveitou o passeio!");
            System.out.println("   Energia agora: " + energia + " | Fome agora: " + fome);
        }
    }
}