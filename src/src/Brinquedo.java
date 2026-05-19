package src;

// Classe Brinquedo - não tem relação com Pet nem com Crianca
public class Brinquedo implements Brincavel {
    private String nome;
    private String tipo;
    
    public Brinquedo(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        System.out.println("🧸 Um novo brinquedo foi criado!");
        System.out.println("   Nome: " + this.nome);
        System.out.println("   Tipo: " + this.tipo);
    }
    
    public String getNome() { return nome; }
    public String getTipo() { return tipo; }
    
    // ======================================
    // MÉTODOS DA INTERFACE BRINCAVEL
    // ======================================
    @Override
    public void brincar() {
        System.out.println("🧸 " + nome + " (" + tipo + ") está sendo brincado! 🎮");
    }
    
    @Override
    public int tempoBrincada() {
        return 45;  // Brinquedo pode ser usado por 45 minutos
    }
    
    public void exibirInfo() {
        System.out.println("Brinquedo: " + nome + " | Tipo: " + tipo);
    }
}