package src;

public class Pet {
    String nome;
    int idade;
    String tipo;

    public Pet(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void brincar() {
        System.out.println(nome + " está brincando 🐾");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo 😴");
    }

    public void exibirInfo() {
        System.out.println("Pet: " + nome + " | Idade: " + idade + " | Tipo: " + tipo);
    }
}