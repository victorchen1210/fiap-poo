package src;

// Gato é uma subclasse de Pet (herança)
public class Gato extends Pet {
    
    // ATRIBUTO EXCLUSIVO DE GATO
    private String pelagem;
    
    // CONSTRUTOR
    public Gato(String nome, int idade, String tipo, Tutor tutor, String pelagem) {
        // Chamando o construtor da superclasse Pet
        super(nome, idade, tipo, tutor);
        this.pelagem = pelagem;
        
        System.out.println("🐱 Característica de Gato adicionada!");
        System.out.println("   Pelagem: " + this.pelagem);
    }
    
    // GETTER e SETTER exclusivo
    public String getPelagem() {
        return pelagem;
    }
    
    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }
    
    // MÉTODO EXCLUSIVO DE GATO
    public void miar() {
        System.out.println(getNome() + " está miando: MIAU MIAU! 🐱");
    }
    
    public void arranharMoveis() {
        System.out.println(getNome() + " está arranhando os móveis! 💢");
        setEnergia(getEnergia() - 3);
        System.out.println("   Energia após arranhar: " + getEnergia());
    }
    
    // ======================================
    // POLIMORFISMO - SOBRESCREVENDO O MÉTODO emitirSom() (PARTE 7)
    // ======================================
    @Override
    public void emitirSom() {
        System.out.println("🐱 " + getNome() + " (Gato) mia: MIAU MIAU! Purrr...");
    }
    
    // SOBRESCREVENDO (override) o método exibirInfo
    @Override
    public void exibirInfo() {
        super.exibirInfo();  // chama o método da superclasse
        System.out.println("   🐱 PELAGEM: " + pelagem);
    }
}