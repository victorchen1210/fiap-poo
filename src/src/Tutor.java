package src;

public class Tutor {
    // Atributos
    private String nome;
    private String telefone;
    private String email;

    // CONSTRUTOR
    public Tutor(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        
        System.out.println("\n👤 NOVO TUTOR CADASTRADO!");
        System.out.println("   Nome: " + this.nome);
        System.out.println("   Telefone: " + this.telefone);
        System.out.println("   Email: " + this.email);
    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Exibir informações do tutor
    public void exibirInfo() {
        System.out.println("Tutor: " + nome + " | Telefone: " + telefone + " | Email: " + email);
    }
}