package src;

// Classe completamente diferente (não extends Pet)
// Mas implementa a mesma interface Brincavel
public class Crianca implements Brincavel {
    private String nome;
    private int idade;
    
    public Crianca(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("👶 Uma nova criança nasceu!");
        System.out.println("   Nome: " + this.nome);
        System.out.println("   Idade: " + this.idade + " anos");
    }
    
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    
    public void estudar() {
        System.out.println(nome + " está estudando 📚");
    }
    
    // ======================================
    // MÉTODOS DA INTERFACE BRINCAVEL (PARTE 9)
    // ======================================
    @Override
    public void brincar() {
        System.out.println("👶 " + nome + " está brincando de esconde-esconde! 🙈");
    }
    
    @Override
    public int tempoBrincada() {
        return 60;  // Criança brinca por 60 minutos
    }
    
    public void exibirInfo() {
        System.out.println("Criança: " + nome + " | Idade: " + idade + " anos");
    }
}