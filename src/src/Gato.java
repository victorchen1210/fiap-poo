package src;

public class Gato extends Pet {
    private String pelagem;
    
    public Gato(String nome, int idade, String tipo, Tutor tutor, String pelagem) {
        super(nome, idade, tipo, tutor);
        this.pelagem = pelagem;
        
        System.out.println("🐱 Característica de Gato adicionada!");
        System.out.println("   Pelagem: " + this.pelagem);
    }
    
    public String getPelagem() { return pelagem; }
    public void setPelagem(String pelagem) { this.pelagem = pelagem; }
    
    public void miar() {
        System.out.println(getNome() + " está miando: MIAU MIAU! 🐱");
    }
    
    public void arranharMoveis() {
        System.out.println(getNome() + " está arranhando os móveis! 💢");
        setEnergia(getEnergia() - 3);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("🐱 " + getNome() + " (Gato) mia: MIAU MIAU! Purrr...");
    }
    
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("   🐱 PELAGEM: " + pelagem);
    }
}